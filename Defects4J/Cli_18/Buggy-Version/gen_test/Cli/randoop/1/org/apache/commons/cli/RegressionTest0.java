package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = posixParser0.parse(options2, strArray3, properties4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        java.util.ListIterator listIterator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("", listIterator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = posixParser0.flatten(options1, strArray2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = posixParser0.parse(options2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = null;
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = posixParser0.parse(options12, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.util.Properties properties25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = posixParser0.parse(options12, strArray22, properties25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.lang.String[] strArray26 = posixParser0.flatten(options12, strArray24, false);
        org.apache.commons.cli.Options options27 = posixParser0.getOptions();
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = posixParser29.getOptions();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray40 = posixParser29.flatten(options31, strArray38, false);
        org.apache.commons.cli.Options options41 = null;
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = posixParser42.getOptions();
        org.apache.commons.cli.Options options44 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray53 = posixParser42.flatten(options44, strArray51, false);
        java.lang.String[] strArray55 = posixParser29.flatten(options41, strArray53, false);
        org.apache.commons.cli.CommandLine commandLine56 = new org.apache.commons.cli.CommandLine();
        java.lang.String str59 = commandLine56.getOptionValue("hi!", "");
        java.util.Properties properties61 = commandLine56.getOptionProperties("org.apache.commons.cli.UnrecognizedOptionException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine63 = posixParser0.parse(options28, strArray53, properties61, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(options27);
        org.junit.Assert.assertNull(options30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNull(options43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(properties61);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = posixParser2.getOptions();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray13 = posixParser2.flatten(options4, strArray11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options1, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = posixParser2.getOptions();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray13 = posixParser2.flatten(options4, strArray11, false);
        org.apache.commons.cli.Options options14 = null;
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = posixParser15.getOptions();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray26 = posixParser15.flatten(options17, strArray24, false);
        java.lang.String[] strArray28 = posixParser2.flatten(options14, strArray26, false);
        org.apache.commons.cli.CommandLine commandLine29 = new org.apache.commons.cli.CommandLine();
        java.lang.String str32 = commandLine29.getOptionValue("hi!", "");
        java.util.Properties properties34 = commandLine29.getOptionProperties("org.apache.commons.cli.UnrecognizedOptionException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine36 = posixParser0.parse(options1, strArray26, properties34, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.lang.String[] strArray26 = posixParser0.flatten(options12, strArray24, false);
        org.apache.commons.cli.Options options27 = posixParser0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("org.apache.commons.cli.UnrecognizedOptionException: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(options27);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.lang.String[] strArray26 = posixParser0.flatten(options12, strArray24, false);
        org.apache.commons.cli.Options options27 = posixParser0.getOptions();
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = posixParser29.getOptions();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray40 = posixParser29.flatten(options31, strArray38, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine41 = posixParser0.parse(options28, strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(options27);
        org.junit.Assert.assertNull(options30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        org.apache.commons.cli.Options options25 = null;
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = posixParser26.getOptions();
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray37 = posixParser26.flatten(options28, strArray35, false);
        java.lang.String[] strArray39 = posixParser13.flatten(options25, strArray37, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine41 = posixParser0.parse(options12, strArray39, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(options27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str6 = option5.getDescription();
        org.apache.commons.cli.MissingArgumentException missingArgumentException7 = new org.apache.commons.cli.MissingArgumentException(option5);
        org.apache.commons.cli.Option option8 = missingArgumentException7.getOption();
        java.lang.String[] strArray9 = option8.getValues();
        java.util.ListIterator listIterator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option8, listIterator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(option8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.lang.String[] strArray26 = posixParser0.flatten(options12, strArray24, false);
        java.util.ListIterator listIterator28 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("org.apache.commons.cli.UnrecognizedOptionException: ", listIterator28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.lang.String[] strArray26 = posixParser0.flatten(options12, strArray24, false);
        org.apache.commons.cli.Options options27 = posixParser0.getOptions();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options31 = null;
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options33 = posixParser32.getOptions();
        org.apache.commons.cli.Options options34 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray43 = posixParser32.flatten(options34, strArray41, false);
        org.apache.commons.cli.Options options44 = null;
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = posixParser45.getOptions();
        org.apache.commons.cli.Options options47 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray56 = posixParser45.flatten(options47, strArray54, false);
        java.lang.String[] strArray58 = posixParser32.flatten(options44, strArray56, false);
        org.apache.commons.cli.CommandLine commandLine59 = new org.apache.commons.cli.CommandLine();
        java.lang.String str62 = commandLine59.getOptionValue("hi!", "");
        java.util.Properties properties64 = commandLine59.getOptionProperties("org.apache.commons.cli.UnrecognizedOptionException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine66 = posixParser0.parse(options31, strArray58, properties64, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(options27);
        org.junit.Assert.assertNull(options33);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNull(options46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        java.util.Properties properties2 = null;
        posixParser0.processProperties(properties2);
        java.util.ListIterator listIterator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("", listIterator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = posixParser0.parse(options12, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("", "", true, "");
        java.util.List list7 = option6.getValuesList();
        java.lang.String[] strArray8 = option6.getValues();
        java.lang.String str10 = option6.getValue("org.apache.commons.cli.UnrecognizedOptionException: ");
        option6.setRequired(true);
        java.util.ListIterator listIterator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option6, listIterator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str10, "org.apache.commons.cli.UnrecognizedOptionException: ");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str6 = option5.getDescription();
        org.apache.commons.cli.MissingArgumentException missingArgumentException7 = new org.apache.commons.cli.MissingArgumentException(option5);
        org.apache.commons.cli.Option option8 = missingArgumentException7.getOption();
        java.util.ListIterator listIterator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option8, listIterator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(option8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        java.util.Properties properties2 = null;
        posixParser0.processProperties(properties2);
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: ", "[ option:    [ARG] ::  ]", "hi!", "arg", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: " };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = posixParser0.parse(options4, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "", true, "");
        java.util.List list17 = option16.getValuesList();
        java.lang.String[] strArray18 = option16.getValues();
        java.lang.String str20 = option16.getValue("org.apache.commons.cli.UnrecognizedOptionException: ");
        boolean boolean21 = option16.hasValueSeparator();
        java.lang.String str22 = option16.toString();
        option16.clearValues();
        java.util.ListIterator listIterator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option16, listIterator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str20, "org.apache.commons.cli.UnrecognizedOptionException: ");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ option:    [ARG] ::  ]" + "'", str22, "[ option:    [ARG] ::  ]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = posixParser0.getOptions();
        org.apache.commons.cli.Options options3 = null;
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options5 = posixParser4.getOptions();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray15 = posixParser4.flatten(options6, strArray13, false);
        org.apache.commons.cli.Options options16 = null;
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options18 = posixParser17.getOptions();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray28 = posixParser17.flatten(options19, strArray26, false);
        java.lang.String[] strArray30 = posixParser4.flatten(options16, strArray28, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine32 = posixParser0.parse(options3, strArray28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(options18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.setOptions(options1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = posixParser1.getOptions();
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray12 = posixParser1.flatten(options3, strArray10, false);
        org.apache.commons.cli.Options options13 = null;
        org.apache.commons.cli.PosixParser posixParser14 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options15 = posixParser14.getOptions();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray25 = posixParser14.flatten(options16, strArray23, false);
        java.lang.String[] strArray27 = posixParser1.flatten(options13, strArray25, false);
        org.apache.commons.cli.Options options28 = null;
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = posixParser29.getOptions();
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray40 = posixParser29.flatten(options31, strArray38, false);
        java.lang.String[] strArray42 = posixParser1.flatten(options28, strArray38, false);
        org.apache.commons.cli.CommandLine commandLine43 = new org.apache.commons.cli.CommandLine();
        java.lang.String str46 = commandLine43.getOptionValue("hi!", "");
        java.util.Properties properties48 = commandLine43.getOptionProperties("org.apache.commons.cli.UnrecognizedOptionException: ");
        posixParser1.processProperties(properties48);
        posixParser0.processProperties(properties48);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNull(options30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(properties48);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = posixParser0.getOptions();
        org.apache.commons.cli.CommandLine commandLine3 = posixParser0.cmd;
        java.util.ListIterator listIterator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("hi!", listIterator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = posixParser0.getOptions();
        org.apache.commons.cli.CommandLine commandLine3 = posixParser0.cmd;
        org.apache.commons.cli.Options options4 = posixParser0.getOptions();
        java.util.List list5 = posixParser0.getRequiredOptions();
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(list5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.lang.String[] strArray26 = posixParser0.flatten(options12, strArray24, false);
        org.apache.commons.cli.Options options27 = null;
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = posixParser28.getOptions();
        org.apache.commons.cli.Options options30 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray39 = posixParser28.flatten(options30, strArray37, false);
        java.lang.String[] strArray41 = posixParser0.flatten(options27, strArray37, false);
        org.apache.commons.cli.CommandLine commandLine42 = new org.apache.commons.cli.CommandLine();
        java.lang.String str45 = commandLine42.getOptionValue("hi!", "");
        java.util.Properties properties47 = commandLine42.getOptionProperties("org.apache.commons.cli.UnrecognizedOptionException: ");
        posixParser0.processProperties(properties47);
        org.apache.commons.cli.Option option53 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str54 = option53.getDescription();
        org.apache.commons.cli.MissingArgumentException missingArgumentException55 = new org.apache.commons.cli.MissingArgumentException(option53);
        org.apache.commons.cli.Option option56 = missingArgumentException55.getOption();
        java.util.ListIterator listIterator57 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option56, listIterator57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(options29);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(option56);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = posixParser0.getOptions();
        org.apache.commons.cli.CommandLine commandLine3 = posixParser0.cmd;
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", "", true, "");
        java.util.List list9 = option8.getValuesList();
        java.lang.String[] strArray10 = option8.getValues();
        java.lang.String str12 = option8.getValue("org.apache.commons.cli.UnrecognizedOptionException: ");
        option8.setRequired(true);
        option8.clearValues();
        java.util.ListIterator listIterator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option8, listIterator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: " + "'", str12, "org.apache.commons.cli.UnrecognizedOptionException: ");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.lang.String[] strArray26 = posixParser0.flatten(options12, strArray24, false);
        org.apache.commons.cli.Options options27 = posixParser0.getOptions();
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        org.apache.commons.cli.Options options34 = null;
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = posixParser35.getOptions();
        org.apache.commons.cli.Options options37 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray46 = posixParser35.flatten(options37, strArray44, false);
        org.apache.commons.cli.Options options47 = null;
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options49 = posixParser48.getOptions();
        org.apache.commons.cli.Options options50 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray59 = posixParser48.flatten(options50, strArray57, false);
        java.lang.String[] strArray61 = posixParser35.flatten(options47, strArray59, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine62 = posixParser0.parse(options34, strArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(options27);
        org.junit.Assert.assertNull(options36);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNull(options49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray61);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        java.util.Properties properties2 = null;
        posixParser0.processProperties(properties2);
        org.apache.commons.cli.Options options4 = null;
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.lang.String str8 = commandLine5.getOptionValue("hi!", "");
        java.util.Properties properties10 = commandLine5.getOptionProperties("org.apache.commons.cli.UnrecognizedOptionException: ");
        java.lang.String str13 = commandLine5.getOptionValue('#', "hi!");
        java.lang.String[] strArray14 = commandLine5.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = posixParser0.parse(options4, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.lang.String[] strArray26 = posixParser0.flatten(options12, strArray24, false);
        org.apache.commons.cli.Options options27 = posixParser0.getOptions();
        posixParser0.burstToken("", false);
        java.util.List list31 = posixParser0.getRequiredOptions();
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(options27);
        org.junit.Assert.assertNull(list31);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str5 = option4.getDescription();
        org.apache.commons.cli.MissingArgumentException missingArgumentException6 = new org.apache.commons.cli.MissingArgumentException(option4);
        org.apache.commons.cli.Option option7 = missingArgumentException6.getOption();
        org.apache.commons.cli.Option option8 = missingArgumentException6.getOption();
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = posixParser9.getOptions();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray20 = posixParser9.flatten(options11, strArray18, false);
        org.apache.commons.cli.Options options21 = null;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = posixParser22.getOptions();
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray33 = posixParser22.flatten(options24, strArray31, false);
        java.lang.String[] strArray35 = posixParser9.flatten(options21, strArray33, false);
        org.apache.commons.cli.Options options36 = null;
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = posixParser37.getOptions();
        org.apache.commons.cli.Options options39 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray48 = posixParser37.flatten(options39, strArray46, false);
        java.lang.String[] strArray50 = posixParser9.flatten(options36, strArray46, false);
        option8.setType((java.lang.Object) strArray46);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(option7);
        org.junit.Assert.assertNotNull(option8);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNull(options23);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNull(options38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray50);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.lang.String[] strArray26 = posixParser0.flatten(options12, strArray24, false);
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = posixParser0.getOptions();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = posixParser0.flatten(options2, strArray9, false);
        org.apache.commons.cli.Options options12 = null;
        org.apache.commons.cli.PosixParser posixParser13 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options14 = posixParser13.getOptions();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = posixParser13.flatten(options15, strArray22, false);
        java.lang.String[] strArray26 = posixParser0.flatten(options12, strArray24, false);
        org.apache.commons.cli.Options options27 = posixParser0.getOptions();
        posixParser0.burstToken("", false);
        org.apache.commons.cli.Options options31 = null;
        java.lang.String[] strArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine34 = posixParser0.parse(options31, strArray32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(options27);
    }
}

