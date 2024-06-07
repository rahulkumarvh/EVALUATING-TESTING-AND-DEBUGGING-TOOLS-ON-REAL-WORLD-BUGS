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
{static class __CLR4_5_21wg1wglvl2tyl5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402243997L,8589935092L,2616,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private CommandLine _cl = null;
    private Options opts = new Options();

    public void setUp() throws Exception
    {try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2464);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2465);opts.addOption("a", false, "toggle -a");
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2466);opts.addOption("b", true, "set -b");
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2467);opts.addOption("c", "c", false, "toggle -c");
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2468);opts.addOption("d", "d", true, "set -d");

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2469);opts.addOption(OptionBuilder.hasOptionalArg().create('e'));
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2470);opts.addOption(OptionBuilder.hasOptionalArg().withLongOpt("fish").create());
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2471);opts.addOption(OptionBuilder.hasOptionalArgs().withLongOpt("gravy").create());
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2472);opts.addOption(OptionBuilder.hasOptionalArgs(2).withLongOpt("hide").create());
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2473);opts.addOption(OptionBuilder.hasOptionalArgs(2).create('i'));
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2474);opts.addOption(OptionBuilder.hasOptionalArgs().create('j'));
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2475);opts.addOption(OptionBuilder.hasArgs().withValueSeparator(',').create('k'));

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2476);String[] args = new String[] { "-a",
            "-b", "foo",
            "--c",
            "--d", "bar" 
        };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2477);Parser parser = new PosixParser();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2478);_cl = parser.parse(opts,args);
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testShortNoArg()
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2twwvyq1wv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2twwvyq1wv(){try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2479);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2480);assertTrue( _cl.hasOption("a") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2481);assertNull( _cl.getOptionValue("a") );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testShortWithArg()
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bljupf1wy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bljupf1wy(){try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2482);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2483);assertTrue( _cl.hasOption("b") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2484);assertNotNull( _cl.getOptionValue("b") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2485);assertEquals( _cl.getOptionValue("b"), "foo");
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testLongNoArg()
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c8vgpe1x2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c8vgpe1x2(){try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2486);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2487);assertTrue( _cl.hasOption("c") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2488);assertNull( _cl.getOptionValue("c") );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testLongWithArg()
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujx9k91x5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2489,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujx9k91x5(){try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2489);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2490);assertTrue( _cl.hasOption("d") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2491);assertNotNull( _cl.getOptionValue("d") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2492);assertEquals( _cl.getOptionValue("d"), "bar");
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testShortOptionalArgNoValue() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_237z0np1x9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_237z0np1x9() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2493);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2494);String[] args = new String[] { "-e" };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2495);Parser parser = new PosixParser();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2496);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2497);assertTrue( cmd.hasOption("e") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2498);assertNull( cmd.getOptionValue("e") );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testShortOptionalArgValue() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k5ibjo1xf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2499,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k5ibjo1xf() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2499);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2500);String[] args = new String[] { "-e", "everything" };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2501);Parser parser = new PosixParser();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2502);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2503);assertTrue( cmd.hasOption("e") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2504);assertEquals( "everything", cmd.getOptionValue("e") );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testLongOptionalNoValue() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sapvtj1xl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sapvtj1xl() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2505);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2506);String[] args = new String[] { "--fish" };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2507);Parser parser = new PosixParser();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2508);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2509);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2510);assertNull( cmd.getOptionValue("fish") );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testLongOptionalArgValue() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pgkls1xr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pgkls1xr() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2511);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2512);String[] args = new String[] { "--fish", "face" };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2513);Parser parser = new PosixParser();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2514);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2515);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2516);assertEquals( "face", cmd.getOptionValue("fish") );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testShortOptionalArgValues() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fjtm171xx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2517,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fjtm171xx() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2517);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2518);String[] args = new String[] { "-j", "ink", "idea" };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2519);Parser parser = new PosixParser();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2520);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2521);assertTrue( cmd.hasOption("j") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2522);assertEquals( "ink", cmd.getOptionValue("j") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2523);assertEquals( "ink", cmd.getOptionValues("j")[0] );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2524);assertEquals( "idea", cmd.getOptionValues("j")[1] );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2525);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testLongOptionalArgValues() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j0s5ch1y6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2526,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j0s5ch1y6() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2526);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2527);String[] args = new String[] { "--gravy", "gold", "garden" };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2528);Parser parser = new PosixParser();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2529);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2530);assertTrue( cmd.hasOption("gravy") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2531);assertEquals( "gold", cmd.getOptionValue("gravy") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2532);assertEquals( "gold", cmd.getOptionValues("gravy")[0] );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2533);assertEquals( "garden", cmd.getOptionValues("gravy")[1] );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2534);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testShortOptionalNArgValues() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29trby31yf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2535,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29trby31yf() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2535);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2536);String[] args = new String[] { "-i", "ink", "idea", "isotope", "ice" };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2537);Parser parser = new PosixParser();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2538);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2539);assertTrue( cmd.hasOption("i") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2540);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2541);assertEquals( "ink", cmd.getOptionValues("i")[0] );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2542);assertEquals( "idea", cmd.getOptionValues("i")[1] );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2543);assertEquals( cmd.getArgs().length, 2 );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2544);assertEquals( "isotope", cmd.getArgs()[0] );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2545);assertEquals( "ice", cmd.getArgs()[1] );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testLongOptionalNArgValues() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g3t3331yq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g3t3331yq() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2546);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2547);String[] args = new String[] { 
            "--hide", "house", "hair", "head"
        };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2548);Parser parser = new PosixParser();

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2549);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2550);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2551);assertEquals( "house", cmd.getOptionValue("hide") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2552);assertEquals( "house", cmd.getOptionValues("hide")[0] );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2553);assertEquals( "hair", cmd.getOptionValues("hide")[1] );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2554);assertEquals( cmd.getArgs().length, 1 );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2555);assertEquals( "head", cmd.getArgs()[0] );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testPropertyOptionSingularValue() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2hv391z0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionSingularValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2556,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2hv391z0() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2556);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2557);Properties properties = new Properties();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2558);properties.setProperty( "hide", "seek" );

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2559);Parser parser = new PosixParser();
        
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2560);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2561);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2562);assertEquals( "seek", cmd.getOptionValue("hide") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2563);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testPropertyOptionFlags() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vt3w1e1z8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionFlags",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vt3w1e1z8() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2564);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2565);Properties properties = new Properties();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2566);properties.setProperty( "a", "true" );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2567);properties.setProperty( "c", "yes" );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2568);properties.setProperty( "e", "1" );

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2569);Parser parser = new PosixParser();

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2570);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2571);assertTrue( cmd.hasOption("a") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2572);assertTrue( cmd.hasOption("c") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2573);assertTrue( cmd.hasOption("e") );


        __CLR4_5_21wg1wglvl2tyl5.R.inc(2574);properties = new Properties();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2575);properties.setProperty( "a", "false" );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2576);properties.setProperty( "c", "no" );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2577);properties.setProperty( "e", "0" );

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2578);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2579);assertTrue( !cmd.hasOption("a") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2580);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2581);assertTrue( !cmd.hasOption("e") );


        __CLR4_5_21wg1wglvl2tyl5.R.inc(2582);properties = new Properties();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2583);properties.setProperty( "a", "TRUE" );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2584);properties.setProperty( "c", "nO" );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2585);properties.setProperty( "e", "TrUe" );

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2586);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2587);assertTrue( cmd.hasOption("a") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2588);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2589);assertTrue( cmd.hasOption("e") );

        
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2590);properties = new Properties();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2591);properties.setProperty( "a", "just a string" );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2592);properties.setProperty( "e", "" );

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2593);cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2594);assertTrue( !cmd.hasOption("a") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2595);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2596);assertTrue( !cmd.hasOption("e") );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}} 

    public void testPropertyOptionMultipleValues() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27085at205();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionMultipleValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2597,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27085at205() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2597);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2598);Properties properties = new Properties();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2599);properties.setProperty( "k", "one,two" );

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2600);Parser parser = new PosixParser();
        
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2601);String[] values = new String[] {
            "one", "two"
        };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2602);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2603);assertTrue( cmd.hasOption("k") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2604);assertTrue( Arrays.equals( values, cmd.getOptionValues('k') ) );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

    public void testPropertyOverrideValues() throws Exception
    {__CLR4_5_21wg1wglvl2tyl5.R.globalSliceStart(getClass().getName(),2605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vhymsk20d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wg1wglvl2tyl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wg1wglvl2tyl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOverrideValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2605,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vhymsk20d() throws Exception{try{__CLR4_5_21wg1wglvl2tyl5.R.inc(2605);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2606);String[] args = new String[] { 
            "-j",
            "found",
            "-i",
            "ink"
        };

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2607);Properties properties = new Properties();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2608);properties.setProperty( "j", "seek" );

        __CLR4_5_21wg1wglvl2tyl5.R.inc(2609);Parser parser = new PosixParser();
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2610);CommandLine cmd = parser.parse(opts, args, properties);
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2611);assertTrue( cmd.hasOption("j") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2612);assertEquals( "found", cmd.getOptionValue("j") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2613);assertTrue( cmd.hasOption("i") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2614);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_21wg1wglvl2tyl5.R.inc(2615);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_21wg1wglvl2tyl5.R.flushNeeded();}}

}
