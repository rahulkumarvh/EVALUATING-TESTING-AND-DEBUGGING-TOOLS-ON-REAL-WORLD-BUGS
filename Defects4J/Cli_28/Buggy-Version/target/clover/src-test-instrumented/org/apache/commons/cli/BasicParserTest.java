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
 * @author Emmanuel Bourg
 * @version $Revision$, $Date$
 */
public class BasicParserTest extends ParserTestCase
{static class __CLR4_5_21bs1bslvn1n6cq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,1747,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void setUp()
    {try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1720);
        __CLR4_5_21bs1bslvn1n6cq.R.inc(1721);super.setUp();
        __CLR4_5_21bs1bslvn1n6cq.R.inc(1722);parser = new BasicParser();
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testDoubleDash2() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xew1bw1bv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testDoubleDash2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xew1bw1bv() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1723);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnksl1bw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1724,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnksl1bw() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1724);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}
    
    public void testAmbiguousLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ppu6b1bx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testAmbiguousLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1725,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ppu6b1bx() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1725);
        // not supported by the basicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}
    
    public void testNegativeOption() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kw2kj1by();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testNegativeOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1726,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kw2kj1by() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1726);
        // not supported by the BasicParser (CLI-184)
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testPropertiesOption1() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m4t5zy1bz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testPropertiesOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m4t5zy1bz() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1727);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testPropertiesOption2() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pdt4sf1c0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testPropertiesOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pdt4sf1c0() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1728);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}    

    public void testShortWithEqual() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohwzdh1c1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testShortWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1729,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohwzdh1c1() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1729);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testShortWithoutEqual() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se6war1c2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testShortWithoutEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se6war1c2() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1730);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testLongWithEqualDoubleDash() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21degsq1c3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testLongWithEqualDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1731,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21degsq1c3() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1731);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testLongWithEqualSingleDash() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qootr51c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testLongWithEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1732,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qootr51c4() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1732);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}
    
    public void testUnambiguousPartialLongOption1() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tpjutj1c5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testUnambiguousPartialLongOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1733,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tpjutj1c5() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1733);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption2() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wyjtm01c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testUnambiguousPartialLongOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wyjtm01c6() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1734);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption3() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytk9kn1c7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testUnambiguousPartialLongOption3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytk9kn1c7() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1735);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption4() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkkas61c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testUnambiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkkas61c8() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1736);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption1() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2ixr41c9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testAmbiguousPartialLongOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2ixr41c9() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1737);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption2() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sbiwjl1ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testAmbiguousPartialLongOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1738,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sbiwjl1ca() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1738);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption3() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkivc21cb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testAmbiguousPartialLongOption3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkivc21cb() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1739);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption4() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytiu4j1cc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testAmbiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytiu4j1cc() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1740);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testPartialLongOptionSingleDash() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcd5i91cd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testPartialLongOptionSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1741,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcd5i91cd() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1741);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testBursting() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g4pqkl1ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g4pqkl1ce() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1742);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testUnrecognizedOptionWithBursting() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23fy8u31cf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testUnrecognizedOptionWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23fy8u31cf() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1743);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testMissingArgWithBursting() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26h2akx1cg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testMissingArgWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26h2akx1cg() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1744);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testStopBursting() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zby38j1ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testStopBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zby38j1ch() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1745);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}

    public void testStopBursting2() throws Exception
    {__CLR4_5_21bs1bslvn1n6cq.R.globalSliceStart(getClass().getName(),1746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cys9wj1ci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bs1bslvn1n6cq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bs1bslvn1n6cq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testStopBursting2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cys9wj1ci() throws Exception{try{__CLR4_5_21bs1bslvn1n6cq.R.inc(1746);
        // not supported by the BasicParser
    }finally{__CLR4_5_21bs1bslvn1n6cq.R.flushNeeded();}}
}
