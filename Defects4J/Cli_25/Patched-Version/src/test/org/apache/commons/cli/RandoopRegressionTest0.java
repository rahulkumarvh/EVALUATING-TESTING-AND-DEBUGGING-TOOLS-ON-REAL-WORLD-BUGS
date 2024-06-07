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
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = helpFormatter0.renderWrappedText(stringBuffer20, (int) ' ', (int) ' ', "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = helpFormatter0.createPadding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        java.util.Collection collection5 = options4.getOptionGroups();
        org.apache.commons.cli.Options options10 = options4.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option12 = options4.getOption("hi!");
        org.apache.commons.cli.Options options16 = options4.addOption("", true, "--");
        java.util.List list17 = options16.helpOptions();
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) -1, "arg", "hi!", options16, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(option12);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getWidth();
        java.util.Comparator comparator20 = helpFormatter0.getOptionComparator();
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter22 = null;
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        java.util.Collection collection25 = options24.getOptionGroups();
        org.apache.commons.cli.Options options29 = options24.addOption("", false, "--");
        java.util.Collection collection30 = options29.getOptionGroups();
        org.apache.commons.cli.Option option35 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option35.clearValues();
        option35.setLongOpt("arg");
        java.lang.String str39 = option35.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup40 = options29.getOptionGroup(option35);
        org.apache.commons.cli.Option option45 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option45.setLongOpt("hi!");
        option45.setRequired(true);
        org.apache.commons.cli.OptionGroup optionGroup50 = options29.getOptionGroup(option45);
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter22, (int) (short) 10, options29, (int) (short) 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "arg" + "'", str39, "arg");
        org.junit.Assert.assertNull(optionGroup40);
        org.junit.Assert.assertNull(optionGroup50);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options27 = options23.addOption("arg", false, "");
        java.util.List list28 = options23.getRequiredOptions();
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 100, "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", "", options23, (-1), 1, "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        java.util.Collection collection25 = options24.getOptionGroups();
        org.apache.commons.cli.Options options30 = options24.addOption("arg", "hi!", false, "");
        boolean boolean32 = options24.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.List list33 = options24.getRequiredOptions();
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter20, 100, "   ", "", options24, 0, 74, "[ option:  hi!  :: hi! :: -1 ]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter22 = null;
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        java.util.Collection collection25 = options24.getOptionGroups();
        org.apache.commons.cli.Options options30 = options24.addOption("arg", "hi!", false, "");
        boolean boolean32 = options24.hasOption("org.apache.commons.cli.ParseException: arg");
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter22, (int) (short) 1, options24, (int) (short) -1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter24 = null;
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection collection29 = options28.getOptionGroups();
        org.apache.commons.cli.Options options33 = options28.addOption("", false, "--");
        org.apache.commons.cli.Options options38 = options28.addOption("", "--", false, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter24, 74, "usage: ", "   ", options38, (int) (byte) 0, (-2), "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(options38);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter24, (int) (short) 10, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.StringBuffer stringBuffer23 = null;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = helpFormatter0.renderOptions(stringBuffer23, (int) (byte) -1, options25, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection collection29 = options28.getOptionGroups();
        org.apache.commons.cli.Options options34 = options28.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option36 = options28.getOption("hi!");
        org.apache.commons.cli.Options options40 = options28.addOption("", true, "--");
        java.util.List list41 = options40.getRequiredOptions();
        helpFormatter25.printHelp("usage: ", "arg", options40, "");
        int int44 = helpFormatter25.getDescPadding();
        int int45 = helpFormatter25.defaultDescPad;
        java.lang.String str46 = helpFormatter25.defaultLongOptPrefix;
        int int47 = helpFormatter25.defaultDescPad;
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        java.util.Collection collection52 = options51.getOptionGroups();
        org.apache.commons.cli.Options options57 = options51.addOption("arg", "hi!", false, "");
        boolean boolean59 = options51.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection60 = options51.getOptions();
        java.util.List list61 = options51.helpOptions();
        helpFormatter25.printHelp(100, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options51, "", false);
        helpFormatter0.printHelp("                                                                                                    ", options51, false);
        java.io.PrintWriter printWriter67 = null;
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        java.util.Collection collection72 = options71.getOptionGroups();
        org.apache.commons.cli.Options options76 = options71.addOption("", false, "--");
        org.apache.commons.cli.Option option81 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option81.setLongOpt("hi!");
        option81.clearValues();
        option81.setType((java.lang.Object) (byte) -1);
        boolean boolean87 = option81.hasOptionalArg();
        char char88 = option81.getValueSeparator();
        option81.setDescription("--");
        boolean boolean91 = option81.hasArg();
        org.apache.commons.cli.Options options92 = options71.addOption(option81);
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter67, (-2), "[ option:  hi!  :: hi! :: -1 ]", " ", options92, 74, 74, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "--" + "'", str46, "--");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + char88 + "' != '" + '\000' + "'", char88 == '\000');
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(options92);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        helpFormatter0.defaultLeftPad = 100;
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.Collection collection27 = options26.getOptionGroups();
        org.apache.commons.cli.Options options32 = options26.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option34 = options26.getOption("hi!");
        org.apache.commons.cli.Options options38 = options26.addOption("", true, "--");
        java.util.List list39 = options38.getRequiredOptions();
        helpFormatter23.printHelp("usage: ", "arg", options38, "");
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter21, (-1), options38, (-2), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(option34);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 0;
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter26, 10, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getWidth();
        java.util.Comparator comparator20 = helpFormatter0.getOptionComparator();
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        java.lang.String str22 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter23, (int) ' ', "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        helpFormatter0.setNewLine("-");
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter25, (int) (byte) 100, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator21);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLeftPadding((int) (short) -1);
        int int3 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding(3);
        java.util.Comparator comparator3 = null;
        helpFormatter0.setOptionComparator(comparator3);
        helpFormatter0.setNewLine("org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter25, (int) (short) 1, (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter25, 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding(3);
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setSyntaxPrefix("org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.getOptionComparator();
        java.lang.String str2 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter3, 1, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.StringBuffer stringBuffer23 = null;
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.util.Collection collection26 = options25.getOptionGroups();
        org.apache.commons.cli.Options options31 = options25.addOption("arg", "hi!", false, "");
        boolean boolean33 = options25.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection34 = options25.getOptions();
        org.apache.commons.cli.Options options39 = options25.addOption("arg", "org.apache.commons.cli.ParseException: arg", true, "arg");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer42 = helpFormatter0.renderOptions(stringBuffer23, (-1), options39, (int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(options39);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultNewLine = "-";
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        java.lang.String str19 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str22 = helpFormatter0.createPadding((int) (byte) 100);
        java.lang.StringBuffer stringBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = helpFormatter0.renderWrappedText(stringBuffer23, 0, 0, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                    " + "'", str22, "                                                                                                    ");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        int int26 = helpFormatter0.getWidth();
        java.lang.String str27 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("arg");
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.String str26 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.List list29 = options28.helpOptions();
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option34.setLongOpt("hi!");
        java.lang.Object obj37 = option34.clone();
        option34.setArgs(0);
        org.apache.commons.cli.OptionGroup optionGroup40 = options28.getOptionGroup(option34);
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("arg", false, "hi!");
        org.apache.commons.cli.OptionGroup optionGroup45 = options28.getOptionGroup(option44);
        helpFormatter0.printHelp("--", options28, false);
        helpFormatter0.defaultSyntaxPrefix = "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]";
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertNull(optionGroup40);
        org.junit.Assert.assertNull(optionGroup45);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        int int24 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter25, (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str22 = helpFormatter0.defaultArgName;
        int int23 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.util.Collection collection30 = options29.getOptionGroups();
        org.apache.commons.cli.Options options35 = options29.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option37 = options29.getOption("hi!");
        org.apache.commons.cli.Options options41 = options29.addOption("", true, "--");
        java.util.List list42 = options41.getRequiredOptions();
        helpFormatter26.printHelp("usage: ", "arg", options41, "");
        int int45 = helpFormatter26.getDescPadding();
        int int46 = helpFormatter26.defaultDescPad;
        java.lang.String str48 = helpFormatter26.createPadding((int) (short) 1);
        java.lang.String str49 = helpFormatter26.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter51 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.Collection collection55 = options54.getOptionGroups();
        org.apache.commons.cli.Options options60 = options54.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option62 = options54.getOption("hi!");
        org.apache.commons.cli.Options options66 = options54.addOption("", true, "--");
        java.util.List list67 = options66.getRequiredOptions();
        helpFormatter51.printHelp("usage: ", "arg", options66, "");
        int int70 = helpFormatter51.getDescPadding();
        int int71 = helpFormatter51.defaultDescPad;
        java.lang.String str72 = helpFormatter51.defaultLongOptPrefix;
        int int73 = helpFormatter51.defaultDescPad;
        org.apache.commons.cli.Options options77 = new org.apache.commons.cli.Options();
        java.util.Collection collection78 = options77.getOptionGroups();
        org.apache.commons.cli.Options options83 = options77.addOption("arg", "hi!", false, "");
        boolean boolean85 = options77.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection86 = options77.getOptions();
        java.util.List list87 = options77.helpOptions();
        helpFormatter51.printHelp(100, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options77, "", false);
        helpFormatter26.printHelp("                                                                                                    ", options77, false);
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "   ", options77, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(option37);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + " " + "'", str48, " ");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-" + "'", str49, "-");
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(option62);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "--" + "'", str72, "--");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(options83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(list87);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.String str26 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.List list29 = options28.helpOptions();
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option34.setLongOpt("hi!");
        java.lang.Object obj37 = option34.clone();
        option34.setArgs(0);
        org.apache.commons.cli.OptionGroup optionGroup40 = options28.getOptionGroup(option34);
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("arg", false, "hi!");
        org.apache.commons.cli.OptionGroup optionGroup45 = options28.getOptionGroup(option44);
        helpFormatter0.printHelp("--", options28, false);
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertNull(optionGroup40);
        org.junit.Assert.assertNull(optionGroup45);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding(3);
        java.lang.String str4 = helpFormatter0.createPadding((int) (byte) 100);
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((-2), "hi!", "hi!", options8, "[ option:  hi!  :: hi! :: -1 ]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.defaultArgName = "--";
        java.io.PrintWriter printWriter28 = null;
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection collection33 = options32.getOptionGroups();
        org.apache.commons.cli.Options options37 = options32.addOption("", false, "--");
        org.apache.commons.cli.Option option39 = options32.getOption("hi!");
        java.util.Collection collection40 = options32.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter28, (int) (short) -1, "-", "arg", options32, (int) (short) 0, (int) (short) -1, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNull(option39);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.Collection collection27 = options26.getOptionGroups();
        org.apache.commons.cli.Options options32 = options26.addOption("arg", "hi!", false, "");
        boolean boolean34 = options26.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection35 = options26.getOptions();
        java.util.List list36 = options26.helpOptions();
        helpFormatter0.printHelp(100, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options26, "", false);
        helpFormatter0.defaultLongOptPrefix = " ";
        java.lang.String str42 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter43 = null;
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        java.util.Collection collection47 = options46.getOptionGroups();
        org.apache.commons.cli.Options options51 = options46.addOption("", false, "--");
        org.apache.commons.cli.Option option56 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option56.setLongOpt("hi!");
        option56.clearValues();
        option56.setType((java.lang.Object) (byte) -1);
        boolean boolean62 = option56.hasOptionalArg();
        char char63 = option56.getValueSeparator();
        option56.setDescription("--");
        boolean boolean66 = option56.hasArg();
        org.apache.commons.cli.Options options67 = options46.addOption(option56);
        boolean boolean69 = options67.hasOption("org.apache.commons.cli.ParseException: arg");
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter43, (int) ' ', "usage: ", options67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + char63 + "' != '" + '\000' + "'", char63 == '\000');
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getWidth();
        java.util.Comparator comparator20 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        java.util.Collection collection25 = options24.getOptionGroups();
        org.apache.commons.cli.Options options29 = options24.addOption("", false, "--");
        org.apache.commons.cli.Option option31 = options24.getOption("hi!");
        helpFormatter0.printHelp((int) '#', "arg", "-", options24, "", true);
        java.lang.String str35 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNull(option31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-" + "'", str35, "-");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getWidth();
        java.util.Comparator comparator20 = helpFormatter0.getOptionComparator();
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        java.lang.String str22 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        java.util.Collection collection9 = options8.getOptionGroups();
        org.apache.commons.cli.Options options14 = options8.addOption("arg", "hi!", false, "");
        boolean boolean16 = options8.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection17 = options8.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter4, (int) '#', "usage: ", "                                                                                                    ", options8, (int) (short) 10, (int) ' ', "[ Options: [ short {arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter24 = null;
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options30 = options26.addOption("arg", false, "");
        java.lang.String str31 = options26.toString();
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter24, 10, options26, 3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]" + "'", str31, "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.setOptPrefix("arg");
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getWidth();
        java.util.Comparator comparator20 = helpFormatter0.getOptionComparator();
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        int int22 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultOptPrefix;
        int int22 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str22 = helpFormatter0.createPadding((int) (byte) 100);
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        helpFormatter0.printHelp("hi!", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options25, "[ Options: [ short {=[ option:  hi!  :: hi! :: -1 ]} ] [ long {hi!=[ option:  hi!  :: hi! :: -1 ]} ]", false);
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                    " + "'", str22, "                                                                                                    ");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        int int26 = helpFormatter0.getWidth();
        java.util.Comparator comparator27 = helpFormatter0.getOptionComparator();
        helpFormatter0.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options33 = new org.apache.commons.cli.Options();
        java.util.Collection collection34 = options33.getOptionGroups();
        org.apache.commons.cli.Options options39 = options33.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option41 = options33.getOption("hi!");
        org.apache.commons.cli.Options options45 = options33.addOption("", true, "--");
        java.util.List list46 = options45.getRequiredOptions();
        helpFormatter30.printHelp("usage: ", "arg", options45, "");
        int int49 = helpFormatter30.getDescPadding();
        int int50 = helpFormatter30.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter51 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.Collection collection55 = options54.getOptionGroups();
        org.apache.commons.cli.Options options60 = options54.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option62 = options54.getOption("hi!");
        org.apache.commons.cli.Options options66 = options54.addOption("", true, "--");
        java.util.List list67 = options66.getRequiredOptions();
        helpFormatter51.printHelp("usage: ", "arg", options66, "");
        int int70 = helpFormatter51.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter71 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator72 = helpFormatter71.getOptionComparator();
        helpFormatter51.setOptionComparator(comparator72);
        helpFormatter30.setOptionComparator(comparator72);
        helpFormatter0.optionComparator = comparator72;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(option62);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertNotNull(comparator72);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        int int23 = helpFormatter0.defaultWidth;
        java.lang.String str24 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding(3);
        helpFormatter0.setSyntaxPrefix("hi!");
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        java.util.Collection collection11 = options10.getOptionGroups();
        org.apache.commons.cli.Options options16 = options10.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option18 = options10.getOption("hi!");
        org.apache.commons.cli.Options options22 = options10.addOption("", true, "--");
        java.util.List list23 = options22.getRequiredOptions();
        helpFormatter7.printHelp("usage: ", "arg", options22, "");
        int int26 = helpFormatter7.getWidth();
        java.util.Comparator comparator27 = helpFormatter7.getOptionComparator();
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        java.util.Collection collection32 = options31.getOptionGroups();
        org.apache.commons.cli.Options options36 = options31.addOption("", false, "--");
        org.apache.commons.cli.Option option38 = options31.getOption("hi!");
        helpFormatter7.printHelp((int) '#', "arg", "-", options31, "", true);
        java.util.List list42 = options31.helpOptions();
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "[ Options: [ short {=[ option:  hi!  :: hi! :: -1 ]} ] [ long {hi!=[ option:  hi!  :: hi! :: -1 ]} ]", options31, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(option18);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNull(option38);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.StringBuffer stringBuffer26 = null;
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection collection29 = options28.getOptionGroups();
        org.apache.commons.cli.Options options34 = options28.addOption("arg", "hi!", false, "");
        boolean boolean36 = options28.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection37 = options28.getOptions();
        java.util.List list38 = options28.helpOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer41 = helpFormatter0.renderOptions(stringBuffer26, 0, options28, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str22 = helpFormatter0.createPadding((int) (byte) 100);
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        helpFormatter0.printHelp("hi!", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options25, "[ Options: [ short {=[ option:  hi!  :: hi! :: -1 ]} ] [ long {hi!=[ option:  hi!  :: hi! :: -1 ]} ]", false);
        java.lang.StringBuffer stringBuffer29 = null;
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.util.Collection collection35 = options34.getOptionGroups();
        org.apache.commons.cli.Options options40 = options34.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option42 = options34.getOption("hi!");
        org.apache.commons.cli.Options options46 = options34.addOption("", true, "--");
        java.util.List list47 = options46.getRequiredOptions();
        helpFormatter31.printHelp("usage: ", "arg", options46, "");
        int int50 = helpFormatter31.getDescPadding();
        int int51 = helpFormatter31.defaultDescPad;
        java.lang.String str52 = helpFormatter31.defaultLongOptPrefix;
        int int53 = helpFormatter31.defaultDescPad;
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        java.util.Collection collection58 = options57.getOptionGroups();
        org.apache.commons.cli.Options options63 = options57.addOption("arg", "hi!", false, "");
        boolean boolean65 = options57.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection66 = options57.getOptions();
        java.util.List list67 = options57.helpOptions();
        helpFormatter31.printHelp(100, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options57, "", false);
        boolean boolean72 = options57.hasOption("usage: ");
        java.lang.String str73 = options57.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer76 = helpFormatter0.renderOptions(stringBuffer29, (int) (short) 1, options57, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                    " + "'", str22, "                                                                                                    ");
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(option42);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "--" + "'", str52, "--");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[ Options: [ short {arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]" + "'", str73, "[ Options: [ short {arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        int int24 = helpFormatter0.defaultLeftPad;
        int int25 = helpFormatter0.getWidth();
        java.lang.Class<?> wildcardClass26 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderWrappedText(stringBuffer21, (int) (byte) 0, (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        helpFormatter0.defaultLeftPad = 10;
        java.io.PrintWriter printWriter28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter28, 3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        java.lang.String str24 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter25, (-2), "[ option:  hi!  :: hi! :: -1 ]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.String str26 = helpFormatter0.getOptPrefix();
        java.lang.String str27 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        java.util.Collection collection32 = options31.getOptionGroups();
        org.apache.commons.cli.Options options37 = options31.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option39 = options31.getOption("hi!");
        org.apache.commons.cli.Options options43 = options31.addOption("", true, "--");
        java.util.List list44 = options43.getRequiredOptions();
        helpFormatter28.printHelp("usage: ", "arg", options43, "");
        int int47 = helpFormatter28.getDescPadding();
        int int48 = helpFormatter28.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter49 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        java.util.Collection collection53 = options52.getOptionGroups();
        org.apache.commons.cli.Options options58 = options52.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option60 = options52.getOption("hi!");
        org.apache.commons.cli.Options options64 = options52.addOption("", true, "--");
        java.util.List list65 = options64.getRequiredOptions();
        helpFormatter49.printHelp("usage: ", "arg", options64, "");
        int int68 = helpFormatter49.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter69 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator70 = helpFormatter69.getOptionComparator();
        helpFormatter49.setOptionComparator(comparator70);
        helpFormatter28.setOptionComparator(comparator70);
        helpFormatter0.setOptionComparator(comparator70);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(option39);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(option60);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(comparator70);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection collection29 = options28.getOptionGroups();
        org.apache.commons.cli.Options options34 = options28.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option36 = options28.getOption("hi!");
        org.apache.commons.cli.Options options40 = options28.addOption("", true, "--");
        java.util.List list41 = options40.getRequiredOptions();
        helpFormatter25.printHelp("usage: ", "arg", options40, "");
        int int44 = helpFormatter25.getDescPadding();
        int int45 = helpFormatter25.defaultDescPad;
        java.lang.String str46 = helpFormatter25.defaultLongOptPrefix;
        int int47 = helpFormatter25.defaultDescPad;
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        java.util.Collection collection52 = options51.getOptionGroups();
        org.apache.commons.cli.Options options57 = options51.addOption("arg", "hi!", false, "");
        boolean boolean59 = options51.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection60 = options51.getOptions();
        java.util.List list61 = options51.helpOptions();
        helpFormatter25.printHelp(100, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options51, "", false);
        helpFormatter0.printHelp("                                                                                                    ", options51, false);
        java.io.PrintWriter printWriter67 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter67, (int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "--" + "'", str46, "--");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(list61);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "hi!";
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Options options32 = options28.addOption("arg", false, "");
        java.util.List list33 = options32.getRequiredOptions();
        org.apache.commons.cli.Option option35 = options32.getOption("usage: ");
        helpFormatter0.printHelp("[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "arg", options32, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]");
        org.apache.commons.cli.Option option42 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option42.clearValues();
        boolean boolean44 = option42.hasValueSeparator();
        option42.setValueSeparator('a');
        java.lang.String str48 = option42.getValue(0);
        org.apache.commons.cli.Option option53 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        boolean boolean54 = option53.hasArg();
        org.apache.commons.cli.Option option59 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option59.setLongOpt("hi!");
        java.lang.String str62 = option59.getArgName();
        option59.setRequired(false);
        boolean boolean65 = option59.hasArgName();
        boolean boolean66 = option53.equals((java.lang.Object) option59);
        option42.setType((java.lang.Object) boolean66);
        java.lang.Object obj68 = null;
        boolean boolean69 = option42.equals(obj68);
        org.apache.commons.cli.OptionGroup optionGroup70 = options32.getOptionGroup(option42);
        org.apache.commons.cli.Option option75 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        boolean boolean76 = option75.isRequired();
        org.apache.commons.cli.OptionGroup optionGroup77 = options32.getOptionGroup(option75);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNull(option35);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "arg" + "'", str62, "arg");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(optionGroup70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(optionGroup77);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        java.util.Collection collection24 = options23.getOptionGroups();
        org.apache.commons.cli.Options options29 = options23.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option31 = options23.getOption("hi!");
        org.apache.commons.cli.Options options35 = options23.addOption("", true, "--");
        java.util.List list36 = options35.getRequiredOptions();
        helpFormatter20.printHelp("usage: ", "arg", options35, "");
        int int39 = helpFormatter20.getDescPadding();
        int int40 = helpFormatter20.defaultDescPad;
        java.lang.String str42 = helpFormatter20.createPadding((int) (short) 1);
        java.lang.String str43 = helpFormatter20.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter44 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options47 = new org.apache.commons.cli.Options();
        java.util.Collection collection48 = options47.getOptionGroups();
        org.apache.commons.cli.Options options53 = options47.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option55 = options47.getOption("hi!");
        org.apache.commons.cli.Options options59 = options47.addOption("", true, "--");
        java.util.List list60 = options59.getRequiredOptions();
        helpFormatter44.printHelp("usage: ", "arg", options59, "");
        int int63 = helpFormatter44.getWidth();
        java.util.Comparator comparator64 = helpFormatter44.getOptionComparator();
        helpFormatter20.setOptionComparator(comparator64);
        helpFormatter0.setOptionComparator(comparator64);
        int int67 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter68 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter68, 1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(option31);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " " + "'", str42, " ");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-" + "'", str43, "-");
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 74 + "'", int63 == 74);
        org.junit.Assert.assertNotNull(comparator64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option4.clearValues();
        option4.setLongOpt("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.util.Collection collection12 = options11.getOptionGroups();
        org.apache.commons.cli.Options options17 = options11.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option19 = options11.getOption("hi!");
        org.apache.commons.cli.Options options23 = options11.addOption("", true, "--");
        java.util.List list24 = options23.getRequiredOptions();
        helpFormatter8.printHelp("usage: ", "arg", options23, "");
        int int27 = helpFormatter8.getDescPadding();
        int int28 = helpFormatter8.defaultDescPad;
        java.lang.String str30 = helpFormatter8.createPadding((int) (short) 1);
        java.lang.String str31 = helpFormatter8.defaultOptPrefix;
        helpFormatter8.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.String str34 = helpFormatter8.defaultOptPrefix;
        int int35 = helpFormatter8.getDescPadding();
        boolean boolean36 = option4.equals((java.lang.Object) int35);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " " + "'", str30, " ");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-" + "'", str31, "-");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-" + "'", str34, "-");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLeftPad = (short) 1;
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        java.util.Collection collection7 = options6.getOptionGroups();
        org.apache.commons.cli.Options options12 = options6.addOption("arg", "hi!", false, "");
        boolean boolean14 = options6.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.List list15 = options6.getRequiredOptions();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option20.clearValues();
        option20.setLongOpt("arg");
        option20.setValueSeparator('a');
        org.apache.commons.cli.Options options26 = options6.addOption(option20);
        helpFormatter0.printHelp("   ", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options6, "-", false);
        java.lang.Class<?> wildcardClass30 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultLeftPad = 10;
        helpFormatter0.defaultOptPrefix = "";
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        java.lang.String str24 = helpFormatter0.getSyntaxPrefix();
        int int25 = helpFormatter0.getWidth();
        helpFormatter0.setLongOptPrefix("[ Options: [ short {=[ option:   :: -- ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "--";
        java.lang.StringBuffer stringBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer30 = helpFormatter0.renderWrappedText(stringBuffer26, (int) (short) 10, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.Collection collection28 = options27.getOptionGroups();
        org.apache.commons.cli.Options options33 = options27.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option35 = options27.getOption("hi!");
        org.apache.commons.cli.Options options39 = options27.addOption("", true, "--");
        java.util.List list40 = options39.getRequiredOptions();
        helpFormatter24.printHelp("usage: ", "arg", options39, "");
        int int43 = helpFormatter24.getDescPadding();
        int int44 = helpFormatter24.defaultDescPad;
        java.lang.String str46 = helpFormatter24.createPadding((int) (short) 1);
        java.lang.String str47 = helpFormatter24.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter49 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        java.util.Collection collection53 = options52.getOptionGroups();
        org.apache.commons.cli.Options options58 = options52.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option60 = options52.getOption("hi!");
        org.apache.commons.cli.Options options64 = options52.addOption("", true, "--");
        java.util.List list65 = options64.getRequiredOptions();
        helpFormatter49.printHelp("usage: ", "arg", options64, "");
        int int68 = helpFormatter49.getDescPadding();
        int int69 = helpFormatter49.defaultDescPad;
        java.lang.String str70 = helpFormatter49.defaultLongOptPrefix;
        int int71 = helpFormatter49.defaultDescPad;
        org.apache.commons.cli.Options options75 = new org.apache.commons.cli.Options();
        java.util.Collection collection76 = options75.getOptionGroups();
        org.apache.commons.cli.Options options81 = options75.addOption("arg", "hi!", false, "");
        boolean boolean83 = options75.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection84 = options75.getOptions();
        java.util.List list85 = options75.helpOptions();
        helpFormatter49.printHelp(100, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options75, "", false);
        helpFormatter24.printHelp("                                                                                                    ", options75, false);
        helpFormatter0.printHelp("                                                                                                    ", options75);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(option35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + " " + "'", str46, " ");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-" + "'", str47, "-");
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(options58);
        org.junit.Assert.assertNotNull(option60);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "--" + "'", str70, "--");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(list85);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        int int25 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("usage: ");
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.getOptionComparator();
        java.lang.String str2 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        org.apache.commons.cli.OptionGroup optionGroup19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options20 = options15.addOptionGroup(optionGroup19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setSyntaxPrefix("[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]");
        java.lang.String str26 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                                                                                    " + "'", str26, "                                                                                                    ");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        int int26 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "arg";
        java.util.Comparator comparator29 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertNotNull(comparator29);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        java.util.Comparator comparator28 = helpFormatter0.getOptionComparator();
        int int29 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 74 + "'", int29 == 74);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]";
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        java.util.Collection collection11 = options10.getOptionGroups();
        org.apache.commons.cli.Options options16 = options10.addOption("arg", "hi!", false, "");
        boolean boolean18 = options10.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection19 = options10.getOptions();
        org.apache.commons.cli.Options options24 = options10.addOption("arg", "org.apache.commons.cli.ParseException: arg", true, "arg");
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, 10, "[ Options: [ short {arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "hi!", options24, 3, (-2), "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(options24);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding(3);
        java.util.Comparator comparator3 = null;
        helpFormatter0.setOptionComparator(comparator3);
        int int8 = helpFormatter0.findWrapPos("usage: ", 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str28 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n" + "'", str28, "\n");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding(3);
        java.lang.String str3 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        java.lang.String str24 = helpFormatter0.getSyntaxPrefix();
        int int25 = helpFormatter0.getWidth();
        int int26 = helpFormatter0.getDescPadding();
        java.lang.String str27 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection collection33 = options32.getOptionGroups();
        org.apache.commons.cli.Options options38 = options32.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option40 = options32.getOption("hi!");
        org.apache.commons.cli.Options options44 = options32.addOption("", true, "--");
        java.util.List list45 = options44.getRequiredOptions();
        helpFormatter29.printHelp("usage: ", "arg", options44, "");
        int int48 = helpFormatter29.getDescPadding();
        int int49 = helpFormatter29.defaultDescPad;
        java.lang.String str50 = helpFormatter29.defaultLongOptPrefix;
        int int51 = helpFormatter29.defaultDescPad;
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        java.util.Collection collection56 = options55.getOptionGroups();
        org.apache.commons.cli.Options options61 = options55.addOption("arg", "hi!", false, "");
        boolean boolean63 = options55.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection64 = options55.getOptions();
        java.util.List list65 = options55.helpOptions();
        helpFormatter29.printHelp(100, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options55, "", false);
        boolean boolean70 = options55.hasOption("usage: ");
        java.lang.String str71 = options55.toString();
        helpFormatter0.printHelp("[ Options: [ short {arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", options55, true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "--" + "'", str50, "--");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[ Options: [ short {arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]" + "'", str71, "[ Options: [ short {arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding(3);
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        java.util.Collection collection7 = options6.getOptionGroups();
        org.apache.commons.cli.Options options12 = options6.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option14 = options6.getOption("hi!");
        org.apache.commons.cli.Options options18 = options6.addOption("", true, "--");
        java.util.List list19 = options18.getRequiredOptions();
        helpFormatter3.printHelp("usage: ", "arg", options18, "");
        int int22 = helpFormatter3.getDescPadding();
        int int23 = helpFormatter3.defaultDescPad;
        java.lang.String str25 = helpFormatter3.createPadding((int) (short) 1);
        java.lang.String str26 = helpFormatter3.defaultOptPrefix;
        helpFormatter3.defaultOptPrefix = "hi!";
        helpFormatter3.defaultArgName = "--";
        java.lang.String str31 = helpFormatter3.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter32 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        java.util.Collection collection36 = options35.getOptionGroups();
        org.apache.commons.cli.Options options41 = options35.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option43 = options35.getOption("hi!");
        org.apache.commons.cli.Options options47 = options35.addOption("", true, "--");
        java.util.List list48 = options47.getRequiredOptions();
        helpFormatter32.printHelp("usage: ", "arg", options47, "");
        int int51 = helpFormatter32.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter52 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator53 = helpFormatter52.getOptionComparator();
        helpFormatter32.setOptionComparator(comparator53);
        helpFormatter3.setOptionComparator(comparator53);
        helpFormatter0.setOptionComparator(comparator53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(option14);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " " + "'", str25, " ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "--" + "'", str31, "--");
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(option43);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(comparator53);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("arg");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("arg");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 10;
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.defaultOptPrefix = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.getOptionComparator();
        helpFormatter0.setOptPrefix("\n");
        org.junit.Assert.assertNotNull(comparator1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.Collection collection27 = options26.getOptionGroups();
        org.apache.commons.cli.Options options32 = options26.addOption("arg", "hi!", false, "");
        boolean boolean34 = options26.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection35 = options26.getOptions();
        java.util.List list36 = options26.helpOptions();
        helpFormatter0.printHelp(100, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options26, "", false);
        helpFormatter0.defaultLongOptPrefix = " ";
        java.lang.String str42 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options45 = new org.apache.commons.cli.Options();
        java.util.Collection collection46 = options45.getOptionGroups();
        org.apache.commons.cli.Options options51 = options45.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option53 = options45.getOption("hi!");
        org.apache.commons.cli.Options options57 = options45.addOption("", true, "--");
        java.util.List list58 = options57.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "org.apache.commons.cli.ParseException: arg", options57, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", false);
        java.io.PrintWriter printWriter62 = null;
        org.apache.commons.cli.Options options64 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter62, (int) (byte) 0, options64, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(option53);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        int int3 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("org.apache.commons.cli.ParseException: arg");
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator9 = helpFormatter8.getOptionComparator();
        helpFormatter8.defaultLeftPad = (short) 1;
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        java.util.Collection collection15 = options14.getOptionGroups();
        org.apache.commons.cli.Options options20 = options14.addOption("arg", "hi!", false, "");
        boolean boolean22 = options14.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.List list23 = options14.getRequiredOptions();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option28.clearValues();
        option28.setLongOpt("arg");
        option28.setValueSeparator('a');
        org.apache.commons.cli.Options options34 = options14.addOption(option28);
        helpFormatter8.printHelp("   ", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options14, "-", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer40 = helpFormatter0.renderOptions(stringBuffer6, (int) (byte) -1, options14, 1, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(options34);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "--";
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.Collection collection28 = options27.getOptionGroups();
        org.apache.commons.cli.Options options32 = options27.addOption("", false, "--");
        helpFormatter0.printHelp("[ Options: [ short {=[ option:   :: -- ]} ] [ long {} ]", options32);
        java.lang.String str35 = helpFormatter0.rtrim("[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[ option:  hi!  :: hi! ]" + "'", str35, "[ option:  hi!  :: hi! ]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.defaultSyntaxPrefix = "arg";
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection collection29 = options28.getOptionGroups();
        org.apache.commons.cli.Options options34 = options28.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option36 = options28.getOption("hi!");
        org.apache.commons.cli.Options options40 = options28.addOption("", true, "--");
        java.util.List list41 = options40.getRequiredOptions();
        helpFormatter25.printHelp("usage: ", "arg", options40, "");
        int int44 = helpFormatter25.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter45 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator46 = helpFormatter45.getOptionComparator();
        helpFormatter25.setOptionComparator(comparator46);
        helpFormatter0.setOptionComparator(comparator46);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(comparator46);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultOptPrefix;
        int int22 = helpFormatter0.getDescPadding();
        int int23 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setWidth((int) 'a');
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.setWidth(1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.String str26 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = " ";
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 10;
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter6, (int) '#', options8, (-1), 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        java.util.Comparator comparator28 = helpFormatter0.getOptionComparator();
        java.lang.String str30 = helpFormatter0.rtrim("org.apache.commons.cli.ParseException: arg");
        java.io.PrintWriter printWriter31 = null;
        org.apache.commons.cli.HelpFormatter helpFormatter34 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator35 = helpFormatter34.getOptionComparator();
        helpFormatter34.defaultLeftPad = (short) 1;
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        java.util.Collection collection41 = options40.getOptionGroups();
        org.apache.commons.cli.Options options46 = options40.addOption("arg", "hi!", false, "");
        boolean boolean48 = options40.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.List list49 = options40.getRequiredOptions();
        org.apache.commons.cli.Option option54 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option54.clearValues();
        option54.setLongOpt("arg");
        option54.setValueSeparator('a');
        org.apache.commons.cli.Options options60 = options40.addOption(option54);
        helpFormatter34.printHelp("   ", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options40, "-", false);
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter31, (int) (byte) 10, "[ Options: [ short {=[ option:  hi!  :: hi! :: -1 ]} ] [ long {hi!=[ option:  hi!  :: hi! :: -1 ]} ]", options40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.cli.ParseException: arg" + "'", str30, "org.apache.commons.cli.ParseException: arg");
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(options60);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultSyntaxPrefix = "-";
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getWidth();
        helpFormatter0.setLongOptPrefix("usage: ");
        java.lang.String str22 = helpFormatter0.getNewLine();
        int int23 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getWidth();
        java.util.Comparator comparator20 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        java.util.Collection collection25 = options24.getOptionGroups();
        org.apache.commons.cli.Options options29 = options24.addOption("", false, "--");
        org.apache.commons.cli.Option option31 = options24.getOption("hi!");
        helpFormatter0.printHelp((int) '#', "arg", "-", options24, "", true);
        int int35 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNull(option31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        int int24 = helpFormatter0.defaultLeftPad;
        java.lang.String str25 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) ' ');
        java.lang.String str28 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-" + "'", str25, "-");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n" + "'", str28, "\n");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        helpFormatter0.defaultLeftPad = 100;
        java.lang.String str22 = helpFormatter0.createPadding((int) (byte) 100);
        java.lang.String str24 = helpFormatter0.rtrim("   ");
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                    " + "'", str22, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.defaultArgName = "--";
        java.lang.String str28 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection collection33 = options32.getOptionGroups();
        org.apache.commons.cli.Options options38 = options32.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option40 = options32.getOption("hi!");
        org.apache.commons.cli.Options options44 = options32.addOption("", true, "--");
        java.util.List list45 = options44.getRequiredOptions();
        helpFormatter29.printHelp("usage: ", "arg", options44, "");
        int int48 = helpFormatter29.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter49 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator50 = helpFormatter49.getOptionComparator();
        helpFormatter29.setOptionComparator(comparator50);
        helpFormatter0.setOptionComparator(comparator50);
        helpFormatter0.defaultLongOptPrefix = " ";
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "--" + "'", str28, "--");
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(comparator50);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLeftPad = (short) 1;
        org.apache.commons.cli.Options options6 = new org.apache.commons.cli.Options();
        java.util.Collection collection7 = options6.getOptionGroups();
        org.apache.commons.cli.Options options12 = options6.addOption("arg", "hi!", false, "");
        boolean boolean14 = options6.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.List list15 = options6.getRequiredOptions();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option20.clearValues();
        option20.setLongOpt("arg");
        option20.setValueSeparator('a');
        org.apache.commons.cli.Options options26 = options6.addOption(option20);
        helpFormatter0.printHelp("   ", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options6, "-", false);
        helpFormatter0.defaultLeftPad = 0;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(options26);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str23 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator25 = helpFormatter24.getOptionComparator();
        java.lang.String str26 = helpFormatter24.getOptPrefix();
        java.util.Comparator comparator27 = helpFormatter24.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator27);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertNotNull(comparator27);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultOptPrefix;
        int int22 = helpFormatter0.getDescPadding();
        int int23 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setDescPadding((int) (byte) 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.defaultNewLine;
        int int24 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding(3);
        java.util.Comparator comparator3 = null;
        helpFormatter0.setOptionComparator(comparator3);
        helpFormatter0.setWidth(10);
        helpFormatter0.defaultWidth = '\000';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.String str26 = helpFormatter0.getOptPrefix();
        java.lang.String str27 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.util.List list30 = options29.helpOptions();
        org.apache.commons.cli.Option option35 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option35.setLongOpt("hi!");
        java.lang.Object obj38 = option35.clone();
        option35.setArgs(0);
        org.apache.commons.cli.OptionGroup optionGroup41 = options29.getOptionGroup(option35);
        org.apache.commons.cli.Option option45 = new org.apache.commons.cli.Option("arg", false, "hi!");
        org.apache.commons.cli.OptionGroup optionGroup46 = options29.getOptionGroup(option45);
        org.apache.commons.cli.Option option51 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option51.setLongOpt("hi!");
        option51.clearValues();
        option51.setType((java.lang.Object) (byte) -1);
        option51.setArgName("   ");
        org.apache.commons.cli.Options options59 = options29.addOption(option51);
        java.lang.String str60 = options59.toString();
        helpFormatter0.printHelp("org.apache.commons.cli.ParseException: arg", options59);
        helpFormatter0.defaultNewLine = "[ option:  hi!  :: hi! :: -1 ]";
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertNull(optionGroup41);
        org.junit.Assert.assertNull(optionGroup46);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[ Options: [ short {=[ option:  hi!  :: hi! :: -1 ]} ] [ long {hi!=[ option:  hi!  :: hi! :: -1 ]} ]" + "'", str60, "[ Options: [ short {=[ option:  hi!  :: hi! :: -1 ]} ] [ long {hi!=[ option:  hi!  :: hi! :: -1 ]} ]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setSyntaxPrefix("[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]");
        java.lang.String str26 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.Collection collection28 = options27.getOptionGroups();
        org.apache.commons.cli.Options options33 = options27.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option35 = options27.getOption("hi!");
        org.apache.commons.cli.Options options39 = options27.addOption("", true, "--");
        java.util.List list40 = options39.getRequiredOptions();
        helpFormatter24.printHelp("usage: ", "arg", options39, "");
        int int43 = helpFormatter24.getDescPadding();
        int int44 = helpFormatter24.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter45 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options48 = new org.apache.commons.cli.Options();
        java.util.Collection collection49 = options48.getOptionGroups();
        org.apache.commons.cli.Options options54 = options48.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option56 = options48.getOption("hi!");
        org.apache.commons.cli.Options options60 = options48.addOption("", true, "--");
        java.util.List list61 = options60.getRequiredOptions();
        helpFormatter45.printHelp("usage: ", "arg", options60, "");
        int int64 = helpFormatter45.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter65 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator66 = helpFormatter65.getOptionComparator();
        helpFormatter45.setOptionComparator(comparator66);
        helpFormatter24.setOptionComparator(comparator66);
        helpFormatter0.optionComparator = comparator66;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(option35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(option56);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertNotNull(comparator66);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        java.util.Collection collection24 = options23.getOptionGroups();
        org.apache.commons.cli.Options options29 = options23.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option31 = options23.getOption("hi!");
        org.apache.commons.cli.Options options35 = options23.addOption("", true, "--");
        java.util.List list36 = options35.getRequiredOptions();
        helpFormatter20.printHelp("usage: ", "arg", options35, "");
        int int39 = helpFormatter20.getDescPadding();
        int int40 = helpFormatter20.defaultDescPad;
        java.lang.String str42 = helpFormatter20.createPadding((int) (short) 1);
        java.lang.String str43 = helpFormatter20.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter44 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options47 = new org.apache.commons.cli.Options();
        java.util.Collection collection48 = options47.getOptionGroups();
        org.apache.commons.cli.Options options53 = options47.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option55 = options47.getOption("hi!");
        org.apache.commons.cli.Options options59 = options47.addOption("", true, "--");
        java.util.List list60 = options59.getRequiredOptions();
        helpFormatter44.printHelp("usage: ", "arg", options59, "");
        int int63 = helpFormatter44.getWidth();
        java.util.Comparator comparator64 = helpFormatter44.getOptionComparator();
        helpFormatter20.setOptionComparator(comparator64);
        helpFormatter0.setOptionComparator(comparator64);
        helpFormatter0.setOptPrefix(" ");
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(option31);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " " + "'", str42, " ");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-" + "'", str43, "-");
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(option55);
        org.junit.Assert.assertNotNull(options59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 74 + "'", int63 == 74);
        org.junit.Assert.assertNotNull(comparator64);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        helpFormatter0.setDescPadding((int) (short) 10);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(0);
        java.util.Comparator comparator6 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertNotNull(comparator6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str27 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.Collection collection27 = options26.getOptionGroups();
        org.apache.commons.cli.Options options32 = options26.addOption("arg", "hi!", false, "");
        boolean boolean34 = options26.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection35 = options26.getOptions();
        java.util.List list36 = options26.helpOptions();
        helpFormatter0.printHelp(100, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options26, "", false);
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setNewLine("-");
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        helpFormatter0.defaultLeftPad = 100;
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        java.util.Collection collection25 = options24.getOptionGroups();
        org.apache.commons.cli.Options options30 = options24.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option32 = options24.getOption("hi!");
        org.apache.commons.cli.Options options36 = options24.addOption("", true, "--");
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "[ option:  arg  :: hi! ]", "   ", options24, "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 11");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(option32);
        org.junit.Assert.assertNotNull(options36);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.getOptionComparator();
        java.lang.String str2 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator3 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options7 = new org.apache.commons.cli.Options();
        java.util.Collection collection8 = options7.getOptionGroups();
        org.apache.commons.cli.Options options12 = options7.addOption("", false, "--");
        java.lang.String str13 = options12.toString();
        helpFormatter0.printHelp((int) (byte) 10, "org.apache.commons.cli.ParseException: arg", "arg", options12, "hi!", true);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertNotNull(comparator3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:   :: -- ]} ] [ long {} ]" + "'", str13, "[ Options: [ short {=[ option:   :: -- ]} ] [ long {} ]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator21 = helpFormatter20.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "--";
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.Collection collection28 = options27.getOptionGroups();
        org.apache.commons.cli.Options options32 = options27.addOption("", false, "--");
        helpFormatter0.printHelp("[ Options: [ short {=[ option:   :: -- ]} ] [ long {} ]", options32);
        java.lang.String str34 = helpFormatter0.getArgName();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "--" + "'", str34, "--");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.setSyntaxPrefix("");
        int int27 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 74 + "'", int27 == 74);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        helpFormatter0.defaultLeftPad = 100;
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str23 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        int int25 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("usage: ");
        helpFormatter0.defaultWidth = 74;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.Collection collection29 = options28.getOptionGroups();
        org.apache.commons.cli.Options options34 = options28.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option36 = options28.getOption("hi!");
        org.apache.commons.cli.Options options40 = options28.addOption("", true, "--");
        java.util.List list41 = options40.getRequiredOptions();
        helpFormatter25.printHelp("usage: ", "arg", options40, "");
        int int44 = helpFormatter25.getDescPadding();
        int int45 = helpFormatter25.defaultDescPad;
        java.lang.String str46 = helpFormatter25.defaultLongOptPrefix;
        int int47 = helpFormatter25.defaultDescPad;
        org.apache.commons.cli.Options options51 = new org.apache.commons.cli.Options();
        java.util.Collection collection52 = options51.getOptionGroups();
        org.apache.commons.cli.Options options57 = options51.addOption("arg", "hi!", false, "");
        boolean boolean59 = options51.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection60 = options51.getOptions();
        java.util.List list61 = options51.helpOptions();
        helpFormatter25.printHelp(100, "[ Options: [ short {=[ option:   [ARG] :: -- ], arg=[ option: arg hi!  ::  ]} ] [ long {hi!=[ option: arg hi!  ::  ]} ]", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options51, "", false);
        helpFormatter0.printHelp("                                                                                                    ", options51, false);
        int int67 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(option36);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "--" + "'", str46, "--");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        java.util.Collection collection25 = options24.getOptionGroups();
        org.apache.commons.cli.Options options30 = options24.addOption("arg", "hi!", false, "");
        boolean boolean32 = options24.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection33 = options24.getOptions();
        java.util.List list34 = options24.helpOptions();
        helpFormatter0.printHelp("-", options24);
        java.lang.String str36 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-" + "'", str36, "-");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        int int3 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("org.apache.commons.cli.ParseException: arg");
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator7 = helpFormatter6.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(comparator7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.getOptionComparator();
        java.lang.String str2 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "--";
        java.util.Comparator comparator5 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertNotNull(comparator5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.String str26 = helpFormatter0.defaultOptPrefix;
        java.lang.String str27 = helpFormatter0.getNewLine();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n" + "'", str27, "\n");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        int int24 = helpFormatter0.defaultLeftPad;
        java.lang.String str25 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "[ option:  arg  :: hi! ]";
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "--" + "'", str25, "--");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        int int25 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.util.Collection collection30 = options29.getOptionGroups();
        org.apache.commons.cli.Options options35 = options29.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option37 = options29.getOption("hi!");
        org.apache.commons.cli.Options options41 = options29.addOption("", true, "--");
        java.util.List list42 = options41.getRequiredOptions();
        helpFormatter26.printHelp("usage: ", "arg", options41, "");
        int int45 = helpFormatter26.getDescPadding();
        int int46 = helpFormatter26.defaultDescPad;
        java.lang.String str48 = helpFormatter26.createPadding((int) (short) 1);
        java.lang.String str49 = helpFormatter26.defaultOptPrefix;
        helpFormatter26.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.String str52 = helpFormatter26.defaultOptPrefix;
        int int53 = helpFormatter26.getDescPadding();
        java.util.Comparator comparator54 = helpFormatter26.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator54);
        java.io.PrintWriter printWriter56 = null;
        org.apache.commons.cli.Options options59 = new org.apache.commons.cli.Options();
        java.util.List list60 = options59.helpOptions();
        org.apache.commons.cli.Option option65 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option65.setLongOpt("hi!");
        java.lang.Object obj68 = option65.clone();
        option65.setArgs(0);
        org.apache.commons.cli.OptionGroup optionGroup71 = options59.getOptionGroup(option65);
        org.apache.commons.cli.Option option75 = new org.apache.commons.cli.Option("arg", false, "hi!");
        org.apache.commons.cli.OptionGroup optionGroup76 = options59.getOptionGroup(option75);
        org.apache.commons.cli.Option option81 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option81.setLongOpt("hi!");
        option81.clearValues();
        option81.setType((java.lang.Object) (byte) -1);
        option81.setArgName("   ");
        org.apache.commons.cli.Options options89 = options59.addOption(option81);
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter56, 74, "[ Options: [ short {=[ option:  arg  :: hi! ]} ] [ long {arg=[ option:  arg  :: hi! ]} ]", options59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(option37);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + " " + "'", str48, " ");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-" + "'", str49, "-");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-" + "'", str52, "-");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(comparator54);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals(obj68.toString(), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj68), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj68), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNull(optionGroup76);
        org.junit.Assert.assertNotNull(options89);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding(3);
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding(3);
        java.lang.String str4 = helpFormatter0.createPadding((int) (byte) 100);
        int int5 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        java.lang.String str3 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.defaultLeftPad = (byte) 0;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option4.setLongOpt("hi!");
        option4.clearValues();
        option4.setType((java.lang.Object) (byte) -1);
        boolean boolean10 = option4.hasOptionalArg();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        java.util.Collection collection15 = options14.getOptionGroups();
        org.apache.commons.cli.Options options20 = options14.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option22 = options14.getOption("hi!");
        org.apache.commons.cli.Options options26 = options14.addOption("", true, "--");
        java.util.List list27 = options26.getRequiredOptions();
        helpFormatter11.printHelp("usage: ", "arg", options26, "");
        int int30 = helpFormatter11.getDescPadding();
        int int31 = helpFormatter11.defaultDescPad;
        java.lang.String str33 = helpFormatter11.createPadding((int) (short) 1);
        java.lang.String str34 = helpFormatter11.defaultOptPrefix;
        helpFormatter11.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        int int37 = helpFormatter11.getWidth();
        java.util.Comparator comparator38 = helpFormatter11.getOptionComparator();
        helpFormatter11.setWidth(74);
        option4.setType((java.lang.Object) helpFormatter11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(option22);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " " + "'", str33, " ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-" + "'", str34, "-");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 74 + "'", int37 == 74);
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.defaultArgName = "--";
        java.lang.String str28 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.util.Collection collection33 = options32.getOptionGroups();
        org.apache.commons.cli.Options options38 = options32.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option40 = options32.getOption("hi!");
        org.apache.commons.cli.Options options44 = options32.addOption("", true, "--");
        java.util.List list45 = options44.getRequiredOptions();
        helpFormatter29.printHelp("usage: ", "arg", options44, "");
        int int48 = helpFormatter29.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter49 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator50 = helpFormatter49.getOptionComparator();
        helpFormatter29.setOptionComparator(comparator50);
        helpFormatter0.setOptionComparator(comparator50);
        helpFormatter0.setWidth((int) 'a');
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "--" + "'", str28, "--");
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(comparator50);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getWidth();
        java.util.Comparator comparator20 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLongOptPrefix("-");
        helpFormatter0.setLeftPadding((-2));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        java.util.Comparator comparator28 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.util.Collection collection31 = options30.getOptionGroups();
        org.apache.commons.cli.Options options35 = options30.addOption("", false, "--");
        java.util.Collection collection36 = options35.getOptionGroups();
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option41.clearValues();
        option41.setLongOpt("arg");
        java.lang.String str45 = option41.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup46 = options35.getOptionGroup(option41);
        helpFormatter0.printHelp("[ option:  hi!  :: hi! ]", options35, false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "arg" + "'", str45, "arg");
        org.junit.Assert.assertNull(optionGroup46);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        int int26 = helpFormatter0.getWidth();
        java.lang.String str27 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter28 = null;
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.util.Collection collection31 = options30.getOptionGroups();
        org.apache.commons.cli.Options options35 = options30.addOption("", false, "--");
        org.apache.commons.cli.Option option37 = options30.getOption("hi!");
        java.util.Collection collection38 = options30.getOptionGroups();
        org.apache.commons.cli.Option option43 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        boolean boolean44 = option43.hasArg();
        option43.setValueSeparator('#');
        org.apache.commons.cli.Options options47 = options30.addOption(option43);
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter28, 74, options30, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNull(option37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(options47);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultWidth = (-2);
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.util.Collection collection28 = options27.getOptionGroups();
        org.apache.commons.cli.Options options33 = options27.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option35 = options27.getOption("hi!");
        org.apache.commons.cli.Options options39 = options27.addOption("", true, "--");
        java.util.List list40 = options39.getRequiredOptions();
        helpFormatter24.printHelp("usage: ", "arg", options39, "");
        int int43 = helpFormatter24.getDescPadding();
        int int44 = helpFormatter24.defaultDescPad;
        java.lang.String str46 = helpFormatter24.createPadding((int) (short) 1);
        java.lang.String str47 = helpFormatter24.defaultOptPrefix;
        helpFormatter24.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.String str50 = helpFormatter24.getOptPrefix();
        java.lang.String str51 = helpFormatter24.defaultLongOptPrefix;
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        java.util.List list54 = options53.helpOptions();
        org.apache.commons.cli.Option option59 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option59.setLongOpt("hi!");
        java.lang.Object obj62 = option59.clone();
        option59.setArgs(0);
        org.apache.commons.cli.OptionGroup optionGroup65 = options53.getOptionGroup(option59);
        org.apache.commons.cli.Option option69 = new org.apache.commons.cli.Option("arg", false, "hi!");
        org.apache.commons.cli.OptionGroup optionGroup70 = options53.getOptionGroup(option69);
        org.apache.commons.cli.Option option75 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option75.setLongOpt("hi!");
        option75.clearValues();
        option75.setType((java.lang.Object) (byte) -1);
        option75.setArgName("   ");
        org.apache.commons.cli.Options options83 = options53.addOption(option75);
        java.lang.String str84 = options83.toString();
        helpFormatter24.printHelp("org.apache.commons.cli.ParseException: arg", options83);
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "[ option:  hi!  :: hi! :: -1 ]", options83, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(option35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + " " + "'", str46, " ");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-" + "'", str47, "-");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-" + "'", str50, "-");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "--" + "'", str51, "--");
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertNull(optionGroup65);
        org.junit.Assert.assertNull(optionGroup70);
        org.junit.Assert.assertNotNull(options83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "[ Options: [ short {=[ option:  hi!  :: hi! :: -1 ]} ] [ long {hi!=[ option:  hi!  :: hi! :: -1 ]} ]" + "'", str84, "[ Options: [ short {=[ option:  hi!  :: hi! :: -1 ]} ] [ long {hi!=[ option:  hi!  :: hi! :: -1 ]} ]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultWidth = (-2);
        helpFormatter0.defaultDescPad = (byte) 100;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator1 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.defaultOptPrefix = "\n";
        int int6 = helpFormatter0.getWidth();
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter22 = null;
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.Collection collection27 = options26.getOptionGroups();
        org.apache.commons.cli.Options options32 = options26.addOption("arg", "hi!", false, "");
        boolean boolean34 = options26.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.Collection collection35 = options26.getOptions();
        org.apache.commons.cli.Options options40 = options26.addOption("arg", "org.apache.commons.cli.ParseException: arg", true, "arg");
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter22, (int) (short) 100, "\n", "[ option:  hi!  :: hi! ]", options40, (-2), 0, "[ option:  hi!  :: hi! ]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(options40);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        java.lang.String str24 = helpFormatter0.getSyntaxPrefix();
        int int25 = helpFormatter0.getWidth();
        int int26 = helpFormatter0.getDescPadding();
        java.lang.String str27 = helpFormatter0.getOptPrefix();
        java.lang.String str28 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-" + "'", str28, "-");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("[ option:  hi!  :: hi! :: -1 ]");
        java.lang.String str26 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.util.List list29 = options28.helpOptions();
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option34.setLongOpt("hi!");
        java.lang.Object obj37 = option34.clone();
        option34.setArgs(0);
        org.apache.commons.cli.OptionGroup optionGroup40 = options28.getOptionGroup(option34);
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("arg", false, "hi!");
        org.apache.commons.cli.OptionGroup optionGroup45 = options28.getOptionGroup(option44);
        helpFormatter0.printHelp("--", options28, false);
        int int51 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        org.apache.commons.cli.HelpFormatter helpFormatter52 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        java.util.Collection collection56 = options55.getOptionGroups();
        org.apache.commons.cli.Options options61 = options55.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option63 = options55.getOption("hi!");
        org.apache.commons.cli.Options options67 = options55.addOption("", true, "--");
        java.util.List list68 = options67.getRequiredOptions();
        helpFormatter52.printHelp("usage: ", "arg", options67, "");
        int int71 = helpFormatter52.getDescPadding();
        int int72 = helpFormatter52.defaultDescPad;
        java.lang.String str74 = helpFormatter52.createPadding((int) (short) 1);
        java.lang.String str75 = helpFormatter52.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter76 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options79 = new org.apache.commons.cli.Options();
        java.util.Collection collection80 = options79.getOptionGroups();
        org.apache.commons.cli.Options options85 = options79.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option87 = options79.getOption("hi!");
        org.apache.commons.cli.Options options91 = options79.addOption("", true, "--");
        java.util.List list92 = options91.getRequiredOptions();
        helpFormatter76.printHelp("usage: ", "arg", options91, "");
        int int95 = helpFormatter76.getWidth();
        java.util.Comparator comparator96 = helpFormatter76.getOptionComparator();
        helpFormatter52.setOptionComparator(comparator96);
        helpFormatter0.setOptionComparator(comparator96);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertNull(optionGroup40);
        org.junit.Assert.assertNull(optionGroup45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(options61);
        org.junit.Assert.assertNotNull(option63);
        org.junit.Assert.assertNotNull(options67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3 + "'", int72 == 3);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + " " + "'", str74, " ");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "-" + "'", str75, "-");
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNotNull(options85);
        org.junit.Assert.assertNotNull(option87);
        org.junit.Assert.assertNotNull(options91);
        org.junit.Assert.assertNotNull(list92);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 74 + "'", int95 == 74);
        org.junit.Assert.assertNotNull(comparator96);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "[ Options: [ short {=[ option:   :: -- ]} ] [ long {} ]";
        int int6 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        int int25 = helpFormatter0.defaultDescPad;
        java.lang.String str26 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "usage: " + "'", str26, "usage: ");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str21 = helpFormatter0.defaultLongOptPrefix;
        int int22 = helpFormatter0.defaultDescPad;
        int int23 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.createPadding((int) (short) 1);
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        java.util.Comparator comparator28 = helpFormatter0.optionComparator;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertNotNull(comparator28);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        int int19 = helpFormatter0.getDescPadding();
        int int20 = helpFormatter0.defaultDescPad;
        int int21 = helpFormatter0.getLeftPadding();
        java.lang.String str22 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultLongOptPrefix = "[ option:  hi!  :: hi! ]";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.util.Comparator comparator10 = helpFormatter9.getOptionComparator();
        helpFormatter9.defaultLeftPad = (short) 1;
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        java.util.Collection collection16 = options15.getOptionGroups();
        org.apache.commons.cli.Options options21 = options15.addOption("arg", "hi!", false, "");
        boolean boolean23 = options15.hasOption("org.apache.commons.cli.ParseException: arg");
        java.util.List list24 = options15.getRequiredOptions();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", "arg", false, "hi!");
        option29.clearValues();
        option29.setLongOpt("arg");
        option29.setValueSeparator('a');
        org.apache.commons.cli.Options options35 = options15.addOption(option29);
        helpFormatter9.printHelp("   ", "[ Options: [ short {arg=[ option: arg  ::  ]} ] [ long {} ]", options15, "-", false);
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter6, (int) (byte) 1, "[ Options: [ short {=[ option:  arg  :: hi! ]} ] [ long {arg=[ option:  arg  :: hi! ]} ]", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:  hi!  :: hi! ]" + "'", str5, "[ option:  hi!  :: hi! ]");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(options35);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.util.Collection collection4 = options3.getOptionGroups();
        org.apache.commons.cli.Options options9 = options3.addOption("arg", "hi!", false, "");
        org.apache.commons.cli.Option option11 = options3.getOption("hi!");
        org.apache.commons.cli.Options options15 = options3.addOption("", true, "--");
        java.util.List list16 = options15.getRequiredOptions();
        helpFormatter0.printHelp("usage: ", "arg", options15, "");
        java.lang.Class<?> wildcardClass19 = options15.getClass();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

