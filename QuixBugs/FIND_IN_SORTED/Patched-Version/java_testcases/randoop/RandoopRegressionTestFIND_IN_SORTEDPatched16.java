import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestFIND_IN_SORTEDPatched16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8001");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8002");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 0, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8003");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 0, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8004");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8005");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (-1), 3);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8006");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8007");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8008");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8009");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 0, 2);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8010");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) '#', (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8011");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8012");
        int[] intArray1 = new int[] { (short) 1 };
        int int3 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 3);
        int int5 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 3);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8013");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8014");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 0, 0, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8015");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8016");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8017");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
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
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8018");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (int) 'a', (int) 'a');
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 3, 3);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 3, 1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8019");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8020");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8021");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8022");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 0, (-1));
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8023");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
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
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8024");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8025");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 0, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 4);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8026");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8027");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, (int) (byte) 10, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
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
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8028");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, 2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8029");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 5, 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8030");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, (int) (short) 0, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8031");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8032");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
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
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8033");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8034");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8035");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (int) (short) -1, (int) (short) 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8036");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 0, 3);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8037");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (int) (short) -1, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (int) (byte) -1, 4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8038");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8039");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, (int) (short) 0, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (int) (short) -1, 2);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int38 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int40 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8040");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 2, 4);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8041");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 0, (int) (short) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8042");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 10, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8043");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, 0, (int) (byte) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (int) (short) 0, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8044");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8045");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (short) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) '#', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8046");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8047");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8048");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (byte) 1, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, 3);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8049");
        int[] intArray1 = new int[] { 0 };
        int int3 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (-1));
        int int5 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 1);
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 4);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8050");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8051");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8052");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, 100, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (int) (short) 0, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8053");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) 0, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, 100, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (int) (short) 0, 2);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8054");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 0, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8055");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8056");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, (-1), 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, 1, 5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8057");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (short) -1, (int) (byte) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8058");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8059");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8060");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8061");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8062");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8063");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (byte) -1, (-1));
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, 0, (int) (byte) 1);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 2, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8064");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8065");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8066");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8067");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8068");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 100, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, 2, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8069");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8070");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 0, 3);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (int) (byte) 0, 5);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 10, 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8071");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, (int) (byte) 0, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8072");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (short) 1, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8073");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 1, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 0, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8074");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 1, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8075");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, 5, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, (int) (byte) 0, 5);
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (short) 0, (-1));
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8076");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 0, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8077");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8078");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8079");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
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
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8080");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8081");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, (-1), 3);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, (-1), (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8082");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 0, (int) (short) -1);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 0, (int) (short) 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8083");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', 2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8084");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8085");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 3, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int36 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (int) '4', (int) '4');
        int int38 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int40 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int44 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (short) 10, 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8086");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 3, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, 0, (int) (short) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8087");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 10, 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (short) 100, (int) (short) 100);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int38 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, (int) (short) 1, 0);
        int int40 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8088");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8089");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8090");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8091");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8092");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 0, (int) (short) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8093");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 0, (int) (short) -1);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8094");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 0, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (byte) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8095");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 0, 2);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 2, (int) (short) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8096");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, (int) (short) 0, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8097");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 100, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) (short) 0, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8098");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 2, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8099");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8100");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8101");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int13 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (-1), (int) (byte) 0, (int) (short) 0);
        int int15 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        java.lang.Class<?> wildcardClass16 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8102");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, (int) ' ', (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8103");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8104");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 100, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8105");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8106");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8107");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8108");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, 0, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8109");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, 0, 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8110");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, (int) (short) 0, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8111");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 4);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8112");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 1, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8113");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8114");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
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
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8115");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8116");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, (int) (byte) 10, (int) (byte) 10);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8117");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 10, (int) (short) 0, 5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8118");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8119");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
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
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8120");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8121");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (-1), 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8122");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, (int) (byte) 100, 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8123");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 100, 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8124");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8125");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 2, 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 0, (int) (short) 1);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int38 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8126");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 100, (int) (short) 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8127");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, 100, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, 5, (int) (short) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8128");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 0, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8129");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8130");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 4, 2, 4);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8131");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8132");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 0, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', 0, (int) (short) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8133");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8134");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (byte) -1, (-1));
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8135");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8136");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (short) -1, (int) (short) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8137");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, (-1), (int) (short) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8138");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8139");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8140");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) ' ', 0, 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8141");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
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
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8142");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8143");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8144");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8145");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (byte) 1, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8146");
        int[] intArray1 = new int[] { (short) 1 };
        int int3 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 3);
        int int5 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 10, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8147");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8148");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) '4', (int) '4');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8149");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (byte) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) 0);
        int int13 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8150");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8151");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8152");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), 4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8153");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8154");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, 0, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', (int) (byte) 0, 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, (int) (short) 1, 2);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', 1, 2);
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int38 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int42 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8155");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 4, 0);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8156");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8157");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 0, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8158");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (-1), (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8159");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8160");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, (int) (byte) 0, (int) (short) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8161");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8162");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, 100, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, 5, (int) (short) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) ' ', 4, (int) (byte) 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8163");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8164");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (byte) 1, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8165");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8166");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, (int) '4', (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8167");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, (int) (byte) -1, (int) (short) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8168");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8169");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8170");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 1, (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8171");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 5, (-1));
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (byte) 10, (int) (short) 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8172");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int9 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 100, (int) (short) 10, (int) (short) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 100);
        int int13 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 10);
        int int17 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (byte) 1, 0, (int) (byte) -1);
        int int19 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (byte) 10);
        int int21 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8173");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
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
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8174");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 0);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8175");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) ' ', 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8176");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (short) 0, 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8177");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 2);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test8178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8178");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 5, (-1));
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (byte) 10, (int) (short) 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, 0, (int) (short) 10);
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test8179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8179");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 100, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8180");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8181");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8182");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test8183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8183");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8184");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 0, 0, 2);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8185");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8186");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 1, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', 0, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8187");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 5, (-1));
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (byte) 10, (int) (short) 10);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, 4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8188");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8189");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, 1, 3);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8190");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8191");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8192");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', 1, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) -1, 2);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (byte) 0, (int) (byte) 0);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test8193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8193");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, 0, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', (int) (byte) 0, 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, (int) (short) 1, 2);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', 1, 2);
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int38 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8194");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, (int) (short) 1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8195");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test8196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8196");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8197");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8198");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (int) (short) 0, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (int) (byte) -1, (int) (byte) -1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8199");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 5, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8200");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (short) 0, (int) (short) 1);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 0, 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8201");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 100, 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8202");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) '4', (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 5, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test8203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8203");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test8204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8204");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8205");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (short) 0, (int) (short) 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8206");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8207");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, 0, (int) (short) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8208");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8209");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, 100, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8210");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 0, 0, 2);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', (-1), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 10, 4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8211");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 0, (int) (short) -1);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 0, (int) (short) 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 2, (int) (byte) 0, (int) (short) 1);
        int int36 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test8212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8212");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (byte) 1, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8213");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8214");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8215");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (int) (byte) -1, (int) (short) 1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8216");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 0, 5, 4);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test8217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8217");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test8218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8218");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test8219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8219");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8220");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', 0, 4);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8221");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched16.test8222");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }
}

