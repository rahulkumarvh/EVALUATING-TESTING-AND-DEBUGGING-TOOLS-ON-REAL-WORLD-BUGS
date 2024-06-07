package com.fasterxml.jackson.databind.deser.std;

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
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes0 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
        org.junit.Assert.assertNotNull(contextAttributes0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    }
}

