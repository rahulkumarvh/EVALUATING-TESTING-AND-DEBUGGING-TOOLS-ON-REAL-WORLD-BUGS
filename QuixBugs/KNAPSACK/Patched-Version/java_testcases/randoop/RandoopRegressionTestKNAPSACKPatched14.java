import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestKNAPSACKPatched14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7001");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7002");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7003");
        int[][] intArray8 = new int[][] {};
        int int9 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray8);
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray8);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray8);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray8);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray8);
        int int15 = correct_java_programs.KNAPSACK.knapsack(1, intArray8);
        int int16 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7004");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7005");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        java.lang.Class<?> wildcardClass41 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7006");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7007");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7008");
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray35 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray36 = new int[][] { intArray28, intArray35 };
        int int37 = correct_java_programs.KNAPSACK.knapsack(0, intArray36);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray36);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray36);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray36);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray36);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray36);
        int int43 = correct_java_programs.KNAPSACK.knapsack(0, intArray36);
        int int44 = correct_java_programs.KNAPSACK.knapsack(1, intArray36);
        int int45 = correct_java_programs.KNAPSACK.knapsack(30, intArray36);
        int int46 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray36);
        int int47 = correct_java_programs.KNAPSACK.knapsack(1, intArray36);
        int int48 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray36);
        int int49 = correct_java_programs.KNAPSACK.knapsack(52, intArray36);
        int int50 = correct_java_programs.KNAPSACK.knapsack(0, intArray36);
        int int51 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray36);
        int int52 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray36);
        int int53 = correct_java_programs.KNAPSACK.knapsack(1, intArray36);
        int int54 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray36);
        int int55 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray36);
        int int56 = correct_java_programs.KNAPSACK.knapsack(0, intArray36);
        int int57 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray36);
        int int58 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray36);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7009");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7010");
        int[] intArray14 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray15 = new int[][] { intArray14 };
        int int16 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int17 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray15);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray15);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray15);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray15);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray15);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray15);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray15);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray15);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7011");
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray24 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7012");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7013");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7014");
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray22 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7015");
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray22 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7016");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7017");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7018");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7019");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7020");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7021");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7022");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7023");
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray24 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7024");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7025");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((-1), intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7026");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7027");
        int[][] intArray7 = new int[][] {};
        int int8 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray7);
        int int9 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray7);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray7);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray7);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray7);
        int int13 = correct_java_programs.KNAPSACK.knapsack(30, intArray7);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray7);
        java.lang.Class<?> wildcardClass15 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7028");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7029");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7030");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7031");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7032");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7033");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7034");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(52, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7035");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7036");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7037");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        java.lang.Class<?> wildcardClass41 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7038");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7039");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7040");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack(1, intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack(52, intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray29);
        java.lang.Class<?> wildcardClass45 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7041");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        java.lang.Class<?> wildcardClass41 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7042");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7043");
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray29 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray30 = new int[][] { intArray22, intArray29 };
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray30);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray30);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray30);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray30);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray30);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray30);
        int int37 = correct_java_programs.KNAPSACK.knapsack(100, intArray30);
        int int38 = correct_java_programs.KNAPSACK.knapsack(10, intArray30);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray30);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray30);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray30);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray30);
        int int43 = correct_java_programs.KNAPSACK.knapsack(1, intArray30);
        int int44 = correct_java_programs.KNAPSACK.knapsack(10, intArray30);
        int int45 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray30);
        int int46 = correct_java_programs.KNAPSACK.knapsack(1, intArray30);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7044");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7045");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7046");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7047");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7048");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7049");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7050");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7051");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7052");
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray22 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7053");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7054");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7055");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7056");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7057");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7058");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7059");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7060");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7061");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        java.lang.Class<?> wildcardClass41 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7062");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack(30, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        java.lang.Class<?> wildcardClass43 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7063");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7064");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7065");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7066");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7067");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7068");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7069");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7070");
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray30 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray31 = new int[][] { intArray23, intArray30 };
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray31);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray31);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray31);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray31);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray31);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray31);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray31);
        int int39 = correct_java_programs.KNAPSACK.knapsack(1, intArray31);
        int int40 = correct_java_programs.KNAPSACK.knapsack(30, intArray31);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray31);
        int int42 = correct_java_programs.KNAPSACK.knapsack(1, intArray31);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray31);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray31);
        int int45 = correct_java_programs.KNAPSACK.knapsack(100, intArray31);
        int int46 = correct_java_programs.KNAPSACK.knapsack(30, intArray31);
        int int47 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray31);
        int int48 = correct_java_programs.KNAPSACK.knapsack(30, intArray31);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7071");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7072");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7073");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7074");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        java.lang.Class<?> wildcardClass41 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7075");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7076");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7077");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7078");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7079");
        int[] intArray10 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray11 = new int[][] { intArray10 };
        int int12 = correct_java_programs.KNAPSACK.knapsack(0, intArray11);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray11);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray11);
        int int15 = correct_java_programs.KNAPSACK.knapsack(100, intArray11);
        int int16 = correct_java_programs.KNAPSACK.knapsack(10, intArray11);
        int int17 = correct_java_programs.KNAPSACK.knapsack(0, intArray11);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7080");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7081");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7082");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7083");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7084");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7085");
        int[] intArray10 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray11 = new int[][] { intArray10 };
        int int12 = correct_java_programs.KNAPSACK.knapsack(0, intArray11);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray11);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray11);
        int int15 = correct_java_programs.KNAPSACK.knapsack(10, intArray11);
        int int16 = correct_java_programs.KNAPSACK.knapsack(0, intArray11);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray11);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7086");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7087");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7088");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7089");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7090");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7091");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7092");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7093");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack(30, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7094");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7095");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7096");
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray31 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray32 = new int[][] { intArray24, intArray31 };
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray32);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray32);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray32);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray32);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray32);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray32);
        int int39 = correct_java_programs.KNAPSACK.knapsack(0, intArray32);
        int int40 = correct_java_programs.KNAPSACK.knapsack(1, intArray32);
        int int41 = correct_java_programs.KNAPSACK.knapsack(30, intArray32);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray32);
        int int43 = correct_java_programs.KNAPSACK.knapsack(1, intArray32);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray32);
        int int45 = correct_java_programs.KNAPSACK.knapsack(52, intArray32);
        int int46 = correct_java_programs.KNAPSACK.knapsack(1, intArray32);
        int int47 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray32);
        int int48 = correct_java_programs.KNAPSACK.knapsack(100, intArray32);
        int int49 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray32);
        int int50 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray32);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7097");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7098");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray29);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7099");
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray29 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray30 = new int[][] { intArray22, intArray29 };
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray30);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray30);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray30);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray30);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray30);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray30);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray30);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray30);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray30);
        int int40 = correct_java_programs.KNAPSACK.knapsack(100, intArray30);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray30);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray30);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray30);
        int int44 = correct_java_programs.KNAPSACK.knapsack(30, intArray30);
        int int45 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray30);
        int int46 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray30);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7100");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7101");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7102");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7103");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7104");
        int[] intArray14 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray15 = new int[][] { intArray14 };
        int int16 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray15);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray15);
        int int19 = correct_java_programs.KNAPSACK.knapsack(30, intArray15);
        int int20 = correct_java_programs.KNAPSACK.knapsack(52, intArray15);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray15);
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray15);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray15);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray15);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7105");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7106");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7107");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7108");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7109");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7110");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack(30, intArray29);
        java.lang.Class<?> wildcardClass45 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7111");
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray28 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7112");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7113");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7114");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7115");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7116");
        int[] intArray11 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray12 = new int[][] { intArray11 };
        int int13 = correct_java_programs.KNAPSACK.knapsack(0, intArray12);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray12);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray12);
        int int16 = correct_java_programs.KNAPSACK.knapsack(30, intArray12);
        int int17 = correct_java_programs.KNAPSACK.knapsack(52, intArray12);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray12);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray12);
        java.lang.Class<?> wildcardClass20 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7117");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7118");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack(30, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        java.lang.Class<?> wildcardClass43 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7119");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7120");
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray24 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((-1), intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7121");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7122");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7123");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7124");
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray22 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7125");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7126");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7127");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack(52, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack(52, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray29);
        java.lang.Class<?> wildcardClass45 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7128");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7129");
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray25 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7130");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        java.lang.Class<?> wildcardClass43 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7131");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack(30, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7132");
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray24 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7133");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7134");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7135");
        int[] intArray10 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray11 = new int[][] { intArray10 };
        int int12 = correct_java_programs.KNAPSACK.knapsack(0, intArray11);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray11);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray11);
        int int15 = correct_java_programs.KNAPSACK.knapsack(30, intArray11);
        int int16 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray11);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray11);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7136");
        int[] intArray11 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray12 = new int[][] { intArray11 };
        int int13 = correct_java_programs.KNAPSACK.knapsack(0, intArray12);
        int int14 = correct_java_programs.KNAPSACK.knapsack(0, intArray12);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray12);
        int int16 = correct_java_programs.KNAPSACK.knapsack(52, intArray12);
        int int17 = correct_java_programs.KNAPSACK.knapsack(0, intArray12);
        int int18 = correct_java_programs.KNAPSACK.knapsack(1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7137");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7138");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7139");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7140");
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray27 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7141");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7142");
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray30 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray31 = new int[][] { intArray23, intArray30 };
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray31);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray31);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray31);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray31);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray31);
        int int37 = correct_java_programs.KNAPSACK.knapsack(10, intArray31);
        int int38 = correct_java_programs.KNAPSACK.knapsack(100, intArray31);
        int int39 = correct_java_programs.KNAPSACK.knapsack(10, intArray31);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray31);
        int int41 = correct_java_programs.KNAPSACK.knapsack(1, intArray31);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray31);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray31);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray31);
        int int45 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray31);
        int int46 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray31);
        int int47 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray31);
        int int48 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray31);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7143");
        int[] intArray8 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray9 = new int[][] { intArray8 };
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int11 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int12 = correct_java_programs.KNAPSACK.knapsack(10, intArray9);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7144");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7145");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((-1), intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7146");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7147");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7148");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7149");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack(30, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7150");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7151");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7152");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7153");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7154");
        int[] intArray14 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray15 = new int[][] { intArray14 };
        int int16 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int17 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray15);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray15);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray15);
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int23 = correct_java_programs.KNAPSACK.knapsack(10, intArray15);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray15);
        int int25 = correct_java_programs.KNAPSACK.knapsack(1, intArray15);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7155");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7156");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7157");
        int[][] intArray7 = new int[][] {};
        int int8 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray7);
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray7);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray7);
        int int11 = correct_java_programs.KNAPSACK.knapsack(30, intArray7);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray7);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray7);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray7);
        java.lang.Class<?> wildcardClass15 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7158");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7159");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7160");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7161");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        java.lang.Class<?> wildcardClass43 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7162");
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray27 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack(30, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7163");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7164");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7165");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7166");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7167");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7168");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7169");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7170");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7171");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7172");
        int[][] intArray7 = new int[][] {};
        int int8 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray7);
        int int9 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray7);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray7);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray7);
        int int12 = correct_java_programs.KNAPSACK.knapsack(52, intArray7);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray7);
        int int14 = correct_java_programs.KNAPSACK.knapsack(10, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7173");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7174");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7175");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7176");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack(30, intArray29);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7177");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(52, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7178");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((-1), intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7179");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7180");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack(1, intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7181");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7182");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7183");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7184");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7185");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7186");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7187");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7188");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7189");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7190");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7191");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7192");
        int[] intArray9 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray10 = new int[][] { intArray9 };
        int int11 = correct_java_programs.KNAPSACK.knapsack(0, intArray10);
        int int12 = correct_java_programs.KNAPSACK.knapsack(0, intArray10);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray10);
        int int14 = correct_java_programs.KNAPSACK.knapsack(52, intArray10);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray10);
        java.lang.Class<?> wildcardClass16 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7193");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7194");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        java.lang.Class<?> wildcardClass43 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7195");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7196");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7197");
        int[] intArray15 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray16 = new int[][] { intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack(0, intArray16);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray16);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray16);
        int int20 = correct_java_programs.KNAPSACK.knapsack(30, intArray16);
        int int21 = correct_java_programs.KNAPSACK.knapsack(52, intArray16);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray16);
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray16);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray16);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray16);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray16);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray16);
        java.lang.Class<?> wildcardClass28 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7198");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack(30, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        java.lang.Class<?> wildcardClass45 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7199");
        int[] intArray10 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray11 = new int[][] { intArray10 };
        int int12 = correct_java_programs.KNAPSACK.knapsack(0, intArray11);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray11);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray11);
        int int15 = correct_java_programs.KNAPSACK.knapsack(30, intArray11);
        int int16 = correct_java_programs.KNAPSACK.knapsack(10, intArray11);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray11);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7200");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7201");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7202");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7203");
        int[][] intArray6 = new int[][] {};
        int int7 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray6);
        int int8 = correct_java_programs.KNAPSACK.knapsack(0, intArray6);
        int int9 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray6);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray6);
        int int11 = correct_java_programs.KNAPSACK.knapsack(30, intArray6);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7204");
        int[][] intArray7 = new int[][] {};
        int int8 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray7);
        int int9 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray7);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray7);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray7);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray7);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray7);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7205");
        int[] intArray10 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray16 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray22 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[][] intArray23 = new int[][] { intArray10, intArray16, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((-1), intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30 + "'", int25 == 30);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 30 + "'", int26 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7206");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7207");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7208");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7209");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack(30, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7210");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(30, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7211");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7212");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7213");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack(30, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7214");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack(52, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack(100, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray28);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7215");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7216");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7217");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        java.lang.Class<?> wildcardClass41 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7218");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7219");
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray32 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray33 = new int[][] { intArray25, intArray32 };
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray33);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray33);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray33);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray33);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray33);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray33);
        int int40 = correct_java_programs.KNAPSACK.knapsack(0, intArray33);
        int int41 = correct_java_programs.KNAPSACK.knapsack(1, intArray33);
        int int42 = correct_java_programs.KNAPSACK.knapsack(30, intArray33);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray33);
        int int44 = correct_java_programs.KNAPSACK.knapsack(1, intArray33);
        int int45 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray33);
        int int46 = correct_java_programs.KNAPSACK.knapsack(52, intArray33);
        int int47 = correct_java_programs.KNAPSACK.knapsack(1, intArray33);
        int int48 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray33);
        int int49 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray33);
        int int50 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray33);
        int int51 = correct_java_programs.KNAPSACK.knapsack(100, intArray33);
        int int52 = correct_java_programs.KNAPSACK.knapsack(1, intArray33);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7220");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7221");
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray26 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = correct_java_programs.KNAPSACK.knapsack((-1), intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7222");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7223");
        int[] intArray12 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray13 = new int[][] { intArray12 };
        int int14 = correct_java_programs.KNAPSACK.knapsack(0, intArray13);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray13);
        int int16 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray13);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray13);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray13);
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray13);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray13);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7224");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7225");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7226");
        int[][] intArray6 = new int[][] {};
        int int7 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray6);
        int int8 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray6);
        int int9 = correct_java_programs.KNAPSACK.knapsack(1, intArray6);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray6);
        int int11 = correct_java_programs.KNAPSACK.knapsack(0, intArray6);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7227");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7228");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7229");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7230");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        java.lang.Class<?> wildcardClass41 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7231");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7232");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7233");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7234");
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray26 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7235");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7236");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7237");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(52, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((-1), intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7238");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack(52, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7239");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7240");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7241");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7242");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7243");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7244");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7245");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7246");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7247");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((-1), intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7248");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7249");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7250");
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray31 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray32 = new int[][] { intArray24, intArray31 };
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray32);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray32);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray32);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray32);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray32);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray32);
        int int39 = correct_java_programs.KNAPSACK.knapsack(0, intArray32);
        int int40 = correct_java_programs.KNAPSACK.knapsack(1, intArray32);
        int int41 = correct_java_programs.KNAPSACK.knapsack(30, intArray32);
        int int42 = correct_java_programs.KNAPSACK.knapsack(52, intArray32);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray32);
        int int44 = correct_java_programs.KNAPSACK.knapsack(30, intArray32);
        int int45 = correct_java_programs.KNAPSACK.knapsack(1, intArray32);
        int int46 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray32);
        int int47 = correct_java_programs.KNAPSACK.knapsack(1, intArray32);
        int int48 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray32);
        int int49 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray32);
        int int50 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray32);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7251");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7252");
        int[] intArray11 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray12 = new int[][] { intArray11 };
        int int13 = correct_java_programs.KNAPSACK.knapsack(0, intArray12);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray12);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray12);
        int int16 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray12);
        int int17 = correct_java_programs.KNAPSACK.knapsack(10, intArray12);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray12);
        int int19 = correct_java_programs.KNAPSACK.knapsack(100, intArray12);
        java.lang.Class<?> wildcardClass20 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7253");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7254");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7255");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7256");
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray24 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7257");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7258");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7259");
        int[] intArray14 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray15 = new int[][] { intArray14 };
        int int16 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray15);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray15);
        int int19 = correct_java_programs.KNAPSACK.knapsack(30, intArray15);
        int int20 = correct_java_programs.KNAPSACK.knapsack(52, intArray15);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray15);
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray15);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray15);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7260");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7261");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7262");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7263");
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray26 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        java.lang.Class<?> wildcardClass41 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7264");
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray22 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7265");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7266");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7267");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7268");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7269");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7270");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7271");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7272");
        int[] intArray11 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray12 = new int[][] { intArray11 };
        int int13 = correct_java_programs.KNAPSACK.knapsack(0, intArray12);
        int int14 = correct_java_programs.KNAPSACK.knapsack(0, intArray12);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray12);
        int int16 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray12);
        int int17 = correct_java_programs.KNAPSACK.knapsack(52, intArray12);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray12);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray12);
        java.lang.Class<?> wildcardClass20 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7273");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7274");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7275");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7276");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7277");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7278");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(52, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7279");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack(10, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7280");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7281");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7282");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(10, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(30, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7283");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7284");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7285");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7286");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7287");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7288");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7289");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7290");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7291");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7292");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7293");
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray29 = new int[][] { intArray21, intArray28 };
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray29);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray29);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray29);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray29);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray29);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray29);
        int int39 = correct_java_programs.KNAPSACK.knapsack(100, intArray29);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray29);
        int int41 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray29);
        int int42 = correct_java_programs.KNAPSACK.knapsack(1, intArray29);
        int int43 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray29);
        int int44 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray29);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7294");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7295");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7296");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7297");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7298");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7299");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7300");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7301");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray27);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray27);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7302");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7303");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7304");
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray25 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7305");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7306");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKNAPSACKPatched14.test7307");
        int[] intArray13 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray19 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray25 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[][] intArray26 = new int[][] { intArray13, intArray19, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 30 + "'", int28 == 30);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30 + "'", int30 == 30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 30 + "'", int31 == 30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 30 + "'", int33 == 30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 30 + "'", int34 == 30);
    }
}

