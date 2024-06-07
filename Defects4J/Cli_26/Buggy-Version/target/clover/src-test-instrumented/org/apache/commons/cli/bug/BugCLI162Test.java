/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.commons.cli.bug;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.ParameterMetaData;
import java.sql.Types;

import junit.framework.TestCase;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class BugCLI162Test extends TestCase {static class __CLR4_5_224a24alvn1m5wg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0036\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521133496L,8589935092L,2850,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the line separator.*/
    private static final String CR = System.getProperty("line.separator");

    public void testInfiniteLoop() {__CLR4_5_224a24alvn1m5wg.R.globalSliceStart(getClass().getName(),2746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lq3tsh24a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_224a24alvn1m5wg.R.rethrow($CLV_t2$);}finally{__CLR4_5_224a24alvn1m5wg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.bug.BugCLI162Test.testInfiniteLoop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lq3tsh24a(){try{__CLR4_5_224a24alvn1m5wg.R.inc(2746);
        __CLR4_5_224a24alvn1m5wg.R.inc(2747);Options options = new Options();
        __CLR4_5_224a24alvn1m5wg.R.inc(2748);options.addOption("h", "help", false, "This is a looooong description");
        __CLR4_5_224a24alvn1m5wg.R.inc(2749);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_224a24alvn1m5wg.R.inc(2750);formatter.setWidth(20);
        __CLR4_5_224a24alvn1m5wg.R.inc(2751);formatter.printHelp("app", options); // used to hang & crash
    }finally{__CLR4_5_224a24alvn1m5wg.R.flushNeeded();}}

    public void testPrintHelpLongLines() throws ParseException, IOException {__CLR4_5_224a24alvn1m5wg.R.globalSliceStart(getClass().getName(),2752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2np4ioe24g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_224a24alvn1m5wg.R.rethrow($CLV_t2$);}finally{__CLR4_5_224a24alvn1m5wg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.bug.BugCLI162Test.testPrintHelpLongLines",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2np4ioe24g() throws ParseException, IOException{try{__CLR4_5_224a24alvn1m5wg.R.inc(2752);
        // Constants used for options
        __CLR4_5_224a24alvn1m5wg.R.inc(2753);final String OPT = "-";

        __CLR4_5_224a24alvn1m5wg.R.inc(2754);final String OPT_COLUMN_NAMES = "l";

        __CLR4_5_224a24alvn1m5wg.R.inc(2755);final String OPT_CONNECTION = "c";

        __CLR4_5_224a24alvn1m5wg.R.inc(2756);final String OPT_DESCRIPTION = "e";

        __CLR4_5_224a24alvn1m5wg.R.inc(2757);final String OPT_DRIVER = "d";

        __CLR4_5_224a24alvn1m5wg.R.inc(2758);final String OPT_DRIVER_INFO = "n";

        __CLR4_5_224a24alvn1m5wg.R.inc(2759);final String OPT_FILE_BINDING = "b";

        __CLR4_5_224a24alvn1m5wg.R.inc(2760);final String OPT_FILE_JDBC = "j";

        __CLR4_5_224a24alvn1m5wg.R.inc(2761);final String OPT_FILE_SFMD = "f";

        __CLR4_5_224a24alvn1m5wg.R.inc(2762);final String OPT_HELP = "h";

        __CLR4_5_224a24alvn1m5wg.R.inc(2763);final String OPT_HELP_ = "help";

        __CLR4_5_224a24alvn1m5wg.R.inc(2764);final String OPT_INTERACTIVE = "i";

        __CLR4_5_224a24alvn1m5wg.R.inc(2765);final String OPT_JDBC_TO_SFMD = "2";

        __CLR4_5_224a24alvn1m5wg.R.inc(2766);final String OPT_JDBC_TO_SFMD_L = "jdbc2sfmd";

        __CLR4_5_224a24alvn1m5wg.R.inc(2767);final String OPT_METADATA = "m";

        __CLR4_5_224a24alvn1m5wg.R.inc(2768);final String OPT_PARAM_MODES_INT = "o";

        __CLR4_5_224a24alvn1m5wg.R.inc(2769);final String OPT_PARAM_MODES_NAME = "O";

        __CLR4_5_224a24alvn1m5wg.R.inc(2770);final String OPT_PARAM_NAMES = "a";

        __CLR4_5_224a24alvn1m5wg.R.inc(2771);final String OPT_PARAM_TYPES_INT = "y";

        __CLR4_5_224a24alvn1m5wg.R.inc(2772);final String OPT_PARAM_TYPES_NAME = "Y";

        __CLR4_5_224a24alvn1m5wg.R.inc(2773);final String OPT_PASSWORD = "p";

        __CLR4_5_224a24alvn1m5wg.R.inc(2774);final String OPT_PASSWORD_L = "password";

        __CLR4_5_224a24alvn1m5wg.R.inc(2775);final String OPT_SQL = "s";

        __CLR4_5_224a24alvn1m5wg.R.inc(2776);final String OPT_SQL_L = "sql";

        __CLR4_5_224a24alvn1m5wg.R.inc(2777);final String OPT_SQL_SPLIT_DEFAULT = "###";

        __CLR4_5_224a24alvn1m5wg.R.inc(2778);final String OPT_SQL_SPLIT_L = "splitSql";

        __CLR4_5_224a24alvn1m5wg.R.inc(2779);final String OPT_STACK_TRACE = "t";

        __CLR4_5_224a24alvn1m5wg.R.inc(2780);final String OPT_TIMING = "g";

        __CLR4_5_224a24alvn1m5wg.R.inc(2781);final String OPT_TRIM_L = "trim";

        __CLR4_5_224a24alvn1m5wg.R.inc(2782);final String OPT_USER = "u";

        __CLR4_5_224a24alvn1m5wg.R.inc(2783);final String OPT_WRITE_TO_FILE = "w";

        __CLR4_5_224a24alvn1m5wg.R.inc(2784);final String _PMODE_IN = "IN";

        __CLR4_5_224a24alvn1m5wg.R.inc(2785);final String _PMODE_INOUT = "INOUT";

        __CLR4_5_224a24alvn1m5wg.R.inc(2786);final String _PMODE_OUT = "OUT";

        __CLR4_5_224a24alvn1m5wg.R.inc(2787);final String _PMODE_UNK = "Unknown";

        __CLR4_5_224a24alvn1m5wg.R.inc(2788);final String PMODES = _PMODE_IN + ", " + _PMODE_INOUT + ", " + _PMODE_OUT + ", " + _PMODE_UNK;

        // Options build
        __CLR4_5_224a24alvn1m5wg.R.inc(2789);Options commandLineOptions;
        __CLR4_5_224a24alvn1m5wg.R.inc(2790);commandLineOptions = new Options();
        __CLR4_5_224a24alvn1m5wg.R.inc(2791);commandLineOptions.addOption(OPT_HELP, OPT_HELP_, false, "Prints help and quits");
        __CLR4_5_224a24alvn1m5wg.R.inc(2792);commandLineOptions.addOption(OPT_DRIVER, "driver", true, "JDBC driver class name");
        __CLR4_5_224a24alvn1m5wg.R.inc(2793);commandLineOptions.addOption(OPT_DRIVER_INFO, "info", false, "Prints driver information and properties. If "
            + OPT
            + OPT_CONNECTION
            + " is not specified, all drivers on the classpath are displayed.");
        __CLR4_5_224a24alvn1m5wg.R.inc(2794);commandLineOptions.addOption(OPT_CONNECTION, "url", true, "Connection URL");
        __CLR4_5_224a24alvn1m5wg.R.inc(2795);commandLineOptions.addOption(OPT_USER, "user", true, "A database user name");
        __CLR4_5_224a24alvn1m5wg.R.inc(2796);commandLineOptions
                .addOption(
                        OPT_PASSWORD,
                        OPT_PASSWORD_L,
                        true,
                        "The database password for the user specified with the "
                            + OPT
                            + OPT_USER
                            + " option. You can obfuscate the password with org.mortbay.jetty.security.Password, see http://docs.codehaus.org/display/JETTY/Securing+Passwords");
        __CLR4_5_224a24alvn1m5wg.R.inc(2797);commandLineOptions.addOption(OPT_SQL, OPT_SQL_L, true, "Runs SQL or {call stored_procedure(?, ?)} or {?=call function(?, ?)}");
        __CLR4_5_224a24alvn1m5wg.R.inc(2798);commandLineOptions.addOption(OPT_FILE_SFMD, "sfmd", true, "Writes a SFMD file for the given SQL");
        __CLR4_5_224a24alvn1m5wg.R.inc(2799);commandLineOptions.addOption(OPT_FILE_BINDING, "jdbc", true, "Writes a JDBC binding node file for the given SQL");
        __CLR4_5_224a24alvn1m5wg.R.inc(2800);commandLineOptions.addOption(OPT_FILE_JDBC, "node", true, "Writes a JDBC node file for the given SQL (internal debugging)");
        __CLR4_5_224a24alvn1m5wg.R.inc(2801);commandLineOptions.addOption(OPT_WRITE_TO_FILE, "outfile", true, "Writes the SQL output to the given file");
        __CLR4_5_224a24alvn1m5wg.R.inc(2802);commandLineOptions.addOption(OPT_DESCRIPTION, "description", true,
                "SFMD description. A default description is used if omited. Example: " + OPT + OPT_DESCRIPTION + " \"Runs such and such\"");
        __CLR4_5_224a24alvn1m5wg.R.inc(2803);commandLineOptions.addOption(OPT_INTERACTIVE, "interactive", false,
                "Runs in interactive mode, reading and writing from the console, 'go' or '/' sends a statement");
        __CLR4_5_224a24alvn1m5wg.R.inc(2804);commandLineOptions.addOption(OPT_TIMING, "printTiming", false, "Prints timing information");
        __CLR4_5_224a24alvn1m5wg.R.inc(2805);commandLineOptions.addOption(OPT_METADATA, "printMetaData", false, "Prints metadata information");
        __CLR4_5_224a24alvn1m5wg.R.inc(2806);commandLineOptions.addOption(OPT_STACK_TRACE, "printStack", false, "Prints stack traces on errors");
        __CLR4_5_224a24alvn1m5wg.R.inc(2807);Option option = new Option(OPT_COLUMN_NAMES, "columnNames", true, "Column XML names; default names column labels. Example: "
            + OPT
            + OPT_COLUMN_NAMES
            + " \"cname1 cname2\"");
        __CLR4_5_224a24alvn1m5wg.R.inc(2808);commandLineOptions.addOption(option);
        __CLR4_5_224a24alvn1m5wg.R.inc(2809);option = new Option(OPT_PARAM_NAMES, "paramNames", true, "Parameter XML names; default names are param1, param2, etc. Example: "
            + OPT
            + OPT_PARAM_NAMES
            + " \"pname1 pname2\"");
        __CLR4_5_224a24alvn1m5wg.R.inc(2810);commandLineOptions.addOption(option);
        //
        __CLR4_5_224a24alvn1m5wg.R.inc(2811);OptionGroup pOutTypesOptionGroup = new OptionGroup();
        __CLR4_5_224a24alvn1m5wg.R.inc(2812);String pOutTypesOptionGroupDoc = OPT + OPT_PARAM_TYPES_INT + " and " + OPT + OPT_PARAM_TYPES_NAME + " are mutually exclusive.";
        __CLR4_5_224a24alvn1m5wg.R.inc(2813);final String typesClassName = Types.class.getName();
        __CLR4_5_224a24alvn1m5wg.R.inc(2814);option = new Option(OPT_PARAM_TYPES_INT, "paramTypes", true, "Parameter types from "
            + typesClassName
            + ". "
            + pOutTypesOptionGroupDoc
            + " Example: "
            + OPT
            + OPT_PARAM_TYPES_INT
            + " \"-10 12\"");
        __CLR4_5_224a24alvn1m5wg.R.inc(2815);commandLineOptions.addOption(option);
        __CLR4_5_224a24alvn1m5wg.R.inc(2816);option = new Option(OPT_PARAM_TYPES_NAME, "paramTypeNames", true, "Parameter "
            + typesClassName
            + " names. "
            + pOutTypesOptionGroupDoc
            + " Example: "
            + OPT
            + OPT_PARAM_TYPES_NAME
            + " \"CURSOR VARCHAR\"");
        __CLR4_5_224a24alvn1m5wg.R.inc(2817);commandLineOptions.addOption(option);
        __CLR4_5_224a24alvn1m5wg.R.inc(2818);commandLineOptions.addOptionGroup(pOutTypesOptionGroup);
        //
        __CLR4_5_224a24alvn1m5wg.R.inc(2819);OptionGroup modesOptionGroup = new OptionGroup();
        __CLR4_5_224a24alvn1m5wg.R.inc(2820);String modesOptionGroupDoc = OPT + OPT_PARAM_MODES_INT + " and " + OPT + OPT_PARAM_MODES_NAME + " are mutually exclusive.";
        __CLR4_5_224a24alvn1m5wg.R.inc(2821);option = new Option(OPT_PARAM_MODES_INT, "paramModes", true, "Parameters modes ("
            + ParameterMetaData.parameterModeIn
            + "=IN, "
            + ParameterMetaData.parameterModeInOut
            + "=INOUT, "
            + ParameterMetaData.parameterModeOut
            + "=OUT, "
            + ParameterMetaData.parameterModeUnknown
            + "=Unknown"
            + "). "
            + modesOptionGroupDoc
            + " Example for 2 parameters, OUT and IN: "
            + OPT
            + OPT_PARAM_MODES_INT
            + " \""
            + ParameterMetaData.parameterModeOut
            + " "
            + ParameterMetaData.parameterModeIn
            + "\"");
        __CLR4_5_224a24alvn1m5wg.R.inc(2822);modesOptionGroup.addOption(option);
        __CLR4_5_224a24alvn1m5wg.R.inc(2823);option = new Option(OPT_PARAM_MODES_NAME, "paramModeNames", true, "Parameters mode names ("
            + PMODES
            + "). "
            + modesOptionGroupDoc
            + " Example for 2 parameters, OUT and IN: "
            + OPT
            + OPT_PARAM_MODES_NAME
            + " \""
            + _PMODE_OUT
            + " "
            + _PMODE_IN
            + "\"");
        __CLR4_5_224a24alvn1m5wg.R.inc(2824);modesOptionGroup.addOption(option);
        __CLR4_5_224a24alvn1m5wg.R.inc(2825);commandLineOptions.addOptionGroup(modesOptionGroup);
        __CLR4_5_224a24alvn1m5wg.R.inc(2826);option = new Option(null, OPT_TRIM_L, true,
                "Trims leading and trailing spaces from all column values. Column XML names can be optionally specified to set which columns to trim.");
        __CLR4_5_224a24alvn1m5wg.R.inc(2827);option.setOptionalArg(true);
        __CLR4_5_224a24alvn1m5wg.R.inc(2828);commandLineOptions.addOption(option);
        __CLR4_5_224a24alvn1m5wg.R.inc(2829);option = new Option(OPT_JDBC_TO_SFMD, OPT_JDBC_TO_SFMD_L, true,
                "Converts the JDBC file in the first argument to an SMFD file specified in the second argument.");
        __CLR4_5_224a24alvn1m5wg.R.inc(2830);option.setArgs(2);
        __CLR4_5_224a24alvn1m5wg.R.inc(2831);commandLineOptions.addOption(option);
        __CLR4_5_224a24alvn1m5wg.R.inc(2832);new HelpFormatter().printHelp(this.getClass().getName(), commandLineOptions);
    }finally{__CLR4_5_224a24alvn1m5wg.R.flushNeeded();}}

    public void testLongLineChunking() throws ParseException, IOException {__CLR4_5_224a24alvn1m5wg.R.globalSliceStart(getClass().getName(),2833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2knvw8226p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_224a24alvn1m5wg.R.rethrow($CLV_t2$);}finally{__CLR4_5_224a24alvn1m5wg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.bug.BugCLI162Test.testLongLineChunking",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2833,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2knvw8226p() throws ParseException, IOException{try{__CLR4_5_224a24alvn1m5wg.R.inc(2833);
        __CLR4_5_224a24alvn1m5wg.R.inc(2834);Options options = new Options();
        __CLR4_5_224a24alvn1m5wg.R.inc(2835);options.addOption("x", "extralongarg", false,
                                     "This description has ReallyLongValuesThatAreLongerThanTheWidthOfTheColumns " +
                                     "and also other ReallyLongValuesThatAreHugerAndBiggerThanTheWidthOfTheColumnsBob, " +
                                     "yes. ");
        __CLR4_5_224a24alvn1m5wg.R.inc(2836);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_224a24alvn1m5wg.R.inc(2837);StringWriter sw = new StringWriter();
        __CLR4_5_224a24alvn1m5wg.R.inc(2838);formatter.printHelp(new PrintWriter(sw), 35, this.getClass().getName(), "Header", options, 0, 5, "Footer");
        __CLR4_5_224a24alvn1m5wg.R.inc(2839);String expected = "usage:" + CR +
                          "       org.apache.commons.cli.bug.B" + CR +
                          "       ugCLI162Test" + CR +
                          "Header" + CR +
                          "-x,--extralongarg     This" + CR +
                          "                      description" + CR +
                          "                      has" + CR +
                          "                      ReallyLongVal" + CR +
                          "                      uesThatAreLon" + CR +
                          "                      gerThanTheWid" + CR +
                          "                      thOfTheColumn" + CR +
                          "                      s and also" + CR +
                          "                      other" + CR +
                          "                      ReallyLongVal" + CR +
                          "                      uesThatAreHug" + CR +
                          "                      erAndBiggerTh" + CR +
                          "                      anTheWidthOfT" + CR +
                          "                      heColumnsBob," + CR +
                          "                      yes." + CR +
                          "Footer" + CR;
        __CLR4_5_224a24alvn1m5wg.R.inc(2840);assertEquals( "Long arguments did not split as expected", expected, sw.toString() );
    }finally{__CLR4_5_224a24alvn1m5wg.R.flushNeeded();}}

    public void testLongLineChunkingIndentIgnored() throws ParseException, IOException {__CLR4_5_224a24alvn1m5wg.R.globalSliceStart(getClass().getName(),2841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2abbwqe26x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_224a24alvn1m5wg.R.rethrow($CLV_t2$);}finally{__CLR4_5_224a24alvn1m5wg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.bug.BugCLI162Test.testLongLineChunkingIndentIgnored",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2abbwqe26x() throws ParseException, IOException{try{__CLR4_5_224a24alvn1m5wg.R.inc(2841);
        __CLR4_5_224a24alvn1m5wg.R.inc(2842);Options options = new Options();
        __CLR4_5_224a24alvn1m5wg.R.inc(2843);options.addOption("x", "extralongarg", false, "This description is Long." );
        __CLR4_5_224a24alvn1m5wg.R.inc(2844);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_224a24alvn1m5wg.R.inc(2845);StringWriter sw = new StringWriter();
        __CLR4_5_224a24alvn1m5wg.R.inc(2846);formatter.printHelp(new PrintWriter(sw), 22, this.getClass().getName(), "Header", options, 0, 5, "Footer");
        __CLR4_5_224a24alvn1m5wg.R.inc(2847);System.err.println(sw.toString());
        __CLR4_5_224a24alvn1m5wg.R.inc(2848);String expected = "usage:" + CR +
                          "       org.apache.comm" + CR +
                          "       ons.cli.bug.Bug" + CR +
                          "       CLI162Test" + CR +
                          "Header" + CR +
                          "-x,--extralongarg" + CR +
                          " This description is" + CR +
                          " Long." + CR +
                          "Footer" + CR;
        __CLR4_5_224a24alvn1m5wg.R.inc(2849);assertEquals( "Long arguments did not split as expected", expected, sw.toString() );
    }finally{__CLR4_5_224a24alvn1m5wg.R.flushNeeded();}}

}
