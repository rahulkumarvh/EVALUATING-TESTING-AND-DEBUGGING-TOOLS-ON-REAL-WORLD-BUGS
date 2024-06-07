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

import junit.framework.TestCase;

public class ValuesTest extends TestCase
{static class __CLR4_5_21zn1znlvl36yhm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402850486L,8589935092L,2653,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** CommandLine instance */
    private CommandLine _cmdline = null;

    public void setUp() throws Exception
    {try{__CLR4_5_21zn1znlvl36yhm.R.inc(2579);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2580);Options options = new Options();

        __CLR4_5_21zn1znlvl36yhm.R.inc(2581);options.addOption("a", false, "toggle -a");
        __CLR4_5_21zn1znlvl36yhm.R.inc(2582);options.addOption("b", true, "set -b");
        __CLR4_5_21zn1znlvl36yhm.R.inc(2583);options.addOption("c", "c", false, "toggle -c");
        __CLR4_5_21zn1znlvl36yhm.R.inc(2584);options.addOption("d", "d", true, "set -d");

        __CLR4_5_21zn1znlvl36yhm.R.inc(2585);options.addOption(OptionBuilder.withLongOpt("e").hasArgs().withDescription("set -e ").create('e'));
        __CLR4_5_21zn1znlvl36yhm.R.inc(2586);options.addOption("f", "f", false, "jk");
        __CLR4_5_21zn1znlvl36yhm.R.inc(2587);options.addOption(OptionBuilder.withLongOpt("g").hasArgs(2).withDescription("set -g").create('g'));
        __CLR4_5_21zn1znlvl36yhm.R.inc(2588);options.addOption(OptionBuilder.withLongOpt("h").hasArgs(2).withDescription("set -h").create('h'));
        __CLR4_5_21zn1znlvl36yhm.R.inc(2589);options.addOption(OptionBuilder.withLongOpt("i").withDescription("set -i").create('i'));
        __CLR4_5_21zn1znlvl36yhm.R.inc(2590);options.addOption(OptionBuilder.withLongOpt("j").hasArgs().withDescription("set -j").withValueSeparator('=').create('j'));
        __CLR4_5_21zn1znlvl36yhm.R.inc(2591);options.addOption(OptionBuilder.withLongOpt("k").hasArgs().withDescription("set -k").withValueSeparator('=').create('k'));
        __CLR4_5_21zn1znlvl36yhm.R.inc(2592);options.addOption(OptionBuilder.withLongOpt("m").hasArgs().withDescription("set -m").withValueSeparator().create('m'));

        __CLR4_5_21zn1znlvl36yhm.R.inc(2593);String[] args = new String[] { "-a",
                                       "-b", "foo",
                                       "--c",
                                       "--d", "bar",
                                       "-e", "one", "two",
                                       "-f",
                                       "arg1", "arg2",
                                       "-g", "val1", "val2" , "arg3",
                                       "-h", "val1", "-i",
                                       "-h", "val2",
                                       "-jkey=value",
                                       "-j", "key=value",
                                       "-kkey1=value1", 
                                       "-kkey2=value2",
                                       "-mkey=value"};

        __CLR4_5_21zn1znlvl36yhm.R.inc(2594);CommandLineParser parser = new PosixParser();

        __CLR4_5_21zn1znlvl36yhm.R.inc(2595);_cmdline = parser.parse(options,args);
    }finally{__CLR4_5_21zn1znlvl36yhm.R.flushNeeded();}}

    public void testShortArgs()
    {__CLR4_5_21zn1znlvl36yhm.R.globalSliceStart(getClass().getName(),2596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jty45u204();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zn1znlvl36yhm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zn1znlvl36yhm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testShortArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jty45u204(){try{__CLR4_5_21zn1znlvl36yhm.R.inc(2596);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2597);assertTrue( _cmdline.hasOption("a") );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2598);assertTrue( _cmdline.hasOption("c") );

        __CLR4_5_21zn1znlvl36yhm.R.inc(2599);assertNull( _cmdline.getOptionValues("a") );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2600);assertNull( _cmdline.getOptionValues("c") );
    }finally{__CLR4_5_21zn1znlvl36yhm.R.flushNeeded();}}

    public void testShortArgsWithValue()
    {__CLR4_5_21zn1znlvl36yhm.R.globalSliceStart(getClass().getName(),2601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sj2saz209();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zn1znlvl36yhm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zn1znlvl36yhm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testShortArgsWithValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sj2saz209(){try{__CLR4_5_21zn1znlvl36yhm.R.inc(2601);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2602);assertTrue( _cmdline.hasOption("b") );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2603);assertTrue( _cmdline.getOptionValue("b").equals("foo"));
        __CLR4_5_21zn1znlvl36yhm.R.inc(2604);assertEquals(1, _cmdline.getOptionValues("b").length);

        __CLR4_5_21zn1znlvl36yhm.R.inc(2605);assertTrue( _cmdline.hasOption("d") );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2606);assertTrue( _cmdline.getOptionValue("d").equals("bar"));
        __CLR4_5_21zn1znlvl36yhm.R.inc(2607);assertEquals(1, _cmdline.getOptionValues("d").length);
    }finally{__CLR4_5_21zn1znlvl36yhm.R.flushNeeded();}}

    public void testMultipleArgValues()
    {__CLR4_5_21zn1znlvl36yhm.R.globalSliceStart(getClass().getName(),2608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eqlml20g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zn1znlvl36yhm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zn1znlvl36yhm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testMultipleArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2608,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eqlml20g(){try{__CLR4_5_21zn1znlvl36yhm.R.inc(2608);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2609);String[] result = _cmdline.getOptionValues("e");
        __CLR4_5_21zn1znlvl36yhm.R.inc(2610);String[] values = new String[] { "one", "two" };
        __CLR4_5_21zn1znlvl36yhm.R.inc(2611);assertTrue( _cmdline.hasOption("e") );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2612);assertEquals(2, _cmdline.getOptionValues("e").length);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2613);assertTrue( Arrays.equals( values, _cmdline.getOptionValues("e") ) );
    }finally{__CLR4_5_21zn1znlvl36yhm.R.flushNeeded();}}

    public void testTwoArgValues()
    {__CLR4_5_21zn1znlvl36yhm.R.globalSliceStart(getClass().getName(),2614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qmk4uz20m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zn1znlvl36yhm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zn1znlvl36yhm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testTwoArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qmk4uz20m(){try{__CLR4_5_21zn1znlvl36yhm.R.inc(2614);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2615);String[] result = _cmdline.getOptionValues("g");
        __CLR4_5_21zn1znlvl36yhm.R.inc(2616);String[] values = new String[] { "val1", "val2" };
        __CLR4_5_21zn1znlvl36yhm.R.inc(2617);assertTrue( _cmdline.hasOption("g") );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2618);assertEquals(2, _cmdline.getOptionValues("g").length);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2619);assertTrue( Arrays.equals( values, _cmdline.getOptionValues("g") ) );
    }finally{__CLR4_5_21zn1znlvl36yhm.R.flushNeeded();}}

    public void testComplexValues()
    {__CLR4_5_21zn1znlvl36yhm.R.globalSliceStart(getClass().getName(),2620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g011af20s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zn1znlvl36yhm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zn1znlvl36yhm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testComplexValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2620,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g011af20s(){try{__CLR4_5_21zn1znlvl36yhm.R.inc(2620);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2621);String[] result = _cmdline.getOptionValues("h");
        __CLR4_5_21zn1znlvl36yhm.R.inc(2622);String[] values = new String[] { "val1", "val2" };
        __CLR4_5_21zn1znlvl36yhm.R.inc(2623);assertTrue( _cmdline.hasOption("i") );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2624);assertTrue( _cmdline.hasOption("h") );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2625);assertEquals(2, _cmdline.getOptionValues("h").length);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2626);assertTrue( Arrays.equals( values, _cmdline.getOptionValues("h") ) );
    }finally{__CLR4_5_21zn1znlvl36yhm.R.flushNeeded();}}

    public void testExtraArgs()
    {__CLR4_5_21zn1znlvl36yhm.R.globalSliceStart(getClass().getName(),2627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4eohq20z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zn1znlvl36yhm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zn1znlvl36yhm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testExtraArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2627,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4eohq20z(){try{__CLR4_5_21zn1znlvl36yhm.R.inc(2627);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2628);String[] args = new String[] { "arg1", "arg2", "arg3" };
        __CLR4_5_21zn1znlvl36yhm.R.inc(2629);assertEquals(3, _cmdline.getArgs().length);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2630);assertTrue( Arrays.equals( args, _cmdline.getArgs() ) );
    }finally{__CLR4_5_21zn1znlvl36yhm.R.flushNeeded();}}

    public void testCharSeparator()
    {__CLR4_5_21zn1znlvl36yhm.R.globalSliceStart(getClass().getName(),2631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qslhuk213();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zn1znlvl36yhm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zn1znlvl36yhm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testCharSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2631,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qslhuk213(){try{__CLR4_5_21zn1znlvl36yhm.R.inc(2631);
        // tests the char methods of CommandLine that delegate to
        // the String methods
        __CLR4_5_21zn1znlvl36yhm.R.inc(2632);String[] values = new String[] { "key", "value", "key", "value" };
        __CLR4_5_21zn1znlvl36yhm.R.inc(2633);assertTrue( _cmdline.hasOption( "j" ) );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2634);assertTrue( _cmdline.hasOption( 'j' ) );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2635);assertEquals( 4, _cmdline.getOptionValues( "j" ).length );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2636);assertEquals( 4, _cmdline.getOptionValues( 'j' ).length );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2637);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( "j" ) ) );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2638);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( 'j' ) ) );

        __CLR4_5_21zn1znlvl36yhm.R.inc(2639);values = new String[] { "key1", "value1", "key2", "value2" };
        __CLR4_5_21zn1znlvl36yhm.R.inc(2640);assertTrue( _cmdline.hasOption( "k" ) );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2641);assertTrue( _cmdline.hasOption( 'k' ) );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2642);assertEquals(4, _cmdline.getOptionValues( "k" ).length);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2643);assertEquals(4, _cmdline.getOptionValues( 'k' ).length);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2644);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( "k" ) ) );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2645);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( 'k' ) ) );

        __CLR4_5_21zn1znlvl36yhm.R.inc(2646);values = new String[] { "key", "value" };
        __CLR4_5_21zn1znlvl36yhm.R.inc(2647);assertTrue( _cmdline.hasOption( "m" ) );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2648);assertTrue( _cmdline.hasOption( 'm' ) );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2649);assertEquals(2, _cmdline.getOptionValues( "m" ).length);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2650);assertEquals(2, _cmdline.getOptionValues( 'm' ).length);
        __CLR4_5_21zn1znlvl36yhm.R.inc(2651);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( "m" ) ) );
        __CLR4_5_21zn1znlvl36yhm.R.inc(2652);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( 'm' ) ) );
    }finally{__CLR4_5_21zn1znlvl36yhm.R.flushNeeded();}}

    /**
     * jkeyes - commented out this test as the new architecture
     * breaks this type of functionality.  I have left the test 
     * here in case I get a brainwave on how to resolve this.
     */
    /*
    public void testGetValue()
    {
        // the 'm' option
        assertTrue( _option.getValues().length == 2 );
        assertEquals( _option.getValue(), "key" );
        assertEquals( _option.getValue( 0 ), "key" );
        assertEquals( _option.getValue( 1 ), "value" );

        try {
            assertEquals( _option.getValue( 2 ), "key" );
            fail( "IndexOutOfBounds not caught" );
        }
        catch( IndexOutOfBoundsException exp ) {
            
        }

        try {
            assertEquals( _option.getValue( -1 ), "key" );
            fail( "IndexOutOfBounds not caught" );
        }
        catch( IndexOutOfBoundsException exp ) {

        }
    }
    */
}
