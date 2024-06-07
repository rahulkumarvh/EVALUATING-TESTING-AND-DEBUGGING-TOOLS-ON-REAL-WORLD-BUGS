import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestDETECT_CYCLEBuggy0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestDETECT_CYCLEBuggy0.test1");
        java_programs.DETECT_CYCLE dETECT_CYCLE0 = new java_programs.DETECT_CYCLE();
        java.lang.Class<?> wildcardClass1 = dETECT_CYCLE0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestDETECT_CYCLEBuggy0.test2");
        java_programs.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = java_programs.DETECT_CYCLE.detect_cycle(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestDETECT_CYCLEBuggy0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

