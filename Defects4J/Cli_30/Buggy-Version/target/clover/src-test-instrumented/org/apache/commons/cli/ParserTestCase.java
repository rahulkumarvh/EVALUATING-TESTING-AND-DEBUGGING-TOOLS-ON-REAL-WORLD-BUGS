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
{static class __CLR4_5_2218218lvn1nf3c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521191983L,8589935092L,3184,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected CommandLineParser parser;

    protected Options options;

    public void setUp()
    {try{__CLR4_5_2218218lvn1nf3c.R.inc(2636);
        __CLR4_5_2218218lvn1nf3c.R.inc(2637);options = new Options()
            .addOption("a", "enable-a", false, "turn [a] on or off")
            .addOption("b", "bfile", true, "set the value of [b]")
            .addOption("c", "copt", false, "turn [c] on or off");
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testSimpleShort() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25gmla721a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSimpleShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2638,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25gmla721a() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2638);
        __CLR4_5_2218218lvn1nf3c.R.inc(2639);String[] args = new String[] { "-a",
                                       "-b", "toast",
                                       "foo", "bar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2640);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2641);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2642);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2643);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2644);assertTrue("Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testSimpleLong() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_283qhtz21h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSimpleLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_283qhtz21h() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2645);
        __CLR4_5_2218218lvn1nf3c.R.inc(2646);String[] args = new String[] { "--enable-a",
                                       "--bfile", "toast",
                                       "foo", "bar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2647);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2648);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_2218218lvn1nf3c.R.inc(2649);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_2218218lvn1nf3c.R.inc(2650);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_2218218lvn1nf3c.R.inc(2651);assertTrue( "Confirm arg of --bfile", cl.getOptionValue( "bfile" ).equals( "toast" ) );
        __CLR4_5_2218218lvn1nf3c.R.inc(2652);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testMultiple() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pj8bhz21p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMultiple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pj8bhz21p() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2653);
        __CLR4_5_2218218lvn1nf3c.R.inc(2654);String[] args = new String[] { "-c",
                                       "foobar",
                                       "-b", "toast" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2655);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_2218218lvn1nf3c.R.inc(2656);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2657);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_2218218lvn1nf3c.R.inc(2658);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_2218218lvn1nf3c.R.inc(2659);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2660);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2661);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2662);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_2218218lvn1nf3c.R.inc(2663);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testMultipleWithLong() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235tfkb220();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMultipleWithLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235tfkb220() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2664);
        __CLR4_5_2218218lvn1nf3c.R.inc(2665);String[] args = new String[] { "--copt",
                                       "foobar",
                                       "--bfile", "toast" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2666);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_2218218lvn1nf3c.R.inc(2667);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2668);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_2218218lvn1nf3c.R.inc(2669);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_2218218lvn1nf3c.R.inc(2670);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2671);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2672);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2673);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_2218218lvn1nf3c.R.inc(2674);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testUnrecognizedOption() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2grwzr722b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnrecognizedOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2grwzr722b() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2675);
        __CLR4_5_2218218lvn1nf3c.R.inc(2676);String[] args = new String[] { "-a", "-d", "-b", "toast", "foo", "bar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2677);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2678);parser.parse(options, args);
            __CLR4_5_2218218lvn1nf3c.R.inc(2679);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2680);assertEquals("-d", e.getOption());
        }
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testMissingArg() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tcx6x522h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tcx6x522h() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2681);
        __CLR4_5_2218218lvn1nf3c.R.inc(2682);String[] args = new String[] { "-b" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2683);boolean caught = false;

        __CLR4_5_2218218lvn1nf3c.R.inc(2684);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2685);parser.parse(options, args);
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2686);caught = true;
            __CLR4_5_2218218lvn1nf3c.R.inc(2687);assertEquals("option missing an argument", "b", e.getOption().getOpt());
        }

        __CLR4_5_2218218lvn1nf3c.R.inc(2688);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testDoubleDash1() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yd81ur22p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testDoubleDash1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yd81ur22p() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2689);
        __CLR4_5_2218218lvn1nf3c.R.inc(2690);String[] args = new String[] { "--copt",
                                       "--",
                                       "-b", "toast" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2691);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2692);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2693);assertTrue("Confirm -b is not set", !cl.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2694);assertTrue("Confirm 2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testDoubleDash2() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xew1bw22v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testDoubleDash2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2695,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xew1bw22v() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2695);
        __CLR4_5_2218218lvn1nf3c.R.inc(2696);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2697);options.addOption(OptionBuilder.hasArg().create('n'));
        __CLR4_5_2218218lvn1nf3c.R.inc(2698);options.addOption(OptionBuilder.create('m'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2699);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2700);parser.parse(options, new String[]{"-n", "--", "-m"});
            __CLR4_5_2218218lvn1nf3c.R.inc(2701);fail("MissingArgumentException not thrown for option -n");
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2702);assertNotNull("option null", e.getOption());
            __CLR4_5_2218218lvn1nf3c.R.inc(2703);assertEquals("n", e.getOption().getOpt());
        }
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
    
    public void testSingleDash() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idzcwd234();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2704,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idzcwd234() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2704);
        __CLR4_5_2218218lvn1nf3c.R.inc(2705);String[] args = new String[] { "--copt",
                                       "-b", "-",
                                       "-a",
                                       "-" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2706);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2707);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2708);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2709);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("-"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2710);assertTrue("Confirm 1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_2218218lvn1nf3c.R.inc(2711);assertTrue("Confirm value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("-"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testStopAtUnexpectedArg() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w2sq2t23c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtUnexpectedArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2712,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w2sq2t23c() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2712);
        __CLR4_5_2218218lvn1nf3c.R.inc(2713);String[] args = new String[] { "-c",
                                       "foober",
                                       "-b",
                                       "toast" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2714);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_2218218lvn1nf3c.R.inc(2715);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2716);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

   public void testStopAtExpectedArg() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26fsujm23h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtExpectedArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2717,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26fsujm23h() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2717);
        __CLR4_5_2218218lvn1nf3c.R.inc(2718);String[] args = new String[]{"-b", "foo"};

        __CLR4_5_2218218lvn1nf3c.R.inc(2719);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_2218218lvn1nf3c.R.inc(2720);assertTrue("Confirm -b is set", cl.hasOption('b'));
        __CLR4_5_2218218lvn1nf3c.R.inc(2721);assertEquals("Confirm -b is set", "foo", cl.getOptionValue('b'));
        __CLR4_5_2218218lvn1nf3c.R.inc(2722);assertTrue("Confirm no extra args: " + cl.getArgList().size(), cl.getArgList().size() == 0);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testStopAtNonOptionShort() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21vvp4o23n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtNonOptionShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21vvp4o23n() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2723);
        __CLR4_5_2218218lvn1nf3c.R.inc(2724);String[] args = new String[]{"-z",
                                     "-a",
                                     "-btoast"};

        __CLR4_5_2218218lvn1nf3c.R.inc(2725);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_2218218lvn1nf3c.R.inc(2726);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2727);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testStopAtNonOptionLong() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21aqvj623s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopAtNonOptionLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21aqvj623s() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2728);
        __CLR4_5_2218218lvn1nf3c.R.inc(2729);String[] args = new String[]{"--zop==1",
                                     "-abtoast",
                                     "--b=bar"};

        __CLR4_5_2218218lvn1nf3c.R.inc(2730);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_2218218lvn1nf3c.R.inc(2731);assertFalse("Confirm -a is not set", cl.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2732);assertFalse("Confirm -b is not set", cl.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2733);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testNegativeArgument() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8jgqd23y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testNegativeArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8jgqd23y() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2734);
        __CLR4_5_2218218lvn1nf3c.R.inc(2735);String[] args = new String[] { "-b", "-1"} ;

        __CLR4_5_2218218lvn1nf3c.R.inc(2736);CommandLine cl = parser.parse(options, args);
        __CLR4_5_2218218lvn1nf3c.R.inc(2737);assertEquals("-1", cl.getOptionValue("b"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testNegativeOption() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kw2kj242();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testNegativeOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2738,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kw2kj242() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2738);
        __CLR4_5_2218218lvn1nf3c.R.inc(2739);String[] args = new String[] { "-b", "-1"} ;
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2740);options.addOption("1", false, null);

        __CLR4_5_2218218lvn1nf3c.R.inc(2741);CommandLine cl = parser.parse(options, args);
        __CLR4_5_2218218lvn1nf3c.R.inc(2742);assertEquals("-1", cl.getOptionValue("b"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
    
    public void testArgumentStartingWithHyphen() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jfa36247();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testArgumentStartingWithHyphen",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jfa36247() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2743);
        __CLR4_5_2218218lvn1nf3c.R.inc(2744);String[] args = new String[]{"-b", "-foo"};

        __CLR4_5_2218218lvn1nf3c.R.inc(2745);CommandLine cl = parser.parse(options, args);
        __CLR4_5_2218218lvn1nf3c.R.inc(2746);assertEquals("-foo", cl.getOptionValue("b"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testShortWithEqual() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohwzdh24b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testShortWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2747,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohwzdh24b() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2747);
        __CLR4_5_2218218lvn1nf3c.R.inc(2748);String[] args = new String[] { "-f=bar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2749);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2750);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2751);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2752);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testShortWithoutEqual() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se6war24h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testShortWithoutEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2753,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se6war24h() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2753);
        __CLR4_5_2218218lvn1nf3c.R.inc(2754);String[] args = new String[] { "-fbar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2755);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2756);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2757);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2758);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testLongWithEqualDoubleDash() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21degsq24n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithEqualDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2759,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21degsq24n() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2759);
        __CLR4_5_2218218lvn1nf3c.R.inc(2760);String[] args = new String[] { "--foo=bar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2761);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2762);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2763);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2764);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testLongWithEqualSingleDash() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qootr524t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qootr524t() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2765);
        __CLR4_5_2218218lvn1nf3c.R.inc(2766);String[] args = new String[] { "-foo=bar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2767);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2768);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2769);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2770);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnksl24z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnksl24z() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2771);
        __CLR4_5_2218218lvn1nf3c.R.inc(2772);String[] args = new String[] { "-foobar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2773);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2774);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2775);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2776);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
    
    public void testAmbiguousLongWithoutEqualSingleDash() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ppu6b255();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testAmbiguousLongWithoutEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ppu6b255() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2777);
        __CLR4_5_2218218lvn1nf3c.R.inc(2778);String[] args = new String[] { "-b", "-foobar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2779);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2780);options.addOption(OptionBuilder.withLongOpt("foo").hasOptionalArg().create('f'));
        __CLR4_5_2218218lvn1nf3c.R.inc(2781);options.addOption(OptionBuilder.withLongOpt("bar").hasOptionalArg().create('b'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2782);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2783);assertTrue(cl.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2784);assertTrue(cl.hasOption("f"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2785);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testLongWithoutEqualDoubleDash() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pyxxr025e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithoutEqualDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pyxxr025e() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2786);
        __CLR4_5_2218218lvn1nf3c.R.inc(2787);String[] args = new String[] { "--foobar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2788);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2789);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2790);CommandLine cl = parser.parse(options, args, true);

        __CLR4_5_2218218lvn1nf3c.R.inc(2791);assertFalse(cl.hasOption("foo")); // foo isn't expected to be recognized with a double dash
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testLongWithUnexpectedArgument1() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28r28vq25k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithUnexpectedArgument1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2792,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28r28vq25k() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2792);
        __CLR4_5_2218218lvn1nf3c.R.inc(2793);String[] args = new String[] { "--foo=bar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2794);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2795);options.addOption(OptionBuilder.withLongOpt("foo").create('f'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2796);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2797);parser.parse(options, args);
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2798);assertEquals("--foo=bar", e.getOption());
            __CLR4_5_2218218lvn1nf3c.R.inc(2799);return;
        }

        __CLR4_5_2218218lvn1nf3c.R.inc(2800);fail("UnrecognizedOptionException not thrown");
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testLongWithUnexpectedArgument2() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c027o725t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testLongWithUnexpectedArgument2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2801,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c027o725t() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2801);
        __CLR4_5_2218218lvn1nf3c.R.inc(2802);String[] args = new String[] { "-foobar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2803);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2804);options.addOption(OptionBuilder.withLongOpt("foo").create('f'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2805);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2806);parser.parse(options, args);
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2807);assertEquals("-foobar", e.getOption());
            __CLR4_5_2218218lvn1nf3c.R.inc(2808);return;
        }

        __CLR4_5_2218218lvn1nf3c.R.inc(2809);fail("UnrecognizedOptionException not thrown");
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testShortWithUnexpectedArgument() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bkns1x262();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testShortWithUnexpectedArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bkns1x262() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2810);
        __CLR4_5_2218218lvn1nf3c.R.inc(2811);String[] args = new String[] { "-f=bar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2812);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2813);options.addOption(OptionBuilder.withLongOpt("foo").create('f'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2814);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2815);parser.parse(options, args);
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2816);assertEquals("-f=bar", e.getOption());
            __CLR4_5_2218218lvn1nf3c.R.inc(2817);return;
        }

        __CLR4_5_2218218lvn1nf3c.R.inc(2818);fail("UnrecognizedOptionException not thrown");
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
    
    public void testPropertiesOption1() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m4t5zy26b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertiesOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2819,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m4t5zy26b() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2819);
        __CLR4_5_2218218lvn1nf3c.R.inc(2820);String[] args = new String[] { "-Jsource=1.5", "-J", "target", "1.5", "foo" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2821);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2822);options.addOption(OptionBuilder.withValueSeparator().hasArgs(2).create('J'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2823);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2824);List values = Arrays.asList(cl.getOptionValues("J"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2825);assertNotNull("null values", values);
        __CLR4_5_2218218lvn1nf3c.R.inc(2826);assertEquals("number of values", 4, values.size());
        __CLR4_5_2218218lvn1nf3c.R.inc(2827);assertEquals("value 1", "source", values.get(0));
        __CLR4_5_2218218lvn1nf3c.R.inc(2828);assertEquals("value 2", "1.5", values.get(1));
        __CLR4_5_2218218lvn1nf3c.R.inc(2829);assertEquals("value 3", "target", values.get(2));
        __CLR4_5_2218218lvn1nf3c.R.inc(2830);assertEquals("value 4", "1.5", values.get(3));
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2831);List argsleft = cl.getArgList();
        __CLR4_5_2218218lvn1nf3c.R.inc(2832);assertEquals("Should be 1 arg left", 1, argsleft.size());
        __CLR4_5_2218218lvn1nf3c.R.inc(2833);assertEquals("Expecting foo", "foo", argsleft.get(0));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testPropertiesOption2() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pdt4sf26q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertiesOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pdt4sf26q() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2834);
        __CLR4_5_2218218lvn1nf3c.R.inc(2835);String[] args = new String[] { "-Dparam1", "-Dparam2=value2", "-D"};

        __CLR4_5_2218218lvn1nf3c.R.inc(2836);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2837);options.addOption(OptionBuilder.withValueSeparator().hasOptionalArgs(2).create('D'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2838);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2839);Properties props = cl.getOptionProperties("D");
        __CLR4_5_2218218lvn1nf3c.R.inc(2840);assertNotNull("null properties", props);
        __CLR4_5_2218218lvn1nf3c.R.inc(2841);assertEquals("number of properties in " + props, 2, props.size());
        __CLR4_5_2218218lvn1nf3c.R.inc(2842);assertEquals("property 1", "true", props.getProperty("param1"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2843);assertEquals("property 2", "value2", props.getProperty("param2"));
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2844);List argsleft = cl.getArgList();
        __CLR4_5_2218218lvn1nf3c.R.inc(2845);assertEquals("Should be no arg left", 0, argsleft.size());
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption1() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tpjutj272();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tpjutj272() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2846);
        __CLR4_5_2218218lvn1nf3c.R.inc(2847);String[] args = new String[] { "--ver" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2848);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2849);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_2218218lvn1nf3c.R.inc(2850);options.addOption(OptionBuilder.withLongOpt("help").create());
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2851);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2852);assertTrue("Confirm --version is set", cl.hasOption("version"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption2() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wyjtm0279();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2853,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wyjtm0279() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2853);
        __CLR4_5_2218218lvn1nf3c.R.inc(2854);String[] args = new String[] { "-ver" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2855);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2856);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_2218218lvn1nf3c.R.inc(2857);options.addOption(OptionBuilder.withLongOpt("help").create());
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2858);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2859);assertTrue("Confirm --version is set", cl.hasOption("version"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption3() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytk9kn27g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2860,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytk9kn27g() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2860);
        __CLR4_5_2218218lvn1nf3c.R.inc(2861);String[] args = new String[] { "--ver=1" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2862);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2863);options.addOption(OptionBuilder.withLongOpt("verbose").hasOptionalArg().create());
        __CLR4_5_2218218lvn1nf3c.R.inc(2864);options.addOption(OptionBuilder.withLongOpt("help").create());
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2865);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2866);assertTrue("Confirm --verbose is set", cl.hasOption("verbose"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2867);assertEquals("1", cl.getOptionValue("verbose"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testUnambiguousPartialLongOption4() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkkas627o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkkas627o() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2868);
        __CLR4_5_2218218lvn1nf3c.R.inc(2869);String[] args = new String[] { "-ver=1" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2870);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2871);options.addOption(OptionBuilder.withLongOpt("verbose").hasOptionalArg().create());
        __CLR4_5_2218218lvn1nf3c.R.inc(2872);options.addOption(OptionBuilder.withLongOpt("help").create());
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2873);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2874);assertTrue("Confirm --verbose is set", cl.hasOption("verbose"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2875);assertEquals("1", cl.getOptionValue("verbose"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
    
    public void testAmbiguousPartialLongOption1() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2ixr427w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2ixr427w() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2876);
        __CLR4_5_2218218lvn1nf3c.R.inc(2877);String[] args = new String[] { "--ver" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2878);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2879);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_2218218lvn1nf3c.R.inc(2880);options.addOption(OptionBuilder.withLongOpt("verbose").create());
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2881);boolean caught = false;
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2882);try 
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2883);parser.parse(options, args);
        }
        catch (AmbiguousOptionException e) 
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2884);caught = true;
            __CLR4_5_2218218lvn1nf3c.R.inc(2885);assertEquals("Partial option", "--ver", e.getOption());
            __CLR4_5_2218218lvn1nf3c.R.inc(2886);assertNotNull("Matching options null", e.getMatchingOptions());
            __CLR4_5_2218218lvn1nf3c.R.inc(2887);assertEquals("Matching options size", 2, e.getMatchingOptions().size());
        }
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2888);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
    
    public void testAmbiguousPartialLongOption2() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sbiwjl289();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sbiwjl289() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2889);
        __CLR4_5_2218218lvn1nf3c.R.inc(2890);String[] args = new String[] { "-ver" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2891);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2892);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_2218218lvn1nf3c.R.inc(2893);options.addOption(OptionBuilder.withLongOpt("verbose").create());
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2894);boolean caught = false;
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2895);try 
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2896);parser.parse(options, args);
        }
        catch (AmbiguousOptionException e) 
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2897);caught = true;
            __CLR4_5_2218218lvn1nf3c.R.inc(2898);assertEquals("Partial option", "-ver", e.getOption());
            __CLR4_5_2218218lvn1nf3c.R.inc(2899);assertNotNull("Matching options null", e.getMatchingOptions());
            __CLR4_5_2218218lvn1nf3c.R.inc(2900);assertEquals("Matching options size", 2, e.getMatchingOptions().size());
        }
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2901);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption3() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkivc228m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkivc228m() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2902);
        __CLR4_5_2218218lvn1nf3c.R.inc(2903);String[] args = new String[] { "--ver=1" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2904);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2905);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_2218218lvn1nf3c.R.inc(2906);options.addOption(OptionBuilder.withLongOpt("verbose").hasOptionalArg().create());
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2907);boolean caught = false;
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2908);try 
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2909);parser.parse(options, args);
        }
        catch (AmbiguousOptionException e) 
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2910);caught = true;
            __CLR4_5_2218218lvn1nf3c.R.inc(2911);assertEquals("Partial option", "--ver", e.getOption());
            __CLR4_5_2218218lvn1nf3c.R.inc(2912);assertNotNull("Matching options null", e.getMatchingOptions());
            __CLR4_5_2218218lvn1nf3c.R.inc(2913);assertEquals("Matching options size", 2, e.getMatchingOptions().size());
        }
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2914);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testAmbiguousPartialLongOption4() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytiu4j28z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2915,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytiu4j28z() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2915);
        __CLR4_5_2218218lvn1nf3c.R.inc(2916);String[] args = new String[] { "-ver=1" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2917);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2918);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_2218218lvn1nf3c.R.inc(2919);options.addOption(OptionBuilder.withLongOpt("verbose").hasOptionalArg().create());
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2920);boolean caught = false;
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2921);try 
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2922);parser.parse(options, args);
        }
        catch (AmbiguousOptionException e) 
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2923);caught = true;
            __CLR4_5_2218218lvn1nf3c.R.inc(2924);assertEquals("Partial option", "-ver", e.getOption());
            __CLR4_5_2218218lvn1nf3c.R.inc(2925);assertNotNull("Matching options null", e.getMatchingOptions());
            __CLR4_5_2218218lvn1nf3c.R.inc(2926);assertEquals("Matching options size", 2, e.getMatchingOptions().size());
        }
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2927);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
    
    public void testPartialLongOptionSingleDash() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcd5i929c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPartialLongOptionSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcd5i929c() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2928);
        __CLR4_5_2218218lvn1nf3c.R.inc(2929);String[] args = new String[] { "-ver" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2930);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2931);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_2218218lvn1nf3c.R.inc(2932);options.addOption(OptionBuilder.hasArg().create('v'));
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2933);CommandLine cl = parser.parse(options, args);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2934);assertTrue("Confirm --version is set", cl.hasOption("version"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2935);assertTrue("Confirm -v is not set", !cl.hasOption("v"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testWithRequiredOption() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29lagml29k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testWithRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29lagml29k() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2936);
        __CLR4_5_2218218lvn1nf3c.R.inc(2937);String[] args = new String[] { "-b", "file" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2938);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2939);options.addOption("a", "enable-a", false, null);
        __CLR4_5_2218218lvn1nf3c.R.inc(2940);options.addOption(OptionBuilder.withLongOpt("bfile").hasArg().isRequired().create('b'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2941);CommandLine cl = parser.parse(options,args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2942);assertTrue("Confirm -a is NOT set", !cl.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2943);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2944);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("file"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2945);assertTrue("Confirm NO of extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testOptionAndRequiredOption() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_282kgvp29u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testOptionAndRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2946,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_282kgvp29u() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2946);
        __CLR4_5_2218218lvn1nf3c.R.inc(2947);String[] args = new String[] { "-a", "-b", "file" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2948);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2949);options.addOption("a", "enable-a", false, null);
        __CLR4_5_2218218lvn1nf3c.R.inc(2950);options.addOption(OptionBuilder.withLongOpt("bfile").hasArg().isRequired().create('b'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2951);CommandLine cl = parser.parse(options,args);

        __CLR4_5_2218218lvn1nf3c.R.inc(2952);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2953);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2954);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("file"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2955);assertTrue("Confirm NO of extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testMissingRequiredOption()
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g6vokx2a4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2956,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g6vokx2a4(){try{__CLR4_5_2218218lvn1nf3c.R.inc(2956);
        __CLR4_5_2218218lvn1nf3c.R.inc(2957);String[] args = new String[] { "-a" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2958);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2959);options.addOption("a", "enable-a", false, null);
        __CLR4_5_2218218lvn1nf3c.R.inc(2960);options.addOption(OptionBuilder.withLongOpt("bfile").hasArg().isRequired().create('b'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2961);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2962);parser.parse(options,args);
            __CLR4_5_2218218lvn1nf3c.R.inc(2963);fail("exception should have been thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2964);assertEquals( "Incorrect exception message", "Missing required option: b", e.getMessage() );
            __CLR4_5_2218218lvn1nf3c.R.inc(2965);assertTrue(e.getMissingOptions().contains("b"));
        }
        catch (ParseException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2966);fail("expected to catch MissingOptionException");
        }
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testMissingRequiredOptions()
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ysjy262af();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingRequiredOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2967,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ysjy262af(){try{__CLR4_5_2218218lvn1nf3c.R.inc(2967);
        __CLR4_5_2218218lvn1nf3c.R.inc(2968);String[] args = new String[] { "-a" };

        __CLR4_5_2218218lvn1nf3c.R.inc(2969);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2970);options.addOption("a", "enable-a", false, null);
        __CLR4_5_2218218lvn1nf3c.R.inc(2971);options.addOption(OptionBuilder.withLongOpt("bfile").hasArg().isRequired().create('b'));
        __CLR4_5_2218218lvn1nf3c.R.inc(2972);options.addOption(OptionBuilder.withLongOpt("cfile").hasArg().isRequired().create('c'));

        __CLR4_5_2218218lvn1nf3c.R.inc(2973);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2974);parser.parse(options,args);
            __CLR4_5_2218218lvn1nf3c.R.inc(2975);fail("exception should have been thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2976);assertEquals("Incorrect exception message", "Missing required options: b, c", e.getMessage());
            __CLR4_5_2218218lvn1nf3c.R.inc(2977);assertTrue(e.getMissingOptions().contains("b"));
            __CLR4_5_2218218lvn1nf3c.R.inc(2978);assertTrue(e.getMissingOptions().contains("c"));
        }
        catch (ParseException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2979);fail("expected to catch MissingOptionException");
        }
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
    
    public void testMissingRequiredGroup() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vnnbjh2as();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingRequiredGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2980,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vnnbjh2as() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2980);
        __CLR4_5_2218218lvn1nf3c.R.inc(2981);OptionGroup group = new OptionGroup();
        __CLR4_5_2218218lvn1nf3c.R.inc(2982);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2983);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2984);group.setRequired(true);

        __CLR4_5_2218218lvn1nf3c.R.inc(2985);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2986);options.addOptionGroup(group);
        __CLR4_5_2218218lvn1nf3c.R.inc(2987);options.addOption(OptionBuilder.isRequired().create("c"));

        __CLR4_5_2218218lvn1nf3c.R.inc(2988);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2989);parser.parse(options, new String[] { "-c" });
            __CLR4_5_2218218lvn1nf3c.R.inc(2990);fail("MissingOptionException not thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2991);assertEquals(1, e.getMissingOptions().size());
            __CLR4_5_2218218lvn1nf3c.R.inc(2992);assertTrue(e.getMissingOptions().get(0) instanceof OptionGroup);
        }
        catch (ParseException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(2993);fail("Expected to catch MissingOptionException");
        }
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
    
    public void testOptionGroup() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),2994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vi1s2n2b6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testOptionGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vi1s2n2b6() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(2994);
        __CLR4_5_2218218lvn1nf3c.R.inc(2995);OptionGroup group = new OptionGroup();
        __CLR4_5_2218218lvn1nf3c.R.inc(2996);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(2997);group.addOption(OptionBuilder.create("b"));
        
        __CLR4_5_2218218lvn1nf3c.R.inc(2998);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(2999);options.addOptionGroup(group);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3000);parser.parse(options, new String[] { "-b" });
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3001);assertEquals("selected option", "b", group.getSelected());
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testOptionGroupLong() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22hxbi32be();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testOptionGroupLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22hxbi32be() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3002);
        __CLR4_5_2218218lvn1nf3c.R.inc(3003);OptionGroup group = new OptionGroup();
        __CLR4_5_2218218lvn1nf3c.R.inc(3004);group.addOption(OptionBuilder.withLongOpt("foo").create());
        __CLR4_5_2218218lvn1nf3c.R.inc(3005);group.addOption(OptionBuilder.withLongOpt("bar").create());
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3006);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(3007);options.addOptionGroup(group);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3008);CommandLine cl = parser.parse(options, new String[] { "--bar" });
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3009);assertTrue(cl.hasOption("bar"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3010);assertEquals("selected option", "bar", group.getSelected());
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
    
    public void testReuseOptionsTwice() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kv5yb12bn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testReuseOptionsTwice",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kv5yb12bn() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3011);
        __CLR4_5_2218218lvn1nf3c.R.inc(3012);Options opts = new Options();
		__CLR4_5_2218218lvn1nf3c.R.inc(3013);opts.addOption(OptionBuilder.isRequired().create('v'));

        // first parsing
        __CLR4_5_2218218lvn1nf3c.R.inc(3014);parser.parse(opts, new String[] { "-v" });

        __CLR4_5_2218218lvn1nf3c.R.inc(3015);try
        {
            // second parsing, with the same Options instance and an invalid command line
            __CLR4_5_2218218lvn1nf3c.R.inc(3016);parser.parse(opts, new String[0]);
            __CLR4_5_2218218lvn1nf3c.R.inc(3017);fail("MissingOptionException not thrown");
        }
        catch (MissingOptionException e)
        {
            // expected
        }
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testBursting() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g4pqkl2bu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g4pqkl2bu() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3018);
        __CLR4_5_2218218lvn1nf3c.R.inc(3019);String[] args = new String[] { "-acbtoast", "foo", "bar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(3020);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(3021);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3022);assertTrue( "Confirm -b is set", cl.hasOption("b") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3023);assertTrue( "Confirm -c is set", cl.hasOption("c") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3024);assertTrue( "Confirm arg of -b", cl.getOptionValue("b").equals("toast") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3025);assertTrue( "Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testUnrecognizedOptionWithBursting() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23fy8u32c2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnrecognizedOptionWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3026,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23fy8u32c2() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3026);
        __CLR4_5_2218218lvn1nf3c.R.inc(3027);String[] args = new String[] { "-adbtoast", "foo", "bar" };

        __CLR4_5_2218218lvn1nf3c.R.inc(3028);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(3029);parser.parse(options, args);
            __CLR4_5_2218218lvn1nf3c.R.inc(3030);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(3031);assertEquals("-adbtoast", e.getOption());
        }
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testMissingArgWithBursting() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26h2akx2c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testMissingArgWithBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26h2akx2c8() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3032);
        __CLR4_5_2218218lvn1nf3c.R.inc(3033);String[] args = new String[] { "-acb" };

        __CLR4_5_2218218lvn1nf3c.R.inc(3034);boolean caught = false;

        __CLR4_5_2218218lvn1nf3c.R.inc(3035);try
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(3036);parser.parse(options, args);
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_2218218lvn1nf3c.R.inc(3037);caught = true;
            __CLR4_5_2218218lvn1nf3c.R.inc(3038);assertEquals("option missing an argument", "b", e.getOption().getOpt());
        }

        __CLR4_5_2218218lvn1nf3c.R.inc(3039);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testStopBursting() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zby38j2cg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopBursting",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3040,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zby38j2cg() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3040);
        __CLR4_5_2218218lvn1nf3c.R.inc(3041);String[] args = new String[] { "-azc" };

        __CLR4_5_2218218lvn1nf3c.R.inc(3042);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_2218218lvn1nf3c.R.inc(3043);assertTrue( "Confirm -a is set", cl.hasOption("a") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3044);assertFalse( "Confirm -c is not set", cl.hasOption("c") );

        __CLR4_5_2218218lvn1nf3c.R.inc(3045);assertTrue( "Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_2218218lvn1nf3c.R.inc(3046);assertTrue(cl.getArgList().contains("zc"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testStopBursting2() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cys9wj2cn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testStopBursting2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cys9wj2cn() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3047);
        __CLR4_5_2218218lvn1nf3c.R.inc(3048);String[] args = new String[] { "-c", "foobar", "-btoast" };

        __CLR4_5_2218218lvn1nf3c.R.inc(3049);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_2218218lvn1nf3c.R.inc(3050);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3051);assertTrue("Confirm  2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);

        __CLR4_5_2218218lvn1nf3c.R.inc(3052);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_2218218lvn1nf3c.R.inc(3053);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3054);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3055);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3056);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_2218218lvn1nf3c.R.inc(3057);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testUnlimitedArgs() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25t74252cy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testUnlimitedArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3058,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25t74252cy() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3058);
        __CLR4_5_2218218lvn1nf3c.R.inc(3059);String[] args = new String[]{"-e", "one", "two", "-f", "alpha"};

        __CLR4_5_2218218lvn1nf3c.R.inc(3060);Options options = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(3061);options.addOption(OptionBuilder.hasArgs().create("e"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3062);options.addOption(OptionBuilder.hasArgs().create("f"));

        __CLR4_5_2218218lvn1nf3c.R.inc(3063);CommandLine cl = parser.parse(options, args);

        __CLR4_5_2218218lvn1nf3c.R.inc(3064);assertTrue("Confirm -e is set", cl.hasOption("e"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3065);assertEquals("number of arg for -e", 2, cl.getOptionValues("e").length);
        __CLR4_5_2218218lvn1nf3c.R.inc(3066);assertTrue("Confirm -f is set", cl.hasOption("f"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3067);assertEquals("number of arg for -f", 1, cl.getOptionValues("f").length);
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    private CommandLine parse(CommandLineParser parser, Options opts, String[] args, Properties properties) throws ParseException {try{__CLR4_5_2218218lvn1nf3c.R.inc(3068);
        __CLR4_5_2218218lvn1nf3c.R.inc(3069);if ((((parser instanceof Parser)&&(__CLR4_5_2218218lvn1nf3c.R.iget(3070)!=0|true))||(__CLR4_5_2218218lvn1nf3c.R.iget(3071)==0&false))) {{
            __CLR4_5_2218218lvn1nf3c.R.inc(3072);return ((Parser) parser).parse(opts, args, properties);
        } }else {__CLR4_5_2218218lvn1nf3c.R.inc(3073);if ((((parser instanceof DefaultParser)&&(__CLR4_5_2218218lvn1nf3c.R.iget(3074)!=0|true))||(__CLR4_5_2218218lvn1nf3c.R.iget(3075)==0&false))) {{
            __CLR4_5_2218218lvn1nf3c.R.inc(3076);return ((DefaultParser) parser).parse(opts, args, properties);
        } }else {{
            __CLR4_5_2218218lvn1nf3c.R.inc(3077);throw new UnsupportedOperationException("Default options not supported by this parser");
        }
    }}}finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testPropertyOptionSingularValue() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2hv392di();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertyOptionSingularValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2hv392di() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3078);
        __CLR4_5_2218218lvn1nf3c.R.inc(3079);Options opts = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(3080);opts.addOption(OptionBuilder.hasOptionalArgs(2).withLongOpt("hide").create());        
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3081);Properties properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3082);properties.setProperty( "hide", "seek" );

        __CLR4_5_2218218lvn1nf3c.R.inc(3083);CommandLine cmd = parse(parser, opts, null, properties);
        __CLR4_5_2218218lvn1nf3c.R.inc(3084);assertTrue( cmd.hasOption("hide") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3085);assertEquals( "seek", cmd.getOptionValue("hide") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3086);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testPropertyOptionFlags() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vt3w1e2dr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertyOptionFlags",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vt3w1e2dr() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3087);
        __CLR4_5_2218218lvn1nf3c.R.inc(3088);Options opts = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(3089);opts.addOption("a", false, "toggle -a");
        __CLR4_5_2218218lvn1nf3c.R.inc(3090);opts.addOption("c", "c", false, "toggle -c");
        __CLR4_5_2218218lvn1nf3c.R.inc(3091);opts.addOption(OptionBuilder.hasOptionalArg().create('e'));
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3092);Properties properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3093);properties.setProperty("a", "true");
        __CLR4_5_2218218lvn1nf3c.R.inc(3094);properties.setProperty("c", "yes");
        __CLR4_5_2218218lvn1nf3c.R.inc(3095);properties.setProperty("e", "1");
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3096);CommandLine cmd = parse(parser, opts, null, properties);
        __CLR4_5_2218218lvn1nf3c.R.inc(3097);assertTrue(cmd.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3098);assertTrue(cmd.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3099);assertTrue(cmd.hasOption("e"));
        
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3100);properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3101);properties.setProperty("a", "false");
        __CLR4_5_2218218lvn1nf3c.R.inc(3102);properties.setProperty("c", "no");
        __CLR4_5_2218218lvn1nf3c.R.inc(3103);properties.setProperty("e", "0");
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3104);cmd = parse(parser, opts, null, properties);
        __CLR4_5_2218218lvn1nf3c.R.inc(3105);assertTrue(!cmd.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3106);assertTrue(!cmd.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3107);assertTrue(cmd.hasOption("e")); // this option accepts an argument
        
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3108);properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3109);properties.setProperty("a", "TRUE");
        __CLR4_5_2218218lvn1nf3c.R.inc(3110);properties.setProperty("c", "nO");
        __CLR4_5_2218218lvn1nf3c.R.inc(3111);properties.setProperty("e", "TrUe");
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3112);cmd = parse(parser, opts, null, properties);
        __CLR4_5_2218218lvn1nf3c.R.inc(3113);assertTrue(cmd.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3114);assertTrue(!cmd.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3115);assertTrue(cmd.hasOption("e"));
        
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3116);properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3117);properties.setProperty("a", "just a string");
        __CLR4_5_2218218lvn1nf3c.R.inc(3118);properties.setProperty("e", "");
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3119);cmd = parse(parser, opts, null, properties);
        __CLR4_5_2218218lvn1nf3c.R.inc(3120);assertTrue(!cmd.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3121);assertTrue(!cmd.hasOption("c"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3122);assertTrue(cmd.hasOption("e"));
        
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3123);properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3124);properties.setProperty("a", "0");
        __CLR4_5_2218218lvn1nf3c.R.inc(3125);properties.setProperty("c", "1");
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3126);cmd = parse(parser, opts, null, properties);
        __CLR4_5_2218218lvn1nf3c.R.inc(3127);assertTrue(!cmd.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3128);assertTrue(cmd.hasOption("c"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}} 

    public void testPropertyOptionMultipleValues() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27085at2ex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertyOptionMultipleValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27085at2ex() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3129);
        __CLR4_5_2218218lvn1nf3c.R.inc(3130);Options opts = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(3131);opts.addOption(OptionBuilder.hasArgs().withValueSeparator(',').create('k'));
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3132);Properties properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3133);properties.setProperty( "k", "one,two" );

        __CLR4_5_2218218lvn1nf3c.R.inc(3134);String[] values = new String[] { "one", "two" };

        __CLR4_5_2218218lvn1nf3c.R.inc(3135);CommandLine cmd = parse(parser, opts, null, properties);
        __CLR4_5_2218218lvn1nf3c.R.inc(3136);assertTrue( cmd.hasOption("k") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3137);assertTrue( Arrays.equals( values, cmd.getOptionValues('k') ) );
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testPropertyOverrideValues() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vhymsk2f6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertyOverrideValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3138,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vhymsk2f6() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3138);
        __CLR4_5_2218218lvn1nf3c.R.inc(3139);Options opts = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(3140);opts.addOption(OptionBuilder.hasOptionalArgs(2).create('i'));
        __CLR4_5_2218218lvn1nf3c.R.inc(3141);opts.addOption(OptionBuilder.hasOptionalArgs().create('j'));
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3142);String[] args = new String[] { "-j", "found", "-i", "ink" };

        __CLR4_5_2218218lvn1nf3c.R.inc(3143);Properties properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3144);properties.setProperty( "j", "seek" );

        __CLR4_5_2218218lvn1nf3c.R.inc(3145);CommandLine cmd = parse(parser, opts, args, properties);
        __CLR4_5_2218218lvn1nf3c.R.inc(3146);assertTrue( cmd.hasOption("j") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3147);assertEquals( "found", cmd.getOptionValue("j") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3148);assertTrue( cmd.hasOption("i") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3149);assertEquals( "ink", cmd.getOptionValue("i") );
        __CLR4_5_2218218lvn1nf3c.R.inc(3150);assertTrue( !cmd.hasOption("fake") );
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testPropertyOptionRequired() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2urjv5u2fj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertyOptionRequired",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3151,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2urjv5u2fj() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3151);
        __CLR4_5_2218218lvn1nf3c.R.inc(3152);Options opts = new Options();
        __CLR4_5_2218218lvn1nf3c.R.inc(3153);opts.addOption(OptionBuilder.isRequired().create("f"));
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3154);Properties properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3155);properties.setProperty("f", "true");
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3156);CommandLine cmd = parse(parser, opts, null, properties);
        __CLR4_5_2218218lvn1nf3c.R.inc(3157);assertTrue(cmd.hasOption("f"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testPropertyOptionUnexpected() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2os9uyc2fq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertyOptionUnexpected",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3158,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2os9uyc2fq() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3158);
        __CLR4_5_2218218lvn1nf3c.R.inc(3159);Options opts = new Options();
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3160);Properties properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3161);properties.setProperty("f", "true");
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3162);try {
            __CLR4_5_2218218lvn1nf3c.R.inc(3163);parse(parser, opts, null, properties);
            __CLR4_5_2218218lvn1nf3c.R.inc(3164);fail("UnrecognizedOptionException expected");
        } catch (UnrecognizedOptionException e) {
            // expected
        }
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}

    public void testPropertyOptionGroup() throws Exception
    {__CLR4_5_2218218lvn1nf3c.R.globalSliceStart(getClass().getName(),3165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jime3u2fx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2218218lvn1nf3c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2218218lvn1nf3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ParserTestCase.testPropertyOptionGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3165,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jime3u2fx() throws Exception{try{__CLR4_5_2218218lvn1nf3c.R.inc(3165);
        __CLR4_5_2218218lvn1nf3c.R.inc(3166);Options opts = new Options();
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3167);OptionGroup group1 = new OptionGroup();
        __CLR4_5_2218218lvn1nf3c.R.inc(3168);group1.addOption(new Option("a", null));
        __CLR4_5_2218218lvn1nf3c.R.inc(3169);group1.addOption(new Option("b", null));
        __CLR4_5_2218218lvn1nf3c.R.inc(3170);opts.addOptionGroup(group1);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3171);OptionGroup group2 = new OptionGroup();
        __CLR4_5_2218218lvn1nf3c.R.inc(3172);group2.addOption(new Option("x", null));
        __CLR4_5_2218218lvn1nf3c.R.inc(3173);group2.addOption(new Option("y", null));
        __CLR4_5_2218218lvn1nf3c.R.inc(3174);opts.addOptionGroup(group2);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3175);String[] args = new String[] { "-a" };
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3176);Properties properties = new Properties();
        __CLR4_5_2218218lvn1nf3c.R.inc(3177);properties.put("b", "true");
        __CLR4_5_2218218lvn1nf3c.R.inc(3178);properties.put("x", "true");
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3179);CommandLine cmd = parse(parser, opts, args, properties);
        
        __CLR4_5_2218218lvn1nf3c.R.inc(3180);assertTrue(cmd.hasOption("a"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3181);assertFalse(cmd.hasOption("b"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3182);assertTrue(cmd.hasOption("x"));
        __CLR4_5_2218218lvn1nf3c.R.inc(3183);assertFalse(cmd.hasOption("y"));
    }finally{__CLR4_5_2218218lvn1nf3c.R.flushNeeded();}}
}
