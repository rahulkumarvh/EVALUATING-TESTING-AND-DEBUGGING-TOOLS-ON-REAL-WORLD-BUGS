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
import java.util.Properties;

import junit.framework.TestCase;

/**
 * Abstract test case testing common parser features.
 *
 * @author Emmanuel Bourg
 * @version $Revision$, $Date$
 */
public abstract class ParserTestCase extends TestCase
{static class __CLR4_5_21zu1zulvn1n6m7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,3018,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected CommandLineParser parser;

    protected Options options;

    public void setUp()
    {try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2586);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2587);options = new Options()
            .addOption("a", "enable-a", false, "turn [a] on or off")
            .addOption("b", "bfile", true, "set the value of [b]")
            .addOption("c", "copt", false, "turn [c] on or off");
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testSimpleShort() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25gmla71zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSimpleShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25gmla71zw() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2588);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2589);String[] args = new String[] { "-a",
                                       "-b", "toast",
                                       "foo", "bar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2590);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2591);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2592);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2593);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2594);assertTrue("Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testSimpleLong() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_283qhtz203();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSimpleLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_283qhtz203() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2595);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2596);String[] args = new String[] { "--enable-a",
                                       "--bfile", "toast",
                                       "foo", "bar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2597);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2598);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2599);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2600);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2601);assertTrue( "Confirm arg of --bfile", cl.getOptionValue( "bfile" ).equals( "toast" ) );
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2602);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testMultiple() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pj8bhz20b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMultiple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2603,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pj8bhz20b() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2603);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2604);String[] args = new String[] { "-c",
                                       "foobar",
                                       "-b", "toast" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2605);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2606);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2607);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2608);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2609);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2610);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2611);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2612);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2613);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testMultipleWithLong() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235tfkb20m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMultipleWithLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235tfkb20m() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2614);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2615);String[] args = new String[] { "--copt",
                                       "foobar",
                                       "--bfile", "toast" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2616);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2617);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2618);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2619);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2620);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2621);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2622);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2623);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2624);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testUnrecognizedOption() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2grwzr720x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnrecognizedOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2grwzr720x() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2625);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2626);String[] args = new String[] { "-a", "-d", "-b", "toast", "foo", "bar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2627);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2628);parser.parse(options, args);
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2629);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2630);assertEquals("-d", e.getOption());
        }
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testMissingArg() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tcx6x5213();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2631,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tcx6x5213() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2631);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2632);String[] args = new String[] { "-b" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2633);boolean caught = false;

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2634);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2635);parser.parse(options, args);
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2636);caught = true;
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2637);assertEquals("option missing an argument", "b", e.getOption().getOpt());
        }

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2638);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testDoubleDash1() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yd81ur21b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testDoubleDash1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yd81ur21b() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2639);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2640);String[] args = new String[] { "--copt",
                                       "--",
                                       "-b", "toast" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2641);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2642);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2643);assertTrue("Confirm -b is not set", !cl.hasOption("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2644);assertTrue("Confirm 2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testDoubleDash2() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xew1bw21h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testDoubleDash2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xew1bw21h() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2645);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2646);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2647);options.addOption(OptionBuilder.hasArg().create('n'));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2648);options.addOption(OptionBuilder.create('m'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2649);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2650);parser.parse(options, new String[]{"-n", "--", "-m"});
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2651);fail("MissingArgumentException not thrown for option -n");
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2652);assertNotNull("option null", e.getOption());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2653);assertEquals("n", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
    
    public void testSingleDash() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idzcwd21q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idzcwd21q() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2654);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2655);String[] args = new String[] { "--copt",
                                       "-b", "-",
                                       "-a",
                                       "-" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2656);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2657);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2658);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2659);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("-"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2660);assertTrue("Confirm 1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2661);assertTrue("Confirm value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("-"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testStopAtUnexpectedArg() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w2sq2t21y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtUnexpectedArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w2sq2t21y() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2662);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2663);String[] args = new String[] { "-c",
                                       "foober",
                                       "-b",
                                       "toast" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2664);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2665);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2666);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

   public void testStopAtExpectedArg() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26fsujm223();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtExpectedArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26fsujm223() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2667);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2668);String[] args = new String[]{"-b", "foo"};

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2669);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2670);assertTrue("Confirm -b is set", cl.hasOption('b'));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2671);assertEquals("Confirm -b is set", "foo", cl.getOptionValue('b'));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2672);assertTrue("Confirm no extra args: " + cl.getArgList().size(), cl.getArgList().size() == 0);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testStopAtNonOptionShort() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21vvp4o229();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtNonOptionShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2673,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21vvp4o229() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2673);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2674);String[] args = new String[]{"-z",
                                     "-a",
                                     "-btoast"};

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2675);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2676);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2677);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testStopAtNonOptionLong() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21aqvj622e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtNonOptionLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21aqvj622e() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2678);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2679);String[] args = new String[]{"--zop==1",
                                     "-abtoast",
                                     "--b=bar"};

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2680);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2681);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2682);assertFalse("Confirm -b is not set", cl.hasOption("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2683);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testNegativeArgument() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8jgqd22k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testNegativeArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8jgqd22k() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2684);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2685);String[] args = new String[] { "-b", "-1"} ;

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2686);CommandLine cl = parser.parse(options, args);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2687);assertEquals("-1", cl.getOptionValue("b"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testNegativeOption() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kw2kj22o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testNegativeOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kw2kj22o() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2688);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2689);String[] args = new String[] { "-b", "-1"} ;
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2690);options.addOption("1", false, null);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2691);CommandLine cl = parser.parse(options, args);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2692);assertEquals("-1", cl.getOptionValue("b"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
    
    public void testArgumentStartingWithHyphen() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jfa3622t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testArgumentStartingWithHyphen",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jfa3622t() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2693);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2694);String[] args = new String[]{"-b", "-foo"};

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2695);CommandLine cl = parser.parse(options, args);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2696);assertEquals("-foo", cl.getOptionValue("b"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testShortWithEqual() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohwzdh22x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testShortWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohwzdh22x() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2697);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2698);String[] args = new String[] { "-f=bar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2699);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2700);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2701);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2702);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testShortWithoutEqual() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se6war233();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testShortWithoutEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2703,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se6war233() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2703);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2704);String[] args = new String[] { "-fbar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2705);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2706);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2707);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2708);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testLongWithEqualDoubleDash() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21degsq239();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithEqualDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2709,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21degsq239() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2709);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2710);String[] args = new String[] { "--foo=bar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2711);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2712);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2713);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2714);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testLongWithEqualSingleDash() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qootr523f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qootr523f() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2715);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2716);String[] args = new String[] { "-foo=bar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2717);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2718);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2719);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2720);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnksl23l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2721,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnksl23l() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2721);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2722);String[] args = new String[] { "-foobar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2723);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2724);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2725);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2726);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
    
    public void testAmbiguousLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ppu6b23r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testAmbiguousLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ppu6b23r() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2727);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2728);String[] args = new String[] { "-b", "-foobar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2729);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2730);options.addOption(OptionBuilder.withLongOpt("foo").hasOptionalArg().create('f'));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2731);options.addOption(OptionBuilder.withLongOpt("bar").hasOptionalArg().create('b'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2732);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2733);assertTrue(cl.hasOption("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2734);assertTrue(cl.hasOption("f"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2735);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testLongWithoutEqualDoubleDash() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pyxxr0240();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithoutEqualDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pyxxr0240() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2736);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2737);String[] args = new String[] { "--foobar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2738);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2739);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2740);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2741);assertFalse(cl.hasOption("foo")); // foo isn't expected to be recognized with a double dash
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testLongWithUnexpectedArgument1() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28r28vq246();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithUnexpectedArgument1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28r28vq246() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2742);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2743);String[] args = new String[] { "--foo=bar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2744);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2745);options.addOption(OptionBuilder.withLongOpt("foo").create('f'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2746);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2747);parser.parse(options, args);
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2748);assertEquals("--foo=bar", e.getOption());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2749);return;
        }

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2750);fail("UnrecognizedOptionException not thrown");
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testLongWithUnexpectedArgument2() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c027o724f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithUnexpectedArgument2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2751,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c027o724f() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2751);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2752);String[] args = new String[] { "-foobar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2753);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2754);options.addOption(OptionBuilder.withLongOpt("foo").create('f'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2755);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2756);parser.parse(options, args);
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2757);assertEquals("-foobar", e.getOption());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2758);return;
        }

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2759);fail("UnrecognizedOptionException not thrown");
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testShortWithUnexpectedArgument() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bkns1x24o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testShortWithUnexpectedArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bkns1x24o() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2760);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2761);String[] args = new String[] { "-f=bar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2762);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2763);options.addOption(OptionBuilder.withLongOpt("foo").create('f'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2764);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2765);parser.parse(options, args);
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2766);assertEquals("-f=bar", e.getOption());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2767);return;
        }

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2768);fail("UnrecognizedOptionException not thrown");
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
    
    public void testPropertiesOption1() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m4t5zy24x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertiesOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m4t5zy24x() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2769);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2770);String[] args = new String[] { "-Jsource=1.5", "-J", "target", "1.5", "foo" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2771);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2772);options.addOption(OptionBuilder.withValueSeparator().hasArgs(2).create('J'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2773);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2774);List values = Arrays.asList(cl.getOptionValues("J"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2775);assertNotNull("null values", values);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2776);assertEquals("number of values", 4, values.size());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2777);assertEquals("value 1", "source", values.get(0));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2778);assertEquals("value 2", "1.5", values.get(1));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2779);assertEquals("value 3", "target", values.get(2));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2780);assertEquals("value 4", "1.5", values.get(3));
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2781);List argsleft = cl.getArgList();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2782);assertEquals("Should be 1 arg left", 1, argsleft.size());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2783);assertEquals("Expecting foo", "foo", argsleft.get(0));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testPropertiesOption2() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pdt4sf25c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertiesOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pdt4sf25c() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2784);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2785);String[] args = new String[] { "-Dparam1", "-Dparam2=value2", "-D"};

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2786);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2787);options.addOption(OptionBuilder.withValueSeparator().hasOptionalArgs(2).create('D'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2788);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2789);Properties props = cl.getOptionProperties("D");
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2790);assertNotNull("null properties", props);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2791);assertEquals("number of properties in " + props, 2, props.size());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2792);assertEquals("property 1", "true", props.getProperty("param1"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2793);assertEquals("property 2", "value2", props.getProperty("param2"));
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2794);List argsleft = cl.getArgList();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2795);assertEquals("Should be no arg left", 0, argsleft.size());
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption1() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tpjutj25o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tpjutj25o() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2796);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2797);String[] args = new String[] { "--ver" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2798);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2799);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2800);options.addOption(OptionBuilder.withLongOpt("help").create());
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2801);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2802);assertTrue("Confirm --version is set", cl.hasOption("version"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption2() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wyjtm025v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2803,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wyjtm025v() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2803);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2804);String[] args = new String[] { "-ver" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2805);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2806);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2807);options.addOption(OptionBuilder.withLongOpt("help").create());
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2808);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2809);assertTrue("Confirm --version is set", cl.hasOption("version"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption3() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytk9kn262();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytk9kn262() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2810);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2811);String[] args = new String[] { "--ver=1" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2812);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2813);options.addOption(OptionBuilder.withLongOpt("verbose").hasOptionalArg().create());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2814);options.addOption(OptionBuilder.withLongOpt("help").create());
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2815);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2816);assertTrue("Confirm --verbose is set", cl.hasOption("verbose"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2817);assertEquals("1", cl.getOptionValue("verbose"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption4() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkkas626a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2818,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkkas626a() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2818);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2819);String[] args = new String[] { "-ver=1" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2820);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2821);options.addOption(OptionBuilder.withLongOpt("verbose").hasOptionalArg().create());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2822);options.addOption(OptionBuilder.withLongOpt("help").create());
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2823);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2824);assertTrue("Confirm --verbose is set", cl.hasOption("verbose"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2825);assertEquals("1", cl.getOptionValue("verbose"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
    
    public void testAmbiguousPartialLongOption1() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2ixr426i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2826,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2ixr426i() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2826);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2827);String[] args = new String[] { "--ver" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2828);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2829);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2830);options.addOption(OptionBuilder.withLongOpt("verbose").create());
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2831);boolean caught = false;
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2832);try 
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2833);parser.parse(options, args);
        }
        catch (AmbiguousOptionException e) 
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2834);caught = true;
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2835);assertEquals("Partial option", "--ver", e.getOption());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2836);assertNotNull("Matching options null", e.getMatchingOptions());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2837);assertEquals("Matching options size", 2, e.getMatchingOptions().size());
        }
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2838);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
    
    public void testAmbiguousPartialLongOption2() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sbiwjl26v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2839,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sbiwjl26v() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2839);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2840);String[] args = new String[] { "-ver" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2841);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2842);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2843);options.addOption(OptionBuilder.withLongOpt("verbose").create());
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2844);boolean caught = false;
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2845);try 
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2846);parser.parse(options, args);
        }
        catch (AmbiguousOptionException e) 
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2847);caught = true;
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2848);assertEquals("Partial option", "-ver", e.getOption());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2849);assertNotNull("Matching options null", e.getMatchingOptions());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2850);assertEquals("Matching options size", 2, e.getMatchingOptions().size());
        }
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2851);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption3() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkivc2278();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkivc2278() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2852);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2853);String[] args = new String[] { "--ver=1" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2854);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2855);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2856);options.addOption(OptionBuilder.withLongOpt("verbose").hasOptionalArg().create());
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2857);boolean caught = false;
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2858);try 
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2859);parser.parse(options, args);
        }
        catch (AmbiguousOptionException e) 
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2860);caught = true;
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2861);assertEquals("Partial option", "--ver", e.getOption());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2862);assertNotNull("Matching options null", e.getMatchingOptions());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2863);assertEquals("Matching options size", 2, e.getMatchingOptions().size());
        }
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2864);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption4() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytiu4j27l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytiu4j27l() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2865);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2866);String[] args = new String[] { "-ver=1" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2867);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2868);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2869);options.addOption(OptionBuilder.withLongOpt("verbose").hasOptionalArg().create());
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2870);boolean caught = false;
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2871);try 
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2872);parser.parse(options, args);
        }
        catch (AmbiguousOptionException e) 
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2873);caught = true;
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2874);assertEquals("Partial option", "-ver", e.getOption());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2875);assertNotNull("Matching options null", e.getMatchingOptions());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2876);assertEquals("Matching options size", 2, e.getMatchingOptions().size());
        }
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2877);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
    
    public void testPartialLongOptionSingleDash() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcd5i927y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPartialLongOptionSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcd5i927y() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2878);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2879);String[] args = new String[] { "-ver" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2880);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2881);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2882);options.addOption(OptionBuilder.hasArg().create('v'));
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2883);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2884);assertTrue("Confirm --version is set", cl.hasOption("version"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2885);assertTrue("Confirm -v is not set", !cl.hasOption("v"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testWithRequiredOption() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29lagml286();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testWithRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29lagml286() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2886);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2887);String[] args = new String[] { "-b", "file" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2888);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2889);options.addOption("a", "enable-a", false, null);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2890);options.addOption(OptionBuilder.withLongOpt("bfile").hasArg().isRequired().create('b'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2891);CommandLine cl = parser.parse(options,args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2892);assertTrue("Confirm -a is NOT set", !cl.hasOption("a"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2893);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2894);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("file"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2895);assertTrue("Confirm NO of extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testOptionAndRequiredOption() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_282kgvp28g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testOptionAndRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_282kgvp28g() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2896);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2897);String[] args = new String[] { "-a", "-b", "file" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2898);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2899);options.addOption("a", "enable-a", false, null);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2900);options.addOption(OptionBuilder.withLongOpt("bfile").hasArg().isRequired().create('b'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2901);CommandLine cl = parser.parse(options,args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2902);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2903);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2904);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("file"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2905);assertTrue("Confirm NO of extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testMissingRequiredOption()
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g6vokx28q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g6vokx28q(){try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2906);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2907);String[] args = new String[] { "-a" };
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2908);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2909);options.addOption("a", "enable-a", false, null);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2910);options.addOption(OptionBuilder.withLongOpt("bfile").hasArg().isRequired().create('b'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2911);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2912);parser.parse(options,args);
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2913);fail("exception should have been thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2914);assertEquals( "Incorrect exception message", "Missing required option: b", e.getMessage() );
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2915);assertTrue(e.getMissingOptions().contains("b"));
        }
        catch (ParseException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2916);fail("expected to catch MissingOptionException");
        }
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testMissingRequiredOptions()
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ysjy26291();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingRequiredOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ysjy26291(){try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2917);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2918);String[] args = new String[] { "-a" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2919);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2920);options.addOption("a", "enable-a", false, null);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2921);options.addOption(OptionBuilder.withLongOpt("bfile").hasArg().isRequired().create('b'));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2922);options.addOption(OptionBuilder.withLongOpt("cfile").hasArg().isRequired().create('c'));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2923);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2924);parser.parse(options,args);
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2925);fail("exception should have been thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2926);assertEquals("Incorrect exception message", "Missing required options: b, c", e.getMessage());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2927);assertTrue(e.getMissingOptions().contains("b"));
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2928);assertTrue(e.getMissingOptions().contains("c"));
        }
        catch (ParseException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2929);fail("expected to catch MissingOptionException");
        }
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
    
    public void testMissingRequiredGroup() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vnnbjh29e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingRequiredGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vnnbjh29e() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2930);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2931);OptionGroup group = new OptionGroup();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2932);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2933);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2934);group.setRequired(true);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2935);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2936);options.addOptionGroup(group);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2937);options.addOption(OptionBuilder.isRequired().create("c"));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2938);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2939);parser.parse(options, new String[] { "-c" });
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2940);fail("MissingOptionException not thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2941);assertEquals(1, e.getMissingOptions().size());
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2942);assertTrue(e.getMissingOptions().get(0) instanceof OptionGroup);
        }
        catch (ParseException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2943);fail("Expected to catch MissingOptionException");
        }
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
    
    public void testOptionGroup() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vi1s2n29s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testOptionGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vi1s2n29s() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2944);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2945);OptionGroup group = new OptionGroup();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2946);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2947);group.addOption(OptionBuilder.create("b"));
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2948);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2949);options.addOptionGroup(group);
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2950);parser.parse(options, new String[] { "-b" });
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2951);assertEquals("selected option", "b", group.getSelected());
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testOptionGroupLong() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22hxbi32a0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testOptionGroupLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22hxbi32a0() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2952);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2953);OptionGroup group = new OptionGroup();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2954);group.addOption(OptionBuilder.withLongOpt("foo").create());
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2955);group.addOption(OptionBuilder.withLongOpt("bar").create());
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2956);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2957);options.addOptionGroup(group);
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2958);CommandLine cl = parser.parse(options, new String[] { "--bar" });
        
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2959);assertTrue(cl.hasOption("bar"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2960);assertEquals("selected option", "bar", group.getSelected());
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
    
    public void testReuseOptionsTwice() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kv5yb12a9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testReuseOptionsTwice",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2961,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kv5yb12a9() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2961);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2962);Options opts = new Options();
		__CLR4_5_21zu1zulvn1n6m7.R.inc(2963);opts.addOption(OptionBuilder.isRequired().create('v'));

        // first parsing
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2964);parser.parse(opts, new String[] { "-v" });

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2965);try
        {
            // second parsing, with the same Options instance and an invalid command line
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2966);parser.parse(opts, new String[0]);
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2967);fail("MissingOptionException not thrown");
        }
        catch (MissingOptionException e)
        {
            // expected
        }
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testBursting() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g4pqkl2ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2968,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g4pqkl2ag() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2968);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2969);String[] args = new String[] { "-acbtoast", "foo", "bar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2970);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2971);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2972);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2973);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2974);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2975);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testUnrecognizedOptionWithBursting() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23fy8u32ao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnrecognizedOptionWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23fy8u32ao() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2976);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2977);String[] args = new String[] { "-adbtoast", "foo", "bar" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2978);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2979);parser.parse(options, args);
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2980);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2981);assertEquals("-adbtoast", e.getOption());
        }
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testMissingArgWithBursting() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26h2akx2au();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingArgWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2982,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26h2akx2au() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2982);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2983);String[] args = new String[] { "-acb" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2984);boolean caught = false;

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2985);try
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2986);parser.parse(options, args);
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2987);caught = true;
            __CLR4_5_21zu1zulvn1n6m7.R.inc(2988);assertEquals("option missing an argument", "b", e.getOption().getOpt());
        }

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2989);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testStopBursting() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zby38j2b2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zby38j2b2() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2990);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2991);String[] args = new String[] { "-azc" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2992);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2993);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2994);assertFalse( "Confirm -c is not set", cl.hasOption("c") );

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2995);assertTrue( "Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2996);assertTrue(cl.getArgList().contains("zc"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testStopBursting2() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),2997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cys9wj2b9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopBursting2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cys9wj2b9() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(2997);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(2998);String[] args = new String[] { "-c", "foobar", "-btoast" };

        __CLR4_5_21zu1zulvn1n6m7.R.inc(2999);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3000);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3001);assertTrue("Confirm  2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(3002);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_21zu1zulvn1n6m7.R.inc(3003);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3004);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3005);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3006);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3007);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}

    public void testUnlimitedArgs() throws Exception
    {__CLR4_5_21zu1zulvn1n6m7.R.globalSliceStart(getClass().getName(),3008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25t74252bk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zu1zulvn1n6m7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zu1zulvn1n6m7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnlimitedArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3008,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25t74252bk() throws Exception{try{__CLR4_5_21zu1zulvn1n6m7.R.inc(3008);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3009);String[] args = new String[]{"-e", "one", "two", "-f", "alpha"};

        __CLR4_5_21zu1zulvn1n6m7.R.inc(3010);Options options = new Options();
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3011);options.addOption(OptionBuilder.hasArgs().create("e"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3012);options.addOption(OptionBuilder.hasArgs().create("f"));

        __CLR4_5_21zu1zulvn1n6m7.R.inc(3013);CommandLine cl = parser.parse(options, args);

        __CLR4_5_21zu1zulvn1n6m7.R.inc(3014);assertTrue("Confirm -e is set", cl.hasOption("e"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3015);assertEquals("number of arg for -e", 2, cl.getOptionValues("e").length);
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3016);assertTrue("Confirm -f is set", cl.hasOption("f"));
        __CLR4_5_21zu1zulvn1n6m7.R.inc(3017);assertEquals("number of arg for -f", 1, cl.getOptionValues("f").length);
    }finally{__CLR4_5_21zu1zulvn1n6m7.R.flushNeeded();}}
}
