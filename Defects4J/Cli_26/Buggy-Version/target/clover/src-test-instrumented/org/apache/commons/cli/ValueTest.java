/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.cli;

import java.util.Arrays;
import java.util.Properties;

import junit.framework.TestCase;

public class ValueTest extends TestCase
{static class __CLR4_5_21wy1wylvn1m5v8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0036\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521133496L,8589935092L,2634,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private CommandLine _cl = null;
    private Options opts = new Options();

    public void setUp() throws Exception
    {try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2482);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2483);opts.addOption("a", false, "toggle -a");
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2484);opts.addOption("b", true, "set -b");
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2485);opts.addOption("c", "c", false, "toggle -c");
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2486);opts.addOption("d", "d", true, "set -d");

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2487);opts.addOption(OptionBuilder.hasOptionalArg().create('e'));
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2488);opts.addOption(OptionBuilder.hasOptionalArg().withLongOpt("fish").create());
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2489);opts.addOption(OptionBuilder.hasOptionalArgs().withLongOpt("gravy").create());
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2490);opts.addOption(OptionBuilder.hasOptionalArgs(2).withLongOpt("hide").create());
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2491);opts.addOption(OptionBuilder.hasOptionalArgs(2).create('i'));
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2492);opts.addOption(OptionBuilder.hasOptionalArgs().create('j'));
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2493);opts.addOption(OptionBuilder.hasArgs().withValueSeparator(',').create('k'));

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2494);String[] args = new String[] { "-a",
            "-b", "foo",
            "--c",
            "--d", "bar" 
        };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2495);Parser parser = new PosixParser();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2496);_cl = parser.parse(opts,args);
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testShortNoArg()
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2twwvyq1xd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2497,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2twwvyq1xd(){try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2497);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2498);assertTrue( _cl.hasOption("a") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2499);assertNull( _cl.getOptionValue("a") );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testShortWithArg()
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bljupf1xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bljupf1xg(){try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2500);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2501);assertTrue( _cl.hasOption("b") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2502);assertNotNull( _cl.getOptionValue("b") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2503);assertEquals( _cl.getOptionValue("b"), "foo");
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testLongNoArg()
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c8vgpe1xk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2504,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c8vgpe1xk(){try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2504);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2505);assertTrue( _cl.hasOption("c") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2506);assertNull( _cl.getOptionValue("c") );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testLongWithArg()
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujx9k91xn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2507,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujx9k91xn(){try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2507);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2508);assertTrue( _cl.hasOption("d") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2509);assertNotNull( _cl.getOptionValue("d") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2510);assertEquals( _cl.getOptionValue("d"), "bar");
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testShortOptionalArgNoValue() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_237z0np1xr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_237z0np1xr() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2511);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2512);String[] args = new String[] { "-e" };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2513);Parser parser = new PosixParser();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2514);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2515);assertTrue( cmd.hasOption("e") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2516);assertNull( cmd.getOptionValue("e") );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testShortOptionalArgValue() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k5ibjo1xx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2517,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k5ibjo1xx() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2517);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2518);String[] args = new String[] { "-e", "everything" };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2519);Parser parser = new PosixParser();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2520);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2521);assertTrue( cmd.hasOption("e") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2522);assertEquals( "everything", cmd.getOptionValue("e") );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testLongOptionalNoValue() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sapvtj1y3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2523,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sapvtj1y3() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2523);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2524);String[] args = new String[] { "--fish" };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2525);Parser parser = new PosixParser();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2526);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2527);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2528);assertNull( cmd.getOptionValue("fish") );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testLongOptionalArgValue() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pgkls1y9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pgkls1y9() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2529);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2530);String[] args = new String[] { "--fish", "face" };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2531);Parser parser = new PosixParser();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2532);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2533);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2534);assertEquals( "face", cmd.getOptionValue("fish") );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testShortOptionalArgValues() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fjtm171yf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2535,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fjtm171yf() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2535);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2536);String[] args = new String[] { "-j", "ink", "idea" };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2537);Parser parser = new PosixParser();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2538);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2539);assertTrue( cmd.hasOption("j") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2540);assertEquals( "ink", cmd.getOptionValue("j") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2541);assertEquals( "ink", cmd.getOptionValues("j")[0] );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2542);assertEquals( "idea", cmd.getOptionValues("j")[1] );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2543);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testLongOptionalArgValues() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j0s5ch1yo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j0s5ch1yo() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2544);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2545);String[] args = new String[] { "--gravy", "gold", "garden" };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2546);Parser parser = new PosixParser();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2547);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2548);assertTrue( cmd.hasOption("gravy") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2549);assertEquals( "gold", cmd.getOptionValue("gravy") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2550);assertEquals( "gold", cmd.getOptionValues("gravy")[0] );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2551);assertEquals( "garden", cmd.getOptionValues("gravy")[1] );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2552);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testShortOptionalNArgValues() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29trby31yx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29trby31yx() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2553);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2554);String[] args = new String[] { "-i", "ink", "idea", "isotope", "ice" };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2555);Parser parser = new PosixParser();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2556);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2557);assertTrue( cmd.hasOption("i") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2558);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2559);assertEquals( "ink", cmd.getOptionValues("i")[0] );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2560);assertEquals( "idea", cmd.getOptionValues("i")[1] );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2561);assertEquals( cmd.getArgs().length, 2 );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2562);assertEquals( "isotope", cmd.getArgs()[0] );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2563);assertEquals( "ice", cmd.getArgs()[1] );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testLongOptionalNArgValues() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g3t3331z8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g3t3331z8() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2564);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2565);String[] args = new String[] { 
            "--hide", "house", "hair", "head"
        };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2566);Parser parser = new PosixParser();

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2567);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2568);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2569);assertEquals( "house", cmd.getOptionValue("hide") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2570);assertEquals( "house", cmd.getOptionValues("hide")[0] );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2571);assertEquals( "hair", cmd.getOptionValues("hide")[1] );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2572);assertEquals( cmd.getArgs().length, 1 );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2573);assertEquals( "head", cmd.getArgs()[0] );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testPropertyOptionSingularValue() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2hv391zi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionSingularValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2hv391zi() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2574);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2575);Properties properties = new Properties();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2576);properties.setProperty( "hide", "seek" );

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2577);Parser parser = new PosixParser();
        
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2578);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2579);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2580);assertEquals( "seek", cmd.getOptionValue("hide") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2581);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testPropertyOptionFlags() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vt3w1e1zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionFlags",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2582,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vt3w1e1zq() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2582);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2583);Properties properties = new Properties();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2584);properties.setProperty( "a", "true" );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2585);properties.setProperty( "c", "yes" );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2586);properties.setProperty( "e", "1" );

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2587);Parser parser = new PosixParser();

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2588);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2589);assertTrue( cmd.hasOption("a") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2590);assertTrue( cmd.hasOption("c") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2591);assertTrue( cmd.hasOption("e") );


        __CLR4_5_21wy1wylvn1m5v8.R.inc(2592);properties = new Properties();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2593);properties.setProperty( "a", "false" );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2594);properties.setProperty( "c", "no" );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2595);properties.setProperty( "e", "0" );

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2596);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2597);assertTrue( !cmd.hasOption("a") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2598);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2599);assertTrue( !cmd.hasOption("e") );


        __CLR4_5_21wy1wylvn1m5v8.R.inc(2600);properties = new Properties();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2601);properties.setProperty( "a", "TRUE" );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2602);properties.setProperty( "c", "nO" );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2603);properties.setProperty( "e", "TrUe" );

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2604);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2605);assertTrue( cmd.hasOption("a") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2606);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2607);assertTrue( cmd.hasOption("e") );

        
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2608);properties = new Properties();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2609);properties.setProperty( "a", "just a string" );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2610);properties.setProperty( "e", "" );

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2611);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2612);assertTrue( !cmd.hasOption("a") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2613);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2614);assertTrue( !cmd.hasOption("e") );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}} 

    public void testPropertyOptionMultipleValues() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27085at20n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionMultipleValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2615,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27085at20n() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2615);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2616);Properties properties = new Properties();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2617);properties.setProperty( "k", "one,two" );

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2618);Parser parser = new PosixParser();
        
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2619);String[] values = new String[] {
            "one", "two"
        };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2620);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2621);assertTrue( cmd.hasOption("k") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2622);assertTrue( Arrays.equals( values, cmd.getOptionValues('k') ) );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

    public void testPropertyOverrideValues() throws Exception
    {__CLR4_5_21wy1wylvn1m5v8.R.globalSliceStart(getClass().getName(),2623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vhymsk20v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wy1wylvn1m5v8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wy1wylvn1m5v8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOverrideValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2623,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vhymsk20v() throws Exception{try{__CLR4_5_21wy1wylvn1m5v8.R.inc(2623);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2624);String[] args = new String[] { 
            "-j",
            "found",
            "-i",
            "ink"
        };

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2625);Properties properties = new Properties();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2626);properties.setProperty( "j", "seek" );

        __CLR4_5_21wy1wylvn1m5v8.R.inc(2627);Parser parser = new PosixParser();
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2628);CommandLine cmd = parser.parse(opts, args, properties);
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2629);assertTrue( cmd.hasOption("j") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2630);assertEquals( "found", cmd.getOptionValue("j") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2631);assertTrue( cmd.hasOption("i") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2632);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_21wy1wylvn1m5v8.R.inc(2633);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_21wy1wylvn1m5v8.R.flushNeeded();}}

}
