package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.lang.String[] strArray8 = commandLine6.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine6.getOptions();
        java.lang.Object obj11 = commandLine6.getOptionObject('4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.lang.String[] strArray8 = commandLine6.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine6.getOptions();
        boolean boolean11 = commandLine6.hasOption(' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String[] strArray13 = commandLine12.getArgs();
        boolean boolean15 = commandLine12.hasOption("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options9 = options3.addOption("org.apache.commons.cli.MissingArgumentException: ", "org.apache.commons.cli.MissingArgumentException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'org.apache.commons.cli.MissingArgumentException: ' contains an illegal character : '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.lang.String[] strArray8 = commandLine6.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine6.getOptions();
        java.lang.Object obj11 = commandLine6.getOptionObject(' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options4 = options0.addOptionGroup(optionGroup3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options7 = options0.addOption("[ option:   ::  :: class java.lang.String ]", "hi!", false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   ::  :: class java.lang.String ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.OptionGroup optionGroup1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options2 = options0.addOptionGroup(optionGroup1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        boolean boolean27 = options16.hasShortOption("hi!");
        java.util.List list28 = options16.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser29 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str30 = defaultParser29.currentToken;
        org.apache.commons.cli.CommandLine commandLine31 = defaultParser29.cmd;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options32.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser29.parse(options32, strArray34);
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser0.parse(options16, strArray34, false);
        org.apache.commons.cli.OptionGroup optionGroup38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options39 = options16.addOptionGroup(optionGroup38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(commandLine31);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(commandLine37);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = options7.getOptions();
        java.lang.String[] strArray9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray9);
        java.lang.Object obj12 = commandLine10.getOptionObject("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options6 = options0.addOption("hi!", true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options17 = options3.addOption("[ Options: [ short {} ] [ long {} ]", "[ Options: [ short {} ] [ long {} ]", false, "[ Options: [ short {} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.DefaultParser defaultParser5 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str6 = defaultParser5.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser5.cmd;
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options8.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options8, strArray10);
        java.util.List list12 = options8.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options16, strArray18);
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options8, strArray18, false);
        org.apache.commons.cli.Option option23 = options8.getOption("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(option23);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.DefaultParser defaultParser5 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str6 = defaultParser5.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser5.cmd;
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options8.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options8, strArray10);
        java.util.List list12 = options8.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options16, strArray18);
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options8, strArray18, false);
        java.lang.Class<?> wildcardClass22 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.util.List list13 = options3.getRequiredOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str15 = commandLine12.getOptionValue(' ', "hi!");
        java.lang.String str18 = commandLine12.getOptionValue('a', "hi!");
        boolean boolean20 = commandLine12.hasOption('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.DefaultParser defaultParser5 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str6 = defaultParser5.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser5.cmd;
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options8.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options8, strArray10);
        java.util.List list12 = options8.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options16, strArray18);
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options8, strArray18, false);
        org.apache.commons.cli.DefaultParser defaultParser22 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str23 = defaultParser22.currentToken;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser22.cmd;
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options25.getOptions();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine28 = defaultParser22.parse(options25, strArray27);
        java.util.List list29 = options25.getRequiredOptions();
        boolean boolean31 = options25.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.CommandLine commandLine32 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray33 = commandLine32.getArgs();
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser0.parse(options25, strArray33, true);
        boolean boolean36 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(commandLine24);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str15 = commandLine12.getOptionValue(' ', "hi!");
        java.lang.String[] strArray17 = commandLine12.getOptionValues("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.lang.String str7 = options3.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str7, "[ Options: [ short {} ] [ long {} ]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        boolean boolean14 = options3.hasShortOption("hi!");
        java.util.List list15 = options3.getRequiredOptions();
        java.util.List list16 = options3.getRequiredOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options21 = options3.addOption("[ option:   ::  :: class java.lang.String ]", "hi!", false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   ::  :: class java.lang.String ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        commandLine6.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.lang.String str10 = commandLine6.getOptionValue("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options6 = options0.addOption("[ Options: [ short {} ] [ long {} ]", "[ option:   ::  :: class java.lang.String ]", true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.lang.String[] strArray8 = commandLine6.getOptionValues("hi!");
        java.lang.String[] strArray10 = commandLine6.getOptionValues("");
        java.util.Iterator<org.apache.commons.cli.Option> optionItor11 = commandLine6.iterator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(optionItor11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        boolean boolean27 = options16.hasShortOption("hi!");
        java.util.List list28 = options16.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser29 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str30 = defaultParser29.currentToken;
        org.apache.commons.cli.CommandLine commandLine31 = defaultParser29.cmd;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options32.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser29.parse(options32, strArray34);
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser0.parse(options16, strArray34, false);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection38 = options16.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection39 = options16.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(commandLine31);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(optionGroupCollection38);
        org.junit.Assert.assertNotNull(optionCollection39);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser8 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str9 = defaultParser8.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser8.cmd;
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options11.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        org.apache.commons.cli.CommandLine commandLine20 = defaultParser8.parse(options11, strArray18, properties19);
        java.lang.String str22 = commandLine20.getOptionValue("hi!");
        java.util.Properties properties24 = commandLine20.getOptionProperties("");
        java.lang.String str27 = commandLine20.getOptionValue("hi!", "");
        java.lang.Object obj29 = commandLine20.getParsedOptionValue("");
        defaultParser0.cmd = commandLine20;
        java.lang.String[] strArray32 = commandLine20.getOptionValues('4');
        java.lang.Object obj34 = commandLine20.getOptionObject('4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("hi!");
        java.util.Properties properties16 = commandLine12.getOptionProperties("");
        java.lang.String str19 = commandLine12.getOptionValue("hi!", "");
        java.util.Properties properties21 = commandLine12.getOptionProperties("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.lang.String[] strArray8 = commandLine6.getOptionValues("hi!");
        java.lang.String[] strArray10 = commandLine6.getOptionValues("");
        boolean boolean12 = commandLine6.hasOption("[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.DefaultParser defaultParser5 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str6 = defaultParser5.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser5.cmd;
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options8.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options8, strArray10);
        java.util.List list12 = options8.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options16, strArray18);
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options8, strArray18, false);
        org.apache.commons.cli.Options options22 = defaultParser0.options;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(options22);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList6 = option5.getValuesList();
        org.apache.commons.cli.Options options7 = options0.addOption(option5);
        boolean boolean8 = option5.hasLongOpt();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str3 = defaultParser2.currentToken;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser2.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options5.getOptions();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser2.parse(options5, strArray7);
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String[] strArray11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser2.parse(options9, strArray11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options9, strArray23);
        java.lang.Object obj28 = commandLine26.getParsedOptionValue("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.lang.String str6 = options5.toString();
        boolean boolean8 = options5.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        defaultParser0.options = options5;
        boolean boolean11 = options5.hasShortOption("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options8 = options0.addOption("org.apache.commons.cli.MissingOptionException: Missing required options: ", "[ Options: [ short {} ] [ long {} ]", false, "org.apache.commons.cli.MissingArgumentException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'org.apache.commons.cli.MissingOptionException: Missing required options: ' contains an illegal character : '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean12 = option11.requiresArg();
        java.lang.String str13 = option11.toString();
        org.apache.commons.cli.OptionGroup optionGroup14 = options3.getOptionGroup(option11);
        java.util.List list15 = options3.getRequiredOptions();
        java.lang.String str16 = options3.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str13, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(optionGroup14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str16, "[ Options: [ short {} ] [ long {} ]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.DefaultParser defaultParser4 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str5 = defaultParser4.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser6 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str7 = defaultParser6.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser6.cmd;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser6.parse(options9, strArray11);
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options13.getOptions();
        java.lang.String[] strArray15 = null;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser6.parse(options13, strArray15);
        org.apache.commons.cli.DefaultParser defaultParser17 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str18 = defaultParser17.currentToken;
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser17.cmd;
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options20.getOptions();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties28 = null;
        org.apache.commons.cli.CommandLine commandLine29 = defaultParser17.parse(options20, strArray27, properties28);
        org.apache.commons.cli.CommandLine commandLine30 = defaultParser4.parse(options13, strArray27);
        org.apache.commons.cli.DefaultParser defaultParser31 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str32 = defaultParser31.currentToken;
        org.apache.commons.cli.CommandLine commandLine33 = defaultParser31.cmd;
        boolean boolean34 = defaultParser31.skipParsing;
        defaultParser31.handleConcatenatedOptions("");
        defaultParser31.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser39 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str40 = defaultParser39.currentToken;
        org.apache.commons.cli.CommandLine commandLine41 = defaultParser39.cmd;
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection43 = options42.getOptions();
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine51 = defaultParser39.parse(options42, strArray49, properties50);
        org.apache.commons.cli.DefaultParser defaultParser52 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str53 = defaultParser52.currentToken;
        org.apache.commons.cli.CommandLine commandLine54 = defaultParser52.cmd;
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection56 = options55.getOptions();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = defaultParser52.parse(options55, strArray62, properties63);
        boolean boolean66 = options55.hasShortOption("hi!");
        java.util.List list67 = options55.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser68 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str69 = defaultParser68.currentToken;
        org.apache.commons.cli.CommandLine commandLine70 = defaultParser68.cmd;
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection72 = options71.getOptions();
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine74 = defaultParser68.parse(options71, strArray73);
        org.apache.commons.cli.CommandLine commandLine76 = defaultParser39.parse(options55, strArray73, false);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection77 = options55.getOptionGroups();
        org.apache.commons.cli.DefaultParser defaultParser78 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str79 = defaultParser78.currentToken;
        org.apache.commons.cli.CommandLine commandLine80 = defaultParser78.cmd;
        org.apache.commons.cli.Options options81 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection82 = options81.getOptions();
        java.lang.String[] strArray83 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine84 = defaultParser78.parse(options81, strArray83);
        org.apache.commons.cli.CommandLine commandLine86 = defaultParser31.parse(options55, strArray83, true);
        org.apache.commons.cli.CommandLine commandLine88 = defaultParser0.parse(options13, strArray83, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options91 = options13.addOption("org.apache.commons.cli.MissingOptionException: Missing required options: ", "[ option:   ::  :: class java.lang.String ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'org.apache.commons.cli.MissingOptionException: Missing required options: ' contains an illegal character : '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(commandLine19);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(commandLine33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(commandLine41);
        org.junit.Assert.assertNotNull(optionCollection43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(commandLine54);
        org.junit.Assert.assertNotNull(optionCollection56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(commandLine70);
        org.junit.Assert.assertNotNull(optionCollection72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(commandLine74);
        org.junit.Assert.assertNotNull(commandLine76);
        org.junit.Assert.assertNotNull(optionGroupCollection77);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(commandLine80);
        org.junit.Assert.assertNotNull(optionCollection82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine88);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.lang.Class<?> wildcardClass4 = optionCollection3.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        boolean boolean27 = options16.hasShortOption("hi!");
        java.util.List list28 = options16.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser29 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str30 = defaultParser29.currentToken;
        org.apache.commons.cli.CommandLine commandLine31 = defaultParser29.cmd;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options32.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser29.parse(options32, strArray34);
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser0.parse(options16, strArray34, false);
        java.lang.Object obj39 = commandLine37.getOptionObject('a');
        java.lang.String[] strArray40 = commandLine37.getArgs();
        boolean boolean42 = commandLine37.hasOption('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(commandLine31);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean12 = option11.requiresArg();
        java.lang.String str13 = option11.toString();
        org.apache.commons.cli.OptionGroup optionGroup14 = options3.getOptionGroup(option11);
        // The following exception was thrown during execution in test generation
        try {
            option11.addValueForProcessing("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str13, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(optionGroup14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str3 = defaultParser2.currentToken;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser2.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options5.getOptions();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser2.parse(options5, strArray7);
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String[] strArray11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser2.parse(options9, strArray11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options9, strArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options31 = options9.addOption("org.apache.commons.cli.MissingOptionException: Missing required options: ", "[ option:   ::  :: class java.lang.String ]", true, "[ option:   ::  :: class java.lang.String ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'org.apache.commons.cli.MissingOptionException: Missing required options: ' contains an illegal character : '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(commandLine26);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = options7.getOptions();
        java.lang.String[] strArray9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray9);
        java.util.List<java.lang.String> strList11 = commandLine10.getArgList();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = options7.getOptions();
        java.lang.String[] strArray9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray9);
        defaultParser0.currentToken = "[ option:   ::  :: class java.lang.String ]";
        java.util.List list13 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean4 = option3.requiresArg();
        java.lang.String str5 = option3.toString();
        java.lang.String str7 = option3.getValue("");
        boolean boolean8 = option3.hasArgName();
        org.apache.commons.cli.DefaultParser defaultParser9 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str10 = defaultParser9.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser9.cmd;
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser9.parse(options12, strArray19, properties20);
        org.apache.commons.cli.DefaultParser defaultParser22 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str23 = defaultParser22.currentToken;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser22.cmd;
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options25.getOptions();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties33 = null;
        org.apache.commons.cli.CommandLine commandLine34 = defaultParser22.parse(options25, strArray32, properties33);
        boolean boolean36 = options25.hasShortOption("hi!");
        java.util.List list37 = options25.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser38 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str39 = defaultParser38.currentToken;
        org.apache.commons.cli.CommandLine commandLine40 = defaultParser38.cmd;
        org.apache.commons.cli.Options options41 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection42 = options41.getOptions();
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine44 = defaultParser38.parse(options41, strArray43);
        org.apache.commons.cli.CommandLine commandLine46 = defaultParser9.parse(options25, strArray43, false);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection47 = options25.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            option3.setType((java.lang.Object) options25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.cli.Options cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str5, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(commandLine24);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(commandLine40);
        org.junit.Assert.assertNotNull(optionCollection42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(optionGroupCollection47);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str2 = defaultParser1.currentToken;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser1.cmd;
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = options4.getOptions();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser1.parse(options4, strArray11, properties12);
        java.lang.String str16 = commandLine13.getOptionValue(' ', "hi!");
        commandLine13.addArg("hi!");
        java.lang.String[] strArray19 = commandLine13.getArgs();
        java.util.List<java.lang.String> strList20 = commandLine13.getArgList();
        org.apache.commons.cli.MissingOptionException missingOptionException21 = new org.apache.commons.cli.MissingOptionException((java.util.List) strList20);
        org.apache.commons.cli.AmbiguousOptionException ambiguousOptionException22 = new org.apache.commons.cli.AmbiguousOptionException("hi!", (java.util.Collection<java.lang.String>) strList20);
        java.util.Collection<java.lang.String> strCollection23 = ambiguousOptionException22.getMatchingOptions();
        java.util.Collection<java.lang.String> strCollection24 = ambiguousOptionException22.getMatchingOptions();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strCollection23);
        org.junit.Assert.assertNotNull(strCollection24);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.DefaultParser defaultParser4 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str5 = defaultParser4.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser6 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str7 = defaultParser6.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser6.cmd;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser6.parse(options9, strArray11);
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options13.getOptions();
        java.lang.String[] strArray15 = null;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser6.parse(options13, strArray15);
        org.apache.commons.cli.DefaultParser defaultParser17 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str18 = defaultParser17.currentToken;
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser17.cmd;
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options20.getOptions();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties28 = null;
        org.apache.commons.cli.CommandLine commandLine29 = defaultParser17.parse(options20, strArray27, properties28);
        org.apache.commons.cli.CommandLine commandLine30 = defaultParser4.parse(options13, strArray27);
        org.apache.commons.cli.DefaultParser defaultParser31 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str32 = defaultParser31.currentToken;
        org.apache.commons.cli.CommandLine commandLine33 = defaultParser31.cmd;
        boolean boolean34 = defaultParser31.skipParsing;
        defaultParser31.handleConcatenatedOptions("");
        defaultParser31.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser39 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str40 = defaultParser39.currentToken;
        org.apache.commons.cli.CommandLine commandLine41 = defaultParser39.cmd;
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection43 = options42.getOptions();
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine51 = defaultParser39.parse(options42, strArray49, properties50);
        org.apache.commons.cli.DefaultParser defaultParser52 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str53 = defaultParser52.currentToken;
        org.apache.commons.cli.CommandLine commandLine54 = defaultParser52.cmd;
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection56 = options55.getOptions();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = defaultParser52.parse(options55, strArray62, properties63);
        boolean boolean66 = options55.hasShortOption("hi!");
        java.util.List list67 = options55.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser68 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str69 = defaultParser68.currentToken;
        org.apache.commons.cli.CommandLine commandLine70 = defaultParser68.cmd;
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection72 = options71.getOptions();
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine74 = defaultParser68.parse(options71, strArray73);
        org.apache.commons.cli.CommandLine commandLine76 = defaultParser39.parse(options55, strArray73, false);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection77 = options55.getOptionGroups();
        org.apache.commons.cli.DefaultParser defaultParser78 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str79 = defaultParser78.currentToken;
        org.apache.commons.cli.CommandLine commandLine80 = defaultParser78.cmd;
        org.apache.commons.cli.Options options81 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection82 = options81.getOptions();
        java.lang.String[] strArray83 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine84 = defaultParser78.parse(options81, strArray83);
        org.apache.commons.cli.CommandLine commandLine86 = defaultParser31.parse(options55, strArray83, true);
        org.apache.commons.cli.CommandLine commandLine88 = defaultParser0.parse(options13, strArray83, true);
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(commandLine19);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(commandLine33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(commandLine41);
        org.junit.Assert.assertNotNull(optionCollection43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(commandLine54);
        org.junit.Assert.assertNotNull(optionCollection56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(commandLine70);
        org.junit.Assert.assertNotNull(optionCollection72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(commandLine74);
        org.junit.Assert.assertNotNull(commandLine76);
        org.junit.Assert.assertNotNull(optionGroupCollection77);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(commandLine80);
        org.junit.Assert.assertNotNull(optionCollection82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine88);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean11 = option10.requiresArg();
        java.lang.String str12 = option10.getLongOpt();
        option10.setValueSeparator('4');
        option10.setOptionalArg(false);
        org.apache.commons.cli.OptionGroup optionGroup17 = options3.getOptionGroup(option10);
        boolean boolean18 = option10.hasOptionalArg();
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "");
        option22.setDescription("");
        int int25 = option22.getArgs();
        java.lang.String str26 = option22.getArgName();
        boolean boolean27 = option10.equals((java.lang.Object) str26);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(optionGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList6 = option5.getValuesList();
        org.apache.commons.cli.Options options7 = options0.addOption(option5);
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList10 = options0.helpOptions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(optionList10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList6 = option5.getValuesList();
        org.apache.commons.cli.Options options7 = options0.addOption(option5);
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("hi!");
        org.apache.commons.cli.OptionGroup optionGroup10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options11 = options0.addOptionGroup(optionGroup10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList6 = option5.getValuesList();
        org.apache.commons.cli.Options options7 = options0.addOption(option5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options11 = options7.addOption("org.apache.commons.cli.MissingOptionException: Missing required options: ", true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'org.apache.commons.cli.MissingOptionException: Missing required options: ' contains an illegal character : '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("hi!");
        java.lang.String str3 = options0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser8 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str9 = defaultParser8.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser8.cmd;
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options11.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        org.apache.commons.cli.CommandLine commandLine20 = defaultParser8.parse(options11, strArray18, properties19);
        org.apache.commons.cli.DefaultParser defaultParser21 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str22 = defaultParser21.currentToken;
        org.apache.commons.cli.CommandLine commandLine23 = defaultParser21.cmd;
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection25 = options24.getOptions();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties32 = null;
        org.apache.commons.cli.CommandLine commandLine33 = defaultParser21.parse(options24, strArray31, properties32);
        boolean boolean35 = options24.hasShortOption("hi!");
        java.util.List list36 = options24.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser37 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str38 = defaultParser37.currentToken;
        org.apache.commons.cli.CommandLine commandLine39 = defaultParser37.cmd;
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options40.getOptions();
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine43 = defaultParser37.parse(options40, strArray42);
        org.apache.commons.cli.CommandLine commandLine45 = defaultParser8.parse(options24, strArray42, false);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection46 = options24.getOptionGroups();
        org.apache.commons.cli.DefaultParser defaultParser47 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str48 = defaultParser47.currentToken;
        org.apache.commons.cli.CommandLine commandLine49 = defaultParser47.cmd;
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection51 = options50.getOptions();
        java.lang.String[] strArray52 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine53 = defaultParser47.parse(options50, strArray52);
        org.apache.commons.cli.CommandLine commandLine55 = defaultParser0.parse(options24, strArray52, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options59 = options24.addOption("org.apache.commons.cli.MissingArgumentException: ", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'org.apache.commons.cli.MissingArgumentException: ' contains an illegal character : '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(commandLine23);
        org.junit.Assert.assertNotNull(optionCollection25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(commandLine39);
        org.junit.Assert.assertNotNull(optionCollection41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(optionGroupCollection46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(commandLine49);
        org.junit.Assert.assertNotNull(optionCollection51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(commandLine55);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        boolean boolean27 = options16.hasShortOption("hi!");
        java.util.List list28 = options16.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser29 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str30 = defaultParser29.currentToken;
        org.apache.commons.cli.CommandLine commandLine31 = defaultParser29.cmd;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options32.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser29.parse(options32, strArray34);
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser0.parse(options16, strArray34, false);
        boolean boolean39 = options16.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(commandLine31);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.lang.String str6 = options5.toString();
        boolean boolean8 = options5.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        defaultParser0.options = options5;
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection10 = options5.getOptionGroups();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionGroupCollection10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean12 = option11.requiresArg();
        java.lang.String str13 = option11.toString();
        org.apache.commons.cli.OptionGroup optionGroup14 = options3.getOptionGroup(option11);
        java.util.List list15 = options3.getRequiredOptions();
        boolean boolean17 = options3.hasLongOption("[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str13, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(optionGroup14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = options7.getOptions();
        java.lang.String[] strArray9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray9);
        java.lang.String[] strArray12 = commandLine10.getOptionValues("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.lang.String str6 = options5.toString();
        boolean boolean8 = options5.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        defaultParser0.options = options5;
        java.util.List list10 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("hi!");
        java.util.Properties properties16 = commandLine12.getOptionProperties("");
        java.lang.String str19 = commandLine12.getOptionValue("hi!", "");
        java.lang.String str22 = commandLine12.getOptionValue("[ Options: [ short {} ] [ long {} ]", "");
        boolean boolean24 = commandLine12.hasOption("[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean12 = option11.requiresArg();
        java.lang.String str13 = option11.toString();
        org.apache.commons.cli.OptionGroup optionGroup14 = options3.getOptionGroup(option11);
        // The following exception was thrown during execution in test generation
        try {
            option11.addValueForProcessing("org.apache.commons.cli.MissingOptionException: Missing required options: ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str13, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(optionGroup14);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.lang.String str6 = options5.toString();
        boolean boolean8 = options5.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        defaultParser0.options = options5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options12 = options5.addOption("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser8 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str9 = defaultParser8.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser8.cmd;
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options11.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        org.apache.commons.cli.CommandLine commandLine20 = defaultParser8.parse(options11, strArray18, properties19);
        java.lang.String str22 = commandLine20.getOptionValue("hi!");
        java.util.Properties properties24 = commandLine20.getOptionProperties("");
        java.lang.String str27 = commandLine20.getOptionValue("hi!", "");
        java.lang.Object obj29 = commandLine20.getParsedOptionValue("");
        defaultParser0.cmd = commandLine20;
        java.lang.String str32 = commandLine20.getOptionValue("hi!");
        java.lang.String str35 = commandLine20.getOptionValue("", "");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser8 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str9 = defaultParser8.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser8.cmd;
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options11.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        org.apache.commons.cli.CommandLine commandLine20 = defaultParser8.parse(options11, strArray18, properties19);
        java.lang.String str22 = commandLine20.getOptionValue("hi!");
        java.util.Properties properties24 = commandLine20.getOptionProperties("");
        java.lang.String str27 = commandLine20.getOptionValue("hi!", "");
        java.lang.Object obj29 = commandLine20.getParsedOptionValue("");
        defaultParser0.cmd = commandLine20;
        defaultParser0.currentToken = "[ option:   ::  :: class java.lang.String ]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.lang.String str9 = options8.toString();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList14 = option13.getValuesList();
        org.apache.commons.cli.Options options15 = options8.addOption(option13);
        org.apache.commons.cli.CommandLine commandLine16 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray17 = commandLine16.getArgs();
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options15, strArray17);
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", false, "");
        java.lang.String str24 = option22.getValue((int) (short) 0);
        org.apache.commons.cli.OptionGroup optionGroup25 = options15.getOptionGroup(option22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(optionGroup25);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List<org.apache.commons.cli.Option> optionList7 = options3.helpOptions();
        boolean boolean9 = options3.hasOption("");
        boolean boolean11 = options3.hasShortOption("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String str14 = options13.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options13.getOptions();
        defaultParser0.options = options13;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str14, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str15 = commandLine12.getOptionValue(' ', "hi!");
        commandLine12.addArg("hi!");
        java.lang.String[] strArray18 = commandLine12.getArgs();
        java.util.List<java.lang.String> strList19 = commandLine12.getArgList();
        java.lang.String[] strArray21 = commandLine12.getOptionValues('#');
        java.lang.String[] strArray23 = commandLine12.getOptionValues('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean12 = option11.requiresArg();
        java.lang.String str13 = option11.toString();
        org.apache.commons.cli.OptionGroup optionGroup14 = options3.getOptionGroup(option11);
        java.util.List list15 = options3.getRequiredOptions();
        org.apache.commons.cli.Option option17 = options3.getOption("");
        org.apache.commons.cli.OptionGroup optionGroup18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options19 = options3.addOptionGroup(optionGroup18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str13, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(optionGroup14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List<org.apache.commons.cli.Option> optionList7 = options3.helpOptions();
        boolean boolean9 = options3.hasOption("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options12 = options3.addOption("[ Options: [ short {} ] [ long {} ]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str15 = commandLine12.getOptionValue(' ', "hi!");
        java.lang.Object obj17 = commandLine12.getParsedOptionValue("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String[] strArray14 = commandLine12.getOptionValues('#');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.lang.String[] strArray8 = commandLine6.getOptionValues("hi!");
        java.lang.String[] strArray10 = commandLine6.getOptionValues("");
        java.util.List<java.lang.String> strList11 = commandLine6.getArgList();
        java.lang.String[] strArray13 = commandLine6.getOptionValues('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        boolean boolean11 = options9.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser12 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str13 = defaultParser12.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser12.cmd;
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options15.getOptions();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser12.parse(options15, strArray22, properties23);
        org.apache.commons.cli.DefaultParser defaultParser25 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str26 = defaultParser25.currentToken;
        org.apache.commons.cli.CommandLine commandLine27 = defaultParser25.cmd;
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection29 = options28.getOptions();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser25.parse(options28, strArray35, properties36);
        java.lang.String str39 = commandLine37.getOptionValue("hi!");
        java.util.Properties properties41 = commandLine37.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine42 = defaultParser0.parse(options9, strArray22, properties41);
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList47 = option46.getValuesList();
        org.apache.commons.cli.OptionGroup optionGroup48 = options9.getOptionGroup(option46);
        boolean boolean50 = options9.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(commandLine27);
        org.junit.Assert.assertNotNull(optionCollection29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNull(optionGroup48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        org.apache.commons.cli.DefaultParser defaultParser6 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str7 = defaultParser6.currentToken;
        org.apache.commons.cli.Options options8 = defaultParser6.options;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.lang.String str10 = options9.toString();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList15 = option14.getValuesList();
        org.apache.commons.cli.Options options16 = options9.addOption(option14);
        org.apache.commons.cli.CommandLine commandLine17 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray18 = commandLine17.getArgs();
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser6.parse(options9, strArray18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        boolean boolean22 = options20.hasShortOption("hi!");
        defaultParser6.options = options20;
        org.apache.commons.cli.DefaultParser defaultParser24 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str25 = defaultParser24.currentToken;
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser24.cmd;
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection28 = options27.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine36 = defaultParser24.parse(options27, strArray34, properties35);
        org.apache.commons.cli.DefaultParser defaultParser37 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str38 = defaultParser37.currentToken;
        org.apache.commons.cli.CommandLine commandLine39 = defaultParser37.cmd;
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options40.getOptions();
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = defaultParser37.parse(options40, strArray47, properties48);
        boolean boolean51 = options40.hasShortOption("hi!");
        java.util.List list52 = options40.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser53 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str54 = defaultParser53.currentToken;
        org.apache.commons.cli.CommandLine commandLine55 = defaultParser53.cmd;
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection57 = options56.getOptions();
        java.lang.String[] strArray58 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine59 = defaultParser53.parse(options56, strArray58);
        org.apache.commons.cli.CommandLine commandLine61 = defaultParser24.parse(options40, strArray58, false);
        java.util.Properties properties62 = null;
        org.apache.commons.cli.CommandLine commandLine64 = defaultParser0.parse(options20, strArray58, properties62, true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str10, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(commandLine26);
        org.junit.Assert.assertNotNull(optionCollection28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(commandLine39);
        org.junit.Assert.assertNotNull(optionCollection41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(commandLine55);
        org.junit.Assert.assertNotNull(optionCollection57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine59);
        org.junit.Assert.assertNotNull(commandLine61);
        org.junit.Assert.assertNotNull(commandLine64);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.lang.String str9 = options8.toString();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList14 = option13.getValuesList();
        org.apache.commons.cli.Options options15 = options8.addOption(option13);
        org.apache.commons.cli.CommandLine commandLine16 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray17 = commandLine16.getArgs();
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options15, strArray17);
        java.lang.String str20 = commandLine18.getOptionValue("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.util.Properties properties14 = commandLine12.getOptionProperties("");
        java.lang.String str16 = commandLine12.getOptionValue(' ');
        org.apache.commons.cli.Option[] optionArray17 = commandLine12.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(optionArray17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser3 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str4 = defaultParser3.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser3.cmd;
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options6.getOptions();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser3.parse(options6, strArray8);
        java.util.List list10 = options6.getRequiredOptions();
        boolean boolean12 = options6.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        org.apache.commons.cli.DefaultParser defaultParser26 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str27 = defaultParser26.currentToken;
        org.apache.commons.cli.CommandLine commandLine28 = defaultParser26.cmd;
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection30 = options29.getOptions();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = defaultParser26.parse(options29, strArray36, properties37);
        commandLine38.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties42 = commandLine38.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine44 = defaultParser0.parse(options6, strArray23, properties42, true);
        java.lang.String str46 = commandLine44.getOptionValue('a');
        java.lang.String str48 = commandLine44.getOptionValue(' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(commandLine28);
        org.junit.Assert.assertNotNull(optionCollection30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        boolean boolean27 = options16.hasShortOption("hi!");
        java.util.List list28 = options16.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser29 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str30 = defaultParser29.currentToken;
        org.apache.commons.cli.CommandLine commandLine31 = defaultParser29.cmd;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options32.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser29.parse(options32, strArray34);
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser0.parse(options16, strArray34, false);
        java.lang.Object obj39 = commandLine37.getOptionObject('a');
        java.lang.String[] strArray40 = commandLine37.getArgs();
        java.util.Iterator<org.apache.commons.cli.Option> optionItor41 = commandLine37.iterator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(commandLine31);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(optionItor41);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        boolean boolean11 = options9.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser12 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str13 = defaultParser12.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser12.cmd;
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options15.getOptions();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser12.parse(options15, strArray22, properties23);
        org.apache.commons.cli.DefaultParser defaultParser25 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str26 = defaultParser25.currentToken;
        org.apache.commons.cli.CommandLine commandLine27 = defaultParser25.cmd;
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection29 = options28.getOptions();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser25.parse(options28, strArray35, properties36);
        java.lang.String str39 = commandLine37.getOptionValue("hi!");
        java.util.Properties properties41 = commandLine37.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine42 = defaultParser0.parse(options9, strArray22, properties41);
        boolean boolean44 = commandLine42.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(commandLine27);
        org.junit.Assert.assertNotNull(optionCollection29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("hi!");
        java.util.Properties properties16 = commandLine12.getOptionProperties("");
        java.lang.String str19 = commandLine12.getOptionValue("hi!", "");
        java.lang.Object obj21 = commandLine12.getParsedOptionValue("");
        boolean boolean23 = commandLine12.hasOption(' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.DefaultParser defaultParser4 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str5 = defaultParser4.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser6 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str7 = defaultParser6.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser6.cmd;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser6.parse(options9, strArray11);
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options13.getOptions();
        java.lang.String[] strArray15 = null;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser6.parse(options13, strArray15);
        org.apache.commons.cli.DefaultParser defaultParser17 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str18 = defaultParser17.currentToken;
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser17.cmd;
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options20.getOptions();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties28 = null;
        org.apache.commons.cli.CommandLine commandLine29 = defaultParser17.parse(options20, strArray27, properties28);
        org.apache.commons.cli.CommandLine commandLine30 = defaultParser4.parse(options13, strArray27);
        org.apache.commons.cli.DefaultParser defaultParser31 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str32 = defaultParser31.currentToken;
        org.apache.commons.cli.CommandLine commandLine33 = defaultParser31.cmd;
        boolean boolean34 = defaultParser31.skipParsing;
        defaultParser31.handleConcatenatedOptions("");
        defaultParser31.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser39 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str40 = defaultParser39.currentToken;
        org.apache.commons.cli.CommandLine commandLine41 = defaultParser39.cmd;
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection43 = options42.getOptions();
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine51 = defaultParser39.parse(options42, strArray49, properties50);
        org.apache.commons.cli.DefaultParser defaultParser52 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str53 = defaultParser52.currentToken;
        org.apache.commons.cli.CommandLine commandLine54 = defaultParser52.cmd;
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection56 = options55.getOptions();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = defaultParser52.parse(options55, strArray62, properties63);
        boolean boolean66 = options55.hasShortOption("hi!");
        java.util.List list67 = options55.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser68 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str69 = defaultParser68.currentToken;
        org.apache.commons.cli.CommandLine commandLine70 = defaultParser68.cmd;
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection72 = options71.getOptions();
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine74 = defaultParser68.parse(options71, strArray73);
        org.apache.commons.cli.CommandLine commandLine76 = defaultParser39.parse(options55, strArray73, false);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection77 = options55.getOptionGroups();
        org.apache.commons.cli.DefaultParser defaultParser78 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str79 = defaultParser78.currentToken;
        org.apache.commons.cli.CommandLine commandLine80 = defaultParser78.cmd;
        org.apache.commons.cli.Options options81 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection82 = options81.getOptions();
        java.lang.String[] strArray83 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine84 = defaultParser78.parse(options81, strArray83);
        org.apache.commons.cli.CommandLine commandLine86 = defaultParser31.parse(options55, strArray83, true);
        org.apache.commons.cli.CommandLine commandLine88 = defaultParser0.parse(options13, strArray83, true);
        java.util.List<java.lang.String> strList90 = options13.getMatchingOptions("hi!");
        boolean boolean92 = options13.hasShortOption("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(commandLine19);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(commandLine33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(commandLine41);
        org.junit.Assert.assertNotNull(optionCollection43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(commandLine54);
        org.junit.Assert.assertNotNull(optionCollection56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(commandLine70);
        org.junit.Assert.assertNotNull(optionCollection72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(commandLine74);
        org.junit.Assert.assertNotNull(commandLine76);
        org.junit.Assert.assertNotNull(optionGroupCollection77);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(commandLine80);
        org.junit.Assert.assertNotNull(optionCollection82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine88);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        boolean boolean14 = options3.hasShortOption("hi!");
        java.util.List list15 = options3.getRequiredOptions();
        java.util.List list16 = options3.getRequiredOptions();
        org.apache.commons.cli.MissingOptionException missingOptionException17 = new org.apache.commons.cli.MissingOptionException(list16);
        java.util.List list18 = missingOptionException17.getMissingOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean11 = option10.requiresArg();
        java.lang.String str12 = option10.getLongOpt();
        option10.setValueSeparator('4');
        option10.setOptionalArg(false);
        org.apache.commons.cli.OptionGroup optionGroup17 = options3.getOptionGroup(option10);
        boolean boolean18 = option10.hasOptionalArg();
        java.lang.String str19 = option10.getLongOpt();
        java.lang.String str21 = option10.getValue("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(optionGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean11 = option10.requiresArg();
        java.lang.String str12 = option10.getLongOpt();
        option10.setValueSeparator('4');
        option10.setOptionalArg(false);
        org.apache.commons.cli.OptionGroup optionGroup17 = options3.getOptionGroup(option10);
        boolean boolean18 = option10.hasOptionalArg();
        option10.clearValues();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(optionGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        boolean boolean9 = options3.hasOption("[ Options: [ short {} ] [ long {} ]");
        java.util.List<org.apache.commons.cli.Option> optionList10 = options3.helpOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionList10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "");
        option3.setDescription("");
        int int6 = option3.getArgs();
        boolean boolean7 = option3.hasArgs();
        java.lang.String str8 = option3.toString();
        java.lang.String str9 = option3.toString();
        org.apache.commons.cli.DefaultParser defaultParser10 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str11 = defaultParser10.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser12 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str13 = defaultParser12.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser12.cmd;
        boolean boolean15 = defaultParser12.skipParsing;
        defaultParser12.handleConcatenatedOptions("");
        defaultParser12.skipParsing = false;
        boolean boolean20 = defaultParser12.skipParsing;
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        boolean boolean23 = options21.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser24 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str25 = defaultParser24.currentToken;
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser24.cmd;
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection28 = options27.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine36 = defaultParser24.parse(options27, strArray34, properties35);
        org.apache.commons.cli.DefaultParser defaultParser37 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str38 = defaultParser37.currentToken;
        org.apache.commons.cli.CommandLine commandLine39 = defaultParser37.cmd;
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options40.getOptions();
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = defaultParser37.parse(options40, strArray47, properties48);
        java.lang.String str51 = commandLine49.getOptionValue("hi!");
        java.util.Properties properties53 = commandLine49.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine54 = defaultParser12.parse(options21, strArray34, properties53);
        org.apache.commons.cli.Option option58 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList59 = option58.getValuesList();
        org.apache.commons.cli.OptionGroup optionGroup60 = options21.getOptionGroup(option58);
        org.apache.commons.cli.DefaultParser defaultParser61 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str62 = defaultParser61.currentToken;
        org.apache.commons.cli.Options options63 = defaultParser61.options;
        org.apache.commons.cli.Options options64 = new org.apache.commons.cli.Options();
        java.lang.String str65 = options64.toString();
        org.apache.commons.cli.Option option69 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList70 = option69.getValuesList();
        org.apache.commons.cli.Options options71 = options64.addOption(option69);
        org.apache.commons.cli.CommandLine commandLine72 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray73 = commandLine72.getArgs();
        org.apache.commons.cli.CommandLine commandLine74 = defaultParser61.parse(options64, strArray73);
        org.apache.commons.cli.DefaultParser defaultParser75 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str76 = defaultParser75.currentToken;
        org.apache.commons.cli.CommandLine commandLine77 = defaultParser75.cmd;
        org.apache.commons.cli.Options options78 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection79 = options78.getOptions();
        java.lang.String[] strArray85 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties86 = null;
        org.apache.commons.cli.CommandLine commandLine87 = defaultParser75.parse(options78, strArray85, properties86);
        commandLine87.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties91 = commandLine87.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine93 = defaultParser10.parse(options21, strArray73, properties91, false);
        // The following exception was thrown during execution in test generation
        try {
            option3.setType((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str8, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str9, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(commandLine26);
        org.junit.Assert.assertNotNull(optionCollection28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(commandLine39);
        org.junit.Assert.assertNotNull(optionCollection41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNull(optionGroup60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(options63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str65, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(options71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(commandLine74);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(commandLine77);
        org.junit.Assert.assertNotNull(optionCollection79);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(properties91);
        org.junit.Assert.assertNotNull(commandLine93);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str15 = commandLine12.getOptionValue(' ', "hi!");
        commandLine12.addArg("hi!");
        java.lang.Object obj19 = commandLine12.getOptionObject("hi!");
        java.lang.String str21 = commandLine12.getOptionValue('a');
        boolean boolean23 = commandLine12.hasOption('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = options7.getOptions();
        java.lang.String[] strArray9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray9);
        boolean boolean11 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.lang.String str9 = options8.toString();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList14 = option13.getValuesList();
        org.apache.commons.cli.Options options15 = options8.addOption(option13);
        org.apache.commons.cli.CommandLine commandLine16 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray17 = commandLine16.getArgs();
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options15, strArray17);
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str15 = commandLine12.getOptionValue(' ', "hi!");
        commandLine12.addArg("hi!");
        java.lang.String[] strArray18 = commandLine12.getArgs();
        java.util.List<java.lang.String> strList19 = commandLine12.getArgList();
        org.apache.commons.cli.MissingOptionException missingOptionException20 = new org.apache.commons.cli.MissingOptionException((java.util.List) strList19);
        java.util.List list21 = missingOptionException20.getMissingOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.lang.String str6 = options5.toString();
        boolean boolean8 = options5.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        defaultParser0.options = options5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options14 = options5.addOption("org.apache.commons.cli.MissingArgumentException: ", "org.apache.commons.cli.MissingOptionException: Missing required options: ", false, "[ Options: [ short {} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'org.apache.commons.cli.MissingArgumentException: ' contains an illegal character : '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser3 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str4 = defaultParser3.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser3.cmd;
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options6.getOptions();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser3.parse(options6, strArray8);
        java.util.List list10 = options6.getRequiredOptions();
        boolean boolean12 = options6.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        org.apache.commons.cli.DefaultParser defaultParser26 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str27 = defaultParser26.currentToken;
        org.apache.commons.cli.CommandLine commandLine28 = defaultParser26.cmd;
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection30 = options29.getOptions();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = defaultParser26.parse(options29, strArray36, properties37);
        commandLine38.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties42 = commandLine38.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine44 = defaultParser0.parse(options6, strArray23, properties42, true);
        java.util.List<java.lang.String> strList46 = options6.getMatchingOptions("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(commandLine28);
        org.junit.Assert.assertNotNull(optionCollection30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        boolean boolean11 = options9.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser12 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str13 = defaultParser12.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser12.cmd;
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options15.getOptions();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser12.parse(options15, strArray22, properties23);
        org.apache.commons.cli.DefaultParser defaultParser25 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str26 = defaultParser25.currentToken;
        org.apache.commons.cli.CommandLine commandLine27 = defaultParser25.cmd;
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection29 = options28.getOptions();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser25.parse(options28, strArray35, properties36);
        java.lang.String str39 = commandLine37.getOptionValue("hi!");
        java.util.Properties properties41 = commandLine37.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine42 = defaultParser0.parse(options9, strArray22, properties41);
        java.util.List list43 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option44 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(commandLine27);
        org.junit.Assert.assertNotNull(optionCollection29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(option44);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        org.apache.commons.cli.DefaultParser defaultParser6 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str7 = defaultParser6.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser6.cmd;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser6.parse(options9, strArray16, properties17);
        boolean boolean20 = options9.hasShortOption("hi!");
        java.util.List list21 = options9.getRequiredOptions();
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options9, strArray22, true);
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean27 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str3 = defaultParser2.currentToken;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser2.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options5.getOptions();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser2.parse(options5, strArray7);
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String[] strArray11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser2.parse(options9, strArray11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options9, strArray23);
        org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(commandLine27);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.DefaultParser defaultParser5 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str6 = defaultParser5.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser5.cmd;
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options8.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options8, strArray10);
        java.util.List list12 = options8.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options16, strArray18);
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options8, strArray18, false);
        org.apache.commons.cli.DefaultParser defaultParser22 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str23 = defaultParser22.currentToken;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser22.cmd;
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options25.getOptions();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine28 = defaultParser22.parse(options25, strArray27);
        java.util.List list29 = options25.getRequiredOptions();
        boolean boolean31 = options25.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.CommandLine commandLine32 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray33 = commandLine32.getArgs();
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser0.parse(options25, strArray33, true);
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(commandLine24);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser8 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str9 = defaultParser8.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser8.cmd;
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options11.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        org.apache.commons.cli.CommandLine commandLine20 = defaultParser8.parse(options11, strArray18, properties19);
        java.lang.String str22 = commandLine20.getOptionValue("hi!");
        java.util.Properties properties24 = commandLine20.getOptionProperties("");
        java.lang.String str27 = commandLine20.getOptionValue("hi!", "");
        java.lang.Object obj29 = commandLine20.getParsedOptionValue("");
        defaultParser0.cmd = commandLine20;
        java.lang.String[] strArray32 = commandLine20.getOptionValues('4');
        org.apache.commons.cli.Option option36 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean37 = option36.requiresArg();
        java.lang.String str38 = option36.toString();
        java.lang.String str40 = option36.getValue("");
        java.lang.String str41 = option36.getDescription();
        boolean boolean42 = option36.hasArgs();
        int int43 = option36.getArgs();
        boolean boolean44 = option36.hasValueSeparator();
        commandLine20.addOption(option36);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str38, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        java.util.List<org.apache.commons.cli.Option> optionList2 = options0.helpOptions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionList2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("hi!");
        boolean boolean4 = options0.hasShortOption("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        boolean boolean14 = options3.hasShortOption("hi!");
        java.util.List list15 = options3.getRequiredOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options3.getOptions();
        boolean boolean18 = options3.hasOption("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options22 = options3.addOption("[ Options: [ short {} ] [ long {} ]", true, "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingArgumentException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List<org.apache.commons.cli.Option> optionList7 = options3.helpOptions();
        org.apache.commons.cli.Option option9 = options3.getOption("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionList7);
        org.junit.Assert.assertNull(option9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        boolean boolean27 = options16.hasShortOption("hi!");
        java.util.List list28 = options16.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser29 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str30 = defaultParser29.currentToken;
        org.apache.commons.cli.CommandLine commandLine31 = defaultParser29.cmd;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options32.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser29.parse(options32, strArray34);
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser0.parse(options16, strArray34, false);
        java.lang.String str39 = commandLine37.getOptionValue("[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(commandLine31);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("hi!");
        java.util.Properties properties16 = commandLine12.getOptionProperties("");
        java.lang.String str19 = commandLine12.getOptionValue("hi!", "");
        java.lang.String str22 = commandLine12.getOptionValue("org.apache.commons.cli.MissingArgumentException: ", "[ Options: [ short {} ] [ long {} ]");
        java.lang.String str25 = commandLine12.getOptionValue('#', "org.apache.commons.cli.MissingOptionException: Missing required options: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str22, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.cli.MissingOptionException: Missing required options: " + "'", str25, "org.apache.commons.cli.MissingOptionException: Missing required options: ");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection1 = options0.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = options0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList4 = options0.helpOptions();
        org.apache.commons.cli.MissingOptionException missingOptionException5 = new org.apache.commons.cli.MissingOptionException((java.util.List) optionList4);
        org.junit.Assert.assertNotNull(optionGroupCollection1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionList4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String str2 = options1.toString();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList7 = option6.getValuesList();
        org.apache.commons.cli.Options options8 = options1.addOption(option6);
        java.util.List<java.lang.String> strList10 = options1.getMatchingOptions("hi!");
        org.apache.commons.cli.AmbiguousOptionException ambiguousOptionException11 = new org.apache.commons.cli.AmbiguousOptionException("[ option:   ::  :: class java.lang.String ]", (java.util.Collection<java.lang.String>) strList10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str2, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        boolean boolean11 = options9.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser12 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str13 = defaultParser12.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser12.cmd;
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options15.getOptions();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser12.parse(options15, strArray22, properties23);
        org.apache.commons.cli.DefaultParser defaultParser25 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str26 = defaultParser25.currentToken;
        org.apache.commons.cli.CommandLine commandLine27 = defaultParser25.cmd;
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection29 = options28.getOptions();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser25.parse(options28, strArray35, properties36);
        java.lang.String str39 = commandLine37.getOptionValue("hi!");
        java.util.Properties properties41 = commandLine37.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine42 = defaultParser0.parse(options9, strArray22, properties41);
        java.util.List list43 = defaultParser0.expectedOpts;
        boolean boolean44 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(commandLine27);
        org.junit.Assert.assertNotNull(optionCollection29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.Object obj14 = commandLine12.getParsedOptionValue("");
        java.lang.String[] strArray16 = commandLine12.getOptionValues("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        boolean boolean14 = options3.hasShortOption("hi!");
        java.util.List list15 = options3.getRequiredOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options20 = options3.addOption("[ Options: [ short {} ] [ long {} ]", "hi!", false, "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingArgumentException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {} ] [ long {} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str15 = commandLine12.getOptionValue(' ', "hi!");
        commandLine12.addArg("hi!");
        commandLine12.addArg("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        java.lang.String[] strArray21 = commandLine12.getOptionValues('4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.lang.String str6 = options5.toString();
        boolean boolean8 = options5.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        defaultParser0.options = options5;
        org.apache.commons.cli.DefaultParser defaultParser10 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str11 = defaultParser10.currentToken;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser10.cmd;
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options13.getOptions();
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser10.parse(options13, strArray15);
        java.util.List<org.apache.commons.cli.Option> optionList17 = options13.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options13.getOptions();
        org.apache.commons.cli.DefaultParser defaultParser19 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str20 = defaultParser19.currentToken;
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser19.cmd;
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options22.getOptions();
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser19.parse(options22, strArray24);
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options13, strArray24);
        org.apache.commons.cli.Options options27 = defaultParser0.options;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(optionList17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(commandLine21);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(options27);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("hi!");
        java.util.Properties properties16 = commandLine12.getOptionProperties("");
        java.lang.String str19 = commandLine12.getOptionValue("hi!", "");
        java.lang.String str22 = commandLine12.getOptionValue("[ Options: [ short {} ] [ long {} ]", "");
        java.lang.String[] strArray24 = commandLine12.getOptionValues('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(strArray24);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        commandLine12.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties16 = commandLine12.getOptionProperties("hi!");
        java.lang.String str19 = commandLine12.getOptionValue("", "hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = options7.getOptions();
        java.lang.String[] strArray9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray9);
        org.apache.commons.cli.DefaultParser defaultParser11 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str12 = defaultParser11.currentToken;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser11.cmd;
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = options14.getOptions();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties22 = null;
        org.apache.commons.cli.CommandLine commandLine23 = defaultParser11.parse(options14, strArray21, properties22);
        org.apache.commons.cli.DefaultParser defaultParser24 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str25 = defaultParser24.currentToken;
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser24.cmd;
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection28 = options27.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine36 = defaultParser24.parse(options27, strArray34, properties35);
        boolean boolean38 = options27.hasShortOption("hi!");
        java.util.List list39 = options27.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser40 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str41 = defaultParser40.currentToken;
        org.apache.commons.cli.CommandLine commandLine42 = defaultParser40.cmd;
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection44 = options43.getOptions();
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine46 = defaultParser40.parse(options43, strArray45);
        org.apache.commons.cli.CommandLine commandLine48 = defaultParser11.parse(options27, strArray45, false);
        java.lang.Object obj50 = commandLine48.getOptionObject("[ Options: [ short {} ] [ long {} ]");
        defaultParser0.cmd = commandLine48;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(commandLine26);
        org.junit.Assert.assertNotNull(optionCollection28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(commandLine42);
        org.junit.Assert.assertNotNull(optionCollection44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean4 = option3.requiresArg();
        java.lang.String str5 = option3.getLongOpt();
        option3.setArgs((int) (byte) 1);
        boolean boolean8 = option3.hasArg();
        org.apache.commons.cli.DefaultParser defaultParser9 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str10 = defaultParser9.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser9.cmd;
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser9.parse(options12, strArray19, properties20);
        org.apache.commons.cli.DefaultParser defaultParser22 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str23 = defaultParser22.currentToken;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser22.cmd;
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection26 = options25.getOptions();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties33 = null;
        org.apache.commons.cli.CommandLine commandLine34 = defaultParser22.parse(options25, strArray32, properties33);
        boolean boolean36 = options25.hasShortOption("hi!");
        java.util.List list37 = options25.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser38 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str39 = defaultParser38.currentToken;
        org.apache.commons.cli.CommandLine commandLine40 = defaultParser38.cmd;
        org.apache.commons.cli.Options options41 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection42 = options41.getOptions();
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine44 = defaultParser38.parse(options41, strArray43);
        org.apache.commons.cli.CommandLine commandLine46 = defaultParser9.parse(options25, strArray43, false);
        org.apache.commons.cli.CommandLine commandLine47 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option[] optionArray48 = commandLine47.getOptions();
        org.apache.commons.cli.Option option52 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList53 = option52.getValuesList();
        java.util.List<java.lang.String> strList54 = option52.getValuesList();
        java.lang.String str55 = option52.getArgName();
        commandLine47.addOption(option52);
        boolean boolean57 = option52.requiresArg();
        org.apache.commons.cli.Options options58 = options25.addOption(option52);
        boolean boolean59 = option3.equals((java.lang.Object) option52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(commandLine24);
        org.junit.Assert.assertNotNull(optionCollection26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(commandLine40);
        org.junit.Assert.assertNotNull(optionCollection42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(optionArray48);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean4 = option3.requiresArg();
        java.lang.String str5 = option3.getLongOpt();
        option3.setArgs((int) (byte) 1);
        org.apache.commons.cli.DefaultParser defaultParser8 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str9 = defaultParser8.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser8.cmd;
        defaultParser8.skipParsing = true;
        org.apache.commons.cli.Option option13 = defaultParser8.currentOption;
        defaultParser8.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.lang.String str17 = options16.toString();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList22 = option21.getValuesList();
        org.apache.commons.cli.Options options23 = options16.addOption(option21);
        org.apache.commons.cli.CommandLine commandLine24 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine24.getArgs();
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser8.parse(options23, strArray25);
        java.util.List list27 = defaultParser8.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            option3.setType((java.lang.Object) defaultParser8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.cli.DefaultParser cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str17, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str3 = defaultParser2.currentToken;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser2.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options5.getOptions();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser2.parse(options5, strArray7);
        java.util.List list9 = options5.getRequiredOptions();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean14 = option13.requiresArg();
        java.lang.String str15 = option13.toString();
        org.apache.commons.cli.OptionGroup optionGroup16 = options5.getOptionGroup(option13);
        boolean boolean18 = options5.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        defaultParser0.options = options5;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str15, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(optionGroup16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList6 = option5.getValuesList();
        org.apache.commons.cli.Options options7 = options0.addOption(option5);
        java.util.List<java.lang.String> strList9 = options0.getMatchingOptions("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options12 = options0.addOption("hi!", "org.apache.commons.cli.MissingOptionException: Missing required options: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = options0.getOptions();
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionList3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        boolean boolean27 = options16.hasShortOption("hi!");
        java.util.List list28 = options16.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser29 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str30 = defaultParser29.currentToken;
        org.apache.commons.cli.CommandLine commandLine31 = defaultParser29.cmd;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options32.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser29.parse(options32, strArray34);
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser0.parse(options16, strArray34, false);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection38 = options16.getOptionGroups();
        java.util.List<java.lang.String> strList40 = options16.getMatchingOptions("[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(commandLine31);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(optionGroupCollection38);
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str3 = defaultParser2.currentToken;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser2.cmd;
        boolean boolean5 = defaultParser2.skipParsing;
        defaultParser2.handleConcatenatedOptions("");
        defaultParser2.skipParsing = false;
        boolean boolean10 = defaultParser2.skipParsing;
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser14 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str15 = defaultParser14.currentToken;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser14.cmd;
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options17.getOptions();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser14.parse(options17, strArray24, properties25);
        org.apache.commons.cli.DefaultParser defaultParser27 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str28 = defaultParser27.currentToken;
        org.apache.commons.cli.CommandLine commandLine29 = defaultParser27.cmd;
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection31 = options30.getOptions();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = defaultParser27.parse(options30, strArray37, properties38);
        java.lang.String str41 = commandLine39.getOptionValue("hi!");
        java.util.Properties properties43 = commandLine39.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine44 = defaultParser2.parse(options11, strArray24, properties43);
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList49 = option48.getValuesList();
        org.apache.commons.cli.OptionGroup optionGroup50 = options11.getOptionGroup(option48);
        org.apache.commons.cli.DefaultParser defaultParser51 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str52 = defaultParser51.currentToken;
        org.apache.commons.cli.Options options53 = defaultParser51.options;
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.lang.String str55 = options54.toString();
        org.apache.commons.cli.Option option59 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList60 = option59.getValuesList();
        org.apache.commons.cli.Options options61 = options54.addOption(option59);
        org.apache.commons.cli.CommandLine commandLine62 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray63 = commandLine62.getArgs();
        org.apache.commons.cli.CommandLine commandLine64 = defaultParser51.parse(options54, strArray63);
        org.apache.commons.cli.DefaultParser defaultParser65 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str66 = defaultParser65.currentToken;
        org.apache.commons.cli.CommandLine commandLine67 = defaultParser65.cmd;
        org.apache.commons.cli.Options options68 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection69 = options68.getOptions();
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties76 = null;
        org.apache.commons.cli.CommandLine commandLine77 = defaultParser65.parse(options68, strArray75, properties76);
        commandLine77.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties81 = commandLine77.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine83 = defaultParser0.parse(options11, strArray63, properties81, false);
        org.apache.commons.cli.Option[] optionArray84 = commandLine83.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(commandLine29);
        org.junit.Assert.assertNotNull(optionCollection31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNull(optionGroup50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(options53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str55, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(commandLine67);
        org.junit.Assert.assertNotNull(optionCollection69);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(commandLine77);
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertNotNull(commandLine83);
        org.junit.Assert.assertNotNull(optionArray84);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.Options options15 = defaultParser13.options;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.lang.String str17 = options16.toString();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList22 = option21.getValuesList();
        org.apache.commons.cli.Options options23 = options16.addOption(option21);
        org.apache.commons.cli.CommandLine commandLine24 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray25 = commandLine24.getArgs();
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser13.parse(options16, strArray25);
        org.apache.commons.cli.DefaultParser defaultParser27 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str28 = defaultParser27.currentToken;
        org.apache.commons.cli.Options options29 = defaultParser27.options;
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.lang.String str31 = options30.toString();
        org.apache.commons.cli.Option option35 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList36 = option35.getValuesList();
        org.apache.commons.cli.Options options37 = options30.addOption(option35);
        org.apache.commons.cli.CommandLine commandLine38 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray39 = commandLine38.getArgs();
        org.apache.commons.cli.CommandLine commandLine40 = defaultParser27.parse(options30, strArray39);
        org.apache.commons.cli.CommandLine commandLine41 = defaultParser0.parse(options16, strArray39);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection42 = options16.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str17, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(options29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str31, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(optionCollection42);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean11 = option10.requiresArg();
        java.lang.String str12 = option10.getLongOpt();
        option10.setValueSeparator('4');
        option10.setOptionalArg(false);
        org.apache.commons.cli.OptionGroup optionGroup17 = options3.getOptionGroup(option10);
        boolean boolean18 = option10.hasLongOpt();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(optionGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.Class<?> wildcardClass13 = strArray10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.DefaultParser defaultParser5 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str6 = defaultParser5.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser5.cmd;
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options8.getOptions();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser5.parse(options8, strArray15, properties16);
        commandLine17.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties21 = commandLine17.getOptionProperties("hi!");
        defaultParser0.cmd = commandLine17;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList6 = option5.getValuesList();
        org.apache.commons.cli.Options options7 = options0.addOption(option5);
        java.lang.String str8 = option5.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str8, "[ option:   ::  :: class java.lang.String ]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection1 = options0.getOptionGroups();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = options0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options6 = options0.addOption("org.apache.commons.cli.MissingOptionException: Missing required options: ", true, "org.apache.commons.cli.MissingOptionException: Missing required options: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'org.apache.commons.cli.MissingOptionException: Missing required options: ' contains an illegal character : '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionGroupCollection1);
        org.junit.Assert.assertNotNull(optionCollection2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        boolean boolean11 = options9.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser12 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str13 = defaultParser12.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser12.cmd;
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options15.getOptions();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser12.parse(options15, strArray22, properties23);
        org.apache.commons.cli.DefaultParser defaultParser25 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str26 = defaultParser25.currentToken;
        org.apache.commons.cli.CommandLine commandLine27 = defaultParser25.cmd;
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection29 = options28.getOptions();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser25.parse(options28, strArray35, properties36);
        java.lang.String str39 = commandLine37.getOptionValue("hi!");
        java.util.Properties properties41 = commandLine37.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine42 = defaultParser0.parse(options9, strArray22, properties41);
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList47 = option46.getValuesList();
        org.apache.commons.cli.OptionGroup optionGroup48 = options9.getOptionGroup(option46);
        java.lang.Object obj49 = option46.getType();
        java.lang.String str50 = option46.getArgName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(commandLine27);
        org.junit.Assert.assertNotNull(optionCollection29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNull(optionGroup48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "class java.lang.String");
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("hi!");
        java.util.Properties properties16 = commandLine12.getOptionProperties("");
        java.lang.String str19 = commandLine12.getOptionValue("hi!", "");
        java.lang.Object obj21 = commandLine12.getParsedOptionValue("");
        commandLine12.addArg("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str15 = commandLine12.getOptionValue(' ', "hi!");
        java.lang.String str18 = commandLine12.getOptionValue('a', "hi!");
        java.lang.String str21 = commandLine12.getOptionValue("org.apache.commons.cli.MissingOptionException: Missing required options: ", "hi!");
        org.apache.commons.cli.Option option22 = null;
        commandLine12.addOption(option22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.util.Properties properties14 = commandLine12.getOptionProperties("");
        java.lang.String[] strArray16 = commandLine12.getOptionValues(' ');
        java.lang.String str19 = commandLine12.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingArgumentException: ", "org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.cli.MissingArgumentException: " + "'", str19, "org.apache.commons.cli.MissingArgumentException: ");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        boolean boolean27 = options16.hasShortOption("hi!");
        java.util.List list28 = options16.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser29 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str30 = defaultParser29.currentToken;
        org.apache.commons.cli.CommandLine commandLine31 = defaultParser29.cmd;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options32.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser29.parse(options32, strArray34);
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser0.parse(options16, strArray34, false);
        java.lang.Object obj39 = commandLine37.getOptionObject("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option[] optionArray40 = commandLine37.getOptions();
        java.util.List<java.lang.String> strList41 = commandLine37.getArgList();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(commandLine31);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(optionArray40);
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.lang.String str6 = options5.toString();
        boolean boolean8 = options5.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        defaultParser0.options = options5;
        org.apache.commons.cli.DefaultParser defaultParser10 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str11 = defaultParser10.currentToken;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser10.cmd;
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = options13.getOptions();
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser10.parse(options13, strArray15);
        java.util.List<org.apache.commons.cli.Option> optionList17 = options13.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options13.getOptions();
        org.apache.commons.cli.DefaultParser defaultParser19 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str20 = defaultParser19.currentToken;
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser19.cmd;
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options22.getOptions();
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser19.parse(options22, strArray24);
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options13, strArray24);
        java.lang.String[] strArray28 = commandLine26.getOptionValues("[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str6, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(optionList17);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(commandLine21);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNull(strArray28);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.DefaultParser defaultParser9 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str10 = defaultParser9.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser9.cmd;
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser9.parse(options12, strArray19, properties20);
        org.apache.commons.cli.DefaultParser defaultParser22 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str23 = defaultParser22.currentToken;
        org.apache.commons.cli.Options options24 = defaultParser22.options;
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.lang.String str26 = options25.toString();
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList31 = option30.getValuesList();
        org.apache.commons.cli.Options options32 = options25.addOption(option30);
        org.apache.commons.cli.CommandLine commandLine33 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray34 = commandLine33.getArgs();
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser22.parse(options25, strArray34);
        org.apache.commons.cli.DefaultParser defaultParser36 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str37 = defaultParser36.currentToken;
        org.apache.commons.cli.Options options38 = defaultParser36.options;
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        java.lang.String str40 = options39.toString();
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList45 = option44.getValuesList();
        org.apache.commons.cli.Options options46 = options39.addOption(option44);
        org.apache.commons.cli.CommandLine commandLine47 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray48 = commandLine47.getArgs();
        org.apache.commons.cli.CommandLine commandLine49 = defaultParser36.parse(options39, strArray48);
        org.apache.commons.cli.CommandLine commandLine50 = defaultParser9.parse(options25, strArray48);
        org.apache.commons.cli.DefaultParser defaultParser51 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str52 = defaultParser51.currentToken;
        org.apache.commons.cli.CommandLine commandLine53 = defaultParser51.cmd;
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection55 = options54.getOptions();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties62 = null;
        org.apache.commons.cli.CommandLine commandLine63 = defaultParser51.parse(options54, strArray61, properties62);
        java.lang.String str66 = commandLine63.getOptionValue(' ', "hi!");
        commandLine63.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray69 = commandLine63.getOptions();
        java.lang.String[] strArray70 = commandLine63.getArgs();
        org.apache.commons.cli.CommandLine commandLine71 = defaultParser0.parse(options25, strArray70);
        boolean boolean72 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(options24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str26, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(options38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str40, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(commandLine53);
        org.junit.Assert.assertNotNull(optionCollection55);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(optionArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(commandLine71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        java.lang.String str11 = options10.toString();
        boolean boolean13 = options10.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", false, "");
        option17.setDescription("");
        option17.setRequired(false);
        boolean boolean22 = option17.acceptsArg();
        org.apache.commons.cli.OptionGroup optionGroup23 = options10.getOptionGroup(option17);
        org.apache.commons.cli.DefaultParser defaultParser24 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str25 = defaultParser24.currentToken;
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser24.cmd;
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection28 = options27.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine36 = defaultParser24.parse(options27, strArray34, properties35);
        java.lang.String str39 = commandLine36.getOptionValue(' ', "hi!");
        commandLine36.addArg("hi!");
        java.lang.String[] strArray42 = commandLine36.getArgs();
        org.apache.commons.cli.CommandLine commandLine43 = defaultParser0.parse(options10, strArray42);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str11, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(optionGroup23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(commandLine26);
        org.junit.Assert.assertNotNull(optionCollection28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(commandLine43);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.lang.String[] strArray8 = commandLine6.getOptionValues("hi!");
        java.lang.Object obj10 = commandLine6.getOptionObject("[ option:   ::  :: class java.lang.String ]");
        java.lang.String str13 = commandLine6.getOptionValue("org.apache.commons.cli.MissingOptionException: Missing required options: ", "");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String[] strArray13 = commandLine12.getArgs();
        java.lang.String str16 = commandLine12.getOptionValue(' ', "");
        java.lang.Object obj18 = commandLine12.getOptionObject("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        boolean boolean27 = options16.hasShortOption("hi!");
        java.util.List list28 = options16.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser29 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str30 = defaultParser29.currentToken;
        org.apache.commons.cli.CommandLine commandLine31 = defaultParser29.cmd;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options32.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser29.parse(options32, strArray34);
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser0.parse(options16, strArray34, false);
        java.lang.Object obj39 = commandLine37.getOptionObject("[ Options: [ short {} ] [ long {} ]");
        commandLine37.addArg("[ Options: [ short {} ] [ long {} ]");
        java.lang.String[] strArray43 = commandLine37.getOptionValues('\000');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(commandLine31);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(strArray43);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str3 = defaultParser2.currentToken;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser2.cmd;
        boolean boolean5 = defaultParser2.skipParsing;
        defaultParser2.handleConcatenatedOptions("");
        defaultParser2.skipParsing = false;
        boolean boolean10 = defaultParser2.skipParsing;
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser14 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str15 = defaultParser14.currentToken;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser14.cmd;
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options17.getOptions();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser14.parse(options17, strArray24, properties25);
        org.apache.commons.cli.DefaultParser defaultParser27 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str28 = defaultParser27.currentToken;
        org.apache.commons.cli.CommandLine commandLine29 = defaultParser27.cmd;
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection31 = options30.getOptions();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = defaultParser27.parse(options30, strArray37, properties38);
        java.lang.String str41 = commandLine39.getOptionValue("hi!");
        java.util.Properties properties43 = commandLine39.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine44 = defaultParser2.parse(options11, strArray24, properties43);
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList49 = option48.getValuesList();
        org.apache.commons.cli.OptionGroup optionGroup50 = options11.getOptionGroup(option48);
        org.apache.commons.cli.DefaultParser defaultParser51 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str52 = defaultParser51.currentToken;
        org.apache.commons.cli.Options options53 = defaultParser51.options;
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.lang.String str55 = options54.toString();
        org.apache.commons.cli.Option option59 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList60 = option59.getValuesList();
        org.apache.commons.cli.Options options61 = options54.addOption(option59);
        org.apache.commons.cli.CommandLine commandLine62 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray63 = commandLine62.getArgs();
        org.apache.commons.cli.CommandLine commandLine64 = defaultParser51.parse(options54, strArray63);
        org.apache.commons.cli.DefaultParser defaultParser65 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str66 = defaultParser65.currentToken;
        org.apache.commons.cli.CommandLine commandLine67 = defaultParser65.cmd;
        org.apache.commons.cli.Options options68 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection69 = options68.getOptions();
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties76 = null;
        org.apache.commons.cli.CommandLine commandLine77 = defaultParser65.parse(options68, strArray75, properties76);
        commandLine77.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties81 = commandLine77.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine83 = defaultParser0.parse(options11, strArray63, properties81, false);
        java.util.Properties properties85 = commandLine83.getOptionProperties("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(commandLine29);
        org.junit.Assert.assertNotNull(optionCollection31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNull(optionGroup50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(options53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str55, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(commandLine67);
        org.junit.Assert.assertNotNull(optionCollection69);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(commandLine77);
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertNotNull(commandLine83);
        org.junit.Assert.assertNotNull(properties85);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", false, "");
        java.lang.Object obj17 = option16.getType();
        java.lang.String str18 = option16.getKey();
        org.apache.commons.cli.OptionGroup optionGroup19 = options3.getOptionGroup(option16);
        java.lang.String str20 = option16.getKey();
        // The following exception was thrown during execution in test generation
        try {
            option16.addValueForProcessing("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: NO_ARGS_ALLOWED");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(optionGroup19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        boolean boolean11 = options9.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser12 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str13 = defaultParser12.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser12.cmd;
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = options15.getOptions();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser12.parse(options15, strArray22, properties23);
        org.apache.commons.cli.DefaultParser defaultParser25 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str26 = defaultParser25.currentToken;
        org.apache.commons.cli.CommandLine commandLine27 = defaultParser25.cmd;
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection29 = options28.getOptions();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser25.parse(options28, strArray35, properties36);
        java.lang.String str39 = commandLine37.getOptionValue("hi!");
        java.util.Properties properties41 = commandLine37.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine42 = defaultParser0.parse(options9, strArray22, properties41);
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList47 = option46.getValuesList();
        org.apache.commons.cli.OptionGroup optionGroup48 = options9.getOptionGroup(option46);
        java.lang.Object obj49 = option46.getType();
        java.lang.Object obj50 = option46.clone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(optionCollection16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(commandLine27);
        org.junit.Assert.assertNotNull(optionCollection29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNull(optionGroup48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "class java.lang.String");
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "[ option:   ::  :: class java.lang.String ]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        boolean boolean9 = options3.hasShortOption("hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options3.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.lang.String str4 = options3.toString();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList9 = option8.getValuesList();
        org.apache.commons.cli.Options options10 = options3.addOption(option8);
        org.apache.commons.cli.CommandLine commandLine11 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray12 = commandLine11.getArgs();
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options3, strArray12);
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options15 = options3.addOptionGroup(optionGroup14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        boolean boolean14 = options3.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option16 = options3.getOption("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        boolean boolean18 = options3.hasLongOption("");
        org.apache.commons.cli.OptionGroup optionGroup19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options20 = options3.addOptionGroup(optionGroup19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList6 = option5.getValuesList();
        java.util.List<java.lang.String> strList7 = option5.getValuesList();
        org.apache.commons.cli.OptionGroup optionGroup8 = options0.getOptionGroup(option5);
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(optionGroup8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.DefaultParser defaultParser8 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str9 = defaultParser8.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser8.cmd;
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options11.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        org.apache.commons.cli.CommandLine commandLine20 = defaultParser8.parse(options11, strArray18, properties19);
        boolean boolean22 = options11.hasShortOption("hi!");
        java.util.List list23 = options11.getRequiredOptions();
        boolean boolean25 = options11.hasShortOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.DefaultParser defaultParser26 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str27 = defaultParser26.currentToken;
        org.apache.commons.cli.CommandLine commandLine28 = defaultParser26.cmd;
        boolean boolean29 = defaultParser26.skipParsing;
        org.apache.commons.cli.CommandLine commandLine30 = defaultParser26.cmd;
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        java.lang.String str32 = options31.toString();
        boolean boolean34 = options31.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        defaultParser26.options = options31;
        org.apache.commons.cli.DefaultParser defaultParser36 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str37 = defaultParser36.currentToken;
        org.apache.commons.cli.CommandLine commandLine38 = defaultParser36.cmd;
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection40 = options39.getOptions();
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine42 = defaultParser36.parse(options39, strArray41);
        java.util.List<org.apache.commons.cli.Option> optionList43 = options39.helpOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection44 = options39.getOptions();
        org.apache.commons.cli.DefaultParser defaultParser45 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str46 = defaultParser45.currentToken;
        org.apache.commons.cli.CommandLine commandLine47 = defaultParser45.cmd;
        org.apache.commons.cli.Options options48 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection49 = options48.getOptions();
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine51 = defaultParser45.parse(options48, strArray50);
        org.apache.commons.cli.CommandLine commandLine52 = defaultParser26.parse(options39, strArray50);
        org.apache.commons.cli.DefaultParser defaultParser53 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str54 = defaultParser53.currentToken;
        org.apache.commons.cli.CommandLine commandLine55 = defaultParser53.cmd;
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection57 = options56.getOptions();
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties64 = null;
        org.apache.commons.cli.CommandLine commandLine65 = defaultParser53.parse(options56, strArray63, properties64);
        java.lang.String str67 = commandLine65.getOptionValue("hi!");
        java.util.Properties properties69 = commandLine65.getOptionProperties("");
        java.lang.String str72 = commandLine65.getOptionValue("hi!", "");
        java.util.Properties properties74 = commandLine65.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine76 = defaultParser0.parse(options11, strArray50, properties74, false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(commandLine28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(commandLine30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str32, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(commandLine38);
        org.junit.Assert.assertNotNull(optionCollection40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(optionList43);
        org.junit.Assert.assertNotNull(optionCollection44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(commandLine47);
        org.junit.Assert.assertNotNull(optionCollection49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(commandLine55);
        org.junit.Assert.assertNotNull(optionCollection57);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(commandLine65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(properties69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(properties74);
        org.junit.Assert.assertNotNull(commandLine76);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        org.apache.commons.cli.Option option9 = options3.getOption("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingArgumentException: ");
        java.util.List<org.apache.commons.cli.Option> optionList10 = options3.helpOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(optionList10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str15 = commandLine12.getOptionValue(' ', "hi!");
        commandLine12.addArg("hi!");
        java.lang.Object obj19 = commandLine12.getOptionObject("hi!");
        java.util.Iterator<org.apache.commons.cli.Option> optionItor20 = commandLine12.iterator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(optionItor20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str3 = defaultParser2.currentToken;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser2.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options5.getOptions();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser2.parse(options5, strArray7);
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String[] strArray11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser2.parse(options9, strArray11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options9, strArray23);
        java.lang.String str29 = commandLine26.getOptionValue('#', "[ option:   ::  :: class java.lang.String ]");
        java.lang.Object obj31 = commandLine26.getOptionObject(' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str29, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        org.apache.commons.cli.Option option9 = options3.getOption("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingArgumentException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options12 = options3.addOption("[ option:   ::  :: class java.lang.String ]", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ option:   ::  :: class java.lang.String ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(option9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        boolean boolean14 = options3.hasShortOption("hi!");
        java.util.List list15 = options3.getRequiredOptions();
        java.util.List list16 = options3.getRequiredOptions();
        org.apache.commons.cli.MissingOptionException missingOptionException17 = new org.apache.commons.cli.MissingOptionException(list16);
        org.apache.commons.cli.MissingOptionException missingOptionException18 = new org.apache.commons.cli.MissingOptionException(list16);
        java.util.List list19 = missingOptionException18.getMissingOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str3 = defaultParser2.currentToken;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser2.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options5.getOptions();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties13 = null;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser2.parse(options5, strArray12, properties13);
        java.lang.String str17 = commandLine14.getOptionValue(' ', "hi!");
        commandLine14.addArg("hi!");
        java.lang.String[] strArray20 = commandLine14.getArgs();
        java.util.List<java.lang.String> strList21 = commandLine14.getArgList();
        org.apache.commons.cli.MissingOptionException missingOptionException22 = new org.apache.commons.cli.MissingOptionException((java.util.List) strList21);
        org.apache.commons.cli.AmbiguousOptionException ambiguousOptionException23 = new org.apache.commons.cli.AmbiguousOptionException("hi!", (java.util.Collection<java.lang.String>) strList21);
        java.util.Collection<java.lang.String> strCollection24 = ambiguousOptionException23.getMatchingOptions();
        org.apache.commons.cli.AmbiguousOptionException ambiguousOptionException25 = new org.apache.commons.cli.AmbiguousOptionException("", strCollection24);
        org.apache.commons.cli.DefaultParser defaultParser26 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str27 = defaultParser26.currentToken;
        org.apache.commons.cli.CommandLine commandLine28 = defaultParser26.cmd;
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection30 = options29.getOptions();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = defaultParser26.parse(options29, strArray36, properties37);
        boolean boolean40 = options29.hasShortOption("hi!");
        java.util.List list41 = options29.getRequiredOptions();
        java.util.List list42 = options29.getRequiredOptions();
        org.apache.commons.cli.MissingOptionException missingOptionException43 = new org.apache.commons.cli.MissingOptionException(list42);
        ambiguousOptionException25.addSuppressed((java.lang.Throwable) missingOptionException43);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strCollection24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(commandLine28);
        org.junit.Assert.assertNotNull(optionCollection30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        boolean boolean2 = options0.hasShortOption("hi!");
        java.util.List<org.apache.commons.cli.Option> optionList3 = options0.helpOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options7 = options0.addOption("hi!", false, "org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingArgumentException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'hi!' contains an illegal character : '!'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionList3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser3 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str4 = defaultParser3.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser3.cmd;
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options6.getOptions();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser3.parse(options6, strArray8);
        java.util.List list10 = options6.getRequiredOptions();
        boolean boolean12 = options6.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        org.apache.commons.cli.DefaultParser defaultParser26 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str27 = defaultParser26.currentToken;
        org.apache.commons.cli.CommandLine commandLine28 = defaultParser26.cmd;
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection30 = options29.getOptions();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = defaultParser26.parse(options29, strArray36, properties37);
        commandLine38.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties42 = commandLine38.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine44 = defaultParser0.parse(options6, strArray23, properties42, true);
        java.lang.String str46 = commandLine44.getOptionValue('a');
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", false, "");
        java.lang.Object obj51 = option50.getType();
        java.lang.String str52 = option50.getKey();
        commandLine44.addOption(option50);
        java.lang.Object obj55 = commandLine44.getOptionObject('a');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(commandLine28);
        org.junit.Assert.assertNotNull(optionCollection30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.String");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        boolean boolean3 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option7 = new org.apache.commons.cli.Option("", false, "");
        option7.setDescription("");
        option7.setRequired(false);
        boolean boolean12 = option7.acceptsArg();
        org.apache.commons.cli.OptionGroup optionGroup13 = options0.getOptionGroup(option7);
        boolean boolean14 = option7.isRequired();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(optionGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("hi!");
        java.util.Properties properties16 = commandLine12.getOptionProperties("");
        java.lang.String str19 = commandLine12.getOptionValue("hi!", "");
        java.lang.Object obj21 = commandLine12.getParsedOptionValue("");
        boolean boolean23 = commandLine12.hasOption("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.DefaultParser defaultParser9 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str10 = defaultParser9.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser9.cmd;
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options12.getOptions();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser9.parse(options12, strArray19, properties20);
        commandLine21.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties25 = commandLine21.getOptionProperties("hi!");
        java.lang.Object obj27 = commandLine21.getOptionObject("[ option:   ::  :: class java.lang.String ]");
        commandLine21.addArg("[ Options: [ short {} ] [ long {} ]");
        defaultParser0.cmd = commandLine21;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("hi!");
        java.util.Properties properties16 = commandLine12.getOptionProperties("");
        java.lang.String str19 = commandLine12.getOptionValue("hi!", "");
        java.util.Properties properties21 = commandLine12.getOptionProperties("hi!");
        java.lang.Object obj23 = commandLine12.getOptionObject("org.apache.commons.cli.MissingArgumentException: ");
        java.lang.String str25 = commandLine12.getOptionValue('\000');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.DefaultParser defaultParser5 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str6 = defaultParser5.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser5.cmd;
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options8.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options8, strArray10);
        java.util.List list12 = options8.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options16, strArray18);
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options8, strArray18, false);
        boolean boolean23 = commandLine21.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser8 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str9 = defaultParser8.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser8.cmd;
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = options11.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        org.apache.commons.cli.CommandLine commandLine20 = defaultParser8.parse(options11, strArray18, properties19);
        org.apache.commons.cli.DefaultParser defaultParser21 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str22 = defaultParser21.currentToken;
        org.apache.commons.cli.CommandLine commandLine23 = defaultParser21.cmd;
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection25 = options24.getOptions();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties32 = null;
        org.apache.commons.cli.CommandLine commandLine33 = defaultParser21.parse(options24, strArray31, properties32);
        boolean boolean35 = options24.hasShortOption("hi!");
        java.util.List list36 = options24.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser37 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str38 = defaultParser37.currentToken;
        org.apache.commons.cli.CommandLine commandLine39 = defaultParser37.cmd;
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection41 = options40.getOptions();
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine43 = defaultParser37.parse(options40, strArray42);
        org.apache.commons.cli.CommandLine commandLine45 = defaultParser8.parse(options24, strArray42, false);
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection46 = options24.getOptionGroups();
        org.apache.commons.cli.DefaultParser defaultParser47 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str48 = defaultParser47.currentToken;
        org.apache.commons.cli.CommandLine commandLine49 = defaultParser47.cmd;
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection51 = options50.getOptions();
        java.lang.String[] strArray52 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine53 = defaultParser47.parse(options50, strArray52);
        org.apache.commons.cli.CommandLine commandLine55 = defaultParser0.parse(options24, strArray52, true);
        java.util.List list56 = options24.getRequiredOptions();
        java.util.List list57 = options24.getRequiredOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(commandLine23);
        org.junit.Assert.assertNotNull(optionCollection25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(commandLine39);
        org.junit.Assert.assertNotNull(optionCollection41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(optionGroupCollection46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(commandLine49);
        org.junit.Assert.assertNotNull(optionCollection51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("hi!");
        java.util.Properties properties16 = commandLine12.getOptionProperties("");
        java.lang.String str19 = commandLine12.getOptionValue("hi!", "");
        java.util.Properties properties21 = commandLine12.getOptionProperties("hi!");
        java.util.List<java.lang.String> strList22 = commandLine12.getArgList();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser3 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str4 = defaultParser3.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser3.cmd;
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = options6.getOptions();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser3.parse(options6, strArray8);
        java.util.List list10 = options6.getRequiredOptions();
        boolean boolean12 = options6.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        org.apache.commons.cli.DefaultParser defaultParser26 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str27 = defaultParser26.currentToken;
        org.apache.commons.cli.CommandLine commandLine28 = defaultParser26.cmd;
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection30 = options29.getOptions();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = defaultParser26.parse(options29, strArray36, properties37);
        commandLine38.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties42 = commandLine38.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine44 = defaultParser0.parse(options6, strArray23, properties42, true);
        java.lang.String str46 = commandLine44.getOptionValue('a');
        java.util.Properties properties48 = commandLine44.getOptionProperties("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(commandLine28);
        org.junit.Assert.assertNotNull(optionCollection30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(properties48);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        boolean boolean9 = options3.hasShortOption("hi!");
        boolean boolean11 = options3.hasShortOption("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean9 = option8.requiresArg();
        java.lang.String str10 = option8.getLongOpt();
        option8.setValueSeparator('4');
        int int13 = option8.getArgs();
        boolean boolean14 = option8.hasOptionalArg();
        defaultParser0.currentOption = option8;
        java.lang.String str16 = defaultParser0.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser17 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str18 = defaultParser17.currentToken;
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser17.cmd;
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = options20.getOptions();
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine23 = defaultParser17.parse(options20, strArray22);
        java.util.List list24 = options20.getRequiredOptions();
        org.apache.commons.cli.Option option26 = options20.getOption("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingArgumentException: ");
        org.apache.commons.cli.DefaultParser defaultParser27 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str28 = defaultParser27.currentToken;
        org.apache.commons.cli.CommandLine commandLine29 = defaultParser27.cmd;
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection31 = options30.getOptions();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = defaultParser27.parse(options30, strArray37, properties38);
        org.apache.commons.cli.DefaultParser defaultParser40 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str41 = defaultParser40.currentToken;
        org.apache.commons.cli.Options options42 = defaultParser40.options;
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        java.lang.String str44 = options43.toString();
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList49 = option48.getValuesList();
        org.apache.commons.cli.Options options50 = options43.addOption(option48);
        org.apache.commons.cli.CommandLine commandLine51 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray52 = commandLine51.getArgs();
        org.apache.commons.cli.CommandLine commandLine53 = defaultParser40.parse(options43, strArray52);
        org.apache.commons.cli.DefaultParser defaultParser54 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str55 = defaultParser54.currentToken;
        org.apache.commons.cli.Options options56 = defaultParser54.options;
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        java.lang.String str58 = options57.toString();
        org.apache.commons.cli.Option option62 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList63 = option62.getValuesList();
        org.apache.commons.cli.Options options64 = options57.addOption(option62);
        org.apache.commons.cli.CommandLine commandLine65 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray66 = commandLine65.getArgs();
        org.apache.commons.cli.CommandLine commandLine67 = defaultParser54.parse(options57, strArray66);
        org.apache.commons.cli.CommandLine commandLine68 = defaultParser27.parse(options43, strArray66);
        org.apache.commons.cli.CommandLine commandLine69 = defaultParser0.parse(options20, strArray66);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(commandLine19);
        org.junit.Assert.assertNotNull(optionCollection21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(option26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(commandLine29);
        org.junit.Assert.assertNotNull(optionCollection31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(options42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str44, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(options56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str58, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertNotNull(commandLine68);
        org.junit.Assert.assertNotNull(commandLine69);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        boolean boolean3 = options0.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Option option7 = new org.apache.commons.cli.Option("", false, "");
        option7.setDescription("");
        option7.setRequired(false);
        boolean boolean12 = option7.acceptsArg();
        org.apache.commons.cli.OptionGroup optionGroup13 = options0.getOptionGroup(option7);
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options15 = options0.addOptionGroup(optionGroup14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(optionGroup13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = options7.getOptions();
        java.lang.String[] strArray9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray9);
        defaultParser0.currentToken = "[ option:   ::  :: class java.lang.String ]";
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options16, strArray18);
        java.util.List list20 = options16.getRequiredOptions();
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean25 = option24.requiresArg();
        java.lang.String str26 = option24.toString();
        org.apache.commons.cli.OptionGroup optionGroup27 = options16.getOptionGroup(option24);
        boolean boolean29 = options16.hasLongOption("[ Options: [ short {} ] [ long {} ]");
        java.lang.String[] strArray30 = null;
        org.apache.commons.cli.DefaultParser defaultParser31 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str32 = defaultParser31.currentToken;
        org.apache.commons.cli.CommandLine commandLine33 = defaultParser31.cmd;
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection35 = options34.getOptions();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties42 = null;
        org.apache.commons.cli.CommandLine commandLine43 = defaultParser31.parse(options34, strArray41, properties42);
        java.lang.String str45 = commandLine43.getOptionValue("hi!");
        java.util.Properties properties47 = commandLine43.getOptionProperties("");
        java.lang.String str50 = commandLine43.getOptionValue("hi!", "");
        java.util.Properties properties52 = commandLine43.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine54 = defaultParser0.parse(options16, strArray30, properties52, false);
        boolean boolean55 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str26, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(commandLine33);
        org.junit.Assert.assertNotNull(optionCollection35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        boolean boolean9 = options3.hasShortOption("hi!");
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "");
        java.lang.String str15 = option13.getValue((int) (short) 0);
        org.apache.commons.cli.Options options16 = options3.addOption(option13);
        java.lang.Object obj17 = option13.clone();
        option13.clearValues();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[ option:   ::  :: class java.lang.String ]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.lang.String str4 = options3.toString();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList9 = option8.getValuesList();
        org.apache.commons.cli.Options options10 = options3.addOption(option8);
        org.apache.commons.cli.CommandLine commandLine11 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray12 = commandLine11.getArgs();
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options3, strArray12);
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        boolean boolean16 = options14.hasShortOption("hi!");
        defaultParser0.options = options14;
        defaultParser0.handleConcatenatedOptions("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = options0.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options3 = options0.addOptionGroup(optionGroup2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionCollection1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str3 = defaultParser2.currentToken;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser2.cmd;
        boolean boolean5 = defaultParser2.skipParsing;
        defaultParser2.handleConcatenatedOptions("");
        defaultParser2.skipParsing = false;
        boolean boolean10 = defaultParser2.skipParsing;
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        boolean boolean13 = options11.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser14 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str15 = defaultParser14.currentToken;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser14.cmd;
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = options17.getOptions();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser14.parse(options17, strArray24, properties25);
        org.apache.commons.cli.DefaultParser defaultParser27 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str28 = defaultParser27.currentToken;
        org.apache.commons.cli.CommandLine commandLine29 = defaultParser27.cmd;
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection31 = options30.getOptions();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = defaultParser27.parse(options30, strArray37, properties38);
        java.lang.String str41 = commandLine39.getOptionValue("hi!");
        java.util.Properties properties43 = commandLine39.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine44 = defaultParser2.parse(options11, strArray24, properties43);
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList49 = option48.getValuesList();
        org.apache.commons.cli.OptionGroup optionGroup50 = options11.getOptionGroup(option48);
        org.apache.commons.cli.DefaultParser defaultParser51 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str52 = defaultParser51.currentToken;
        org.apache.commons.cli.Options options53 = defaultParser51.options;
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.lang.String str55 = options54.toString();
        org.apache.commons.cli.Option option59 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList60 = option59.getValuesList();
        org.apache.commons.cli.Options options61 = options54.addOption(option59);
        org.apache.commons.cli.CommandLine commandLine62 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray63 = commandLine62.getArgs();
        org.apache.commons.cli.CommandLine commandLine64 = defaultParser51.parse(options54, strArray63);
        org.apache.commons.cli.DefaultParser defaultParser65 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str66 = defaultParser65.currentToken;
        org.apache.commons.cli.CommandLine commandLine67 = defaultParser65.cmd;
        org.apache.commons.cli.Options options68 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection69 = options68.getOptions();
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties76 = null;
        org.apache.commons.cli.CommandLine commandLine77 = defaultParser65.parse(options68, strArray75, properties76);
        commandLine77.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties81 = commandLine77.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine83 = defaultParser0.parse(options11, strArray63, properties81, false);
        boolean boolean85 = commandLine83.hasOption(' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(commandLine29);
        org.junit.Assert.assertNotNull(optionCollection31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNull(optionGroup50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(options53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str55, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(commandLine67);
        org.junit.Assert.assertNotNull(optionCollection69);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(commandLine77);
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertNotNull(commandLine83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        boolean boolean27 = options16.hasShortOption("hi!");
        java.util.List list28 = options16.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser29 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str30 = defaultParser29.currentToken;
        org.apache.commons.cli.CommandLine commandLine31 = defaultParser29.cmd;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection33 = options32.getOptions();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser29.parse(options32, strArray34);
        org.apache.commons.cli.CommandLine commandLine37 = defaultParser0.parse(options16, strArray34, false);
        java.lang.Object obj39 = commandLine37.getOptionObject('a');
        java.lang.String[] strArray40 = commandLine37.getArgs();
        java.lang.String[] strArray42 = commandLine37.getOptionValues("");
        java.lang.Object obj44 = commandLine37.getOptionObject(' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(commandLine31);
        org.junit.Assert.assertNotNull(optionCollection33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean12 = option11.requiresArg();
        java.lang.String str13 = option11.toString();
        org.apache.commons.cli.OptionGroup optionGroup14 = options3.getOptionGroup(option11);
        boolean boolean15 = option11.hasArgName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str13, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(optionGroup14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean11 = option10.requiresArg();
        java.lang.String str12 = option10.getLongOpt();
        option10.setValueSeparator('4');
        option10.setOptionalArg(false);
        org.apache.commons.cli.OptionGroup optionGroup17 = options3.getOptionGroup(option10);
        boolean boolean18 = option10.hasOptionalArg();
        java.lang.String str19 = option10.getLongOpt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = option10.addValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(optionGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        java.lang.String str14 = commandLine12.getOptionValue("hi!");
        java.util.Properties properties16 = commandLine12.getOptionProperties("");
        java.lang.String str19 = commandLine12.getOptionValue("hi!", "");
        java.lang.String str22 = commandLine12.getOptionValue("[ Options: [ short {} ] [ long {} ]", "");
        java.lang.String[] strArray23 = commandLine12.getArgs();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        org.apache.commons.cli.DefaultParser defaultParser6 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str7 = defaultParser6.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser6.cmd;
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser6.parse(options9, strArray16, properties17);
        boolean boolean20 = options9.hasShortOption("hi!");
        java.util.List list21 = options9.getRequiredOptions();
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options9, strArray22, true);
        org.apache.commons.cli.DefaultParser defaultParser25 = new org.apache.commons.cli.DefaultParser();
        defaultParser25.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser28 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str29 = defaultParser28.currentToken;
        org.apache.commons.cli.CommandLine commandLine30 = defaultParser28.cmd;
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection32 = options31.getOptions();
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine34 = defaultParser28.parse(options31, strArray33);
        java.util.List list35 = options31.getRequiredOptions();
        boolean boolean37 = options31.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.DefaultParser defaultParser38 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str39 = defaultParser38.currentToken;
        org.apache.commons.cli.CommandLine commandLine40 = defaultParser38.cmd;
        org.apache.commons.cli.Options options41 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection42 = options41.getOptions();
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties49 = null;
        org.apache.commons.cli.CommandLine commandLine50 = defaultParser38.parse(options41, strArray48, properties49);
        org.apache.commons.cli.DefaultParser defaultParser51 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str52 = defaultParser51.currentToken;
        org.apache.commons.cli.CommandLine commandLine53 = defaultParser51.cmd;
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection55 = options54.getOptions();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties62 = null;
        org.apache.commons.cli.CommandLine commandLine63 = defaultParser51.parse(options54, strArray61, properties62);
        commandLine63.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties67 = commandLine63.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine69 = defaultParser25.parse(options31, strArray48, properties67, true);
        defaultParser0.cmd = commandLine69;
        org.apache.commons.cli.DefaultParser defaultParser71 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str72 = defaultParser71.currentToken;
        org.apache.commons.cli.CommandLine commandLine73 = defaultParser71.cmd;
        org.apache.commons.cli.Options options74 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection75 = options74.getOptions();
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine77 = defaultParser71.parse(options74, strArray76);
        org.apache.commons.cli.Option option81 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean82 = option81.requiresArg();
        java.lang.String str83 = option81.getLongOpt();
        option81.setValueSeparator('4');
        option81.setOptionalArg(false);
        org.apache.commons.cli.OptionGroup optionGroup88 = options74.getOptionGroup(option81);
        boolean boolean89 = option81.hasOptionalArg();
        java.lang.String str90 = option81.getLongOpt();
        option81.setRequired(false);
        commandLine69.addOption(option81);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(commandLine30);
        org.junit.Assert.assertNotNull(optionCollection32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(commandLine40);
        org.junit.Assert.assertNotNull(optionCollection42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(commandLine53);
        org.junit.Assert.assertNotNull(optionCollection55);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertNotNull(commandLine69);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(commandLine73);
        org.junit.Assert.assertNotNull(optionCollection75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(commandLine77);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(optionGroup88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(str90);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        java.util.List list7 = options3.getRequiredOptions();
        org.apache.commons.cli.Option option9 = options3.getOption("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.MissingArgumentException: ");
        java.util.Collection<org.apache.commons.cli.OptionGroup> optionGroupCollection10 = options3.getOptionGroups();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(optionGroupCollection10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.lang.String str4 = options3.toString();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList9 = option8.getValuesList();
        org.apache.commons.cli.Options options10 = options3.addOption(option8);
        org.apache.commons.cli.CommandLine commandLine11 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray12 = commandLine11.getArgs();
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options3, strArray12);
        org.apache.commons.cli.DefaultParser defaultParser14 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str15 = defaultParser14.currentToken;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser14.cmd;
        boolean boolean17 = defaultParser14.skipParsing;
        boolean boolean18 = defaultParser14.stopAtNonOption;
        org.apache.commons.cli.DefaultParser defaultParser19 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str20 = defaultParser19.currentToken;
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser19.cmd;
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection23 = options22.getOptions();
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser19.parse(options22, strArray24);
        java.util.List list26 = options22.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser27 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str28 = defaultParser27.currentToken;
        org.apache.commons.cli.CommandLine commandLine29 = defaultParser27.cmd;
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection31 = options30.getOptions();
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine33 = defaultParser27.parse(options30, strArray32);
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser14.parse(options22, strArray32, false);
        org.apache.commons.cli.DefaultParser defaultParser36 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str37 = defaultParser36.currentToken;
        org.apache.commons.cli.CommandLine commandLine38 = defaultParser36.cmd;
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection40 = options39.getOptions();
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine42 = defaultParser36.parse(options39, strArray41);
        java.util.List list43 = options39.getRequiredOptions();
        boolean boolean45 = options39.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.CommandLine commandLine46 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray47 = commandLine46.getArgs();
        org.apache.commons.cli.CommandLine commandLine49 = defaultParser14.parse(options39, strArray47, true);
        java.lang.String[] strArray50 = null;
        org.apache.commons.cli.DefaultParser defaultParser51 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str52 = defaultParser51.currentToken;
        org.apache.commons.cli.CommandLine commandLine53 = defaultParser51.cmd;
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection55 = options54.getOptions();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties62 = null;
        org.apache.commons.cli.CommandLine commandLine63 = defaultParser51.parse(options54, strArray61, properties62);
        java.util.Properties properties65 = commandLine63.getOptionProperties("");
        org.apache.commons.cli.CommandLine commandLine67 = defaultParser0.parse(options39, strArray50, properties65, false);
        java.util.List<java.lang.String> strList69 = options39.getMatchingOptions("[ option:   ::  :: class java.lang.String ]");
        java.util.List<org.apache.commons.cli.Option> optionList70 = options39.helpOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str4, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(commandLine21);
        org.junit.Assert.assertNotNull(optionCollection23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(commandLine29);
        org.junit.Assert.assertNotNull(optionCollection31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(commandLine38);
        org.junit.Assert.assertNotNull(optionCollection40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(commandLine53);
        org.junit.Assert.assertNotNull(optionCollection55);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(optionList70);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str3 = defaultParser2.currentToken;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser2.cmd;
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = options5.getOptions();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser2.parse(options5, strArray7);
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = options9.getOptions();
        java.lang.String[] strArray11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser2.parse(options9, strArray11);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser13.parse(options16, strArray23, properties24);
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options9, strArray23);
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        boolean boolean29 = options27.hasShortOption("hi!");
        org.apache.commons.cli.DefaultParser defaultParser30 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str31 = defaultParser30.currentToken;
        org.apache.commons.cli.CommandLine commandLine32 = defaultParser30.cmd;
        org.apache.commons.cli.Options options33 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection34 = options33.getOptions();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = defaultParser30.parse(options33, strArray40, properties41);
        java.lang.String str45 = commandLine42.getOptionValue(' ', "hi!");
        commandLine42.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray48 = commandLine42.getOptions();
        java.lang.String[] strArray49 = commandLine42.getArgs();
        org.apache.commons.cli.CommandLine commandLine50 = defaultParser0.parse(options27, strArray49);
        boolean boolean52 = options27.hasOption("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(commandLine32);
        org.junit.Assert.assertNotNull(optionCollection34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(optionArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        java.lang.String str1 = options0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = options0.getOptions();
        org.apache.commons.cli.Option option4 = options0.getOption("[ option:   ::  :: class java.lang.String ]");
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean9 = option8.requiresArg();
        boolean boolean10 = option8.hasValueSeparator();
        java.lang.String str12 = option8.getValue((int) '#');
        option8.setDescription("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        java.lang.String str16 = option8.getValue((-2));
        option8.setArgs((int) '\000');
        boolean boolean19 = option8.acceptsArg();
        org.apache.commons.cli.OptionGroup optionGroup20 = options0.getOptionGroup(option8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str1, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(optionGroup20);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.lang.String str9 = options8.toString();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList14 = option13.getValuesList();
        org.apache.commons.cli.Options options15 = options8.addOption(option13);
        org.apache.commons.cli.CommandLine commandLine16 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray17 = commandLine16.getArgs();
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options15, strArray17);
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        java.lang.String str20 = options19.toString();
        org.apache.commons.cli.DefaultParser defaultParser21 = new org.apache.commons.cli.DefaultParser();
        defaultParser21.skipParsing = false;
        org.apache.commons.cli.DefaultParser defaultParser24 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str25 = defaultParser24.currentToken;
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser24.cmd;
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection28 = options27.getOptions();
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine30 = defaultParser24.parse(options27, strArray29);
        java.util.List list31 = options27.getRequiredOptions();
        boolean boolean33 = options27.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.DefaultParser defaultParser34 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str35 = defaultParser34.currentToken;
        org.apache.commons.cli.CommandLine commandLine36 = defaultParser34.cmd;
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection38 = options37.getOptions();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties45 = null;
        org.apache.commons.cli.CommandLine commandLine46 = defaultParser34.parse(options37, strArray44, properties45);
        org.apache.commons.cli.DefaultParser defaultParser47 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str48 = defaultParser47.currentToken;
        org.apache.commons.cli.CommandLine commandLine49 = defaultParser47.cmd;
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection51 = options50.getOptions();
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties58 = null;
        org.apache.commons.cli.CommandLine commandLine59 = defaultParser47.parse(options50, strArray57, properties58);
        commandLine59.addArg("org.apache.commons.cli.MissingArgumentException: ");
        java.util.Properties properties63 = commandLine59.getOptionProperties("hi!");
        org.apache.commons.cli.CommandLine commandLine65 = defaultParser21.parse(options27, strArray44, properties63, true);
        org.apache.commons.cli.CommandLine commandLine66 = new org.apache.commons.cli.CommandLine();
        org.apache.commons.cli.Option[] optionArray67 = commandLine66.getOptions();
        boolean boolean69 = commandLine66.hasOption("org.apache.commons.cli.MissingArgumentException: ");
        java.lang.String str72 = commandLine66.getOptionValue(' ', "hi!");
        boolean boolean74 = commandLine66.hasOption('4');
        java.util.Properties properties76 = commandLine66.getOptionProperties("[ option:   ::  :: class java.lang.String ]");
        org.apache.commons.cli.CommandLine commandLine78 = defaultParser0.parse(options19, strArray44, properties76, false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str20, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(commandLine26);
        org.junit.Assert.assertNotNull(optionCollection28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(commandLine36);
        org.junit.Assert.assertNotNull(optionCollection38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(commandLine49);
        org.junit.Assert.assertNotNull(optionCollection51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(commandLine59);
        org.junit.Assert.assertNotNull(properties63);
        org.junit.Assert.assertNotNull(commandLine65);
        org.junit.Assert.assertNotNull(optionArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(commandLine78);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray5);
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = options7.getOptions();
        java.lang.String[] strArray9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray9);
        org.apache.commons.cli.OptionGroup optionGroup11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options12 = options7.addOptionGroup(optionGroup11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNotNull(commandLine10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = options3.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
        boolean boolean14 = options3.hasShortOption("hi!");
        java.util.List list15 = options3.getRequiredOptions();
        java.util.List list16 = options3.getRequiredOptions();
        org.apache.commons.cli.MissingOptionException missingOptionException17 = new org.apache.commons.cli.MissingOptionException(list16);
        org.apache.commons.cli.MissingOptionException missingOptionException18 = new org.apache.commons.cli.MissingOptionException(list16);
        java.lang.String str19 = missingOptionException18.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.cli.MissingOptionException: Missing required options: " + "'", str19, "org.apache.commons.cli.MissingOptionException: Missing required options: ");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.lang.String str9 = options8.toString();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", false, "");
        java.util.List<java.lang.String> strList14 = option13.getValuesList();
        org.apache.commons.cli.Options options15 = options8.addOption(option13);
        org.apache.commons.cli.CommandLine commandLine16 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray17 = commandLine16.getArgs();
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options15, strArray17);
        java.lang.String str21 = commandLine18.getOptionValue("org.apache.commons.cli.MissingOptionException: Missing required options: ", "");
        commandLine18.addArg("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str9, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.DefaultParser defaultParser5 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str6 = defaultParser5.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser5.cmd;
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = options8.getOptions();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options8, strArray10);
        java.util.List list12 = options8.getRequiredOptions();
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str14 = defaultParser13.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser13.cmd;
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = options16.getOptions();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options16, strArray18);
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options8, strArray18, false);
        java.util.Properties properties23 = commandLine21.getOptionProperties("hi!");
        org.apache.commons.cli.Option option27 = new org.apache.commons.cli.Option("", false, "");
        boolean boolean28 = option27.requiresArg();
        java.lang.String str29 = option27.toString();
        java.lang.String str31 = option27.getValue("");
        java.lang.String str32 = option27.getDescription();
        commandLine21.addOption(option27);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[ option:   ::  :: class java.lang.String ]" + "'", str29, "[ option:   ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }
}

