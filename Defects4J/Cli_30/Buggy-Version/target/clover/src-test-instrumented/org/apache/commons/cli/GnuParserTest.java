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

public class GnuParserTest extends ParserTestCase
{static class __CLR4_5_21jp1jplvn1neox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521191983L,8589935092L,2029,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void setUp()
    {try{__CLR4_5_21jp1jplvn1neox.R.inc(2005);
        __CLR4_5_21jp1jplvn1neox.R.inc(2006);super.setUp();
        __CLR4_5_21jp1jplvn1neox.R.inc(2007);parser = new GnuParser();
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testDoubleDash2() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xew1bw1js();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testDoubleDash2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2008,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xew1bw1js() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2008);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}
    
    public void testLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnksl1jt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnksl1jt() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2009);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testAmbiguousLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ppu6b1ju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testAmbiguousLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2010,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ppu6b1ju() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2010);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testNegativeOption() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kw2kj1jv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testNegativeOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kw2kj1jv() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2011);
        // not supported by the GnuParser (CLI-184)
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testLongWithUnexpectedArgument1() throws Exception 
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28r28vq1jw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testLongWithUnexpectedArgument1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2012,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28r28vq1jw() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2012);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testLongWithUnexpectedArgument2() throws Exception 
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c027o71jx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testLongWithUnexpectedArgument2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2013,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c027o71jx() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2013);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testShortWithUnexpectedArgument() throws Exception 
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bkns1x1jy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testShortWithUnexpectedArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2014,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bkns1x1jy() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2014);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption1() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tpjutj1jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testUnambiguousPartialLongOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tpjutj1jz() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2015);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption2() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wyjtm01k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testUnambiguousPartialLongOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2016,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wyjtm01k0() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2016);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption3() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytk9kn1k1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testUnambiguousPartialLongOption3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2017,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytk9kn1k1() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2017);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption4() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkkas61k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testUnambiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkkas61k2() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2018);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption1() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2ixr41k3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testAmbiguousPartialLongOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2019,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2ixr41k3() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2019);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption2() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sbiwjl1k4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testAmbiguousPartialLongOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sbiwjl1k4() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2020);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

   public void testAmbiguousPartialLongOption3() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkivc21k5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testAmbiguousPartialLongOption3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2021,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkivc21k5() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2021);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption4() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytiu4j1k6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testAmbiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytiu4j1k6() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2022);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testPartialLongOptionSingleDash() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcd5i91k7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testPartialLongOptionSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2023,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcd5i91k7() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2023);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testBursting() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g4pqkl1k8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g4pqkl1k8() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2024);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testUnrecognizedOptionWithBursting() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23fy8u31k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testUnrecognizedOptionWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2025,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23fy8u31k9() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2025);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testMissingArgWithBursting() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26h2akx1ka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testMissingArgWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2026,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26h2akx1ka() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2026);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testStopBursting() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zby38j1kb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testStopBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zby38j1kb() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2027);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}

    public void testStopBursting2() throws Exception
    {__CLR4_5_21jp1jplvn1neox.R.globalSliceStart(getClass().getName(),2028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cys9wj1kc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jp1jplvn1neox.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jp1jplvn1neox.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testStopBursting2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cys9wj1kc() throws Exception{try{__CLR4_5_21jp1jplvn1neox.R.inc(2028);
        // not supported by the GnuParser
    }finally{__CLR4_5_21jp1jplvn1neox.R.flushNeeded();}}
}
