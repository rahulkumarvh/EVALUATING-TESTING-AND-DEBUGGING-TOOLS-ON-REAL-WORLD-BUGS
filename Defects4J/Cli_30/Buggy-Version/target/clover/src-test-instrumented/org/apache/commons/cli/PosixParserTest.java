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
{static class __CLR4_5_22ir2irlvn1nfd0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521191983L,8589935092L,3279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void setUp()
    {try{__CLR4_5_22ir2irlvn1nfd0.R.inc(3267);
        __CLR4_5_22ir2irlvn1nfd0.R.inc(3268);super.setUp();
        __CLR4_5_22ir2irlvn1nfd0.R.inc(3269);parser = new PosixParser();
    }finally{__CLR4_5_22ir2irlvn1nfd0.R.flushNeeded();}}

    public void testDoubleDash2() throws Exception
    {__CLR4_5_22ir2irlvn1nfd0.R.globalSliceStart(getClass().getName(),3270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xew1bw2iu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ir2irlvn1nfd0.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ir2irlvn1nfd0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testDoubleDash2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3270,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xew1bw2iu() throws Exception{try{__CLR4_5_22ir2irlvn1nfd0.R.inc(3270);
        // not supported by the PosixParser
    }finally{__CLR4_5_22ir2irlvn1nfd0.R.flushNeeded();}}
    
    public void testLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_22ir2irlvn1nfd0.R.globalSliceStart(getClass().getName(),3271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnksl2iv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ir2irlvn1nfd0.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ir2irlvn1nfd0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnksl2iv() throws Exception{try{__CLR4_5_22ir2irlvn1nfd0.R.inc(3271);
        // not supported by the PosixParser
    }finally{__CLR4_5_22ir2irlvn1nfd0.R.flushNeeded();}}

    public void testAmbiguousLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_22ir2irlvn1nfd0.R.globalSliceStart(getClass().getName(),3272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ppu6b2iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ir2irlvn1nfd0.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ir2irlvn1nfd0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testAmbiguousLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3272,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ppu6b2iw() throws Exception{try{__CLR4_5_22ir2irlvn1nfd0.R.inc(3272);
        // not supported by the PosixParser
    }finally{__CLR4_5_22ir2irlvn1nfd0.R.flushNeeded();}}
    
    public void testNegativeOption() throws Exception
    {__CLR4_5_22ir2irlvn1nfd0.R.globalSliceStart(getClass().getName(),3273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kw2kj2ix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ir2irlvn1nfd0.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ir2irlvn1nfd0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testNegativeOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kw2kj2ix() throws Exception{try{__CLR4_5_22ir2irlvn1nfd0.R.inc(3273);
        // not supported by the PosixParser (CLI-184)
    }finally{__CLR4_5_22ir2irlvn1nfd0.R.flushNeeded();}}

    public void testLongWithUnexpectedArgument1() throws Exception
    {__CLR4_5_22ir2irlvn1nfd0.R.globalSliceStart(getClass().getName(),3274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28r28vq2iy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ir2irlvn1nfd0.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ir2irlvn1nfd0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testLongWithUnexpectedArgument1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3274,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28r28vq2iy() throws Exception{try{__CLR4_5_22ir2irlvn1nfd0.R.inc(3274);
        // not supported by the PosixParser
    }finally{__CLR4_5_22ir2irlvn1nfd0.R.flushNeeded();}}

    public void testLongWithEqualSingleDash() throws Exception
    {__CLR4_5_22ir2irlvn1nfd0.R.globalSliceStart(getClass().getName(),3275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qootr52iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ir2irlvn1nfd0.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ir2irlvn1nfd0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testLongWithEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3275,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qootr52iz() throws Exception{try{__CLR4_5_22ir2irlvn1nfd0.R.inc(3275);
        // not supported by the PosixParser
    }finally{__CLR4_5_22ir2irlvn1nfd0.R.flushNeeded();}}

    public void testShortWithEqual() throws Exception
    {__CLR4_5_22ir2irlvn1nfd0.R.globalSliceStart(getClass().getName(),3276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohwzdh2j0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ir2irlvn1nfd0.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ir2irlvn1nfd0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testShortWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohwzdh2j0() throws Exception{try{__CLR4_5_22ir2irlvn1nfd0.R.inc(3276);
        // not supported by the PosixParser
    }finally{__CLR4_5_22ir2irlvn1nfd0.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption4() throws Exception
    {__CLR4_5_22ir2irlvn1nfd0.R.globalSliceStart(getClass().getName(),3277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkkas62j1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ir2irlvn1nfd0.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ir2irlvn1nfd0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testUnambiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkkas62j1() throws Exception{try{__CLR4_5_22ir2irlvn1nfd0.R.inc(3277);
        // not supported by the PosixParser
    }finally{__CLR4_5_22ir2irlvn1nfd0.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption4() throws Exception
    {__CLR4_5_22ir2irlvn1nfd0.R.globalSliceStart(getClass().getName(),3278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytiu4j2j2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ir2irlvn1nfd0.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ir2irlvn1nfd0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testAmbiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3278,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytiu4j2j2() throws Exception{try{__CLR4_5_22ir2irlvn1nfd0.R.inc(3278);
        // not supported by the PosixParser
    }finally{__CLR4_5_22ir2irlvn1nfd0.R.flushNeeded();}}
}
