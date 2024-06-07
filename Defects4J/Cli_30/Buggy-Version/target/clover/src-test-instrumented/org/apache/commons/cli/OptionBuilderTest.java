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

public class OptionBuilderTest extends TestCase {static class __CLR4_5_21r91r9lvn1newf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521191983L,8589935092L,2348,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void testCompleteOption( ) {__CLR4_5_21r91r9lvn1newf.R.globalSliceStart(getClass().getName(),2277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2le1bif1r9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r91r9lvn1newf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r91r9lvn1newf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testCompleteOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2le1bif1r9( ){try{__CLR4_5_21r91r9lvn1newf.R.inc(2277);
        __CLR4_5_21r91r9lvn1newf.R.inc(2278);Option simple = OptionBuilder.withLongOpt( "simple option")
                                     .hasArg( )
                                     .isRequired( )
                                     .hasArgs( )
                                     .withType( new Float( 10 ) )
                                     .withDescription( "this is a simple option" )
                                     .create( 's' );

        __CLR4_5_21r91r9lvn1newf.R.inc(2279);assertEquals( "s", simple.getOpt() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2280);assertEquals( "simple option", simple.getLongOpt() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2281);assertEquals( "this is a simple option", simple.getDescription() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2282);assertEquals( simple.getType().getClass(), Float.class );
        __CLR4_5_21r91r9lvn1newf.R.inc(2283);assertTrue( simple.hasArg() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2284);assertTrue( simple.isRequired() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2285);assertTrue( simple.hasArgs() );
    }finally{__CLR4_5_21r91r9lvn1newf.R.flushNeeded();}}

    public void testTwoCompleteOptions( ) {__CLR4_5_21r91r9lvn1newf.R.globalSliceStart(getClass().getName(),2286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21zq7ce1ri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r91r9lvn1newf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r91r9lvn1newf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testTwoCompleteOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2286,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21zq7ce1ri( ){try{__CLR4_5_21r91r9lvn1newf.R.inc(2286);
        __CLR4_5_21r91r9lvn1newf.R.inc(2287);Option simple = OptionBuilder.withLongOpt( "simple option")
                                     .hasArg( )
                                     .isRequired( )
                                     .hasArgs( )
                                     .withType( new Float( 10 ) )
                                     .withDescription( "this is a simple option" )
                                     .create( 's' );

        __CLR4_5_21r91r9lvn1newf.R.inc(2288);assertEquals( "s", simple.getOpt() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2289);assertEquals( "simple option", simple.getLongOpt() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2290);assertEquals( "this is a simple option", simple.getDescription() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2291);assertEquals( simple.getType().getClass(), Float.class );
        __CLR4_5_21r91r9lvn1newf.R.inc(2292);assertTrue( simple.hasArg() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2293);assertTrue( simple.isRequired() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2294);assertTrue( simple.hasArgs() );

        __CLR4_5_21r91r9lvn1newf.R.inc(2295);simple = OptionBuilder.withLongOpt( "dimple option")
                              .hasArg( )
                              .withDescription( "this is a dimple option" )
                              .create( 'd' );

        __CLR4_5_21r91r9lvn1newf.R.inc(2296);assertEquals( "d", simple.getOpt() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2297);assertEquals( "dimple option", simple.getLongOpt() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2298);assertEquals( "this is a dimple option", simple.getDescription() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2299);assertNull( simple.getType() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2300);assertTrue( simple.hasArg() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2301);assertTrue( !simple.isRequired() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2302);assertTrue( !simple.hasArgs() );
    }finally{__CLR4_5_21r91r9lvn1newf.R.flushNeeded();}}

    public void testBaseOptionCharOpt() {__CLR4_5_21r91r9lvn1newf.R.globalSliceStart(getClass().getName(),2303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qwo89g1rz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r91r9lvn1newf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r91r9lvn1newf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testBaseOptionCharOpt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qwo89g1rz(){try{__CLR4_5_21r91r9lvn1newf.R.inc(2303);
        __CLR4_5_21r91r9lvn1newf.R.inc(2304);Option base = OptionBuilder.withDescription( "option description")
                                   .create( 'o' );

        __CLR4_5_21r91r9lvn1newf.R.inc(2305);assertEquals( "o", base.getOpt() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2306);assertEquals( "option description", base.getDescription() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2307);assertTrue( !base.hasArg() );
    }finally{__CLR4_5_21r91r9lvn1newf.R.flushNeeded();}}

    public void testBaseOptionStringOpt() {__CLR4_5_21r91r9lvn1newf.R.globalSliceStart(getClass().getName(),2308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbd5v51s4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r91r9lvn1newf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r91r9lvn1newf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testBaseOptionStringOpt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2308,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbd5v51s4(){try{__CLR4_5_21r91r9lvn1newf.R.inc(2308);
        __CLR4_5_21r91r9lvn1newf.R.inc(2309);Option base = OptionBuilder.withDescription( "option description")
                                   .create( "o" );

        __CLR4_5_21r91r9lvn1newf.R.inc(2310);assertEquals( "o", base.getOpt() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2311);assertEquals( "option description", base.getDescription() );
        __CLR4_5_21r91r9lvn1newf.R.inc(2312);assertTrue( !base.hasArg() );
    }finally{__CLR4_5_21r91r9lvn1newf.R.flushNeeded();}}

    public void testSpecialOptChars() throws Exception
    {__CLR4_5_21r91r9lvn1newf.R.globalSliceStart(getClass().getName(),2313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z4tmuw1s9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r91r9lvn1newf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r91r9lvn1newf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testSpecialOptChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z4tmuw1s9() throws Exception{try{__CLR4_5_21r91r9lvn1newf.R.inc(2313);
        // '?'
        __CLR4_5_21r91r9lvn1newf.R.inc(2314);Option opt1 = OptionBuilder.withDescription("help options").create('?');
        __CLR4_5_21r91r9lvn1newf.R.inc(2315);assertEquals("?", opt1.getOpt());

        // '@'
        __CLR4_5_21r91r9lvn1newf.R.inc(2316);Option opt2 = OptionBuilder.withDescription("read from stdin").create('@');
        __CLR4_5_21r91r9lvn1newf.R.inc(2317);assertEquals("@", opt2.getOpt());
        
        // ' '
        __CLR4_5_21r91r9lvn1newf.R.inc(2318);try {
            __CLR4_5_21r91r9lvn1newf.R.inc(2319);OptionBuilder.create(' ');
            __CLR4_5_21r91r9lvn1newf.R.inc(2320);fail( "IllegalArgumentException not caught" );            
        } catch (IllegalArgumentException e) {
            // success
        }
    }finally{__CLR4_5_21r91r9lvn1newf.R.flushNeeded();}}

    public void testOptionArgNumbers()
    {__CLR4_5_21r91r9lvn1newf.R.globalSliceStart(getClass().getName(),2321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicvsy1sh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r91r9lvn1newf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r91r9lvn1newf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testOptionArgNumbers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicvsy1sh(){try{__CLR4_5_21r91r9lvn1newf.R.inc(2321);
        __CLR4_5_21r91r9lvn1newf.R.inc(2322);Option opt = OptionBuilder.withDescription( "option description" )
                                  .hasArgs( 2 )
                                  .create( 'o' );
        __CLR4_5_21r91r9lvn1newf.R.inc(2323);assertEquals( 2, opt.getArgs() );
    }finally{__CLR4_5_21r91r9lvn1newf.R.flushNeeded();}}

    public void testIllegalOptions() {__CLR4_5_21r91r9lvn1newf.R.globalSliceStart(getClass().getName(),2324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_270z79b1sk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r91r9lvn1newf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r91r9lvn1newf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testIllegalOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2324,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_270z79b1sk(){try{__CLR4_5_21r91r9lvn1newf.R.inc(2324);
        // bad single character option
        __CLR4_5_21r91r9lvn1newf.R.inc(2325);try {
            __CLR4_5_21r91r9lvn1newf.R.inc(2326);OptionBuilder.withDescription( "option description" ).create( '"' );
            __CLR4_5_21r91r9lvn1newf.R.inc(2327);fail( "IllegalArgumentException not caught" );
        }
        catch( IllegalArgumentException exp ) {
            // success
        }

        // bad character in option string
        __CLR4_5_21r91r9lvn1newf.R.inc(2328);try {
            __CLR4_5_21r91r9lvn1newf.R.inc(2329);Option opt = OptionBuilder.create( "opt`" );
            __CLR4_5_21r91r9lvn1newf.R.inc(2330);fail( "IllegalArgumentException not caught" );
        }
        catch( IllegalArgumentException exp ) {
            // success
        }

        // valid option 
        __CLR4_5_21r91r9lvn1newf.R.inc(2331);try {
            __CLR4_5_21r91r9lvn1newf.R.inc(2332);Option opt = OptionBuilder.create( "opt" );
            // success
        }
        catch( IllegalArgumentException exp ) {
            __CLR4_5_21r91r9lvn1newf.R.inc(2333);fail( "IllegalArgumentException caught" );
        }
    }finally{__CLR4_5_21r91r9lvn1newf.R.flushNeeded();}}

    public void testCreateIncompleteOption() {__CLR4_5_21r91r9lvn1newf.R.globalSliceStart(getClass().getName(),2334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocx8fc1su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r91r9lvn1newf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r91r9lvn1newf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testCreateIncompleteOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2334,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocx8fc1su(){try{__CLR4_5_21r91r9lvn1newf.R.inc(2334);
        __CLR4_5_21r91r9lvn1newf.R.inc(2335);try
        {
            __CLR4_5_21r91r9lvn1newf.R.inc(2336);OptionBuilder.hasArg().create();
            __CLR4_5_21r91r9lvn1newf.R.inc(2337);fail("Incomplete option should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
            
            // implicitly reset the builder
            __CLR4_5_21r91r9lvn1newf.R.inc(2338);OptionBuilder.create( "opt" );
        }
    }finally{__CLR4_5_21r91r9lvn1newf.R.flushNeeded();}}

    public void testBuilderIsResettedAlways() {__CLR4_5_21r91r9lvn1newf.R.globalSliceStart(getClass().getName(),2339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2suwaqb1sz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r91r9lvn1newf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r91r9lvn1newf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionBuilderTest.testBuilderIsResettedAlways",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2339,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2suwaqb1sz(){try{__CLR4_5_21r91r9lvn1newf.R.inc(2339);
        __CLR4_5_21r91r9lvn1newf.R.inc(2340);try
        {
            __CLR4_5_21r91r9lvn1newf.R.inc(2341);OptionBuilder.withDescription("JUnit").create('"');
            __CLR4_5_21r91r9lvn1newf.R.inc(2342);fail("IllegalArgumentException expected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
        __CLR4_5_21r91r9lvn1newf.R.inc(2343);assertNull("we inherited a description", OptionBuilder.create('x').getDescription());

        __CLR4_5_21r91r9lvn1newf.R.inc(2344);try
        {
            __CLR4_5_21r91r9lvn1newf.R.inc(2345);OptionBuilder.withDescription("JUnit").create();
            __CLR4_5_21r91r9lvn1newf.R.inc(2346);fail("IllegalArgumentException expected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
        __CLR4_5_21r91r9lvn1newf.R.inc(2347);assertNull("we inherited a description", OptionBuilder.create('x').getDescription());
    }finally{__CLR4_5_21r91r9lvn1newf.R.flushNeeded();}}
}
