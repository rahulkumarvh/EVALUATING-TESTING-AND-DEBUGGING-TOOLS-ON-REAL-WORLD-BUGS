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
{static class __CLR4_5_21vf1vflvl36yfz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402850486L,8589935092L,2579,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private CommandLine _cl = null;
    private Options opts = new Options();

    public void setUp() throws Exception
    {try{__CLR4_5_21vf1vflvl36yfz.R.inc(2427);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2428);opts.addOption("a", false, "toggle -a");
        __CLR4_5_21vf1vflvl36yfz.R.inc(2429);opts.addOption("b", true, "set -b");
        __CLR4_5_21vf1vflvl36yfz.R.inc(2430);opts.addOption("c", "c", false, "toggle -c");
        __CLR4_5_21vf1vflvl36yfz.R.inc(2431);opts.addOption("d", "d", true, "set -d");

        __CLR4_5_21vf1vflvl36yfz.R.inc(2432);opts.addOption(OptionBuilder.hasOptionalArg().create('e'));
        __CLR4_5_21vf1vflvl36yfz.R.inc(2433);opts.addOption(OptionBuilder.hasOptionalArg().withLongOpt("fish").create());
        __CLR4_5_21vf1vflvl36yfz.R.inc(2434);opts.addOption(OptionBuilder.hasOptionalArgs().withLongOpt("gravy").create());
        __CLR4_5_21vf1vflvl36yfz.R.inc(2435);opts.addOption(OptionBuilder.hasOptionalArgs(2).withLongOpt("hide").create());
        __CLR4_5_21vf1vflvl36yfz.R.inc(2436);opts.addOption(OptionBuilder.hasOptionalArgs(2).create('i'));
        __CLR4_5_21vf1vflvl36yfz.R.inc(2437);opts.addOption(OptionBuilder.hasOptionalArgs().create('j'));
        __CLR4_5_21vf1vflvl36yfz.R.inc(2438);opts.addOption(OptionBuilder.hasArgs().withValueSeparator(',').create('k'));

        __CLR4_5_21vf1vflvl36yfz.R.inc(2439);String[] args = new String[] { "-a",
            "-b", "foo",
            "--c",
            "--d", "bar" 
        };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2440);Parser parser = new PosixParser();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2441);_cl = parser.parse(opts,args);
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testShortNoArg()
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2twwvyq1vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2twwvyq1vu(){try{__CLR4_5_21vf1vflvl36yfz.R.inc(2442);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2443);assertTrue( _cl.hasOption("a") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2444);assertNull( _cl.getOptionValue("a") );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testShortWithArg()
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bljupf1vx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bljupf1vx(){try{__CLR4_5_21vf1vflvl36yfz.R.inc(2445);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2446);assertTrue( _cl.hasOption("b") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2447);assertNotNull( _cl.getOptionValue("b") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2448);assertEquals( _cl.getOptionValue("b"), "foo");
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testLongNoArg()
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c8vgpe1w1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c8vgpe1w1(){try{__CLR4_5_21vf1vflvl36yfz.R.inc(2449);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2450);assertTrue( _cl.hasOption("c") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2451);assertNull( _cl.getOptionValue("c") );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testLongWithArg()
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujx9k91w4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujx9k91w4(){try{__CLR4_5_21vf1vflvl36yfz.R.inc(2452);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2453);assertTrue( _cl.hasOption("d") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2454);assertNotNull( _cl.getOptionValue("d") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2455);assertEquals( _cl.getOptionValue("d"), "bar");
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testShortOptionalArgNoValue() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_237z0np1w8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_237z0np1w8() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2456);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2457);String[] args = new String[] { "-e" };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2458);Parser parser = new PosixParser();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2459);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2460);assertTrue( cmd.hasOption("e") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2461);assertNull( cmd.getOptionValue("e") );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testShortOptionalArgValue() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k5ibjo1we();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2462,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k5ibjo1we() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2462);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2463);String[] args = new String[] { "-e", "everything" };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2464);Parser parser = new PosixParser();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2465);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2466);assertTrue( cmd.hasOption("e") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2467);assertEquals( "everything", cmd.getOptionValue("e") );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testLongOptionalNoValue() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sapvtj1wk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2468,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sapvtj1wk() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2468);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2469);String[] args = new String[] { "--fish" };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2470);Parser parser = new PosixParser();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2471);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2472);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2473);assertNull( cmd.getOptionValue("fish") );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testLongOptionalArgValue() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pgkls1wq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pgkls1wq() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2474);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2475);String[] args = new String[] { "--fish", "face" };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2476);Parser parser = new PosixParser();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2477);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2478);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2479);assertEquals( "face", cmd.getOptionValue("fish") );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testShortOptionalArgValues() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fjtm171ww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2480,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fjtm171ww() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2480);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2481);String[] args = new String[] { "-j", "ink", "idea" };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2482);Parser parser = new PosixParser();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2483);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2484);assertTrue( cmd.hasOption("j") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2485);assertEquals( "ink", cmd.getOptionValue("j") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2486);assertEquals( "ink", cmd.getOptionValues("j")[0] );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2487);assertEquals( "idea", cmd.getOptionValues("j")[1] );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2488);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testLongOptionalArgValues() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j0s5ch1x5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2489,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j0s5ch1x5() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2489);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2490);String[] args = new String[] { "--gravy", "gold", "garden" };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2491);Parser parser = new PosixParser();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2492);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2493);assertTrue( cmd.hasOption("gravy") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2494);assertEquals( "gold", cmd.getOptionValue("gravy") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2495);assertEquals( "gold", cmd.getOptionValues("gravy")[0] );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2496);assertEquals( "garden", cmd.getOptionValues("gravy")[1] );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2497);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testShortOptionalNArgValues() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29trby31xe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2498,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29trby31xe() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2498);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2499);String[] args = new String[] { "-i", "ink", "idea", "isotope", "ice" };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2500);Parser parser = new PosixParser();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2501);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2502);assertTrue( cmd.hasOption("i") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2503);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2504);assertEquals( "ink", cmd.getOptionValues("i")[0] );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2505);assertEquals( "idea", cmd.getOptionValues("i")[1] );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2506);assertEquals( cmd.getArgs().length, 2 );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2507);assertEquals( "isotope", cmd.getArgs()[0] );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2508);assertEquals( "ice", cmd.getArgs()[1] );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testLongOptionalNArgValues() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g3t3331xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2509,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g3t3331xp() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2509);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2510);String[] args = new String[] { 
            "--hide", "house", "hair", "head"
        };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2511);Parser parser = new PosixParser();

        __CLR4_5_21vf1vflvl36yfz.R.inc(2512);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2513);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2514);assertEquals( "house", cmd.getOptionValue("hide") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2515);assertEquals( "house", cmd.getOptionValues("hide")[0] );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2516);assertEquals( "hair", cmd.getOptionValues("hide")[1] );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2517);assertEquals( cmd.getArgs().length, 1 );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2518);assertEquals( "head", cmd.getArgs()[0] );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testPropertyOptionSingularValue() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2hv391xz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionSingularValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2519,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2hv391xz() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2519);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2520);Properties properties = new Properties();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2521);properties.setProperty( "hide", "seek" );

        __CLR4_5_21vf1vflvl36yfz.R.inc(2522);Parser parser = new PosixParser();
        
        __CLR4_5_21vf1vflvl36yfz.R.inc(2523);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2524);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2525);assertEquals( "seek", cmd.getOptionValue("hide") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2526);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testPropertyOptionFlags() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vt3w1e1y7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionFlags",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2527,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vt3w1e1y7() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2527);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2528);Properties properties = new Properties();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2529);properties.setProperty( "a", "true" );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2530);properties.setProperty( "c", "yes" );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2531);properties.setProperty( "e", "1" );

        __CLR4_5_21vf1vflvl36yfz.R.inc(2532);Parser parser = new PosixParser();

        __CLR4_5_21vf1vflvl36yfz.R.inc(2533);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2534);assertTrue( cmd.hasOption("a") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2535);assertTrue( cmd.hasOption("c") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2536);assertTrue( cmd.hasOption("e") );


        __CLR4_5_21vf1vflvl36yfz.R.inc(2537);properties = new Properties();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2538);properties.setProperty( "a", "false" );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2539);properties.setProperty( "c", "no" );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2540);properties.setProperty( "e", "0" );

        __CLR4_5_21vf1vflvl36yfz.R.inc(2541);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2542);assertTrue( !cmd.hasOption("a") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2543);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2544);assertTrue( !cmd.hasOption("e") );


        __CLR4_5_21vf1vflvl36yfz.R.inc(2545);properties = new Properties();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2546);properties.setProperty( "a", "TRUE" );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2547);properties.setProperty( "c", "nO" );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2548);properties.setProperty( "e", "TrUe" );

        __CLR4_5_21vf1vflvl36yfz.R.inc(2549);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2550);assertTrue( cmd.hasOption("a") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2551);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2552);assertTrue( cmd.hasOption("e") );

        
        __CLR4_5_21vf1vflvl36yfz.R.inc(2553);properties = new Properties();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2554);properties.setProperty( "a", "just a string" );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2555);properties.setProperty( "e", "" );

        __CLR4_5_21vf1vflvl36yfz.R.inc(2556);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2557);assertTrue( !cmd.hasOption("a") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2558);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2559);assertTrue( !cmd.hasOption("e") );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}} 

    public void testPropertyOptionMultipleValues() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27085at1z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionMultipleValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27085at1z4() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2560);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2561);Properties properties = new Properties();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2562);properties.setProperty( "k", "one,two" );

        __CLR4_5_21vf1vflvl36yfz.R.inc(2563);Parser parser = new PosixParser();
        
        __CLR4_5_21vf1vflvl36yfz.R.inc(2564);String[] values = new String[] {
            "one", "two"
        };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2565);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2566);assertTrue( cmd.hasOption("k") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2567);assertTrue( Arrays.equals( values, cmd.getOptionValues('k') ) );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

    public void testPropertyOverrideValues() throws Exception
    {__CLR4_5_21vf1vflvl36yfz.R.globalSliceStart(getClass().getName(),2568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vhymsk1zc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf1vflvl36yfz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf1vflvl36yfz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOverrideValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2568,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vhymsk1zc() throws Exception{try{__CLR4_5_21vf1vflvl36yfz.R.inc(2568);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2569);String[] args = new String[] { 
            "-j",
            "found",
            "-i",
            "ink"
        };

        __CLR4_5_21vf1vflvl36yfz.R.inc(2570);Properties properties = new Properties();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2571);properties.setProperty( "j", "seek" );

        __CLR4_5_21vf1vflvl36yfz.R.inc(2572);Parser parser = new PosixParser();
        __CLR4_5_21vf1vflvl36yfz.R.inc(2573);CommandLine cmd = parser.parse(opts, args, properties);
        __CLR4_5_21vf1vflvl36yfz.R.inc(2574);assertTrue( cmd.hasOption("j") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2575);assertEquals( "found", cmd.getOptionValue("j") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2576);assertTrue( cmd.hasOption("i") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2577);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_21vf1vflvl36yfz.R.inc(2578);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_21vf1vflvl36yfz.R.flushNeeded();}}

}
