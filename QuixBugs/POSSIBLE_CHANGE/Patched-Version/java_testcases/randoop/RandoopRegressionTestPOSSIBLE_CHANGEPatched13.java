import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestPOSSIBLE_CHANGEPatched13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6501");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6502");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6503");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6504");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6505");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6506");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6507");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6508");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6509");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int36 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6510");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6511");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6512");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6513");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6514");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6515");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6516");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6517");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6518");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6519");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6520");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6521");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6522");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6523");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6524");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11 + "'", int32 == 11);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6525");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6526");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6527");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6528");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6529");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6530");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6531");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6532");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6533");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6534");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6535");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6536");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6537");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6538");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6539");
        int[] intArray3 = new int[] { (short) -1, 10, '4' };
        int int5 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int9 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 52]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6540");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6541");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6542");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6543");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6544");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6545");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6546");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6547");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6548");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6549");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6550");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6551");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6552");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6553");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6554");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6555");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6556");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6557");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6558");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6559");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6560");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6561");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6562");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6563");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6564");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6565");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6566");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6567");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6568");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6569");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6570");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6571");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6572");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6573");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6574");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6575");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6576");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6577");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6578");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6579");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6580");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6581");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6582");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6583");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6584");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6585");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6586");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6587");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6588");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6589");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6590");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6591");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6592");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6593");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6594");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6595");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6596");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6597");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6598");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6599");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6600");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6601");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6602");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6603");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6604");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6605");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6606");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6607");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6608");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6609");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6610");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6611");
        int[] intArray6 = new int[] { (short) 100, 0, 0, (byte) 1, 'a', 10 };
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 0, 1, 97, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6612");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6613");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6614");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6615");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int36 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int38 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6616");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6617");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6618");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6619");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6620");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6621");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6622");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11 + "'", int32 == 11);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6623");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6624");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6625");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6626");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6627");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6628");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6629");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6630");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6631");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6632");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6633");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6634");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6635");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6636");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6637");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6638");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6639");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6640");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6641");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6642");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6643");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6644");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6645");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6646");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6647");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6648");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6649");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6650");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6651");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6652");
        int[] intArray1 = new int[] { ' ' };
        int int3 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 100);
        int int5 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 100);
        int int7 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 0);
        int int9 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) '4');
        int int11 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (short) -1);
        int int13 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 2);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6653");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6654");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6655");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6656");
        int[] intArray3 = new int[] { (short) -1, 10, '4' };
        int int5 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int9 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 52]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6657");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6658");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6659");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6660");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6661");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6662");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6663");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6664");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6665");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6666");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6667");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6668");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6669");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6670");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6671");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6672");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6673");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6674");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6675");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6676");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6677");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6678");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6679");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6680");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6681");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6682");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6683");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6684");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6685");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6686");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6687");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6688");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6689");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6690");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6691");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6692");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6693");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6694");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6695");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6696");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6697");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6698");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6699");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6700");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6701");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6702");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6703");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6704");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6705");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6706");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6707");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6708");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6709");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6710");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6711");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6712");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6713");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6714");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6715");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6716");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6717");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6718");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6719");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6720");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6721");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6722");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6723");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6724");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6725");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6726");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6727");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6728");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6729");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6730");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6731");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6732");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6733");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6734");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6735");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11 + "'", int32 == 11);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6736");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6737");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6738");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6739");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6740");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6741");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6742");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6743");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6744");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6745");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int36 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int38 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6746");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6747");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6748");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6749");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6750");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6751");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6752");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6753");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6754");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int36 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6755");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6756");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6757");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6758");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6759");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6760");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6761");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6762");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6763");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6764");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6765");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6766");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6767");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6768");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6769");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6770");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6771");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6772");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6773");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6774");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6775");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6776");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6777");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6778");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6779");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6780");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6781");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6782");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6783");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6784");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6785");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6786");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6787");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6788");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6789");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6790");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6791");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int36 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6792");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6793");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6794");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6795");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6796");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6797");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6798");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6799");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6800");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6801");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6802");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6803");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6804");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6805");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6806");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6807");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6808");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6809");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6810");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6811");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6812");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6813");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6814");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6815");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6816");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6817");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6818");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6819");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6820");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6821");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6822");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6823");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int36 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6824");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6825");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6826");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6827");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6828");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6829");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6830");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6831");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6832");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6833");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6834");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6835");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6836");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6837");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6838");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6839");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6840");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6841");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6842");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6843");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6844");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6845");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6846");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6847");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6848");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6849");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6850");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6851");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6852");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6853");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6854");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6855");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6856");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6857");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6858");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6859");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6860");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6861");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6862");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6863");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6864");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6865");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestPOSSIBLE_CHANGEPatched13.test6866");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }
}

