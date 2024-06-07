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
{static class __CLR4_5_21w61w6lvkk1ttl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370698324L,8589935092L,2606,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private CommandLine _cl = null;
    private Options opts = new Options();

    public void setUp() throws Exception
    {try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2454);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2455);opts.addOption("a", false, "toggle -a");
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2456);opts.addOption("b", true, "set -b");
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2457);opts.addOption("c", "c", false, "toggle -c");
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2458);opts.addOption("d", "d", true, "set -d");

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2459);opts.addOption(OptionBuilder.hasOptionalArg().create('e'));
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2460);opts.addOption(OptionBuilder.hasOptionalArg().withLongOpt("fish").create());
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2461);opts.addOption(OptionBuilder.hasOptionalArgs().withLongOpt("gravy").create());
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2462);opts.addOption(OptionBuilder.hasOptionalArgs(2).withLongOpt("hide").create());
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2463);opts.addOption(OptionBuilder.hasOptionalArgs(2).create('i'));
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2464);opts.addOption(OptionBuilder.hasOptionalArgs().create('j'));
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2465);opts.addOption(OptionBuilder.hasArgs().withValueSeparator(',').create('k'));

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2466);String[] args = new String[] { "-a",
            "-b", "foo",
            "--c",
            "--d", "bar" 
        };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2467);Parser parser = new PosixParser();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2468);_cl = parser.parse(opts,args);
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testShortNoArg()
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2twwvyq1wl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2twwvyq1wl(){try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2469);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2470);assertTrue( _cl.hasOption("a") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2471);assertNull( _cl.getOptionValue("a") );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testShortWithArg()
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bljupf1wo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bljupf1wo(){try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2472);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2473);assertTrue( _cl.hasOption("b") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2474);assertNotNull( _cl.getOptionValue("b") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2475);assertEquals( _cl.getOptionValue("b"), "foo");
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testLongNoArg()
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c8vgpe1ws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c8vgpe1ws(){try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2476);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2477);assertTrue( _cl.hasOption("c") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2478);assertNull( _cl.getOptionValue("c") );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testLongWithArg()
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujx9k91wv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujx9k91wv(){try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2479);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2480);assertTrue( _cl.hasOption("d") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2481);assertNotNull( _cl.getOptionValue("d") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2482);assertEquals( _cl.getOptionValue("d"), "bar");
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testShortOptionalArgNoValue() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_237z0np1wz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_237z0np1wz() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2483);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2484);String[] args = new String[] { "-e" };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2485);Parser parser = new PosixParser();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2486);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2487);assertTrue( cmd.hasOption("e") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2488);assertNull( cmd.getOptionValue("e") );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testShortOptionalArgValue() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k5ibjo1x5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2489,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k5ibjo1x5() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2489);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2490);String[] args = new String[] { "-e", "everything" };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2491);Parser parser = new PosixParser();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2492);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2493);assertTrue( cmd.hasOption("e") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2494);assertEquals( "everything", cmd.getOptionValue("e") );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testLongOptionalNoValue() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sapvtj1xb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2495,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sapvtj1xb() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2495);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2496);String[] args = new String[] { "--fish" };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2497);Parser parser = new PosixParser();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2498);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2499);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2500);assertNull( cmd.getOptionValue("fish") );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testLongOptionalArgValue() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pgkls1xh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2501,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pgkls1xh() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2501);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2502);String[] args = new String[] { "--fish", "face" };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2503);Parser parser = new PosixParser();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2504);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2505);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2506);assertEquals( "face", cmd.getOptionValue("fish") );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testShortOptionalArgValues() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fjtm171xn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2507,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fjtm171xn() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2507);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2508);String[] args = new String[] { "-j", "ink", "idea" };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2509);Parser parser = new PosixParser();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2510);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2511);assertTrue( cmd.hasOption("j") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2512);assertEquals( "ink", cmd.getOptionValue("j") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2513);assertEquals( "ink", cmd.getOptionValues("j")[0] );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2514);assertEquals( "idea", cmd.getOptionValues("j")[1] );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2515);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testLongOptionalArgValues() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j0s5ch1xw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2516,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j0s5ch1xw() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2516);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2517);String[] args = new String[] { "--gravy", "gold", "garden" };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2518);Parser parser = new PosixParser();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2519);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2520);assertTrue( cmd.hasOption("gravy") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2521);assertEquals( "gold", cmd.getOptionValue("gravy") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2522);assertEquals( "gold", cmd.getOptionValues("gravy")[0] );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2523);assertEquals( "garden", cmd.getOptionValues("gravy")[1] );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2524);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testShortOptionalNArgValues() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29trby31y5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2525,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29trby31y5() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2525);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2526);String[] args = new String[] { "-i", "ink", "idea", "isotope", "ice" };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2527);Parser parser = new PosixParser();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2528);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2529);assertTrue( cmd.hasOption("i") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2530);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2531);assertEquals( "ink", cmd.getOptionValues("i")[0] );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2532);assertEquals( "idea", cmd.getOptionValues("i")[1] );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2533);assertEquals( cmd.getArgs().length, 2 );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2534);assertEquals( "isotope", cmd.getArgs()[0] );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2535);assertEquals( "ice", cmd.getArgs()[1] );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testLongOptionalNArgValues() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g3t3331yg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g3t3331yg() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2536);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2537);String[] args = new String[] { 
            "--hide", "house", "hair", "head"
        };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2538);Parser parser = new PosixParser();

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2539);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2540);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2541);assertEquals( "house", cmd.getOptionValue("hide") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2542);assertEquals( "house", cmd.getOptionValues("hide")[0] );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2543);assertEquals( "hair", cmd.getOptionValues("hide")[1] );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2544);assertEquals( cmd.getArgs().length, 1 );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2545);assertEquals( "head", cmd.getArgs()[0] );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testPropertyOptionSingularValue() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2hv391yq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionSingularValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2hv391yq() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2546);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2547);Properties properties = new Properties();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2548);properties.setProperty( "hide", "seek" );

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2549);Parser parser = new PosixParser();
        
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2550);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2551);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2552);assertEquals( "seek", cmd.getOptionValue("hide") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2553);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testPropertyOptionFlags() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vt3w1e1yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionFlags",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vt3w1e1yy() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2554);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2555);Properties properties = new Properties();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2556);properties.setProperty( "a", "true" );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2557);properties.setProperty( "c", "yes" );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2558);properties.setProperty( "e", "1" );

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2559);Parser parser = new PosixParser();

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2560);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2561);assertTrue( cmd.hasOption("a") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2562);assertTrue( cmd.hasOption("c") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2563);assertTrue( cmd.hasOption("e") );


        __CLR4_5_21w61w6lvkk1ttl.R.inc(2564);properties = new Properties();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2565);properties.setProperty( "a", "false" );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2566);properties.setProperty( "c", "no" );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2567);properties.setProperty( "e", "0" );

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2568);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2569);assertTrue( !cmd.hasOption("a") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2570);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2571);assertTrue( !cmd.hasOption("e") );


        __CLR4_5_21w61w6lvkk1ttl.R.inc(2572);properties = new Properties();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2573);properties.setProperty( "a", "TRUE" );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2574);properties.setProperty( "c", "nO" );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2575);properties.setProperty( "e", "TrUe" );

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2576);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2577);assertTrue( cmd.hasOption("a") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2578);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2579);assertTrue( cmd.hasOption("e") );

        
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2580);properties = new Properties();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2581);properties.setProperty( "a", "just a string" );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2582);properties.setProperty( "e", "" );

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2583);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2584);assertTrue( !cmd.hasOption("a") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2585);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2586);assertTrue( !cmd.hasOption("e") );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}} 

    public void testPropertyOptionMultipleValues() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27085at1zv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionMultipleValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2587,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27085at1zv() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2587);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2588);Properties properties = new Properties();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2589);properties.setProperty( "k", "one,two" );

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2590);Parser parser = new PosixParser();
        
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2591);String[] values = new String[] {
            "one", "two"
        };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2592);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2593);assertTrue( cmd.hasOption("k") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2594);assertTrue( Arrays.equals( values, cmd.getOptionValues('k') ) );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

    public void testPropertyOverrideValues() throws Exception
    {__CLR4_5_21w61w6lvkk1ttl.R.globalSliceStart(getClass().getName(),2595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vhymsk203();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w61w6lvkk1ttl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w61w6lvkk1ttl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOverrideValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vhymsk203() throws Exception{try{__CLR4_5_21w61w6lvkk1ttl.R.inc(2595);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2596);String[] args = new String[] { 
            "-j",
            "found",
            "-i",
            "ink"
        };

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2597);Properties properties = new Properties();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2598);properties.setProperty( "j", "seek" );

        __CLR4_5_21w61w6lvkk1ttl.R.inc(2599);Parser parser = new PosixParser();
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2600);CommandLine cmd = parser.parse(opts, args, properties);
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2601);assertTrue( cmd.hasOption("j") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2602);assertEquals( "found", cmd.getOptionValue("j") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2603);assertTrue( cmd.hasOption("i") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2604);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_21w61w6lvkk1ttl.R.inc(2605);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_21w61w6lvkk1ttl.R.flushNeeded();}}

}
