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

/**
 * @author John Keyes (john at integralsource.com)
 * @version $Revision$
 */
public class ParseRequiredTest extends TestCase
{static class __CLR4_5_21ou1oulvkk1tl5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370698324L,8589935092L,2232,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options _options = null;
    private CommandLineParser parser = new PosixParser();

    public void setUp()
    {try{__CLR4_5_21ou1oulvkk1tl5.R.inc(2190);
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2191);_options = new Options()
            .addOption("a",
                       "enable-a",
                       false,
                       "turn [a] on or off")
            .addOption( OptionBuilder.withLongOpt( "bfile" )
                                     .hasArg()
                                     .isRequired()
                                     .withDescription( "set the value of [b]" )
                                     .create( 'b' ) );
    }finally{__CLR4_5_21ou1oulvkk1tl5.R.flushNeeded();}}

    public void testWithRequiredOption() throws Exception
    {__CLR4_5_21ou1oulvkk1tl5.R.globalSliceStart(getClass().getName(),2192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29lagml1ow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ou1oulvkk1tl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ou1oulvkk1tl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParseRequiredTest.testWithRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2192,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29lagml1ow() throws Exception{try{__CLR4_5_21ou1oulvkk1tl5.R.inc(2192);
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2193);String[] args = new String[] {  "-b", "file" };

        __CLR4_5_21ou1oulvkk1tl5.R.inc(2194);CommandLine cl = parser.parse(_options,args);

        __CLR4_5_21ou1oulvkk1tl5.R.inc(2195);assertTrue( "Confirm -a is NOT set", !cl.hasOption("a") );
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2196);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2197);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("file") );
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2198);assertTrue( "Confirm NO of extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21ou1oulvkk1tl5.R.flushNeeded();}}

    public void testOptionAndRequiredOption() throws Exception
    {__CLR4_5_21ou1oulvkk1tl5.R.globalSliceStart(getClass().getName(),2199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_282kgvp1p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ou1oulvkk1tl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ou1oulvkk1tl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParseRequiredTest.testOptionAndRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_282kgvp1p3() throws Exception{try{__CLR4_5_21ou1oulvkk1tl5.R.inc(2199);
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2200);String[] args = new String[] {  "-a", "-b", "file" };

        __CLR4_5_21ou1oulvkk1tl5.R.inc(2201);CommandLine cl = parser.parse(_options,args);

        __CLR4_5_21ou1oulvkk1tl5.R.inc(2202);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2203);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2204);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("file") );
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2205);assertTrue( "Confirm NO of extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21ou1oulvkk1tl5.R.flushNeeded();}}

    public void testMissingRequiredOption()
    {__CLR4_5_21ou1oulvkk1tl5.R.globalSliceStart(getClass().getName(),2206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g6vokx1pa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ou1oulvkk1tl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ou1oulvkk1tl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParseRequiredTest.testMissingRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2206,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g6vokx1pa(){try{__CLR4_5_21ou1oulvkk1tl5.R.inc(2206);
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2207);String[] args = new String[] { "-a" };

        __CLR4_5_21ou1oulvkk1tl5.R.inc(2208);try
        {
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2209);CommandLine cl = parser.parse(_options,args);
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2210);fail( "exception should have been thrown" );
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2211);assertEquals( "Incorrect exception message", "Missing required option: b", e.getMessage() );
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2212);assertTrue(e.getMissingOptions().contains("b"));
        }
        catch (ParseException e)
        {
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2213);fail( "expected to catch MissingOptionException" );
        }
    }finally{__CLR4_5_21ou1oulvkk1tl5.R.flushNeeded();}}

    public void testMissingRequiredOptions()
    {__CLR4_5_21ou1oulvkk1tl5.R.globalSliceStart(getClass().getName(),2214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ysjy261pi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ou1oulvkk1tl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ou1oulvkk1tl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParseRequiredTest.testMissingRequiredOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ysjy261pi(){try{__CLR4_5_21ou1oulvkk1tl5.R.inc(2214);
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2215);String[] args = new String[] { "-a" };

        __CLR4_5_21ou1oulvkk1tl5.R.inc(2216);_options.addOption( OptionBuilder.withLongOpt( "cfile" )
                                     .hasArg()
                                     .isRequired()
                                     .withDescription( "set the value of [c]" )
                                     .create( 'c' ) );

        __CLR4_5_21ou1oulvkk1tl5.R.inc(2217);try
        {
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2218);CommandLine cl = parser.parse(_options,args);
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2219);fail( "exception should have been thrown" );
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2220);assertEquals( "Incorrect exception message", "Missing required options: b, c", e.getMessage() );
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2221);assertTrue(e.getMissingOptions().contains("b"));
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2222);assertTrue(e.getMissingOptions().contains("c"));
        }
        catch (ParseException e)
        {
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2223);fail( "expected to catch MissingOptionException" );
        }
    }finally{__CLR4_5_21ou1oulvkk1tl5.R.flushNeeded();}}

    public void testReuseOptionsTwice() throws Exception
    {__CLR4_5_21ou1oulvkk1tl5.R.globalSliceStart(getClass().getName(),2224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kv5yb11ps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ou1oulvkk1tl5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ou1oulvkk1tl5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParseRequiredTest.testReuseOptionsTwice",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2224,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kv5yb11ps() throws Exception{try{__CLR4_5_21ou1oulvkk1tl5.R.inc(2224);
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2225);Options opts = new Options();
		__CLR4_5_21ou1oulvkk1tl5.R.inc(2226);opts.addOption(OptionBuilder.isRequired().create('v'));

		__CLR4_5_21ou1oulvkk1tl5.R.inc(2227);GnuParser parser = new GnuParser();

        // first parsing
        __CLR4_5_21ou1oulvkk1tl5.R.inc(2228);parser.parse(opts, new String[] { "-v" });

        __CLR4_5_21ou1oulvkk1tl5.R.inc(2229);try
        {
            // second parsing, with the same Options instance and an invalid command line
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2230);parser.parse(opts, new String[0]);
            __CLR4_5_21ou1oulvkk1tl5.R.inc(2231);fail("MissingOptionException not thrown");
        }
        catch (MissingOptionException e)
        {
            // expected
        }
    }finally{__CLR4_5_21ou1oulvkk1tl5.R.flushNeeded();}}

}
