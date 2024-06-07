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

public class OptionBuilderTest extends TestCase {static class __CLR4_5_21gk1gklvkk1tew{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370698324L,8589935092L,1950,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void testCompleteOption( ) {__CLR4_5_21gk1gklvkk1tew.R.globalSliceStart(getClass().getName(),1892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2le1bif1gk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gk1gklvkk1tew.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gk1gklvkk1tew.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testCompleteOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2le1bif1gk( ){try{__CLR4_5_21gk1gklvkk1tew.R.inc(1892);
        __CLR4_5_21gk1gklvkk1tew.R.inc(1893);Option simple = OptionBuilder.withLongOpt( "simple option")
                                     .hasArg( )
                                     .isRequired( )
                                     .hasArgs( )
                                     .withType( new Float( 10 ) )
                                     .withDescription( "this is a simple option" )
                                     .create( 's' );

        __CLR4_5_21gk1gklvkk1tew.R.inc(1894);assertEquals( "s", simple.getOpt() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1895);assertEquals( "simple option", simple.getLongOpt() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1896);assertEquals( "this is a simple option", simple.getDescription() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1897);assertEquals( simple.getType().getClass(), Float.class );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1898);assertTrue( simple.hasArg() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1899);assertTrue( simple.isRequired() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1900);assertTrue( simple.hasArgs() );
    }finally{__CLR4_5_21gk1gklvkk1tew.R.flushNeeded();}}

