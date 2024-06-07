package org.mockito.internal.creation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        java.lang.reflect.Method method0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.mockito.internal.creation.DelegatingMethod delegatingMethod1 = new org.mockito.internal.creation.DelegatingMethod(method0);
    }
}

