package org.traccar.protocol;

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
        H02Protocol h02Protocol0 = null;
        H02ProtocolDecoder h02ProtocolDecoder1 = new H02ProtocolDecoder(h02Protocol0);
        org.traccar.model.Position position2 = null;
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02ProtocolDecoder1.getLastLocation(position2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        H02Protocol h02Protocol0 = null;
        H02ProtocolDecoder h02ProtocolDecoder1 = new H02ProtocolDecoder(h02Protocol0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02ProtocolDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        H02Protocol h02Protocol0 = null;
        H02ProtocolDecoder h02ProtocolDecoder1 = new H02ProtocolDecoder(h02Protocol0);
        Class<?> wildcardClass2 = h02ProtocolDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        H02Protocol h02Protocol0 = null;
        H02ProtocolDecoder h02ProtocolDecoder1 = new H02ProtocolDecoder(h02Protocol0);
        // The following exception was thrown during execution in test generation
        try {
            String str2 = h02ProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

