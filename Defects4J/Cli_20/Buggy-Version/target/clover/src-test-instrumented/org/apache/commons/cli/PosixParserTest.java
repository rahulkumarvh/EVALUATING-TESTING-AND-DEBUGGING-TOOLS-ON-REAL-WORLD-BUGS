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
{static class __CLR4_5_21s31s3lvl2tyhj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402243997L,8589935092L,2457,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options options = null;
    private Parser parser = null;

    public void setUp()
    {try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2307);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2308);options = new Options()
            .addOption("a", "enable-a", false, "turn [a] on or off")
            .addOption("b", "bfile", true, "set the value of [b]")
            .addOption("c", "copt", false, "turn [c] on or off");

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2309);parser = new PosixParser();
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testSimpleShort() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25gmla71s6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testSimpleShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2310,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25gmla71s6() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2310);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2311);String[] args = new String[] { "-a",
                                       "-b", "toast",
                                       "foo", "bar" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2312);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2313);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2314);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2315);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2316);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testSimpleLong() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_283qhtz1sd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testSimpleLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_283qhtz1sd() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2317);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2318);String[] args = new String[] { "--enable-a",
                                       "--bfile", "toast",
                                       "foo", "bar" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2319);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2320);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2321);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2322);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2323);assertTrue( "Confirm arg of --bfile", cl.getOptionValue( "bfile" ).equals( "toast" ) );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2324);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testComplexShort() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mowf171sl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testComplexShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mowf171sl() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2325);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2326);String[] args = new String[] { "-acbtoast",
                                       "foo", "bar" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2327);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2328);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2329);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2330);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2331);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2332);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testUnrecognizedOption() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2grwzr71st();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testUnrecognizedOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2333,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2grwzr71st() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2333);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2334);String[] args = new String[] { "-adbtoast", "foo", "bar" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2335);try
        {
            __CLR4_5_21s31s3lvl2tyhj.R.inc(2336);parser.parse(options, args);
            __CLR4_5_21s31s3lvl2tyhj.R.inc(2337);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21s31s3lvl2tyhj.R.inc(2338);assertEquals("-adbtoast", e.getOption());
        }
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testUnrecognizedOption2() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jytu0z1sz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testUnrecognizedOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2339,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jytu0z1sz() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2339);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2340);String[] args = new String[] { "-z", "-abtoast", "foo", "bar" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2341);try
        {
            __CLR4_5_21s31s3lvl2tyhj.R.inc(2342);parser.parse(options, args);
            __CLR4_5_21s31s3lvl2tyhj.R.inc(2343);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21s31s3lvl2tyhj.R.inc(2344);assertEquals("-z", e.getOption());
        }
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testMissingArg() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tcx6x51t5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testMissingArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2345,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tcx6x51t5() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2345);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2346);String[] args = new String[] { "-acb" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2347);boolean caught = false;

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2348);try
        {
            __CLR4_5_21s31s3lvl2tyhj.R.inc(2349);parser.parse(options, args);
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_21s31s3lvl2tyhj.R.inc(2350);caught = true;
            __CLR4_5_21s31s3lvl2tyhj.R.inc(2351);assertEquals("option missing an argument", "b", e.getOption().getOpt());
        }

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2352);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testStop() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mkgnt11td();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testStop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mkgnt11td() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2353);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2354);String[] args = new String[] { "-c",
                                       "foober",
                                       "-btoast" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2355);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2356);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2357);assertTrue( "Confirm  2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testStop2() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hjvrln1ti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testStop2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2358,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hjvrln1ti() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2358);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2359);String[] args = new String[]{"-z",
                                     "-a",
                                     "-btoast"};

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2360);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2361);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2362);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testStop3() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eavst61tn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testStop3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2363,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eavst61tn() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2363);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2364);String[] args = new String[]{"--zop==1",
                                     "-abtoast",
                                     "--b=bar"};

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2365);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2366);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2367);assertFalse("Confirm -b is not set", cl.hasOption("b"));
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2368);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testStopBursting() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zby38j1tt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testStopBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zby38j1tt() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2369);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2370);String[] args = new String[] { "-azc" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2371);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2372);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2373);assertFalse( "Confirm -c is not set", cl.hasOption("c") );

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2374);assertTrue( "Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2375);assertTrue(cl.getArgList().contains("zc"));
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testMultiple() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pj8bhz1u0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testMultiple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pj8bhz1u0() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2376);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2377);String[] args = new String[] { "-c",
                                       "foobar",
                                       "-btoast" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2378);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2379);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2380);assertTrue( "Confirm  2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2381);cl = parser.parse(options, cl.getArgs() );

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2382);assertTrue( "Confirm -c is not set", ! cl.hasOption("c") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2383);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2384);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2385);assertTrue( "Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2386);assertTrue( "Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar") );
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testMultipleWithLong() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235tfkb1ub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testMultipleWithLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235tfkb1ub() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2387);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2388);String[] args = new String[] { "--copt",
                                       "foobar",
                                       "--bfile", "toast" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2389);CommandLine cl = parser.parse(options,args, true);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2390);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2391);assertTrue( "Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2392);cl = parser.parse(options, cl.getArgs() );

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2393);assertTrue( "Confirm -c is not set", ! cl.hasOption("c") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2394);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2395);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2396);assertTrue( "Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2397);assertTrue( "Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar") );
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testDoubleDash() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rbuc4c1um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rbuc4c1um() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2398);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2399);String[] args = new String[] { "--copt",
                                       "--",
                                       "-b", "toast" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2400);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2401);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2402);assertTrue( "Confirm -b is not set", ! cl.hasOption("b") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2403);assertTrue( "Confirm 2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testSingleDash() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idzcwd1us();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2404,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idzcwd1us() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2404);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2405);String[] args = new String[] { "--copt",
                                       "-b", "-",
                                       "-a",
                                       "-" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2406);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2407);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2408);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2409);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("-") );
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2410);assertTrue( "Confirm 1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2411);assertTrue( "Confirm value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("-") );
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    /**
     * Real world test with long and short options.
     */
    public void testLongOptionWithShort() throws Exception {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nrf7461v0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testLongOptionWithShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2412,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nrf7461v0() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2412);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2413);Option help = new Option("h", "help", false, "print this message");
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2414);Option version = new Option("v", "version", false, "print version information");
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2415);Option newRun = new Option("n", "new", false, "Create NLT cache entries only for new items");
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2416);Option trackerRun = new Option("t", "tracker", false, "Create NLT cache entries only for tracker items");

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2417);Option timeLimit = OptionBuilder.withLongOpt("limit").hasArg()
                                        .withValueSeparator()
                                        .withDescription("Set time limit for execution, in mintues")
                                        .create("l");

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2418);Option age = OptionBuilder.withLongOpt("age").hasArg()
                                  .withValueSeparator()
                                  .withDescription("Age (in days) of cache item before being recomputed")
                                  .create("a");

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2419);Option server = OptionBuilder.withLongOpt("server").hasArg()
                                     .withValueSeparator()
                                     .withDescription("The NLT server address")
                                     .create("s");

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2420);Option numResults = OptionBuilder.withLongOpt("results").hasArg()
                                         .withValueSeparator()
                                         .withDescription("Number of results per item")
                                         .create("r");

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2421);Option configFile = OptionBuilder.withLongOpt("file").hasArg()
                                         .withValueSeparator()
                                         .withDescription("Use the specified configuration file")
                                         .create();

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2422);Options options = new Options();
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2423);options.addOption(help);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2424);options.addOption(version);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2425);options.addOption(newRun);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2426);options.addOption(trackerRun);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2427);options.addOption(timeLimit);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2428);options.addOption(age);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2429);options.addOption(server);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2430);options.addOption(numResults);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2431);options.addOption(configFile);

        // create the command line parser
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2432);CommandLineParser parser = new PosixParser();

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2433);String[] args = new String[] {
                "-v",
                "-l",
                "10",
                "-age",
                "5",
                "-file",
                "filename"
            };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2434);CommandLine line = parser.parse(options, args);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2435);assertTrue(line.hasOption("v"));
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2436);assertEquals(line.getOptionValue("l"), "10");
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2437);assertEquals(line.getOptionValue("limit"), "10");
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2438);assertEquals(line.getOptionValue("a"), "5");
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2439);assertEquals(line.getOptionValue("age"), "5");
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2440);assertEquals(line.getOptionValue("file"), "filename");
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}

    public void testPropertiesOption() throws Exception
    {__CLR4_5_21s31s3lvl2tyhj.R.globalSliceStart(getClass().getName(),2441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2556ta71vt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s31s3lvl2tyhj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s31s3lvl2tyhj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testPropertiesOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2556ta71vt() throws Exception{try{__CLR4_5_21s31s3lvl2tyhj.R.inc(2441);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2442);String[] args = new String[] { "-Jsource=1.5", "-J", "target", "1.5", "foo" };

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2443);Options options = new Options();
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2444);options.addOption(OptionBuilder.withValueSeparator().hasArgs(2).create('J'));

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2445);Parser parser = new PosixParser();
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2446);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21s31s3lvl2tyhj.R.inc(2447);List values = Arrays.asList(cl.getOptionValues("J"));
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2448);assertNotNull("null values", values);
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2449);assertEquals("number of values", 4, values.size());
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2450);assertEquals("value 1", "source", values.get(0));
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2451);assertEquals("value 2", "1.5", values.get(1));
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2452);assertEquals("value 3", "target", values.get(2));
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2453);assertEquals("value 4", "1.5", values.get(3));
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2454);List argsleft = cl.getArgList();
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2455);assertEquals("Should be 1 arg left",1,argsleft.size());
        __CLR4_5_21s31s3lvl2tyhj.R.inc(2456);assertEquals("Expecting foo","foo",argsleft.get(0));
    }finally{__CLR4_5_21s31s3lvl2tyhj.R.flushNeeded();}}
}
