import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.fasterxml.jackson.annotation.JsonFormat.Value value0 = com.fasterxml.jackson.databind.BeanProperty.EMPTY_FORMAT;
        java.lang.Class<?> wildcardClass1 = value0.getClass();
        org.junit.Assert.assertNotNull(value0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.fasterxml.jackson.annotation.JsonInclude.Value value0 = com.fasterxml.jackson.databind.BeanProperty.EMPTY_INCLUDE;
        java.lang.Class<?> wildcardClass1 = value0.getClass();
        org.junit.Assert.assertNotNull(value0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

