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

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

/**
 * Abstract test case testing common parser features.
 *
 * @author Emmanuel Bourg
 * @version $Revision$, $Date$
 */
public abstract class ParserTestCase extends TestCase
{static class __CLR4_5_21n91n9lvl36y96{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402850486L,8589935092L,2269,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected Parser parser;

    protected Options options;

    public void setUp()
    {try{__CLR4_5_21n91n9lvl36y96.R.inc(2133);
        __CLR4_5_21n91n9lvl36y96.R.inc(2134);options = new Options()
            .addOption("a", "enable-a", false, "turn [a] on or off")
            .addOption("b", "bfile", true, "set the value of [b]")
            .addOption("c", "copt", false, "turn [c] on or off");
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testSimpleShort() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25gmla71nb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSimpleShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2135,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25gmla71nb() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2135);
        __CLR4_5_21n91n9lvl36y96.R.inc(2136);String[] args = new String[] { "-a",
                                       "-b", "toast",
                                       "foo", "bar" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2137);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21n91n9lvl36y96.R.inc(2138);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2139);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2140);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2141);assertTrue("Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testSimpleLong() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_283qhtz1ni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSimpleLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_283qhtz1ni() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2142);
        __CLR4_5_21n91n9lvl36y96.R.inc(2143);String[] args = new String[] { "--enable-a",
                                       "--bfile", "toast",
                                       "foo", "bar" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2144);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21n91n9lvl36y96.R.inc(2145);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21n91n9lvl36y96.R.inc(2146);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21n91n9lvl36y96.R.inc(2147);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21n91n9lvl36y96.R.inc(2148);assertTrue( "Confirm arg of --bfile", cl.getOptionValue( "bfile" ).equals( "toast" ) );
        __CLR4_5_21n91n9lvl36y96.R.inc(2149);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testMultiple() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pj8bhz1nq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMultiple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2150,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pj8bhz1nq() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2150);
        __CLR4_5_21n91n9lvl36y96.R.inc(2151);String[] args = new String[] { "-c",
                                       "foobar",
                                       "-b", "toast" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2152);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21n91n9lvl36y96.R.inc(2153);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2154);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_21n91n9lvl36y96.R.inc(2155);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_21n91n9lvl36y96.R.inc(2156);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2157);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2158);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2159);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21n91n9lvl36y96.R.inc(2160);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testMultipleWithLong() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235tfkb1o1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMultipleWithLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235tfkb1o1() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2161);
        __CLR4_5_21n91n9lvl36y96.R.inc(2162);String[] args = new String[] { "--copt",
                                       "foobar",
                                       "--bfile", "toast" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2163);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21n91n9lvl36y96.R.inc(2164);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2165);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_21n91n9lvl36y96.R.inc(2166);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_21n91n9lvl36y96.R.inc(2167);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2168);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2169);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2170);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21n91n9lvl36y96.R.inc(2171);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testUnrecognizedOption() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2grwzr71oc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnrecognizedOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2172,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2grwzr71oc() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2172);
        __CLR4_5_21n91n9lvl36y96.R.inc(2173);String[] args = new String[] { "-a", "-d", "-b", "toast", "foo", "bar" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2174);try
        {
            __CLR4_5_21n91n9lvl36y96.R.inc(2175);parser.parse(options, args);
            __CLR4_5_21n91n9lvl36y96.R.inc(2176);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21n91n9lvl36y96.R.inc(2177);assertEquals("-d", e.getOption());
        }
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}    

    public void testMissingArg() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tcx6x51oi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tcx6x51oi() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2178);
        __CLR4_5_21n91n9lvl36y96.R.inc(2179);String[] args = new String[] { "-b" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2180);boolean caught = false;

        __CLR4_5_21n91n9lvl36y96.R.inc(2181);try
        {
            __CLR4_5_21n91n9lvl36y96.R.inc(2182);parser.parse(options, args);
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_21n91n9lvl36y96.R.inc(2183);caught = true;
            __CLR4_5_21n91n9lvl36y96.R.inc(2184);assertEquals("option missing an argument", "b", e.getOption().getOpt());
        }

        __CLR4_5_21n91n9lvl36y96.R.inc(2185);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testDoubleDash() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rbuc4c1oq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2186,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rbuc4c1oq() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2186);
        __CLR4_5_21n91n9lvl36y96.R.inc(2187);String[] args = new String[] { "--copt",
                                       "--",
                                       "-b", "toast" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2188);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21n91n9lvl36y96.R.inc(2189);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2190);assertTrue("Confirm -b is not set", !cl.hasOption("b"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2191);assertTrue("Confirm 2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testSingleDash() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idzcwd1ow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2192,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idzcwd1ow() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2192);
        __CLR4_5_21n91n9lvl36y96.R.inc(2193);String[] args = new String[] { "--copt",
                                       "-b", "-",
                                       "-a",
                                       "-" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2194);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21n91n9lvl36y96.R.inc(2195);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2196);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2197);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("-"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2198);assertTrue("Confirm 1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21n91n9lvl36y96.R.inc(2199);assertTrue("Confirm value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("-"));
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testStopAtUnexpectedArg() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w2sq2t1p4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtUnexpectedArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2200,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w2sq2t1p4() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2200);
        __CLR4_5_21n91n9lvl36y96.R.inc(2201);String[] args = new String[] { "-c",
                                       "foober",
                                       "-b",
                                       "toast" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2202);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21n91n9lvl36y96.R.inc(2203);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2204);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

   public void testStopAtExpectedArg() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26fsujm1p9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtExpectedArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26fsujm1p9() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2205);
        __CLR4_5_21n91n9lvl36y96.R.inc(2206);String[] args = new String[]{"-b", "foo"};

        __CLR4_5_21n91n9lvl36y96.R.inc(2207);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_21n91n9lvl36y96.R.inc(2208);assertTrue("Confirm -b is set", cl.hasOption('b'));
        __CLR4_5_21n91n9lvl36y96.R.inc(2209);assertEquals("Confirm -b is set", "foo", cl.getOptionValue('b'));
        __CLR4_5_21n91n9lvl36y96.R.inc(2210);assertTrue("Confirm no extra args: " + cl.getArgList().size(), cl.getArgList().size() == 0);
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testStopAtNonOptionShort() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21vvp4o1pf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtNonOptionShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21vvp4o1pf() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2211);
        __CLR4_5_21n91n9lvl36y96.R.inc(2212);String[] args = new String[]{"-z",
                                     "-a",
                                     "-btoast"};

        __CLR4_5_21n91n9lvl36y96.R.inc(2213);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21n91n9lvl36y96.R.inc(2214);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2215);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testStopAtNonOptionLong() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21aqvj61pk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtNonOptionLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21aqvj61pk() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2216);
        __CLR4_5_21n91n9lvl36y96.R.inc(2217);String[] args = new String[]{"--zop==1",
                                     "-abtoast",
                                     "--b=bar"};

        __CLR4_5_21n91n9lvl36y96.R.inc(2218);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_21n91n9lvl36y96.R.inc(2219);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2220);assertFalse("Confirm -b is not set", cl.hasOption("b"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2221);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testNegativeArgument() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8jgqd1pq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testNegativeArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2222,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8jgqd1pq() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2222);
        __CLR4_5_21n91n9lvl36y96.R.inc(2223);String[] args = new String[] { "-b", "-1"} ;

        __CLR4_5_21n91n9lvl36y96.R.inc(2224);CommandLine cl = parser.parse(options, args);
        __CLR4_5_21n91n9lvl36y96.R.inc(2225);assertEquals("-1", cl.getOptionValue("b"));
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testArgumentStartingWithHyphen() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jfa361pu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testArgumentStartingWithHyphen",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jfa361pu() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2226);
        __CLR4_5_21n91n9lvl36y96.R.inc(2227);String[] args = new String[]{"-b", "-foo"};

        __CLR4_5_21n91n9lvl36y96.R.inc(2228);CommandLine cl = parser.parse(options, args);
        __CLR4_5_21n91n9lvl36y96.R.inc(2229);assertEquals("-foo", cl.getOptionValue("b"));
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testShortWithEqual() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohwzdh1py();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testShortWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohwzdh1py() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2230);
        __CLR4_5_21n91n9lvl36y96.R.inc(2231);String[] args = new String[] { "-f=bar" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2232);Options options = new Options();
        __CLR4_5_21n91n9lvl36y96.R.inc(2233);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21n91n9lvl36y96.R.inc(2234);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21n91n9lvl36y96.R.inc(2235);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testShortWithoutEqual() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se6war1q4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testShortWithoutEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se6war1q4() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2236);
        __CLR4_5_21n91n9lvl36y96.R.inc(2237);String[] args = new String[] { "-fbar" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2238);Options options = new Options();
        __CLR4_5_21n91n9lvl36y96.R.inc(2239);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21n91n9lvl36y96.R.inc(2240);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21n91n9lvl36y96.R.inc(2241);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testLongWithEqual() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23y5b951qa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2242,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23y5b951qa() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2242);
        __CLR4_5_21n91n9lvl36y96.R.inc(2243);String[] args = new String[] { "--foo=bar" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2244);Options options = new Options();
        __CLR4_5_21n91n9lvl36y96.R.inc(2245);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21n91n9lvl36y96.R.inc(2246);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21n91n9lvl36y96.R.inc(2247);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testLongWithEqualSingleDash() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qootr51qg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2248,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qootr51qg() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2248);
        __CLR4_5_21n91n9lvl36y96.R.inc(2249);String[] args = new String[] { "-foo=bar" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2250);Options options = new Options();
        __CLR4_5_21n91n9lvl36y96.R.inc(2251);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21n91n9lvl36y96.R.inc(2252);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21n91n9lvl36y96.R.inc(2253);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}

    public void testPropertiesOption() throws Exception
    {__CLR4_5_21n91n9lvl36y96.R.globalSliceStart(getClass().getName(),2254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2556ta71qm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n91n9lvl36y96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n91n9lvl36y96.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertiesOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2254,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2556ta71qm() throws Exception{try{__CLR4_5_21n91n9lvl36y96.R.inc(2254);
        __CLR4_5_21n91n9lvl36y96.R.inc(2255);String[] args = new String[] { "-Jsource=1.5", "-J", "target", "1.5", "foo" };

        __CLR4_5_21n91n9lvl36y96.R.inc(2256);Options options = new Options();
        __CLR4_5_21n91n9lvl36y96.R.inc(2257);options.addOption(OptionBuilder.withValueSeparator().hasArgs(2).create('J'));

        __CLR4_5_21n91n9lvl36y96.R.inc(2258);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21n91n9lvl36y96.R.inc(2259);List values = Arrays.asList(cl.getOptionValues("J"));
        __CLR4_5_21n91n9lvl36y96.R.inc(2260);assertNotNull("null values", values);
        __CLR4_5_21n91n9lvl36y96.R.inc(2261);assertEquals("number of values", 4, values.size());
        __CLR4_5_21n91n9lvl36y96.R.inc(2262);assertEquals("value 1", "source", values.get(0));
        __CLR4_5_21n91n9lvl36y96.R.inc(2263);assertEquals("value 2", "1.5", values.get(1));
        __CLR4_5_21n91n9lvl36y96.R.inc(2264);assertEquals("value 3", "target", values.get(2));
        __CLR4_5_21n91n9lvl36y96.R.inc(2265);assertEquals("value 4", "1.5", values.get(3));
        __CLR4_5_21n91n9lvl36y96.R.inc(2266);List argsleft = cl.getArgList();
        __CLR4_5_21n91n9lvl36y96.R.inc(2267);assertEquals("Should be 1 arg left",1,argsleft.size());
        __CLR4_5_21n91n9lvl36y96.R.inc(2268);assertEquals("Expecting foo","foo",argsleft.get(0));
    }finally{__CLR4_5_21n91n9lvl36y96.R.flushNeeded();}}
}
