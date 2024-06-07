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

import java.util.ArrayList;
import java.util.Collection;

import junit.framework.TestCase;

/**
 * @author Rob Oxspring roxspring@apache.org
 * @version $Revision$
 */
public class OptionsTest extends TestCase
{static class __CLR4_5_21xe1xelvn1n6k1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,2586,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void testSimple()
    {__CLR4_5_21xe1xelvn1n6k1.R.globalSliceStart(getClass().getName(),2498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uh9yj1xe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xe1xelvn1n6k1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xe1xelvn1n6k1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2498,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uh9yj1xe(){try{__CLR4_5_21xe1xelvn1n6k1.R.inc(2498);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2499);Options opts = new Options();

        __CLR4_5_21xe1xelvn1n6k1.R.inc(2500);opts.addOption("a", false, "toggle -a");
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2501);opts.addOption("b", true, "toggle -b");

        __CLR4_5_21xe1xelvn1n6k1.R.inc(2502);assertTrue(opts.hasOption("a"));
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2503);assertTrue(opts.hasOption("b"));
    }finally{__CLR4_5_21xe1xelvn1n6k1.R.flushNeeded();}}

    public void testDuplicateSimple()
    {__CLR4_5_21xe1xelvn1n6k1.R.globalSliceStart(getClass().getName(),2504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ibqqvm1xk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xe1xelvn1n6k1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xe1xelvn1n6k1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testDuplicateSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2504,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ibqqvm1xk(){try{__CLR4_5_21xe1xelvn1n6k1.R.inc(2504);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2505);Options opts = new Options();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2506);opts.addOption("a", false, "toggle -a");
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2507);opts.addOption("a", true, "toggle -a*");

        __CLR4_5_21xe1xelvn1n6k1.R.inc(2508);assertEquals("last one in wins", "toggle -a*", opts.getOption("a").getDescription());
    }finally{__CLR4_5_21xe1xelvn1n6k1.R.flushNeeded();}}

    public void testLong()
    {__CLR4_5_21xe1xelvn1n6k1.R.globalSliceStart(getClass().getName(),2509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mz1xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xe1xelvn1n6k1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xe1xelvn1n6k1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2509,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mz1xp(){try{__CLR4_5_21xe1xelvn1n6k1.R.inc(2509);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2510);Options opts = new Options();

        __CLR4_5_21xe1xelvn1n6k1.R.inc(2511);opts.addOption("a", "--a", false, "toggle -a");
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2512);opts.addOption("b", "--b", true, "set -b");

        __CLR4_5_21xe1xelvn1n6k1.R.inc(2513);assertTrue(opts.hasOption("a"));
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2514);assertTrue(opts.hasOption("b"));
    }finally{__CLR4_5_21xe1xelvn1n6k1.R.flushNeeded();}}

    public void testDuplicateLong()
    {__CLR4_5_21xe1xelvn1n6k1.R.globalSliceStart(getClass().getName(),2515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i3lt241xv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xe1xelvn1n6k1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xe1xelvn1n6k1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testDuplicateLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2515,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i3lt241xv(){try{__CLR4_5_21xe1xelvn1n6k1.R.inc(2515);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2516);Options opts = new Options();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2517);opts.addOption("a", "--a", false, "toggle -a");
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2518);opts.addOption("a", "--a", false, "toggle -a*");
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2519);assertEquals("last one in wins", "toggle -a*", opts.getOption("a").getDescription());
    }finally{__CLR4_5_21xe1xelvn1n6k1.R.flushNeeded();}}

    public void testHelpOptions()
    {__CLR4_5_21xe1xelvn1n6k1.R.globalSliceStart(getClass().getName(),2520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ik63y1y0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xe1xelvn1n6k1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xe1xelvn1n6k1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testHelpOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2520,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ik63y1y0(){try{__CLR4_5_21xe1xelvn1n6k1.R.inc(2520);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2521);Option longOnly1 = OptionBuilder.withLongOpt("long-only1").create();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2522);Option longOnly2 = OptionBuilder.withLongOpt("long-only2").create();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2523);Option shortOnly1 = OptionBuilder.create("1");
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2524);Option shortOnly2 = OptionBuilder.create("2");
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2525);Option bothA = OptionBuilder.withLongOpt("bothA").create("a");
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2526);Option bothB = OptionBuilder.withLongOpt("bothB").create("b");
        
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2527);Options options = new Options();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2528);options.addOption(longOnly1);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2529);options.addOption(longOnly2);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2530);options.addOption(shortOnly1);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2531);options.addOption(shortOnly2);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2532);options.addOption(bothA);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2533);options.addOption(bothB);
        
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2534);Collection allOptions = new ArrayList();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2535);allOptions.add(longOnly1);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2536);allOptions.add(longOnly2);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2537);allOptions.add(shortOnly1);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2538);allOptions.add(shortOnly2);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2539);allOptions.add(bothA);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2540);allOptions.add(bothB);
        
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2541);Collection helpOptions = options.helpOptions();
        
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2542);assertTrue("Everything in all should be in help", helpOptions.containsAll(allOptions));
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2543);assertTrue("Everything in help should be in all", allOptions.containsAll(helpOptions));        
    }finally{__CLR4_5_21xe1xelvn1n6k1.R.flushNeeded();}}

    public void testMissingOptionException() throws ParseException
    {__CLR4_5_21xe1xelvn1n6k1.R.globalSliceStart(getClass().getName(),2544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gibgst1yo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xe1xelvn1n6k1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xe1xelvn1n6k1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testMissingOptionException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gibgst1yo() throws ParseException{try{__CLR4_5_21xe1xelvn1n6k1.R.inc(2544);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2545);Options options = new Options();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2546);options.addOption(OptionBuilder.isRequired().create("f"));
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2547);try
        {
            __CLR4_5_21xe1xelvn1n6k1.R.inc(2548);new PosixParser().parse(options, new String[0]);
            __CLR4_5_21xe1xelvn1n6k1.R.inc(2549);fail("Expected MissingOptionException to be thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21xe1xelvn1n6k1.R.inc(2550);assertEquals("Missing required option: f", e.getMessage());
        }
    }finally{__CLR4_5_21xe1xelvn1n6k1.R.flushNeeded();}}

    public void testMissingOptionsException() throws ParseException
    {__CLR4_5_21xe1xelvn1n6k1.R.globalSliceStart(getClass().getName(),2551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pcdd2s1yv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xe1xelvn1n6k1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xe1xelvn1n6k1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testMissingOptionsException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2551,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pcdd2s1yv() throws ParseException{try{__CLR4_5_21xe1xelvn1n6k1.R.inc(2551);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2552);Options options = new Options();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2553);options.addOption(OptionBuilder.isRequired().create("f"));
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2554);options.addOption(OptionBuilder.isRequired().create("x"));
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2555);try
        {
            __CLR4_5_21xe1xelvn1n6k1.R.inc(2556);new PosixParser().parse(options, new String[0]);
            __CLR4_5_21xe1xelvn1n6k1.R.inc(2557);fail("Expected MissingOptionException to be thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21xe1xelvn1n6k1.R.inc(2558);assertEquals("Missing required options: f, x", e.getMessage());
        }
    }finally{__CLR4_5_21xe1xelvn1n6k1.R.flushNeeded();}}

    public void testToString()
    {__CLR4_5_21xe1xelvn1n6k1.R.globalSliceStart(getClass().getName(),2559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid1z3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xe1xelvn1n6k1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xe1xelvn1n6k1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid1z3(){try{__CLR4_5_21xe1xelvn1n6k1.R.inc(2559);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2560);Options options = new Options();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2561);options.addOption("f", "foo", true, "Foo");
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2562);options.addOption("b", "bar", false, "Bar");

        __CLR4_5_21xe1xelvn1n6k1.R.inc(2563);String s = options.toString();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2564);assertNotNull("null string returned", s);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2565);assertTrue("foo option missing", s.toLowerCase().indexOf("foo") != -1);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2566);assertTrue("bar option missing", s.toLowerCase().indexOf("bar") != -1);
    }finally{__CLR4_5_21xe1xelvn1n6k1.R.flushNeeded();}}

    public void testGetOptionsGroups()
    {__CLR4_5_21xe1xelvn1n6k1.R.globalSliceStart(getClass().getName(),2567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzfkph1zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xe1xelvn1n6k1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xe1xelvn1n6k1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testGetOptionsGroups",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2567,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzfkph1zb(){try{__CLR4_5_21xe1xelvn1n6k1.R.inc(2567);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2568);Options options = new Options();

        __CLR4_5_21xe1xelvn1n6k1.R.inc(2569);OptionGroup group1 = new OptionGroup();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2570);group1.addOption(OptionBuilder.create('a'));
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2571);group1.addOption(OptionBuilder.create('b'));

        __CLR4_5_21xe1xelvn1n6k1.R.inc(2572);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2573);group2.addOption(OptionBuilder.create('x'));
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2574);group2.addOption(OptionBuilder.create('y'));

        __CLR4_5_21xe1xelvn1n6k1.R.inc(2575);options.addOptionGroup(group1);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2576);options.addOptionGroup(group2);

        __CLR4_5_21xe1xelvn1n6k1.R.inc(2577);assertNotNull(options.getOptionGroups());
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2578);assertEquals(2, options.getOptionGroups().size());
    }finally{__CLR4_5_21xe1xelvn1n6k1.R.flushNeeded();}}
    
    public void testGetMatchingOpts()
    {__CLR4_5_21xe1xelvn1n6k1.R.globalSliceStart(getClass().getName(),2579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ld5eg1zn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xe1xelvn1n6k1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xe1xelvn1n6k1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testGetMatchingOpts",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2579,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ld5eg1zn(){try{__CLR4_5_21xe1xelvn1n6k1.R.inc(2579);
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2580);Options options = new Options();
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2581);options.addOption(OptionBuilder.withLongOpt("version").create());
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2582);options.addOption(OptionBuilder.withLongOpt("verbose").create());
        
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2583);assertTrue(options.getMatchingOptions("foo").isEmpty());
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2584);assertEquals(1, options.getMatchingOptions("version").size());
        __CLR4_5_21xe1xelvn1n6k1.R.inc(2585);assertEquals(2, options.getMatchingOptions("ver").size());
    }finally{__CLR4_5_21xe1xelvn1n6k1.R.flushNeeded();}}
}
