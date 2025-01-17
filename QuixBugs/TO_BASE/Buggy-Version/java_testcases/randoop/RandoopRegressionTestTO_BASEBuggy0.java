import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestTO_BASEBuggy0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test001");
        java_programs.TO_BASE tO_BASE0 = new java_programs.TO_BASE();
        java.lang.Class<?> wildcardClass1 = tO_BASE0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test002");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test004");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test005");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test006");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test007");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "79" + "'", str2, "79");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test008");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test009");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test010");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test011");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test012");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test014");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test016");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test017");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test018");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "43" + "'", str2, "43");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test019");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test020");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test021");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test022");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test023");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "79" + "'", str2, "79");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test024");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test025");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test026");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test027");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test029");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test030");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "R2" + "'", str2, "R2");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test031");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test032");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "W" + "'", str2, "W");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test033");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test034");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test036");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "W" + "'", str2, "W");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test037");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test038");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "W" + "'", str2, "W");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test039");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test040");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test041");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test042");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test043");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test044");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test045");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "43" + "'", str2, "43");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test046");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test047");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "31" + "'", str2, "31");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test048");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test049");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test050");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test052");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test053");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test054");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test055");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test056");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test057");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test059");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test060");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test061");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test064");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test065");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test066");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test067");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test068");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001" + "'", str2, "001");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test069");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test070");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test071");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test072");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test073");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test074");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test075");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test076");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test077");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test078");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test079");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test082");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test083");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test085");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test086");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test087");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test088");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test089");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test090");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "31" + "'", str2, "31");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test091");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test092");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test093");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test094");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test095");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test096");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test097");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test098");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test099");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 45");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test102");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "W" + "'", str2, "W");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test103");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test104");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test105");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test106");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test107");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test108");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "79" + "'", str2, "79");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test111");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test112");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test115");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test117");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test118");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test119");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test120");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test122");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test123");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test124");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test126");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test127");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "25" + "'", str2, "25");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test128");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test129");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test130");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test131");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test132");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test133");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test135");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test136");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test137");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test139");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test140");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test141");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test142");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test143");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test144");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test145");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test146");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test147");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test148");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test149");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test150");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "K1" + "'", str2, "K1");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test151");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test152");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test153");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test154");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001" + "'", str2, "001");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test155");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test156");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test157");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "25" + "'", str2, "25");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test158");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test159");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test160");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001" + "'", str2, "001");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test161");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test162");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "13" + "'", str2, "13");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test163");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test164");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test165");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test166");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23" + "'", str2, "23");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test168");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test169");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test170");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test171");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test173");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test174");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test175");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test176");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23" + "'", str2, "23");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test177");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test178");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "W" + "'", str2, "W");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test179");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test180");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test181");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test182");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test183");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test184");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test186");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test187");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test188");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23" + "'", str2, "23");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test189");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "31" + "'", str2, "31");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test190");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test191");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test192");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "25" + "'", str2, "25");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test193");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test194");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test195");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "W" + "'", str2, "W");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test196");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001" + "'", str2, "001");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test197");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test198");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001" + "'", str2, "001");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test199");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test200");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001" + "'", str2, "001");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test201");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test202");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test203");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test204");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test205");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test206");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test207");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test208");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test209");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001" + "'", str2, "001");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test210");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test211");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test213");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test214");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test215");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test216");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test218");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test219");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test220");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test221");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test222");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test223");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test224");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test225");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test227");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test228");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test229");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test230");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test231");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test233");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test234");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test235");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test236");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U2" + "'", str2, "U2");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test237");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test238");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test239");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test240");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test241");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test242");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test243");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test244");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test245");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test246");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test247");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test248");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test249");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test250");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test251");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test252");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test253");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001" + "'", str2, "001");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test254");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test255");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test256");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test258");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test259");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test260");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test261");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test262");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test264");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test265");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test266");
        java.lang.String str2 = java_programs.TO_BASE.to_base(0, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test267");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test268");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test269");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test271");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "53" + "'", str2, "53");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test272");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test273");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test274");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test275");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "31" + "'", str2, "31");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test276");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test277");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test278");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test279");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test280");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001" + "'", str2, "001");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test281");
        java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test282");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U2" + "'", str2, "U2");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test283");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test284");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test285");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test286");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test287");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test288");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "53" + "'", str2, "53");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test290");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "53" + "'", str2, "53");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test291");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test292");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test293");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test294");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test295");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test296");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "43" + "'", str2, "43");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test297");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test298");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test299");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test300");
        java.lang.String str2 = java_programs.TO_BASE.to_base(10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test302");
        java.lang.String str2 = java_programs.TO_BASE.to_base(100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01" + "'", str2, "01");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test303");
        java.lang.String str2 = java_programs.TO_BASE.to_base((-1), (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test304");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test305");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test306");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test307");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test308");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test309");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test310");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test311");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '#', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test312");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test314");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) '4', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H1" + "'", str2, "H1");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test315");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test316");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test318");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test319");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test320");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test321");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test322");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test323");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U2" + "'", str2, "U2");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestTO_BASEBuggy0.test324");
        java.lang.String str2 = java_programs.TO_BASE.to_base((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }
}

