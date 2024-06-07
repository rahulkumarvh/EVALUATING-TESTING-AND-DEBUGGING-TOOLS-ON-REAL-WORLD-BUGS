import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestDETECT_CYCLEPatched0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestDETECT_CYCLEPatched0.test1");
        java_programs.Node node0 = null;
        boolean boolean1 = correct_java_programs.DETECT_CYCLE.detect_cycle(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestDETECT_CYCLEPatched0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestDETECT_CYCLEPatched0.test3");
        correct_java_programs.DETECT_CYCLE dETECT_CYCLE0 = new correct_java_programs.DETECT_CYCLE();
        java.lang.Class<?> wildcardClass1 = dETECT_CYCLE0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

