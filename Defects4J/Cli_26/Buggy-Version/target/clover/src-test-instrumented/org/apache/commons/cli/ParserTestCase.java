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
{static class __CLR4_5_21om1omlvn1m5qj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0036\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521133496L,8589935092L,2318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected Parser parser;

    protected Options options;

    public void setUp()
    {try{__CLR4_5_21om1omlvn1m5qj.R.inc(2182);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2183);options = new Options()
            .addOption("a", "enable-a", false, "turn [a] on or off")
            .addOption("b", "bfile", true, "set the value of [b]")
            .addOption("c", "copt", false, "turn [c] on or off");
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testSimpleShort() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25gmla71oo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSimpleShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25gmla71oo() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2184);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2185);String[] args = new String[] { "-a",
                                       "-b", "toast",
                                       "foo", "bar" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2186);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2187);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2188);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2189);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2190);assertTrue("Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testSimpleLong() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_283qhtz1ov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSimpleLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2191,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_283qhtz1ov() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2191);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2192);String[] args = new String[] { "--enable-a",
                                       "--bfile", "toast",
                                       "foo", "bar" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2193);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2194);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21om1omlvn1m5qj.R.inc(2195);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21om1omlvn1m5qj.R.inc(2196);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21om1omlvn1m5qj.R.inc(2197);assertTrue( "Confirm arg of --bfile", cl.getOptionValue( "bfile" ).equals( "toast" ) );
        __CLR4_5_21om1omlvn1m5qj.R.inc(2198);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testMultiple() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pj8bhz1p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMultiple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pj8bhz1p3() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2199);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2200);String[] args = new String[] { "-c",
                                       "foobar",
                                       "-b", "toast" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2201);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2202);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2203);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2204);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_21om1omlvn1m5qj.R.inc(2205);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2206);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2207);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2208);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2209);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testMultipleWithLong() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235tfkb1pe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMultipleWithLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2210,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235tfkb1pe() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2210);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2211);String[] args = new String[] { "--copt",
                                       "foobar",
                                       "--bfile", "toast" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2212);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2213);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2214);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2215);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_21om1omlvn1m5qj.R.inc(2216);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2217);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2218);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2219);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2220);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testUnrecognizedOption() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2grwzr71pp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnrecognizedOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2221,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2grwzr71pp() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2221);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2222);String[] args = new String[] { "-a", "-d", "-b", "toast", "foo", "bar" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2223);try
        {
            __CLR4_5_21om1omlvn1m5qj.R.inc(2224);parser.parse(options, args);
            __CLR4_5_21om1omlvn1m5qj.R.inc(2225);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21om1omlvn1m5qj.R.inc(2226);assertEquals("-d", e.getOption());
        }
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}    

    public void testMissingArg() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tcx6x51pv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tcx6x51pv() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2227);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2228);String[] args = new String[] { "-b" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2229);boolean caught = false;

        __CLR4_5_21om1omlvn1m5qj.R.inc(2230);try
        {
            __CLR4_5_21om1omlvn1m5qj.R.inc(2231);parser.parse(options, args);
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_21om1omlvn1m5qj.R.inc(2232);caught = true;
            __CLR4_5_21om1omlvn1m5qj.R.inc(2233);assertEquals("option missing an argument", "b", e.getOption().getOpt());
        }

        __CLR4_5_21om1omlvn1m5qj.R.inc(2234);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testDoubleDash() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rbuc4c1q3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2235,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rbuc4c1q3() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2235);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2236);String[] args = new String[] { "--copt",
                                       "--",
                                       "-b", "toast" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2237);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2238);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2239);assertTrue("Confirm -b is not set", !cl.hasOption("b"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2240);assertTrue("Confirm 2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testSingleDash() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idzcwd1q9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idzcwd1q9() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2241);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2242);String[] args = new String[] { "--copt",
                                       "-b", "-",
                                       "-a",
                                       "-" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2243);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2244);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2245);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2246);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("-"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2247);assertTrue("Confirm 1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2248);assertTrue("Confirm value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("-"));
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testStopAtUnexpectedArg() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w2sq2t1qh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtUnexpectedArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2249,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w2sq2t1qh() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2249);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2250);String[] args = new String[] { "-c",
                                       "foober",
                                       "-b",
                                       "toast" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2251);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2252);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2253);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

   public void testStopAtExpectedArg() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26fsujm1qm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtExpectedArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2254,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26fsujm1qm() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2254);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2255);String[] args = new String[]{"-b", "foo"};

        __CLR4_5_21om1omlvn1m5qj.R.inc(2256);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2257);assertTrue("Confirm -b is set", cl.hasOption('b'));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2258);assertEquals("Confirm -b is set", "foo", cl.getOptionValue('b'));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2259);assertTrue("Confirm no extra args: " + cl.getArgList().size(), cl.getArgList().size() == 0);
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testStopAtNonOptionShort() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21vvp4o1qs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtNonOptionShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2260,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21vvp4o1qs() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2260);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2261);String[] args = new String[]{"-z",
                                     "-a",
                                     "-btoast"};

        __CLR4_5_21om1omlvn1m5qj.R.inc(2262);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2263);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2264);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testStopAtNonOptionLong() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21aqvj61qx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtNonOptionLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21aqvj61qx() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2265);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2266);String[] args = new String[]{"--zop==1",
                                     "-abtoast",
                                     "--b=bar"};

        __CLR4_5_21om1omlvn1m5qj.R.inc(2267);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2268);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2269);assertFalse("Confirm -b is not set", cl.hasOption("b"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2270);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testNegativeArgument() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8jgqd1r3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testNegativeArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8jgqd1r3() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2271);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2272);String[] args = new String[] { "-b", "-1"} ;

        __CLR4_5_21om1omlvn1m5qj.R.inc(2273);CommandLine cl = parser.parse(options, args);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2274);assertEquals("-1", cl.getOptionValue("b"));
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testArgumentStartingWithHyphen() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jfa361r7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testArgumentStartingWithHyphen",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2275,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jfa361r7() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2275);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2276);String[] args = new String[]{"-b", "-foo"};

        __CLR4_5_21om1omlvn1m5qj.R.inc(2277);CommandLine cl = parser.parse(options, args);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2278);assertEquals("-foo", cl.getOptionValue("b"));
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testShortWithEqual() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohwzdh1rb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testShortWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2279,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohwzdh1rb() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2279);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2280);String[] args = new String[] { "-f=bar" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2281);Options options = new Options();
        __CLR4_5_21om1omlvn1m5qj.R.inc(2282);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21om1omlvn1m5qj.R.inc(2283);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2284);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testShortWithoutEqual() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se6war1rh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testShortWithoutEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se6war1rh() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2285);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2286);String[] args = new String[] { "-fbar" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2287);Options options = new Options();
        __CLR4_5_21om1omlvn1m5qj.R.inc(2288);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21om1omlvn1m5qj.R.inc(2289);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2290);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testLongWithEqual() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23y5b951rn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2291,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23y5b951rn() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2291);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2292);String[] args = new String[] { "--foo=bar" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2293);Options options = new Options();
        __CLR4_5_21om1omlvn1m5qj.R.inc(2294);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21om1omlvn1m5qj.R.inc(2295);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2296);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testLongWithEqualSingleDash() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qootr51rt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qootr51rt() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2297);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2298);String[] args = new String[] { "-foo=bar" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2299);Options options = new Options();
        __CLR4_5_21om1omlvn1m5qj.R.inc(2300);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21om1omlvn1m5qj.R.inc(2301);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2302);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}

    public void testPropertiesOption() throws Exception
    {__CLR4_5_21om1omlvn1m5qj.R.globalSliceStart(getClass().getName(),2303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2556ta71rz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21om1omlvn1m5qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21om1omlvn1m5qj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertiesOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2556ta71rz() throws Exception{try{__CLR4_5_21om1omlvn1m5qj.R.inc(2303);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2304);String[] args = new String[] { "-Jsource=1.5", "-J", "target", "1.5", "foo" };

        __CLR4_5_21om1omlvn1m5qj.R.inc(2305);Options options = new Options();
        __CLR4_5_21om1omlvn1m5qj.R.inc(2306);options.addOption(OptionBuilder.withValueSeparator().hasArgs(2).create('J'));

        __CLR4_5_21om1omlvn1m5qj.R.inc(2307);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21om1omlvn1m5qj.R.inc(2308);List values = Arrays.asList(cl.getOptionValues("J"));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2309);assertNotNull("null values", values);
        __CLR4_5_21om1omlvn1m5qj.R.inc(2310);assertEquals("number of values", 4, values.size());
        __CLR4_5_21om1omlvn1m5qj.R.inc(2311);assertEquals("value 1", "source", values.get(0));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2312);assertEquals("value 2", "1.5", values.get(1));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2313);assertEquals("value 3", "target", values.get(2));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2314);assertEquals("value 4", "1.5", values.get(3));
        __CLR4_5_21om1omlvn1m5qj.R.inc(2315);List argsleft = cl.getArgList();
        __CLR4_5_21om1omlvn1m5qj.R.inc(2316);assertEquals("Should be 1 arg left",1,argsleft.size());
        __CLR4_5_21om1omlvn1m5qj.R.inc(2317);assertEquals("Expecting foo","foo",argsleft.get(0));
    }finally{__CLR4_5_21om1omlvn1m5qj.R.flushNeeded();}}
}
