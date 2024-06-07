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

import junit.framework.TestCase;

public class ValueTest extends TestCase
{static class __CLR4_5_22je2jelvn1nfeo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521191983L,8589935092L,3381,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private CommandLine _cl = null;
    private Options opts = new Options();

    public void setUp() throws Exception
    {try{__CLR4_5_22je2jelvn1nfeo.R.inc(3290);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3291);opts.addOption("a", false, "toggle -a");
        __CLR4_5_22je2jelvn1nfeo.R.inc(3292);opts.addOption("b", true, "set -b");
        __CLR4_5_22je2jelvn1nfeo.R.inc(3293);opts.addOption("c", "c", false, "toggle -c");
        __CLR4_5_22je2jelvn1nfeo.R.inc(3294);opts.addOption("d", "d", true, "set -d");

        __CLR4_5_22je2jelvn1nfeo.R.inc(3295);opts.addOption(OptionBuilder.hasOptionalArg().create('e'));
        __CLR4_5_22je2jelvn1nfeo.R.inc(3296);opts.addOption(OptionBuilder.hasOptionalArg().withLongOpt("fish").create());
        __CLR4_5_22je2jelvn1nfeo.R.inc(3297);opts.addOption(OptionBuilder.hasOptionalArgs().withLongOpt("gravy").create());
        __CLR4_5_22je2jelvn1nfeo.R.inc(3298);opts.addOption(OptionBuilder.hasOptionalArgs(2).withLongOpt("hide").create());
        __CLR4_5_22je2jelvn1nfeo.R.inc(3299);opts.addOption(OptionBuilder.hasOptionalArgs(2).create('i'));
        __CLR4_5_22je2jelvn1nfeo.R.inc(3300);opts.addOption(OptionBuilder.hasOptionalArgs().create('j'));

        __CLR4_5_22je2jelvn1nfeo.R.inc(3301);String[] args = new String[] { "-a",
            "-b", "foo",
            "--c",
            "--d", "bar" 
        };

        __CLR4_5_22je2jelvn1nfeo.R.inc(3302);Parser parser = new PosixParser();
        __CLR4_5_22je2jelvn1nfeo.R.inc(3303);_cl = parser.parse(opts,args);
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testShortNoArg()
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2twwvyq2js();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3304,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2twwvyq2js(){try{__CLR4_5_22je2jelvn1nfeo.R.inc(3304);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3305);assertTrue( _cl.hasOption("a") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3306);assertNull( _cl.getOptionValue("a") );
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testShortWithArg()
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bljupf2jv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3307,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bljupf2jv(){try{__CLR4_5_22je2jelvn1nfeo.R.inc(3307);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3308);assertTrue( _cl.hasOption("b") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3309);assertNotNull( _cl.getOptionValue("b") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3310);assertEquals( _cl.getOptionValue("b"), "foo");
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testLongNoArg()
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c8vgpe2jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c8vgpe2jz(){try{__CLR4_5_22je2jelvn1nfeo.R.inc(3311);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3312);assertTrue( _cl.hasOption("c") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3313);assertNull( _cl.getOptionValue("c") );
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testLongWithArg()
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujx9k92k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3314,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujx9k92k2(){try{__CLR4_5_22je2jelvn1nfeo.R.inc(3314);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3315);assertTrue( _cl.hasOption("d") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3316);assertNotNull( _cl.getOptionValue("d") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3317);assertEquals( _cl.getOptionValue("d"), "bar");
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testShortOptionalArgNoValue() throws Exception
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_237z0np2k6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3318,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_237z0np2k6() throws Exception{try{__CLR4_5_22je2jelvn1nfeo.R.inc(3318);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3319);String[] args = new String[] { "-e" };

        __CLR4_5_22je2jelvn1nfeo.R.inc(3320);Parser parser = new PosixParser();
        __CLR4_5_22je2jelvn1nfeo.R.inc(3321);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3322);assertTrue( cmd.hasOption("e") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3323);assertNull( cmd.getOptionValue("e") );
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testShortOptionalArgValue() throws Exception
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k5ibjo2kc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3324,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k5ibjo2kc() throws Exception{try{__CLR4_5_22je2jelvn1nfeo.R.inc(3324);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3325);String[] args = new String[] { "-e", "everything" };

        __CLR4_5_22je2jelvn1nfeo.R.inc(3326);Parser parser = new PosixParser();
        __CLR4_5_22je2jelvn1nfeo.R.inc(3327);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3328);assertTrue( cmd.hasOption("e") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3329);assertEquals( "everything", cmd.getOptionValue("e") );
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testLongOptionalNoValue() throws Exception
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sapvtj2ki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sapvtj2ki() throws Exception{try{__CLR4_5_22je2jelvn1nfeo.R.inc(3330);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3331);String[] args = new String[] { "--fish" };

        __CLR4_5_22je2jelvn1nfeo.R.inc(3332);Parser parser = new PosixParser();
        __CLR4_5_22je2jelvn1nfeo.R.inc(3333);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3334);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3335);assertNull( cmd.getOptionValue("fish") );
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testLongOptionalArgValue() throws Exception
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pgkls2ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pgkls2ko() throws Exception{try{__CLR4_5_22je2jelvn1nfeo.R.inc(3336);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3337);String[] args = new String[] { "--fish", "face" };

        __CLR4_5_22je2jelvn1nfeo.R.inc(3338);Parser parser = new PosixParser();
        __CLR4_5_22je2jelvn1nfeo.R.inc(3339);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3340);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3341);assertEquals( "face", cmd.getOptionValue("fish") );
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testShortOptionalArgValues() throws Exception
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fjtm172ku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fjtm172ku() throws Exception{try{__CLR4_5_22je2jelvn1nfeo.R.inc(3342);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3343);String[] args = new String[] { "-j", "ink", "idea" };

        __CLR4_5_22je2jelvn1nfeo.R.inc(3344);Parser parser = new PosixParser();
        __CLR4_5_22je2jelvn1nfeo.R.inc(3345);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3346);assertTrue( cmd.hasOption("j") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3347);assertEquals( "ink", cmd.getOptionValue("j") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3348);assertEquals( "ink", cmd.getOptionValues("j")[0] );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3349);assertEquals( "idea", cmd.getOptionValues("j")[1] );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3350);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testLongOptionalArgValues() throws Exception
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j0s5ch2l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3351,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j0s5ch2l3() throws Exception{try{__CLR4_5_22je2jelvn1nfeo.R.inc(3351);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3352);String[] args = new String[] { "--gravy", "gold", "garden" };

        __CLR4_5_22je2jelvn1nfeo.R.inc(3353);Parser parser = new PosixParser();
        __CLR4_5_22je2jelvn1nfeo.R.inc(3354);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3355);assertTrue( cmd.hasOption("gravy") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3356);assertEquals( "gold", cmd.getOptionValue("gravy") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3357);assertEquals( "gold", cmd.getOptionValues("gravy")[0] );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3358);assertEquals( "garden", cmd.getOptionValues("gravy")[1] );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3359);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testShortOptionalNArgValues() throws Exception
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29trby32lc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29trby32lc() throws Exception{try{__CLR4_5_22je2jelvn1nfeo.R.inc(3360);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3361);String[] args = new String[] { "-i", "ink", "idea", "isotope", "ice" };

        __CLR4_5_22je2jelvn1nfeo.R.inc(3362);Parser parser = new PosixParser();
        __CLR4_5_22je2jelvn1nfeo.R.inc(3363);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3364);assertTrue( cmd.hasOption("i") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3365);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3366);assertEquals( "ink", cmd.getOptionValues("i")[0] );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3367);assertEquals( "idea", cmd.getOptionValues("i")[1] );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3368);assertEquals( cmd.getArgs().length, 2 );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3369);assertEquals( "isotope", cmd.getArgs()[0] );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3370);assertEquals( "ice", cmd.getArgs()[1] );
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}

    public void testLongOptionalNArgValues() throws Exception
    {__CLR4_5_22je2jelvn1nfeo.R.globalSliceStart(getClass().getName(),3371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g3t3332ln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22je2jelvn1nfeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_22je2jelvn1nfeo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3371,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g3t3332ln() throws Exception{try{__CLR4_5_22je2jelvn1nfeo.R.inc(3371);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3372);String[] args = new String[] { 
            "--hide", "house", "hair", "head"
        };

        __CLR4_5_22je2jelvn1nfeo.R.inc(3373);Parser parser = new PosixParser();

        __CLR4_5_22je2jelvn1nfeo.R.inc(3374);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22je2jelvn1nfeo.R.inc(3375);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3376);assertEquals( "house", cmd.getOptionValue("hide") );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3377);assertEquals( "house", cmd.getOptionValues("hide")[0] );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3378);assertEquals( "hair", cmd.getOptionValues("hide")[1] );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3379);assertEquals( cmd.getArgs().length, 1 );
        __CLR4_5_22je2jelvn1nfeo.R.inc(3380);assertEquals( "head", cmd.getArgs()[0] );
    }finally{__CLR4_5_22je2jelvn1nfeo.R.flushNeeded();}}
}
