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

public class ArgumentIsOptionTest extends TestCase
{static class __CLR4_5_2107107lvl2txsx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402243997L,8589935092L,1326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options options = null;
    private CommandLineParser parser = null;

    public void setUp()
    {try{__CLR4_5_2107107lvl2txsx.R.inc(1303);
        __CLR4_5_2107107lvl2txsx.R.inc(1304);options = new Options().addOption("p", false, "Option p").addOption("attr", true, "Option accepts argument");

        __CLR4_5_2107107lvl2txsx.R.inc(1305);parser = new PosixParser();
    }finally{__CLR4_5_2107107lvl2txsx.R.flushNeeded();}}

    public void testOptionAndOptionWithArgument() throws Exception
    {__CLR4_5_2107107lvl2txsx.R.globalSliceStart(getClass().getName(),1306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23xahbl10a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2107107lvl2txsx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2107107lvl2txsx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ArgumentIsOptionTest.testOptionAndOptionWithArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1306,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23xahbl10a() throws Exception{try{__CLR4_5_2107107lvl2txsx.R.inc(1306);
        __CLR4_5_2107107lvl2txsx.R.inc(1307);String[] args = new String[]{
                "-p",
                "-attr",
                "p"
        };

        __CLR4_5_2107107lvl2txsx.R.inc(1308);CommandLine cl = parser.parse(options, args);
        __CLR4_5_2107107lvl2txsx.R.inc(1309);assertTrue("Confirm -p is set", cl.hasOption("p"));
        __CLR4_5_2107107lvl2txsx.R.inc(1310);assertTrue("Confirm -attr is set", cl.hasOption("attr"));
        __CLR4_5_2107107lvl2txsx.R.inc(1311);assertTrue("Confirm arg of -attr",
                cl.getOptionValue("attr").equals("p"));
        __CLR4_5_2107107lvl2txsx.R.inc(1312);assertTrue("Confirm all arguments recognized", cl.getArgs().length == 0);
    }finally{__CLR4_5_2107107lvl2txsx.R.flushNeeded();}}

    public void testOptionWithArgument() throws Exception
    {__CLR4_5_2107107lvl2txsx.R.globalSliceStart(getClass().getName(),1313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29my7sh10h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2107107lvl2txsx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2107107lvl2txsx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ArgumentIsOptionTest.testOptionWithArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29my7sh10h() throws Exception{try{__CLR4_5_2107107lvl2txsx.R.inc(1313);
        __CLR4_5_2107107lvl2txsx.R.inc(1314);String[] args = new String[]{
                "-attr",
                "p"
        };

        __CLR4_5_2107107lvl2txsx.R.inc(1315);CommandLine cl = parser.parse(options, args);
        __CLR4_5_2107107lvl2txsx.R.inc(1316);assertFalse("Confirm -p is set", cl.hasOption("p"));
        __CLR4_5_2107107lvl2txsx.R.inc(1317);assertTrue("Confirm -attr is set", cl.hasOption("attr"));
        __CLR4_5_2107107lvl2txsx.R.inc(1318);assertTrue("Confirm arg of -attr",
                cl.getOptionValue("attr").equals("p"));
        __CLR4_5_2107107lvl2txsx.R.inc(1319);assertTrue("Confirm all arguments recognized", cl.getArgs().length == 0);
    }finally{__CLR4_5_2107107lvl2txsx.R.flushNeeded();}}

    public void testOption() throws Exception
    {__CLR4_5_2107107lvl2txsx.R.globalSliceStart(getClass().getName(),1320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lqju9e10o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2107107lvl2txsx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2107107lvl2txsx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ArgumentIsOptionTest.testOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1320,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lqju9e10o() throws Exception{try{__CLR4_5_2107107lvl2txsx.R.inc(1320);
        __CLR4_5_2107107lvl2txsx.R.inc(1321);String[] args = new String[]{
                "-p"
        };

        __CLR4_5_2107107lvl2txsx.R.inc(1322);CommandLine cl = parser.parse(options, args);
        __CLR4_5_2107107lvl2txsx.R.inc(1323);assertTrue("Confirm -p is set", cl.hasOption("p"));
        __CLR4_5_2107107lvl2txsx.R.inc(1324);assertFalse("Confirm -attr is not set", cl.hasOption("attr"));
        __CLR4_5_2107107lvl2txsx.R.inc(1325);assertTrue("Confirm all arguments recognized", cl.getArgs().length == 0);
    }finally{__CLR4_5_2107107lvl2txsx.R.flushNeeded();}}
}