    public void testTwoCompleteOptions( ) {__CLR4_5_21gk1gklvkk1tew.R.globalSliceStart(getClass().getName(),1901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21zq7ce1gt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gk1gklvkk1tew.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gk1gklvkk1tew.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testTwoCompleteOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21zq7ce1gt( ){try{__CLR4_5_21gk1gklvkk1tew.R.inc(1901);
        __CLR4_5_21gk1gklvkk1tew.R.inc(1902);Option simple = OptionBuilder.withLongOpt( "simple option")
                                     .hasArg( )
                                     .isRequired( )
                                     .hasArgs( )
                                     .withType( new Float( 10 ) )
                                     .withDescription( "this is a simple option" )
                                     .create( 's' );

        __CLR4_5_21gk1gklvkk1tew.R.inc(1903);assertEquals( "s", simple.getOpt() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1904);assertEquals( "simple option", simple.getLongOpt() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1905);assertEquals( "this is a simple option", simple.getDescription() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1906);assertEquals( simple.getType().getClass(), Float.class );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1907);assertTrue( simple.hasArg() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1908);assertTrue( simple.isRequired() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1909);assertTrue( simple.hasArgs() );

        __CLR4_5_21gk1gklvkk1tew.R.inc(1910);simple = OptionBuilder.withLongOpt( "dimple option")
                              .hasArg( )
                              .withDescription( "this is a dimple option" )
                              .create( 'd' );

        __CLR4_5_21gk1gklvkk1tew.R.inc(1911);assertEquals( "d", simple.getOpt() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1912);assertEquals( "dimple option", simple.getLongOpt() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1913);assertEquals( "this is a dimple option", simple.getDescription() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1914);assertNull( simple.getType() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1915);assertTrue( simple.hasArg() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1916);assertTrue( !simple.isRequired() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1917);assertTrue( !simple.hasArgs() );
    }finally{__CLR4_5_21gk1gklvkk1tew.R.flushNeeded();}}

    public void testBaseOptionCharOpt() {__CLR4_5_21gk1gklvkk1tew.R.globalSliceStart(getClass().getName(),1918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qwo89g1ha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gk1gklvkk1tew.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gk1gklvkk1tew.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testBaseOptionCharOpt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1918,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qwo89g1ha(){try{__CLR4_5_21gk1gklvkk1tew.R.inc(1918);
        __CLR4_5_21gk1gklvkk1tew.R.inc(1919);Option base = OptionBuilder.withDescription( "option description")
                                   .create( 'o' );

        __CLR4_5_21gk1gklvkk1tew.R.inc(1920);assertEquals( "o", base.getOpt() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1921);assertEquals( "option description", base.getDescription() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1922);assertTrue( !base.hasArg() );
    }finally{__CLR4_5_21gk1gklvkk1tew.R.flushNeeded();}}

    public void testBaseOptionStringOpt() {__CLR4_5_21gk1gklvkk1tew.R.globalSliceStart(getClass().getName(),1923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbd5v51hf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gk1gklvkk1tew.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gk1gklvkk1tew.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testBaseOptionStringOpt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1923,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbd5v51hf(){try{__CLR4_5_21gk1gklvkk1tew.R.inc(1923);
        __CLR4_5_21gk1gklvkk1tew.R.inc(1924);Option base = OptionBuilder.withDescription( "option description")
                                   .create( "o" );

        __CLR4_5_21gk1gklvkk1tew.R.inc(1925);assertEquals( "o", base.getOpt() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1926);assertEquals( "option description", base.getDescription() );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1927);assertTrue( !base.hasArg() );
    }finally{__CLR4_5_21gk1gklvkk1tew.R.flushNeeded();}}

    public void testSpecialOptChars() throws Exception
    {__CLR4_5_21gk1gklvkk1tew.R.globalSliceStart(getClass().getName(),1928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z4tmuw1hk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gk1gklvkk1tew.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gk1gklvkk1tew.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testSpecialOptChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z4tmuw1hk() throws Exception{try{__CLR4_5_21gk1gklvkk1tew.R.inc(1928);
        // '?'
        __CLR4_5_21gk1gklvkk1tew.R.inc(1929);Option opt1 = OptionBuilder.withDescription("help options").create('?');
        __CLR4_5_21gk1gklvkk1tew.R.inc(1930);assertEquals("?", opt1.getOpt());

        // '@'
        __CLR4_5_21gk1gklvkk1tew.R.inc(1931);Option opt2 = OptionBuilder.withDescription("read from stdin").create('@');
        __CLR4_5_21gk1gklvkk1tew.R.inc(1932);assertEquals("@", opt2.getOpt());
    }finally{__CLR4_5_21gk1gklvkk1tew.R.flushNeeded();}}

    public void testOptionArgNumbers()
    {__CLR4_5_21gk1gklvkk1tew.R.globalSliceStart(getClass().getName(),1933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicvsy1hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gk1gklvkk1tew.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gk1gklvkk1tew.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testOptionArgNumbers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1933,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicvsy1hp(){try{__CLR4_5_21gk1gklvkk1tew.R.inc(1933);
        __CLR4_5_21gk1gklvkk1tew.R.inc(1934);Option opt = OptionBuilder.withDescription( "option description" )
                                  .hasArgs( 2 )
                                  .create( 'o' );
        __CLR4_5_21gk1gklvkk1tew.R.inc(1935);assertEquals( 2, opt.getArgs() );
    }finally{__CLR4_5_21gk1gklvkk1tew.R.flushNeeded();}}

    public void testIllegalOptions() {__CLR4_5_21gk1gklvkk1tew.R.globalSliceStart(getClass().getName(),1936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_270z79b1hs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gk1gklvkk1tew.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gk1gklvkk1tew.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testIllegalOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_270z79b1hs(){try{__CLR4_5_21gk1gklvkk1tew.R.inc(1936);
        // bad single character option
        __CLR4_5_21gk1gklvkk1tew.R.inc(1937);try {
            __CLR4_5_21gk1gklvkk1tew.R.inc(1938);OptionBuilder.withDescription( "option description" ).create( '"' );
            __CLR4_5_21gk1gklvkk1tew.R.inc(1939);fail( "IllegalArgumentException not caught" );
        }
        catch( IllegalArgumentException exp ) {
            // success
        }

        // bad character in option string
        __CLR4_5_21gk1gklvkk1tew.R.inc(1940);try {
            __CLR4_5_21gk1gklvkk1tew.R.inc(1941);Option opt = OptionBuilder.create( "opt`" );
            __CLR4_5_21gk1gklvkk1tew.R.inc(1942);fail( "IllegalArgumentException not caught" );
        }
        catch( IllegalArgumentException exp ) {
            // success
        }

        // valid option 
        __CLR4_5_21gk1gklvkk1tew.R.inc(1943);try {
            __CLR4_5_21gk1gklvkk1tew.R.inc(1944);Option opt = OptionBuilder.create( "opt" );
            // success
        }
        catch( IllegalArgumentException exp ) {
            __CLR4_5_21gk1gklvkk1tew.R.inc(1945);fail( "IllegalArgumentException caught" );
        }
    }finally{__CLR4_5_21gk1gklvkk1tew.R.flushNeeded();}}

    public void testCreateIncompleteOption() {__CLR4_5_21gk1gklvkk1tew.R.globalSliceStart(getClass().getName(),1946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocx8fc1i2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gk1gklvkk1tew.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gk1gklvkk1tew.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testCreateIncompleteOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1946,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocx8fc1i2(){try{__CLR4_5_21gk1gklvkk1tew.R.inc(1946);
        __CLR4_5_21gk1gklvkk1tew.R.inc(1947);try
        {
            __CLR4_5_21gk1gklvkk1tew.R.inc(1948);OptionBuilder.hasArg().create();
            __CLR4_5_21gk1gklvkk1tew.R.inc(1949);fail("Incomplete option should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }finally{__CLR4_5_21gk1gklvkk1tew.R.flushNeeded();}}
}
