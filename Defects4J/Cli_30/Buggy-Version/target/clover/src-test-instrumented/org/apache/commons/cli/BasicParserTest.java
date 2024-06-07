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
{static class __CLR4_5_21co1colvn1nen2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521191983L,8589935092L,1779,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void setUp()
    {try{__CLR4_5_21co1colvn1nen2.R.inc(1752);
        __CLR4_5_21co1colvn1nen2.R.inc(1753);super.setUp();
        __CLR4_5_21co1colvn1nen2.R.inc(1754);parser = new BasicParser();
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testDoubleDash2() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xew1bw1cr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testDoubleDash2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xew1bw1cr() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1755);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnksl1cs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1756,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnksl1cs() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1756);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}
    
    public void testAmbiguousLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ppu6b1ct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testAmbiguousLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1757,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ppu6b1ct() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1757);
        // not supported by the basicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}
    
    public void testNegativeOption() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kw2kj1cu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testNegativeOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kw2kj1cu() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1758);
        // not supported by the BasicParser (CLI-184)
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testPropertiesOption1() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m4t5zy1cv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testPropertiesOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1759,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m4t5zy1cv() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1759);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testPropertiesOption2() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pdt4sf1cw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testPropertiesOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pdt4sf1cw() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1760);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}    

    public void testShortWithEqual() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohwzdh1cx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testShortWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1761,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohwzdh1cx() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1761);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testShortWithoutEqual() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se6war1cy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testShortWithoutEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se6war1cy() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1762);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testLongWithEqualDoubleDash() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21degsq1cz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testLongWithEqualDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21degsq1cz() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1763);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testLongWithEqualSingleDash() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qootr51d0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testLongWithEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1764,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qootr51d0() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1764);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}
    
    public void testUnambiguousPartialLongOption1() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tpjutj1d1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testUnambiguousPartialLongOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tpjutj1d1() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1765);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption2() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wyjtm01d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testUnambiguousPartialLongOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1766,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wyjtm01d2() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1766);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption3() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytk9kn1d3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testUnambiguousPartialLongOption3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytk9kn1d3() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1767);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption4() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkkas61d4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testUnambiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1768,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkkas61d4() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1768);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption1() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2ixr41d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testAmbiguousPartialLongOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2ixr41d5() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1769);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption2() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sbiwjl1d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testAmbiguousPartialLongOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sbiwjl1d6() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1770);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption3() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkivc21d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testAmbiguousPartialLongOption3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkivc21d7() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1771);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption4() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytiu4j1d8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testAmbiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytiu4j1d8() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1772);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testPartialLongOptionSingleDash() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcd5i91d9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testPartialLongOptionSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1773,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcd5i91d9() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1773);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testBursting() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g4pqkl1da();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1774,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g4pqkl1da() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1774);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testUnrecognizedOptionWithBursting() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23fy8u31db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testUnrecognizedOptionWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23fy8u31db() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1775);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testMissingArgWithBursting() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26h2akx1dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testMissingArgWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1776,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26h2akx1dc() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1776);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testStopBursting() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zby38j1dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testStopBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zby38j1dd() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1777);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}

    public void testStopBursting2() throws Exception
    {__CLR4_5_21co1colvn1nen2.R.globalSliceStart(getClass().getName(),1778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cys9wj1de();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21co1colvn1nen2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21co1colvn1nen2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BasicParserTest.testStopBursting2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cys9wj1de() throws Exception{try{__CLR4_5_21co1colvn1nen2.R.inc(1778);
        // not supported by the BasicParser
    }finally{__CLR4_5_21co1colvn1nen2.R.flushNeeded();}}
}
