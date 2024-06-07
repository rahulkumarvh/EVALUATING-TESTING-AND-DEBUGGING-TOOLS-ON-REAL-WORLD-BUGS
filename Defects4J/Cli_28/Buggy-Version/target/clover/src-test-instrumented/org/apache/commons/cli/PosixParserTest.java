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

/**
 * Test case for the PosixParser.
 *
 * @version $Revision$, $Date$
 */
public class PosixParserTest extends ParserTestCase
{static class __CLR4_5_22e52e5lvn1n6ox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,3113,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void setUp()
    {try{__CLR4_5_22e52e5lvn1n6ox.R.inc(3101);
        __CLR4_5_22e52e5lvn1n6ox.R.inc(3102);super.setUp();
        __CLR4_5_22e52e5lvn1n6ox.R.inc(3103);parser = new PosixParser();
    }finally{__CLR4_5_22e52e5lvn1n6ox.R.flushNeeded();}}

    public void testDoubleDash2() throws Exception
    {__CLR4_5_22e52e5lvn1n6ox.R.globalSliceStart(getClass().getName(),3104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xew1bw2e8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22e52e5lvn1n6ox.R.rethrow($CLV_t2$);}finally{__CLR4_5_22e52e5lvn1n6ox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testDoubleDash2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xew1bw2e8() throws Exception{try{__CLR4_5_22e52e5lvn1n6ox.R.inc(3104);
        // not supported by the PosixParser
    }finally{__CLR4_5_22e52e5lvn1n6ox.R.flushNeeded();}}
    
    public void testLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_22e52e5lvn1n6ox.R.globalSliceStart(getClass().getName(),3105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnksl2e9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22e52e5lvn1n6ox.R.rethrow($CLV_t2$);}finally{__CLR4_5_22e52e5lvn1n6ox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnksl2e9() throws Exception{try{__CLR4_5_22e52e5lvn1n6ox.R.inc(3105);
        // not supported by the PosixParser
    }finally{__CLR4_5_22e52e5lvn1n6ox.R.flushNeeded();}}

    public void testAmbiguousLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_22e52e5lvn1n6ox.R.globalSliceStart(getClass().getName(),3106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ppu6b2ea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22e52e5lvn1n6ox.R.rethrow($CLV_t2$);}finally{__CLR4_5_22e52e5lvn1n6ox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testAmbiguousLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3106,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ppu6b2ea() throws Exception{try{__CLR4_5_22e52e5lvn1n6ox.R.inc(3106);
        // not supported by the PosixParser
    }finally{__CLR4_5_22e52e5lvn1n6ox.R.flushNeeded();}}
    
    public void testNegativeOption() throws Exception
    {__CLR4_5_22e52e5lvn1n6ox.R.globalSliceStart(getClass().getName(),3107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kw2kj2eb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22e52e5lvn1n6ox.R.rethrow($CLV_t2$);}finally{__CLR4_5_22e52e5lvn1n6ox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testNegativeOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3107,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kw2kj2eb() throws Exception{try{__CLR4_5_22e52e5lvn1n6ox.R.inc(3107);
        // not supported by the PosixParser (CLI-184)
    }finally{__CLR4_5_22e52e5lvn1n6ox.R.flushNeeded();}}

    public void testLongWithUnexpectedArgument1() throws Exception
    {__CLR4_5_22e52e5lvn1n6ox.R.globalSliceStart(getClass().getName(),3108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28r28vq2ec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22e52e5lvn1n6ox.R.rethrow($CLV_t2$);}finally{__CLR4_5_22e52e5lvn1n6ox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testLongWithUnexpectedArgument1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28r28vq2ec() throws Exception{try{__CLR4_5_22e52e5lvn1n6ox.R.inc(3108);
        // not supported by the PosixParser
    }finally{__CLR4_5_22e52e5lvn1n6ox.R.flushNeeded();}}

    public void testLongWithEqualSingleDash() throws Exception
    {__CLR4_5_22e52e5lvn1n6ox.R.globalSliceStart(getClass().getName(),3109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qootr52ed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22e52e5lvn1n6ox.R.rethrow($CLV_t2$);}finally{__CLR4_5_22e52e5lvn1n6ox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testLongWithEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qootr52ed() throws Exception{try{__CLR4_5_22e52e5lvn1n6ox.R.inc(3109);
        // not supported by the PosixParser
    }finally{__CLR4_5_22e52e5lvn1n6ox.R.flushNeeded();}}

    public void testShortWithEqual() throws Exception
    {__CLR4_5_22e52e5lvn1n6ox.R.globalSliceStart(getClass().getName(),3110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohwzdh2ee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22e52e5lvn1n6ox.R.rethrow($CLV_t2$);}finally{__CLR4_5_22e52e5lvn1n6ox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testShortWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3110,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohwzdh2ee() throws Exception{try{__CLR4_5_22e52e5lvn1n6ox.R.inc(3110);
        // not supported by the PosixParser
    }finally{__CLR4_5_22e52e5lvn1n6ox.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption4() throws Exception
    {__CLR4_5_22e52e5lvn1n6ox.R.globalSliceStart(getClass().getName(),3111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkkas62ef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22e52e5lvn1n6ox.R.rethrow($CLV_t2$);}finally{__CLR4_5_22e52e5lvn1n6ox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testUnambiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3111,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkkas62ef() throws Exception{try{__CLR4_5_22e52e5lvn1n6ox.R.inc(3111);
        // not supported by the PosixParser
    }finally{__CLR4_5_22e52e5lvn1n6ox.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption4() throws Exception
    {__CLR4_5_22e52e5lvn1n6ox.R.globalSliceStart(getClass().getName(),3112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytiu4j2eg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22e52e5lvn1n6ox.R.rethrow($CLV_t2$);}finally{__CLR4_5_22e52e5lvn1n6ox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testAmbiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytiu4j2eg() throws Exception{try{__CLR4_5_22e52e5lvn1n6ox.R.inc(3112);
        // not supported by the PosixParser
    }finally{__CLR4_5_22e52e5lvn1n6ox.R.flushNeeded();}}
}
