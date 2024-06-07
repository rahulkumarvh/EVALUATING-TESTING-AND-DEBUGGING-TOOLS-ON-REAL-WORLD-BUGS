import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestFIND_IN_SORTEDPatched4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2001");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 3, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 4, (int) '4', (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2002");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (short) -1, (int) (short) 10);
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
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2003");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2004");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (short) 1, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2005");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2006");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', (int) (byte) 10, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2007");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2008");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2009");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2010");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 0, 0, (int) 'a');
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
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2011");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2012");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (-1), (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (byte) 100, 10);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2013");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (byte) 1, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 5, 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2014");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2015");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (int) (short) 10, 100);
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
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2016");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2017");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, 5, 10);
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2018");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 2, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2019");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2020");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2021");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (byte) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2022");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 2, 3, (int) (short) 10);
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
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2023");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, 2, 4);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2024");
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
        int int38 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass39 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2025");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2026");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2027");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2028");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2029");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 3, 2);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2030");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', (int) (byte) -1, (int) (byte) 10);
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2031");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, (int) ' ', (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2032");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, 100, 3);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2033");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2034");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
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
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2035");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2036");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2037");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2038");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2039");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) ' ', (int) (short) 0);
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
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2040");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 4, (int) (short) 1, (int) '4');
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
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2041");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 10, (-1));
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2042");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', 10, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2043");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 10, 3, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2044");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int15 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) ' ', (int) (short) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 10, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2045");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) 'a', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (int) (byte) 100, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2046");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, (-1), (int) '4');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2047");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, (int) (byte) 0, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 10, (int) (byte) -1);
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
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2048");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2049");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, (int) (byte) -1, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (int) 'a', (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2050");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (-1), 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (int) (short) 100, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2051");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (short) 10, 2);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2052");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (byte) 1, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2053");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (int) 'a', (int) 'a');
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 10, (int) (short) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) ' ', (int) '4', (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2054");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) '#', 0);
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
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2055");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2056");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 0, 5);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2057");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2058");
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
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
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
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2059");
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
        java.lang.Class<?> wildcardClass33 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2060");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) ' ', (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2061");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (short) 10, (int) 'a');
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
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2062");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (-1), 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) ' ', 100, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2063");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2064");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (-1), (int) (byte) 100);
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
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2065");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 3, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 4, 5, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2066");
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
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', 0, 100);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2067");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (-1), (int) (byte) 0);
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
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2068");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, (int) (byte) 0, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2069");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2070");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (byte) 1, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2071");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, 0, 1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2072");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (int) (short) 1, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2073");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int9 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 100, (int) (short) 10, (int) (short) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 0);
        int int13 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 100);
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2074");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 100, (int) (short) 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2075");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (-1), (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 100, 1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2076");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) -1, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2077");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 0, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2078");
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
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2079");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2080");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, (int) (short) -1, 0);
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
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2081");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2082");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 100, (int) (short) 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) '4', (-1));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2083");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2084");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (short) 1, (int) ' ');
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
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2085");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (-1), 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2086");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (-1), 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2087");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2088");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, 0, (int) '#');
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
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2089");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 4, (int) (byte) 100, 1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2090");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 4, (int) (byte) 10);
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
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2091");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2092");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2093");
        int[] intArray1 = new int[] { 0 };
        int int3 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (-1));
        int int5 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) '4', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2094");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (-1), 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (int) (short) 0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, 10, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2095");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 10, 0, 0);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2096");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int9 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 100, (int) (short) 10, (int) (short) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 0);
        int int13 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 100);
        int int15 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 10);
        int int17 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 1, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2097");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 3, 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2098");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 1, (int) (short) 10);
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
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2099");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, (int) (short) 10, (int) 'a');
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
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2100");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 2, (int) (short) 0, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2101");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, 0, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) '#', 4);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2102");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, 0, 3);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2103");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2104");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) ' ', 100);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2105");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2106");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2107");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2108");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, 10, 3);
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
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2109");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2110");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2111");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2112");
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
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, (int) (short) 100, (int) (short) 0);
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
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2113");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) -1, (int) (byte) 0);
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2114");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, 10, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2115");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2116");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) '4', (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2117");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 1, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2118");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 0, (int) (short) -1);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (-1), (int) (short) 100);
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
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2119");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2120");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 3, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2121");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, 100, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) ' ', (int) (byte) -1, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2122");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, (int) (byte) -1, (int) (short) 100);
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
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2123");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2124");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 3, (-1));
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
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2125");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2126");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (short) 0, 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2127");
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
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, 1, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, 2, (int) '4');
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
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2128");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2129");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, 0, (int) (byte) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) '#', (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2130");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) '4', 0);
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
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2131");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), 5, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2132");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2133");
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
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 10, 5, 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2134");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (byte) 1, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) 1, 5);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2135");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, (int) ' ', (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (byte) 0, (int) ' ');
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
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2136");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, 1, 2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2137");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 4, (int) (byte) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 2, (-1), 0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2138");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 2, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2139");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2140");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2141");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', (int) (short) 10, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2142");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) 100);
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
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2143");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, 0, 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2144");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, (int) (byte) 1, (int) (short) 10);
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
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2145");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2146");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, 1, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2147");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2148");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int9 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 100, (int) (short) 10, (int) (short) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 100);
        int int13 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 1, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2149");
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
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) -1, 0);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2150");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 10, 10);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2151");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (short) 100, 0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2152");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (int) (byte) -1, (int) (short) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2153");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2154");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2155");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 4, (int) '4', (int) (byte) 10);
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
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2156");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, 10, 3);
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
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2157");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 3, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (byte) 1, 2);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2158");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) '#', 5);
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
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2159");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (byte) 1, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2160");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (int) '#', (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2161");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2162");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, 0, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2163");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2164");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, (int) (short) 0, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (int) ' ', (int) '#');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2165");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) 'a', 0);
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
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2166");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) '#', 1);
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
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2167");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int9 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 100, (int) (short) 10, (int) (short) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 0);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2168");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, 5, 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, 10, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2169");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2170");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, 100, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (int) (byte) 1, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2171");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
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
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2172");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2173");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) '4', (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2174");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2175");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
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
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2176");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2177");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int15 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) ' ', (int) (short) 100, (int) (byte) 100);
        int int17 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) 'a');
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2178");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (-1), 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, (int) 'a', 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2179");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, (int) (byte) -1, (int) (short) 1);
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
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2180");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, (-1), (int) (short) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2181");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2182");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 2);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, 5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2183");
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
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2184");
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
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) ' ', (int) (short) 0);
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
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2185");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2186");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2187");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2188");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) '4', (int) '4');
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2189");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2190");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) '#', (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2191");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 1, (int) (byte) 0, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2192");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2193");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (byte) -1, 2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2194");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (int) '4', 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2195");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, 5, 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (int) (short) -1, (int) (byte) 1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2196");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2197");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) 100, 1);
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
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2198");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (byte) 1, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2199");
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
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2200");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 100, (int) (short) 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) ' ', 4);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2201");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2202");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) 0, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
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
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2203");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 5, (int) (byte) 100);
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
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2204");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, (int) (short) 0, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2205");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) 1);
        int int13 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 2);
        int int15 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 1);
        int int17 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 0);
        int int19 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2206");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 0, (int) 'a');
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
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2207");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2208");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
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
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2209");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 2);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2210");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (short) 0, (int) '4');
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
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2211");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2212");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int9 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 100, (int) (short) 10, (int) (short) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 100);
        int int13 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) -1);
        int int15 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (byte) 10);
        int int19 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) -1, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int23 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 100, (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2213");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 10, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2214");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (short) 0, 2);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2215");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 0, (int) '4');
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
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2216");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2217");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', 4, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, 10, 4);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2218");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2219");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 10, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2220");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2221");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, (int) '#', 2);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2222");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (-1), 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2223");
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
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2224");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, (int) 'a', 3);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2225");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 100, 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) (short) 0, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2226");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2227");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 2, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2228");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) '4', 5);
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
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2229");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) (short) 1, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2230");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, (int) (byte) 100, 2);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2231");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, (int) ' ', (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2232");
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
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (int) (byte) 1, (int) (short) -1);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (int) 'a', (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2233");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, 3, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2234");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2235");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 100, (int) (short) 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (byte) 100, (-1));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2236");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 4, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2237");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2238");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2239");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2240");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2241");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
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
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2242");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), 5);
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
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2243");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
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
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2244");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2245");
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
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, 100, 4);
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
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2246");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 0, (int) (byte) 100, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2247");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (-1), 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 1, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2248");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 2, 10, 2);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2249");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2250");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, 100, 10);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2251");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2252");
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
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2253");
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
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2254");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2255");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 10, 0, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2256");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 1, 5);
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
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2257");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
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
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2258");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 100, (int) (short) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', 0, 1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2259");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (byte) 100, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2260");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, 0, (int) ' ');
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
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2261");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (short) 0, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2262");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) '4', (int) (short) 1);
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
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2263");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, (int) (short) 0, 3);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2264");
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
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 1, 100, 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2265");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 3, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (int) (short) 0, 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2266");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 5, 2);
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
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2267");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 10, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2268");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 0, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (-1), 10);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2269");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 2);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (int) (byte) -1, 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2270");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2271");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (byte) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) 'a', 0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2272");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (short) 10, (int) (byte) 1);
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
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2273");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (short) 10, (-1));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2274");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2275");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, (-1), (int) (short) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (-1), 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2276");
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
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass33 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2277");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 100, 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, 4, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2278");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (int) 'a', (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2279");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (int) (short) 0, 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2280");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2281");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 4, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2282");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 4, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2283");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2284");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) 0, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2285");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) -1, (int) (short) 0);
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
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2286");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int9 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 100, (int) (short) 10, (int) (short) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 2, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2287");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2288");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (short) 1, (int) (byte) 100);
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
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2289");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2290");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, (int) ' ', 2);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2291");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, (int) (byte) 10, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, (int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2292");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
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
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2293");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 4, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2294");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int13 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (-1), (int) (byte) 0, (int) (short) 0);
        int int15 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 0);
        int int17 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) 10);
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2295");
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
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', 100, 2);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2296");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 100, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2297");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) 100, 1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2298");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (short) 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 10, 2);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2299");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, 0, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2300");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (int) (short) 10, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, 0, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2301");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2302");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2303");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (-1), 3);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2304");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 10, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (short) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2305");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, 3, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2306");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (short) -1, 3);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2307");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2308");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (int) (short) 1, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 2, 1);
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
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2309");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, (int) '#', 0);
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
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2310");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (int) ' ', (int) '4');
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
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2311");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, (int) '4', (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2312");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2313");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) 'a', 1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2314");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), 4, (int) '4');
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
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2315");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2316");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2317");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 1, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2318");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, (int) (short) 0, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, 100, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2319");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2320");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (-1), (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2321");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2322");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 100, (int) (short) 10);
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
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2323");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 2);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', 0, 3);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2324");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 5, (int) (short) 10);
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
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2325");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (short) -1, 0);
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
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2326");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int9 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 100, (int) (short) 10, (int) (short) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 100);
        int int13 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 0, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2327");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (-1), (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 0, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', (int) (short) -1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2328");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', 0, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2329");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2330");
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
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, 100, (int) (short) 1);
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
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2331");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 100, 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, (int) (short) 0, (int) '#');
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
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2332");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2333");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2334");
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
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2335");
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
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2336");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) '4', 10);
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
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2337");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2338");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2339");
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
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
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
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2340");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (short) 0, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', (int) (byte) 10, 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2341");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', (int) (byte) 10, (int) (short) 10);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2342");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2343");
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
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) -1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2344");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 0, 100);
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
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2345");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, (int) (short) 100, 4);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2346");
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
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 100, 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2347");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (int) ' ');
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
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2348");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2349");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2350");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (-1), 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, 3, 3);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2351");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (-1), 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2352");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2353");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, 2, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2354");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (byte) -1, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2355");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2356");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 100, 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2357");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2358");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 100, (int) (short) 1);
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
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2359");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2360");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2361");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (int) (short) 100, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2362");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 100, 4);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2363");
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
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) (byte) 100, 1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2364");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2365");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 100, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, 10, (int) (byte) 100);
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
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2366");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2367");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (int) (byte) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, (int) (byte) 100, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2368");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', (int) (byte) 1, 100);
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
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2369");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, (int) (byte) 10, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
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
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2370");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (short) 0, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2371");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2372");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2373");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2374");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2375");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int13 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int17 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 0, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2376");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 2, (int) '4', (-1));
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2377");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2378");
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
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2379");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (-1), (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2380");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2381");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, (int) (short) -1, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) '#', (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2382");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 10, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2383");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 100, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2384");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 100, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) '#', (int) (byte) 100);
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
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2385");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2386");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (-1), (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (-1), (int) '4');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2387");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) '4', (int) (byte) 100);
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
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2388");
        int[] intArray1 = new int[] { 0 };
        int int3 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (-1));
        int int5 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) 10);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2389");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', 4, (int) (short) -1);
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
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2390");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) -1, 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', (int) (byte) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2391");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2392");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 10, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2393");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2394");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (short) 10, 1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2395");
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
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2396");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2397");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) -1, 3, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2398");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) '#', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2399");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, 3, (int) (short) 1);
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
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2400");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (byte) -1);
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
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2401");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) '#', 4);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2402");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (int) '4', (-1));
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
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2403");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) (short) 100, 4);
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
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2404");
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
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
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
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2405");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) 'a', (int) (short) 0);
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
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2406");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, (int) (byte) -1, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2407");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 0, 2);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2408");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
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
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2409");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 0, 3);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2410");
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
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2411");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2412");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) '#', (int) (byte) 10);
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
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2413");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2414");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, 0);
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
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2415");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2416");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) 'a', 0);
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
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2417");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (short) -1, (int) (byte) 100);
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
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2418");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (int) (byte) -1, 0);
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
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2419");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2420");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2421");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
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
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2422");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2423");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2424");
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
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 10, (-1));
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2425");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2426");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2427");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2428");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 0, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 2, (int) '#', 3);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2429");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) '#', (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 4, 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2430");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2431");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, (-1), 0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2432");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2433");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2434");
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
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2435");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2436");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2437");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2438");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, 2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '4', 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2439");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, 5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2440");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, 3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2441");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2442");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
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
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2443");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (short) 1, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2444");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) -1, (int) ' ', (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) '4', (int) (byte) 1);
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
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2445");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 2, (int) (short) 100, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2446");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2447");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2448");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) 100, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2449");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) ' ', 3);
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
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2450");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 2, (int) '#', (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2451");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2452");
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
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2453");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 1, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2454");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 1, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (int) (short) 10, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2455");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) '4', (int) '#');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2456");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) ' ', (int) ' ', (int) '4');
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
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2457");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (byte) -1, (int) (byte) 0);
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
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2458");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2459");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) 'a', (int) (short) 10, (int) (byte) 100);
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
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2460");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 10, 1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2461");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (byte) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2462");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, 1, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2463");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2464");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 100, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, (int) (short) 100, (int) 'a');
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
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2465");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2466");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (short) 1, (int) 'a');
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
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2467");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 100, (int) (short) 1);
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
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2468");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 0, (int) (short) 1, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2469");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2470");
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
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, (int) (byte) 1, (int) (byte) 100);
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
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2471");
        int[] intArray1 = new int[] { 0 };
        int int3 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (-1));
        int int5 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2472");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) '4', (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 2, (int) '#');
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
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2473");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2474");
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
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2475");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, 5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 10, (int) '#', (int) ' ');
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
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2476");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, 2, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2477");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 10, 4);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2478");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) '4', 3);
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
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2479");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2480");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, 0);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2481");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 0, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 5, 0);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2482");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int13 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (-1), (int) (byte) 0, (int) (short) 0);
        int int15 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 0);
        int int17 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) 10);
        int int19 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 2, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2483");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (short) 100, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2484");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2485");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (int) '#', (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2486");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 100, 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) 'a', (int) '4');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2487");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), 0, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2488");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
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
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2489");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2490");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (short) -1, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 4, (int) (short) -1, 5);
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
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2491");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (-1), (int) ' ');
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
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2492");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, (int) (byte) 10, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (-1), 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2493");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2494");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) 'a', (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2495");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 2, (int) (short) 1, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2496");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2497");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2498");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (short) 1, 100);
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
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2499");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDPatched4.test2500");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, (int) (byte) 100, (-1));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }
}

