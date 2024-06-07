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
{static class __CLR4_5_22eo2eolvn1n6pq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,3272,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private CommandLine _cl = null;
    private Options opts = new Options();

    public void setUp() throws Exception
    {try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3120);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3121);opts.addOption("a", false, "toggle -a");
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3122);opts.addOption("b", true, "set -b");
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3123);opts.addOption("c", "c", false, "toggle -c");
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3124);opts.addOption("d", "d", true, "set -d");

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3125);opts.addOption(OptionBuilder.hasOptionalArg().create('e'));
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3126);opts.addOption(OptionBuilder.hasOptionalArg().withLongOpt("fish").create());
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3127);opts.addOption(OptionBuilder.hasOptionalArgs().withLongOpt("gravy").create());
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3128);opts.addOption(OptionBuilder.hasOptionalArgs(2).withLongOpt("hide").create());
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3129);opts.addOption(OptionBuilder.hasOptionalArgs(2).create('i'));
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3130);opts.addOption(OptionBuilder.hasOptionalArgs().create('j'));
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3131);opts.addOption(OptionBuilder.hasArgs().withValueSeparator(',').create('k'));

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3132);String[] args = new String[] { "-a",
            "-b", "foo",
            "--c",
            "--d", "bar" 
        };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3133);Parser parser = new PosixParser();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3134);_cl = parser.parse(opts,args);
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testShortNoArg()
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2twwvyq2f3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3135,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2twwvyq2f3(){try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3135);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3136);assertTrue( _cl.hasOption("a") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3137);assertNull( _cl.getOptionValue("a") );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testShortWithArg()
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bljupf2f6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3138,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bljupf2f6(){try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3138);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3139);assertTrue( _cl.hasOption("b") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3140);assertNotNull( _cl.getOptionValue("b") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3141);assertEquals( _cl.getOptionValue("b"), "foo");
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testLongNoArg()
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c8vgpe2fa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongNoArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c8vgpe2fa(){try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3142);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3143);assertTrue( _cl.hasOption("c") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3144);assertNull( _cl.getOptionValue("c") );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testLongWithArg()
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujx9k92fd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongWithArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujx9k92fd(){try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3145);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3146);assertTrue( _cl.hasOption("d") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3147);assertNotNull( _cl.getOptionValue("d") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3148);assertEquals( _cl.getOptionValue("d"), "bar");
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testShortOptionalArgNoValue() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_237z0np2fh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_237z0np2fh() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3149);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3150);String[] args = new String[] { "-e" };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3151);Parser parser = new PosixParser();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3152);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3153);assertTrue( cmd.hasOption("e") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3154);assertNull( cmd.getOptionValue("e") );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testShortOptionalArgValue() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k5ibjo2fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k5ibjo2fn() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3155);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3156);String[] args = new String[] { "-e", "everything" };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3157);Parser parser = new PosixParser();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3158);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3159);assertTrue( cmd.hasOption("e") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3160);assertEquals( "everything", cmd.getOptionValue("e") );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testLongOptionalNoValue() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sapvtj2ft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNoValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sapvtj2ft() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3161);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3162);String[] args = new String[] { "--fish" };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3163);Parser parser = new PosixParser();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3164);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3165);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3166);assertNull( cmd.getOptionValue("fish") );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testLongOptionalArgValue() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pgkls2fz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pgkls2fz() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3167);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3168);String[] args = new String[] { "--fish", "face" };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3169);Parser parser = new PosixParser();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3170);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3171);assertTrue( cmd.hasOption("fish") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3172);assertEquals( "face", cmd.getOptionValue("fish") );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testShortOptionalArgValues() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fjtm172g5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fjtm172g5() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3173);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3174);String[] args = new String[] { "-j", "ink", "idea" };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3175);Parser parser = new PosixParser();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3176);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3177);assertTrue( cmd.hasOption("j") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3178);assertEquals( "ink", cmd.getOptionValue("j") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3179);assertEquals( "ink", cmd.getOptionValues("j")[0] );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3180);assertEquals( "idea", cmd.getOptionValues("j")[1] );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3181);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testLongOptionalArgValues() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j0s5ch2ge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3182,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j0s5ch2ge() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3182);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3183);String[] args = new String[] { "--gravy", "gold", "garden" };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3184);Parser parser = new PosixParser();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3185);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3186);assertTrue( cmd.hasOption("gravy") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3187);assertEquals( "gold", cmd.getOptionValue("gravy") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3188);assertEquals( "gold", cmd.getOptionValues("gravy")[0] );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3189);assertEquals( "garden", cmd.getOptionValues("gravy")[1] );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3190);assertEquals( cmd.getArgs().length, 0 );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testShortOptionalNArgValues() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29trby32gn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testShortOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3191,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29trby32gn() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3191);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3192);String[] args = new String[] { "-i", "ink", "idea", "isotope", "ice" };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3193);Parser parser = new PosixParser();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3194);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3195);assertTrue( cmd.hasOption("i") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3196);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3197);assertEquals( "ink", cmd.getOptionValues("i")[0] );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3198);assertEquals( "idea", cmd.getOptionValues("i")[1] );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3199);assertEquals( cmd.getArgs().length, 2 );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3200);assertEquals( "isotope", cmd.getArgs()[0] );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3201);assertEquals( "ice", cmd.getArgs()[1] );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testLongOptionalNArgValues() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g3t3332gy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testLongOptionalNArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3202,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g3t3332gy() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3202);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3203);String[] args = new String[] { 
            "--hide", "house", "hair", "head"
        };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3204);Parser parser = new PosixParser();

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3205);CommandLine cmd = parser.parse(opts,args);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3206);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3207);assertEquals( "house", cmd.getOptionValue("hide") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3208);assertEquals( "house", cmd.getOptionValues("hide")[0] );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3209);assertEquals( "hair", cmd.getOptionValues("hide")[1] );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3210);assertEquals( cmd.getArgs().length, 1 );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3211);assertEquals( "head", cmd.getArgs()[0] );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testPropertyOptionSingularValue() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2hv392h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionSingularValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3212,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2hv392h8() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3212);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3213);Properties properties = new Properties();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3214);properties.setProperty( "hide", "seek" );

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3215);Parser parser = new PosixParser();
        
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3216);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3217);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3218);assertEquals( "seek", cmd.getOptionValue("hide") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3219);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testPropertyOptionFlags() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vt3w1e2hg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionFlags",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vt3w1e2hg() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3220);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3221);Properties properties = new Properties();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3222);properties.setProperty( "a", "true" );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3223);properties.setProperty( "c", "yes" );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3224);properties.setProperty( "e", "1" );

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3225);Parser parser = new PosixParser();

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3226);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3227);assertTrue( cmd.hasOption("a") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3228);assertTrue( cmd.hasOption("c") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3229);assertTrue( cmd.hasOption("e") );


        __CLR4_5_22eo2eolvn1n6pq.R.inc(3230);properties = new Properties();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3231);properties.setProperty( "a", "false" );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3232);properties.setProperty( "c", "no" );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3233);properties.setProperty( "e", "0" );

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3234);cmd = parser.parse(opts, null, properties);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3235);assertTrue( !cmd.hasOption("a") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3236);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3237);assertTrue( cmd.hasOption("e") ); // this option accepts as argument


        __CLR4_5_22eo2eolvn1n6pq.R.inc(3238);properties = new Properties();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3239);properties.setProperty( "a", "TRUE" );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3240);properties.setProperty( "c", "nO" );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3241);properties.setProperty( "e", "TrUe" );

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3242);cmd = parser.parse(opts, null, properties);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3243);assertTrue( cmd.hasOption("a") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3244);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3245);assertTrue( cmd.hasOption("e") );

        
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3246);properties = new Properties();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3247);properties.setProperty( "a", "just a string" );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3248);properties.setProperty( "e", "" );

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3249);cmd = parser.parse(opts, null, properties);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3250);assertTrue( !cmd.hasOption("a") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3251);assertTrue( !cmd.hasOption("c") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3252);assertTrue( cmd.hasOption("e") );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}} 

    public void testPropertyOptionMultipleValues() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27085at2id();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOptionMultipleValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3253,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27085at2id() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3253);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3254);Properties properties = new Properties();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3255);properties.setProperty( "k", "one,two" );

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3256);Parser parser = new PosixParser();
        
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3257);String[] values = new String[] {
            "one", "two"
        };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3258);CommandLine cmd = parser.parse(opts, null, properties);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3259);assertTrue( cmd.hasOption("k") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3260);assertTrue( Arrays.equals( values, cmd.getOptionValues('k') ) );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

    public void testPropertyOverrideValues() throws Exception
    {__CLR4_5_22eo2eolvn1n6pq.R.globalSliceStart(getClass().getName(),3261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vhymsk2il();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eo2eolvn1n6pq.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eo2eolvn1n6pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValueTest.testPropertyOverrideValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3261,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vhymsk2il() throws Exception{try{__CLR4_5_22eo2eolvn1n6pq.R.inc(3261);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3262);String[] args = new String[] { 
            "-j",
            "found",
            "-i",
            "ink"
        };

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3263);Properties properties = new Properties();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3264);properties.setProperty( "j", "seek" );

        __CLR4_5_22eo2eolvn1n6pq.R.inc(3265);Parser parser = new PosixParser();
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3266);CommandLine cmd = parser.parse(opts, args, properties);
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3267);assertTrue( cmd.hasOption("j") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3268);assertEquals( "found", cmd.getOptionValue("j") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3269);assertTrue( cmd.hasOption("i") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3270);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_22eo2eolvn1n6pq.R.inc(3271);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_22eo2eolvn1n6pq.R.flushNeeded();}}

}
