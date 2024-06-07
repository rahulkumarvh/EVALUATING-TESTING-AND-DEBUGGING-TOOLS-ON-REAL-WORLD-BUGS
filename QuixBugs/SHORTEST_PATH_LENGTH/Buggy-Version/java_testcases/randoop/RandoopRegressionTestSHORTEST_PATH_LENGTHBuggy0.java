import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestSHORTEST_PATH_LENGTHBuggy0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestSHORTEST_PATH_LENGTHBuggy0.test1");
        java.util.Map<java.util.List<java_programs.Node>, java.lang.Integer> nodeListMap0 = null;
        java_programs.Node node1 = null;
        java_programs.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = java_programs.SHORTEST_PATH_LENGTH.shortest_path_length(nodeListMap0, node1, node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestSHORTEST_PATH_LENGTHBuggy0.test2");
        java.util.Map<java_programs.Node, java.lang.Integer> nodeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java_programs.Node node1 = java_programs.SHORTEST_PATH_LENGTH.getNodeWithMinDistance(nodeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestSHORTEST_PATH_LENGTHBuggy0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestSHORTEST_PATH_LENGTHBuggy0.test4");
        java_programs.SHORTEST_PATH_LENGTH sHORTEST_PATH_LENGTH0 = new java_programs.SHORTEST_PATH_LENGTH();
        java.lang.Class<?> wildcardClass1 = sHORTEST_PATH_LENGTH0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

