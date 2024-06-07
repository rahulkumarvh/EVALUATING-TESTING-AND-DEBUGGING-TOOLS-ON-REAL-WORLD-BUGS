import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestFIND_IN_SORTEDBuggy17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8501");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 3, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int32 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8502");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8503");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8504");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8505");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8506");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8507");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8508");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8509");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8510");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8511");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8512");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, 0, 0);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8513");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) 100, (int) (short) 100);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8514");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) -1);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 10, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8515");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8516");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8517");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8518");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', 3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8519");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8520");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8521");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 10, 10);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8522");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8523");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 100, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8524");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8525");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8526");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8527");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8528");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (byte) 10, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (short) -1, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8529");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8530");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8531");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8532");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8533");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (byte) 10, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8534");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8535");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8536");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 1, 0, 3);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) -1, 0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) ' ', 1, 2);
        int int32 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 0, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8537");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8538");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) 100, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) ' ', (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8539");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8540");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8541");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8542");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8543");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8544");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (short) 1, (-1));
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (short) 0, 2);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8545");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (short) 0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8546");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8547");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 10, 0, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test8548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8548");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (short) 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) '4', (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8549");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8550");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 100, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8551");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 1, 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8552");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8553");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8554");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8555");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8556");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8557");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) 'a', (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (-1), (-1));
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8558");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8559");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8560");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8561");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8562");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8563");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, '#' };
        int int5 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (-1));
        int int7 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (short) -1);
        int int11 = java_programs.FIND_IN_SORTED.binsearch(intArray3, (int) ' ', 10, (int) (short) 10);
        int int13 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test8564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8564");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8565");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8566");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8567");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8568");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8569");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8570");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8571");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8572");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8573");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (short) 100, (int) (short) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8574");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8575");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test8576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8576");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) 0, 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8577");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8578");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 1, 0, 3);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) -1, 0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 10, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8579");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8580");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8581");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8582");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8583");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8584");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 1, 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8585");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8586");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8587");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8588");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int34 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 0, (int) (byte) 0);
        int int36 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int38 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test8589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8589");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8590");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8591");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8592");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8593");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8594");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, (int) (short) 10);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8595");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8596");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8597");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test8598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8598");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8599");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 100, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 2, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8600");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8601");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8602");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8603");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8604");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8605");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8606");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, 10, 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (-1), (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8607");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8608");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8609");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int32 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8610");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8611");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8612");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8613");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8614");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8615");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8616");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 1, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8617");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8618");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8619");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8620");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8621");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8622");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8623");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8624");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 1, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 100, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 0, (int) (short) 0);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8625");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8626");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8627");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8628");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8629");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8630");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8631");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy17.test8632");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }
}

