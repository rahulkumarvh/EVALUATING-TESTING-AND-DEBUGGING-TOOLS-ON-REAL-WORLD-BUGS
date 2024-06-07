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
 * Test case for the PosixParser.
 *
 * @version $Revision$, $Date$
 */
public class PosixParserTest extends ParserTestCase
{static class __CLR4_5_21u81u8lvn1ljcc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521104441L,8589935092L,2458,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void setUp()
    {try{__CLR4_5_21u81u8lvn1ljcc.R.inc(2384);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2385);super.setUp();
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2386);parser = new PosixParser();
    }finally{__CLR4_5_21u81u8lvn1ljcc.R.flushNeeded();}}

    public void testBursting() throws Exception
    {__CLR4_5_21u81u8lvn1ljcc.R.globalSliceStart(getClass().getName(),2387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g4pqkl1ub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u81u8lvn1ljcc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u81u8lvn1ljcc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g4pqkl1ub() throws Exception{try{__CLR4_5_21u81u8lvn1ljcc.R.inc(2387);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2388);String[] args = new String[] { "-acbtoast",
                                       "foo", "bar" };

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2389);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2390);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2391);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2392);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2393);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2394);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21u81u8lvn1ljcc.R.flushNeeded();}}

    public void testUnrecognizedOptionWithBursting() throws Exception
    {__CLR4_5_21u81u8lvn1ljcc.R.globalSliceStart(getClass().getName(),2395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23fy8u31uj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u81u8lvn1ljcc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u81u8lvn1ljcc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testUnrecognizedOptionWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23fy8u31uj() throws Exception{try{__CLR4_5_21u81u8lvn1ljcc.R.inc(2395);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2396);String[] args = new String[] { "-adbtoast", "foo", "bar" };

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2397);try
        {
            __CLR4_5_21u81u8lvn1ljcc.R.inc(2398);parser.parse(options, args);
            __CLR4_5_21u81u8lvn1ljcc.R.inc(2399);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21u81u8lvn1ljcc.R.inc(2400);assertEquals("-adbtoast", e.getOption());
        }
    }finally{__CLR4_5_21u81u8lvn1ljcc.R.flushNeeded();}}

    public void testMissingArgWithBursting() throws Exception
    {__CLR4_5_21u81u8lvn1ljcc.R.globalSliceStart(getClass().getName(),2401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26h2akx1up();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u81u8lvn1ljcc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u81u8lvn1ljcc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testMissingArgWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26h2akx1up() throws Exception{try{__CLR4_5_21u81u8lvn1ljcc.R.inc(2401);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2402);String[] args = new String[] { "-acb" };

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2403);boolean caught = false;

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2404);try
        {
            __CLR4_5_21u81u8lvn1ljcc.R.inc(2405);parser.parse(options, args);
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_21u81u8lvn1ljcc.R.inc(2406);caught = true;
            __CLR4_5_21u81u8lvn1ljcc.R.inc(2407);assertEquals("option missing an argument", "b", e.getOption().getOpt());
        }

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2408);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21u81u8lvn1ljcc.R.flushNeeded();}}

    public void testStopBursting() throws Exception
    {__CLR4_5_21u81u8lvn1ljcc.R.globalSliceStart(getClass().getName(),2409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zby38j1ux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u81u8lvn1ljcc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u81u8lvn1ljcc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testStopBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zby38j1ux() throws Exception{try{__CLR4_5_21u81u8lvn1ljcc.R.inc(2409);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2410);String[] args = new String[] { "-azc" };

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2411);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2412);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2413);assertFalse( "Confirm -c is not set", cl.hasOption("c") );

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2414);assertTrue( "Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2415);assertTrue(cl.getArgList().contains("zc"));
    }finally{__CLR4_5_21u81u8lvn1ljcc.R.flushNeeded();}}

    public void testStopBursting2() throws Exception
    {__CLR4_5_21u81u8lvn1ljcc.R.globalSliceStart(getClass().getName(),2416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cys9wj1v4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u81u8lvn1ljcc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u81u8lvn1ljcc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testStopBursting2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cys9wj1v4() throws Exception{try{__CLR4_5_21u81u8lvn1ljcc.R.inc(2416);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2417);String[] args = new String[] { "-c",
                                       "foobar",
                                       "-btoast" };

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2418);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2419);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2420);assertTrue("Confirm  2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2421);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2422);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2423);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2424);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2425);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2426);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_21u81u8lvn1ljcc.R.flushNeeded();}}

    /**
     * Real world test with long and short options.
     */
    public void testLongOptionWithShort() throws Exception {__CLR4_5_21u81u8lvn1ljcc.R.globalSliceStart(getClass().getName(),2427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nrf7461vf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u81u8lvn1ljcc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u81u8lvn1ljcc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testLongOptionWithShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nrf7461vf() throws Exception{try{__CLR4_5_21u81u8lvn1ljcc.R.inc(2427);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2428);Option help = new Option("h", "help", false, "print this message");
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2429);Option version = new Option("v", "version", false, "print version information");
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2430);Option newRun = new Option("n", "new", false, "Create NLT cache entries only for new items");
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2431);Option trackerRun = new Option("t", "tracker", false, "Create NLT cache entries only for tracker items");

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2432);Option timeLimit = OptionBuilder.withLongOpt("limit").hasArg()
                                        .withValueSeparator()
                                        .withDescription("Set time limit for execution, in minutes")
                                        .create("l");

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2433);Option age = OptionBuilder.withLongOpt("age").hasArg()
                                  .withValueSeparator()
                                  .withDescription("Age (in days) of cache item before being recomputed")
                                  .create("a");

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2434);Option server = OptionBuilder.withLongOpt("server").hasArg()
                                     .withValueSeparator()
                                     .withDescription("The NLT server address")
                                     .create("s");

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2435);Option numResults = OptionBuilder.withLongOpt("results").hasArg()
                                         .withValueSeparator()
                                         .withDescription("Number of results per item")
                                         .create("r");

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2436);Option configFile = OptionBuilder.withLongOpt("file").hasArg()
                                         .withValueSeparator()
                                         .withDescription("Use the specified configuration file")
                                         .create();

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2437);Options options = new Options();
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2438);options.addOption(help);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2439);options.addOption(version);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2440);options.addOption(newRun);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2441);options.addOption(trackerRun);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2442);options.addOption(timeLimit);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2443);options.addOption(age);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2444);options.addOption(server);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2445);options.addOption(numResults);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2446);options.addOption(configFile);

        // create the command line parser
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2447);CommandLineParser parser = new PosixParser();

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2448);String[] args = new String[] {
                "-v",
                "-l",
                "10",
                "-age",
                "5",
                "-file",
                "filename"
            };

        __CLR4_5_21u81u8lvn1ljcc.R.inc(2449);CommandLine line = parser.parse(options, args);
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2450);assertTrue(line.hasOption("v"));
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2451);assertEquals(line.getOptionValue("l"), "10");
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2452);assertEquals(line.getOptionValue("limit"), "10");
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2453);assertEquals(line.getOptionValue("a"), "5");
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2454);assertEquals(line.getOptionValue("age"), "5");
        __CLR4_5_21u81u8lvn1ljcc.R.inc(2455);assertEquals(line.getOptionValue("file"), "filename");
    }finally{__CLR4_5_21u81u8lvn1ljcc.R.flushNeeded();}}

    public void testLongWithEqualSingleDash() throws Exception
    {__CLR4_5_21u81u8lvn1ljcc.R.globalSliceStart(getClass().getName(),2456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qootr51w8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u81u8lvn1ljcc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u81u8lvn1ljcc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testLongWithEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qootr51w8() throws Exception{try{__CLR4_5_21u81u8lvn1ljcc.R.inc(2456);
        // not supported by the PosixParser
    }finally{__CLR4_5_21u81u8lvn1ljcc.R.flushNeeded();}}

    public void testShortWithEqual() throws Exception
    {__CLR4_5_21u81u8lvn1ljcc.R.globalSliceStart(getClass().getName(),2457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohwzdh1w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u81u8lvn1ljcc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u81u8lvn1ljcc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PosixParserTest.testShortWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohwzdh1w9() throws Exception{try{__CLR4_5_21u81u8lvn1ljcc.R.inc(2457);
        // not supported by the PosixParser
    }finally{__CLR4_5_21u81u8lvn1ljcc.R.flushNeeded();}}
}
