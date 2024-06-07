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

public class OptionBuilderTest extends TestCase {static class __CLR4_5_21dx1dxlvn1lj4z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521104441L,8589935092L,1855,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void testCompleteOption( ) {__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceStart(getClass().getName(),1797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2le1bif1dx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dx1dxlvn1lj4z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testCompleteOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1797,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2le1bif1dx( ){try{__CLR4_5_21dx1dxlvn1lj4z.R.inc(1797);
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1798);Option simple = OptionBuilder.withLongOpt( "simple option")
                                     .hasArg( )
                                     .isRequired( )
                                     .hasArgs( )
                                     .withType( new Float( 10 ) )
                                     .withDescription( "this is a simple option" )
                                     .create( 's' );

        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1799);assertEquals( "s", simple.getOpt() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1800);assertEquals( "simple option", simple.getLongOpt() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1801);assertEquals( "this is a simple option", simple.getDescription() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1802);assertEquals( simple.getType().getClass(), Float.class );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1803);assertTrue( simple.hasArg() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1804);assertTrue( simple.isRequired() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1805);assertTrue( simple.hasArgs() );
    }finally{__CLR4_5_21dx1dxlvn1lj4z.R.flushNeeded();}}

    public void testTwoCompleteOptions( ) {__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceStart(getClass().getName(),1806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21zq7ce1e6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dx1dxlvn1lj4z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testTwoCompleteOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21zq7ce1e6( ){try{__CLR4_5_21dx1dxlvn1lj4z.R.inc(1806);
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1807);Option simple = OptionBuilder.withLongOpt( "simple option")
                                     .hasArg( )
                                     .isRequired( )
                                     .hasArgs( )
                                     .withType( new Float( 10 ) )
                                     .withDescription( "this is a simple option" )
                                     .create( 's' );

        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1808);assertEquals( "s", simple.getOpt() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1809);assertEquals( "simple option", simple.getLongOpt() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1810);assertEquals( "this is a simple option", simple.getDescription() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1811);assertEquals( simple.getType().getClass(), Float.class );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1812);assertTrue( simple.hasArg() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1813);assertTrue( simple.isRequired() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1814);assertTrue( simple.hasArgs() );

        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1815);simple = OptionBuilder.withLongOpt( "dimple option")
                              .hasArg( )
                              .withDescription( "this is a dimple option" )
                              .create( 'd' );

        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1816);assertEquals( "d", simple.getOpt() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1817);assertEquals( "dimple option", simple.getLongOpt() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1818);assertEquals( "this is a dimple option", simple.getDescription() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1819);assertNull( simple.getType() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1820);assertTrue( simple.hasArg() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1821);assertTrue( !simple.isRequired() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1822);assertTrue( !simple.hasArgs() );
    }finally{__CLR4_5_21dx1dxlvn1lj4z.R.flushNeeded();}}

    public void testBaseOptionCharOpt() {__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceStart(getClass().getName(),1823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qwo89g1en();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dx1dxlvn1lj4z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testBaseOptionCharOpt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qwo89g1en(){try{__CLR4_5_21dx1dxlvn1lj4z.R.inc(1823);
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1824);Option base = OptionBuilder.withDescription( "option description")
                                   .create( 'o' );

        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1825);assertEquals( "o", base.getOpt() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1826);assertEquals( "option description", base.getDescription() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1827);assertTrue( !base.hasArg() );
    }finally{__CLR4_5_21dx1dxlvn1lj4z.R.flushNeeded();}}

    public void testBaseOptionStringOpt() {__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceStart(getClass().getName(),1828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbd5v51es();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dx1dxlvn1lj4z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testBaseOptionStringOpt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbd5v51es(){try{__CLR4_5_21dx1dxlvn1lj4z.R.inc(1828);
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1829);Option base = OptionBuilder.withDescription( "option description")
                                   .create( "o" );

        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1830);assertEquals( "o", base.getOpt() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1831);assertEquals( "option description", base.getDescription() );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1832);assertTrue( !base.hasArg() );
    }finally{__CLR4_5_21dx1dxlvn1lj4z.R.flushNeeded();}}

    public void testSpecialOptChars() throws Exception
    {__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceStart(getClass().getName(),1833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z4tmuw1ex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dx1dxlvn1lj4z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testSpecialOptChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1833,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z4tmuw1ex() throws Exception{try{__CLR4_5_21dx1dxlvn1lj4z.R.inc(1833);
        // '?'
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1834);Option opt1 = OptionBuilder.withDescription("help options").create('?');
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1835);assertEquals("?", opt1.getOpt());

        // '@'
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1836);Option opt2 = OptionBuilder.withDescription("read from stdin").create('@');
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1837);assertEquals("@", opt2.getOpt());
    }finally{__CLR4_5_21dx1dxlvn1lj4z.R.flushNeeded();}}

    public void testOptionArgNumbers()
    {__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceStart(getClass().getName(),1838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicvsy1f2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dx1dxlvn1lj4z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testOptionArgNumbers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1838,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicvsy1f2(){try{__CLR4_5_21dx1dxlvn1lj4z.R.inc(1838);
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1839);Option opt = OptionBuilder.withDescription( "option description" )
                                  .hasArgs( 2 )
                                  .create( 'o' );
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1840);assertEquals( 2, opt.getArgs() );
    }finally{__CLR4_5_21dx1dxlvn1lj4z.R.flushNeeded();}}

    public void testIllegalOptions() {__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceStart(getClass().getName(),1841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_270z79b1f5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dx1dxlvn1lj4z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testIllegalOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_270z79b1f5(){try{__CLR4_5_21dx1dxlvn1lj4z.R.inc(1841);
        // bad single character option
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1842);try {
            __CLR4_5_21dx1dxlvn1lj4z.R.inc(1843);OptionBuilder.withDescription( "option description" ).create( '"' );
            __CLR4_5_21dx1dxlvn1lj4z.R.inc(1844);fail( "IllegalArgumentException not caught" );
        }
        catch( IllegalArgumentException exp ) {
            // success
        }

        // bad character in option string
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1845);try {
            __CLR4_5_21dx1dxlvn1lj4z.R.inc(1846);Option opt = OptionBuilder.create( "opt`" );
            __CLR4_5_21dx1dxlvn1lj4z.R.inc(1847);fail( "IllegalArgumentException not caught" );
        }
        catch( IllegalArgumentException exp ) {
            // success
        }

        // valid option 
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1848);try {
            __CLR4_5_21dx1dxlvn1lj4z.R.inc(1849);Option opt = OptionBuilder.create( "opt" );
            // success
        }
        catch( IllegalArgumentException exp ) {
            __CLR4_5_21dx1dxlvn1lj4z.R.inc(1850);fail( "IllegalArgumentException caught" );
        }
    }finally{__CLR4_5_21dx1dxlvn1lj4z.R.flushNeeded();}}

    public void testCreateIncompleteOption() {__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceStart(getClass().getName(),1851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocx8fc1ff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dx1dxlvn1lj4z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dx1dxlvn1lj4z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testCreateIncompleteOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1851,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocx8fc1ff(){try{__CLR4_5_21dx1dxlvn1lj4z.R.inc(1851);
        __CLR4_5_21dx1dxlvn1lj4z.R.inc(1852);try
        {
            __CLR4_5_21dx1dxlvn1lj4z.R.inc(1853);OptionBuilder.hasArg().create();
            __CLR4_5_21dx1dxlvn1lj4z.R.inc(1854);fail("Incomplete option should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }finally{__CLR4_5_21dx1dxlvn1lj4z.R.flushNeeded();}}
}
