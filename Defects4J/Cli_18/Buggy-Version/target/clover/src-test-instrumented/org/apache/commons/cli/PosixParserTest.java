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
 * Test case for the PosixParser.
 *
 * @version $Revision$, $Date$
 */
public class PosixParserTest extends TestCase
{static class __CLR4_5_21s51s5lvkk1trv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370698324L,8589935092L,2447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options options = null;
    private Parser parser = null;

    public void setUp()
    {try{__CLR4_5_21s51s5lvkk1trv.R.inc(2309);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2310);options = new Options()
            .addOption("a", "enable-a", false, "turn [a] on or off")
            .addOption("b", "bfile", true, "set the value of [b]")
            .addOption("c", "copt", false, "turn [c] on or off");

        __CLR4_5_21s51s5lvkk1trv.R.inc(2311);parser = new PosixParser();
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testSimpleShort() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25gmla71s8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testSimpleShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2312,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25gmla71s8() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2312);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2313);String[] args = new String[] { "-a",
                                       "-b", "toast",
                                       "foo", "bar" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2314);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s51s5lvkk1trv.R.inc(2315);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2316);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2317);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2318);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testSimpleLong() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_283qhtz1sf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testSimpleLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_283qhtz1sf() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2319);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2320);String[] args = new String[] { "--enable-a",
                                       "--bfile", "toast",
                                       "foo", "bar" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2321);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s51s5lvkk1trv.R.inc(2322);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2323);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2324);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2325);assertTrue( "Confirm arg of --bfile", cl.getOptionValue( "bfile" ).equals( "toast" ) );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2326);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testComplexShort() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mowf171sn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testComplexShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2327,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mowf171sn() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2327);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2328);String[] args = new String[] { "-acbtoast",
                                       "foo", "bar" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2329);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s51s5lvkk1trv.R.inc(2330);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2331);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2332);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2333);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2334);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testUnrecognizedOption() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2grwzr71sv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testUnrecognizedOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2grwzr71sv() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2335);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2336);String[] args = new String[] { "-adbtoast", "foo", "bar" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2337);try
        {
            __CLR4_5_21s51s5lvkk1trv.R.inc(2338);parser.parse(options, args);
            __CLR4_5_21s51s5lvkk1trv.R.inc(2339);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21s51s5lvkk1trv.R.inc(2340);assertEquals("-adbtoast", e.getOption());
        }
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testMissingArg() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tcx6x51t1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testMissingArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2341,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tcx6x51t1() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2341);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2342);String[] args = new String[] { "-acb" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2343);boolean caught = false;

        __CLR4_5_21s51s5lvkk1trv.R.inc(2344);try
        {
            __CLR4_5_21s51s5lvkk1trv.R.inc(2345);parser.parse(options, args);
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_21s51s5lvkk1trv.R.inc(2346);caught = true;
            __CLR4_5_21s51s5lvkk1trv.R.inc(2347);assertEquals("option missing an argument", "b", e.getOption().getOpt());
        }

        __CLR4_5_21s51s5lvkk1trv.R.inc(2348);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testStop() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mkgnt11t9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testStop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mkgnt11t9() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2349);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2350);String[] args = new String[] { "-c",
                                       "foober",
                                       "-btoast" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2351);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2352);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2353);assertTrue( "Confirm  2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testStop2() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hjvrln1te();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testStop2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2354,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hjvrln1te() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2354);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2355);String[] args = new String[]{"-z",
                                     "-a",
                                     "-btoast"};

        __CLR4_5_21s51s5lvkk1trv.R.inc(2356);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2357);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_21s51s5lvkk1trv.R.inc(2358);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testStopBursting() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zby38j1tj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testStopBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2359,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zby38j1tj() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2359);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2360);String[] args = new String[] { "-azc" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2361);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2362);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2363);assertFalse( "Confirm -c is not set", cl.hasOption("c") );

        __CLR4_5_21s51s5lvkk1trv.R.inc(2364);assertTrue( "Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2365);assertTrue(cl.getArgList().contains("zc"));
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testMultiple() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pj8bhz1tq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testMultiple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2366,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pj8bhz1tq() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2366);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2367);String[] args = new String[] { "-c",
                                       "foobar",
                                       "-btoast" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2368);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2369);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2370);assertTrue( "Confirm  2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);

        __CLR4_5_21s51s5lvkk1trv.R.inc(2371);cl = parser.parse(options, cl.getArgs() );

        __CLR4_5_21s51s5lvkk1trv.R.inc(2372);assertTrue( "Confirm -c is not set", ! cl.hasOption("c") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2373);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2374);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2375);assertTrue( "Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2376);assertTrue( "Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar") );
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testMultipleWithLong() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235tfkb1u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testMultipleWithLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2377,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235tfkb1u1() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2377);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2378);String[] args = new String[] { "--copt",
                                       "foobar",
                                       "--bfile", "toast" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2379);CommandLine cl = parser.parse(options,args, true);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2380);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2381);assertTrue( "Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_21s51s5lvkk1trv.R.inc(2382);cl = parser.parse(options, cl.getArgs() );

        __CLR4_5_21s51s5lvkk1trv.R.inc(2383);assertTrue( "Confirm -c is not set", ! cl.hasOption("c") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2384);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2385);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2386);assertTrue( "Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2387);assertTrue( "Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar") );
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testDoubleDash() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rbuc4c1uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rbuc4c1uc() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2388);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2389);String[] args = new String[] { "--copt",
                                       "--",
                                       "-b", "toast" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2390);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s51s5lvkk1trv.R.inc(2391);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2392);assertTrue( "Confirm -b is not set", ! cl.hasOption("b") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2393);assertTrue( "Confirm 2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testSingleDash() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idzcwd1ui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2394,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idzcwd1ui() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2394);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2395);String[] args = new String[] { "--copt",
                                       "-b", "-",
                                       "-a",
                                       "-" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2396);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s51s5lvkk1trv.R.inc(2397);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2398);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2399);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("-") );
        __CLR4_5_21s51s5lvkk1trv.R.inc(2400);assertTrue( "Confirm 1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2401);assertTrue( "Confirm value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("-") );
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    /**
     * Real world test with long and short options.
     */
    public void testLongOptionWithShort() throws Exception {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nrf7461uq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testLongOptionWithShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nrf7461uq() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2402);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2403);Option help = new Option("h", "help", false, "print this message");
        __CLR4_5_21s51s5lvkk1trv.R.inc(2404);Option version = new Option("v", "version", false, "print version information");
        __CLR4_5_21s51s5lvkk1trv.R.inc(2405);Option newRun = new Option("n", "new", false, "Create NLT cache entries only for new items");
        __CLR4_5_21s51s5lvkk1trv.R.inc(2406);Option trackerRun = new Option("t", "tracker", false, "Create NLT cache entries only for tracker items");

        __CLR4_5_21s51s5lvkk1trv.R.inc(2407);Option timeLimit = OptionBuilder.withLongOpt("limit").hasArg()
                                        .withValueSeparator()
                                        .withDescription("Set time limit for execution, in mintues")
                                        .create("l");

        __CLR4_5_21s51s5lvkk1trv.R.inc(2408);Option age = OptionBuilder.withLongOpt("age").hasArg()
                                  .withValueSeparator()
                                  .withDescription("Age (in days) of cache item before being recomputed")
                                  .create("a");

        __CLR4_5_21s51s5lvkk1trv.R.inc(2409);Option server = OptionBuilder.withLongOpt("server").hasArg()
                                     .withValueSeparator()
                                     .withDescription("The NLT server address")
                                     .create("s");

        __CLR4_5_21s51s5lvkk1trv.R.inc(2410);Option numResults = OptionBuilder.withLongOpt("results").hasArg()
                                         .withValueSeparator()
                                         .withDescription("Number of results per item")
                                         .create("r");

        __CLR4_5_21s51s5lvkk1trv.R.inc(2411);Option configFile = OptionBuilder.withLongOpt("file").hasArg()
                                         .withValueSeparator()
                                         .withDescription("Use the specified configuration file")
                                         .create();

        __CLR4_5_21s51s5lvkk1trv.R.inc(2412);Options options = new Options();
        __CLR4_5_21s51s5lvkk1trv.R.inc(2413);options.addOption(help);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2414);options.addOption(version);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2415);options.addOption(newRun);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2416);options.addOption(trackerRun);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2417);options.addOption(timeLimit);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2418);options.addOption(age);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2419);options.addOption(server);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2420);options.addOption(numResults);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2421);options.addOption(configFile);

        // create the command line parser
        __CLR4_5_21s51s5lvkk1trv.R.inc(2422);CommandLineParser parser = new PosixParser();

        __CLR4_5_21s51s5lvkk1trv.R.inc(2423);String[] args = new String[] {
                "-v",
                "-l",
                "10",
                "-age",
                "5",
                "-file",
                "filename"
            };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2424);CommandLine line = parser.parse(options, args);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2425);assertTrue(line.hasOption("v"));
        __CLR4_5_21s51s5lvkk1trv.R.inc(2426);assertEquals(line.getOptionValue("l"), "10");
        __CLR4_5_21s51s5lvkk1trv.R.inc(2427);assertEquals(line.getOptionValue("limit"), "10");
        __CLR4_5_21s51s5lvkk1trv.R.inc(2428);assertEquals(line.getOptionValue("a"), "5");
        __CLR4_5_21s51s5lvkk1trv.R.inc(2429);assertEquals(line.getOptionValue("age"), "5");
        __CLR4_5_21s51s5lvkk1trv.R.inc(2430);assertEquals(line.getOptionValue("file"), "filename");
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}

    public void testPropertiesOption() throws Exception
    {__CLR4_5_21s51s5lvkk1trv.R.globalSliceStart(getClass().getName(),2431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2556ta71vj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s51s5lvkk1trv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s51s5lvkk1trv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testPropertiesOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2431,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2556ta71vj() throws Exception{try{__CLR4_5_21s51s5lvkk1trv.R.inc(2431);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2432);String[] args = new String[] { "-Jsource=1.5", "-J", "target", "1.5", "foo" };

        __CLR4_5_21s51s5lvkk1trv.R.inc(2433);Options options = new Options();
        __CLR4_5_21s51s5lvkk1trv.R.inc(2434);options.addOption(OptionBuilder.withValueSeparator().hasArgs(2).create('J'));

        __CLR4_5_21s51s5lvkk1trv.R.inc(2435);Parser parser = new PosixParser();
        __CLR4_5_21s51s5lvkk1trv.R.inc(2436);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s51s5lvkk1trv.R.inc(2437);List values = Arrays.asList(cl.getOptionValues("J"));
        __CLR4_5_21s51s5lvkk1trv.R.inc(2438);assertNotNull("null values", values);
        __CLR4_5_21s51s5lvkk1trv.R.inc(2439);assertEquals("number of values", 4, values.size());
        __CLR4_5_21s51s5lvkk1trv.R.inc(2440);assertEquals("value 1", "source", values.get(0));
        __CLR4_5_21s51s5lvkk1trv.R.inc(2441);assertEquals("value 2", "1.5", values.get(1));
        __CLR4_5_21s51s5lvkk1trv.R.inc(2442);assertEquals("value 3", "target", values.get(2));
        __CLR4_5_21s51s5lvkk1trv.R.inc(2443);assertEquals("value 4", "1.5", values.get(3));
        __CLR4_5_21s51s5lvkk1trv.R.inc(2444);List argsleft = cl.getArgList();
        __CLR4_5_21s51s5lvkk1trv.R.inc(2445);assertEquals("Should be 1 arg left",1,argsleft.size());
        __CLR4_5_21s51s5lvkk1trv.R.inc(2446);assertEquals("Expecting foo","foo",argsleft.get(0));
    }finally{__CLR4_5_21s51s5lvkk1trv.R.flushNeeded();}}
}
