package org.springframework.cloud.gcp.storage;

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
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.cloud.storage.Storage storage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            GoogleStorageResourceObject googleStorageResourceObject2 = new GoogleStorageResourceObject(storage0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Storage object can not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.google.cloud.storage.Storage storage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            GoogleStorageResourceObject googleStorageResourceObject2 = new GoogleStorageResourceObject(storage0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Storage object can not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.google.cloud.storage.Storage storage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            GoogleStorageResourceObject googleStorageResourceObject3 = new GoogleStorageResourceObject(storage0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Storage object can not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.google.cloud.storage.Storage storage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            GoogleStorageResourceObject googleStorageResourceObject3 = new GoogleStorageResourceObject(storage0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Storage object can not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.google.cloud.storage.Storage storage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            GoogleStorageResourceObject googleStorageResourceObject3 = new GoogleStorageResourceObject(storage0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Storage object can not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        com.google.cloud.storage.Storage storage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            GoogleStorageResourceObject googleStorageResourceObject3 = new GoogleStorageResourceObject(storage0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Storage object can not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

