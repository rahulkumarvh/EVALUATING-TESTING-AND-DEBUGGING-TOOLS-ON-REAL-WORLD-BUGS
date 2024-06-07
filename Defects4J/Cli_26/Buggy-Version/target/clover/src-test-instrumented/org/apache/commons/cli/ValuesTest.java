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
{static class __CLR4_5_2216216lvn1m5vl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0036\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521133496L,8589935092L,2708,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** CommandLine instance */
    private CommandLine _cmdline = null;

    public void setUp() throws Exception
    {try{__CLR4_5_2216216lvn1m5vl.R.inc(2634);
        __CLR4_5_2216216lvn1m5vl.R.inc(2635);Options options = new Options();

        __CLR4_5_2216216lvn1m5vl.R.inc(2636);options.addOption("a", false, "toggle -a");
        __CLR4_5_2216216lvn1m5vl.R.inc(2637);options.addOption("b", true, "set -b");
        __CLR4_5_2216216lvn1m5vl.R.inc(2638);options.addOption("c", "c", false, "toggle -c");
        __CLR4_5_2216216lvn1m5vl.R.inc(2639);options.addOption("d", "d", true, "set -d");

        __CLR4_5_2216216lvn1m5vl.R.inc(2640);options.addOption(OptionBuilder.withLongOpt("e").hasArgs().withDescription("set -e ").create('e'));
        __CLR4_5_2216216lvn1m5vl.R.inc(2641);options.addOption("f", "f", false, "jk");
        __CLR4_5_2216216lvn1m5vl.R.inc(2642);options.addOption(OptionBuilder.withLongOpt("g").hasArgs(2).withDescription("set -g").create('g'));
        __CLR4_5_2216216lvn1m5vl.R.inc(2643);options.addOption(OptionBuilder.withLongOpt("h").hasArgs(2).withDescription("set -h").create('h'));
        __CLR4_5_2216216lvn1m5vl.R.inc(2644);options.addOption(OptionBuilder.withLongOpt("i").withDescription("set -i").create('i'));
        __CLR4_5_2216216lvn1m5vl.R.inc(2645);options.addOption(OptionBuilder.withLongOpt("j").hasArgs().withDescription("set -j").withValueSeparator('=').create('j'));
        __CLR4_5_2216216lvn1m5vl.R.inc(2646);options.addOption(OptionBuilder.withLongOpt("k").hasArgs().withDescription("set -k").withValueSeparator('=').create('k'));
        __CLR4_5_2216216lvn1m5vl.R.inc(2647);options.addOption(OptionBuilder.withLongOpt("m").hasArgs().withDescription("set -m").withValueSeparator().create('m'));

        __CLR4_5_2216216lvn1m5vl.R.inc(2648);String[] args = new String[] { "-a",
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

        __CLR4_5_2216216lvn1m5vl.R.inc(2649);CommandLineParser parser = new PosixParser();

        __CLR4_5_2216216lvn1m5vl.R.inc(2650);_cmdline = parser.parse(options,args);
    }finally{__CLR4_5_2216216lvn1m5vl.R.flushNeeded();}}

    public void testShortArgs()
    {__CLR4_5_2216216lvn1m5vl.R.globalSliceStart(getClass().getName(),2651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jty45u21n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2216216lvn1m5vl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2216216lvn1m5vl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testShortArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2651,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jty45u21n(){try{__CLR4_5_2216216lvn1m5vl.R.inc(2651);
        __CLR4_5_2216216lvn1m5vl.R.inc(2652);assertTrue( _cmdline.hasOption("a") );
        __CLR4_5_2216216lvn1m5vl.R.inc(2653);assertTrue( _cmdline.hasOption("c") );

        __CLR4_5_2216216lvn1m5vl.R.inc(2654);assertNull( _cmdline.getOptionValues("a") );
        __CLR4_5_2216216lvn1m5vl.R.inc(2655);assertNull( _cmdline.getOptionValues("c") );
    }finally{__CLR4_5_2216216lvn1m5vl.R.flushNeeded();}}

    public void testShortArgsWithValue()
    {__CLR4_5_2216216lvn1m5vl.R.globalSliceStart(getClass().getName(),2656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sj2saz21s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2216216lvn1m5vl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2216216lvn1m5vl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testShortArgsWithValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sj2saz21s(){try{__CLR4_5_2216216lvn1m5vl.R.inc(2656);
        __CLR4_5_2216216lvn1m5vl.R.inc(2657);assertTrue( _cmdline.hasOption("b") );
        __CLR4_5_2216216lvn1m5vl.R.inc(2658);assertTrue( _cmdline.getOptionValue("b").equals("foo"));
        __CLR4_5_2216216lvn1m5vl.R.inc(2659);assertEquals(1, _cmdline.getOptionValues("b").length);

        __CLR4_5_2216216lvn1m5vl.R.inc(2660);assertTrue( _cmdline.hasOption("d") );
        __CLR4_5_2216216lvn1m5vl.R.inc(2661);assertTrue( _cmdline.getOptionValue("d").equals("bar"));
        __CLR4_5_2216216lvn1m5vl.R.inc(2662);assertEquals(1, _cmdline.getOptionValues("d").length);
    }finally{__CLR4_5_2216216lvn1m5vl.R.flushNeeded();}}

    public void testMultipleArgValues()
    {__CLR4_5_2216216lvn1m5vl.R.globalSliceStart(getClass().getName(),2663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eqlml21z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2216216lvn1m5vl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2216216lvn1m5vl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testMultipleArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eqlml21z(){try{__CLR4_5_2216216lvn1m5vl.R.inc(2663);
        __CLR4_5_2216216lvn1m5vl.R.inc(2664);String[] result = _cmdline.getOptionValues("e");
        __CLR4_5_2216216lvn1m5vl.R.inc(2665);String[] values = new String[] { "one", "two" };
        __CLR4_5_2216216lvn1m5vl.R.inc(2666);assertTrue( _cmdline.hasOption("e") );
        __CLR4_5_2216216lvn1m5vl.R.inc(2667);assertEquals(2, _cmdline.getOptionValues("e").length);
        __CLR4_5_2216216lvn1m5vl.R.inc(2668);assertTrue( Arrays.equals( values, _cmdline.getOptionValues("e") ) );
    }finally{__CLR4_5_2216216lvn1m5vl.R.flushNeeded();}}

    public void testTwoArgValues()
    {__CLR4_5_2216216lvn1m5vl.R.globalSliceStart(getClass().getName(),2669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qmk4uz225();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2216216lvn1m5vl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2216216lvn1m5vl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testTwoArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qmk4uz225(){try{__CLR4_5_2216216lvn1m5vl.R.inc(2669);
        __CLR4_5_2216216lvn1m5vl.R.inc(2670);String[] result = _cmdline.getOptionValues("g");
        __CLR4_5_2216216lvn1m5vl.R.inc(2671);String[] values = new String[] { "val1", "val2" };
        __CLR4_5_2216216lvn1m5vl.R.inc(2672);assertTrue( _cmdline.hasOption("g") );
        __CLR4_5_2216216lvn1m5vl.R.inc(2673);assertEquals(2, _cmdline.getOptionValues("g").length);
        __CLR4_5_2216216lvn1m5vl.R.inc(2674);assertTrue( Arrays.equals( values, _cmdline.getOptionValues("g") ) );
    }finally{__CLR4_5_2216216lvn1m5vl.R.flushNeeded();}}

    public void testComplexValues()
    {__CLR4_5_2216216lvn1m5vl.R.globalSliceStart(getClass().getName(),2675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g011af22b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2216216lvn1m5vl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2216216lvn1m5vl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testComplexValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g011af22b(){try{__CLR4_5_2216216lvn1m5vl.R.inc(2675);
        __CLR4_5_2216216lvn1m5vl.R.inc(2676);String[] result = _cmdline.getOptionValues("h");
        __CLR4_5_2216216lvn1m5vl.R.inc(2677);String[] values = new String[] { "val1", "val2" };
        __CLR4_5_2216216lvn1m5vl.R.inc(2678);assertTrue( _cmdline.hasOption("i") );
        __CLR4_5_2216216lvn1m5vl.R.inc(2679);assertTrue( _cmdline.hasOption("h") );
        __CLR4_5_2216216lvn1m5vl.R.inc(2680);assertEquals(2, _cmdline.getOptionValues("h").length);
        __CLR4_5_2216216lvn1m5vl.R.inc(2681);assertTrue( Arrays.equals( values, _cmdline.getOptionValues("h") ) );
    }finally{__CLR4_5_2216216lvn1m5vl.R.flushNeeded();}}

    public void testExtraArgs()
    {__CLR4_5_2216216lvn1m5vl.R.globalSliceStart(getClass().getName(),2682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4eohq22i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2216216lvn1m5vl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2216216lvn1m5vl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testExtraArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2682,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4eohq22i(){try{__CLR4_5_2216216lvn1m5vl.R.inc(2682);
        __CLR4_5_2216216lvn1m5vl.R.inc(2683);String[] args = new String[] { "arg1", "arg2", "arg3" };
        __CLR4_5_2216216lvn1m5vl.R.inc(2684);assertEquals(3, _cmdline.getArgs().length);
        __CLR4_5_2216216lvn1m5vl.R.inc(2685);assertTrue( Arrays.equals( args, _cmdline.getArgs() ) );
    }finally{__CLR4_5_2216216lvn1m5vl.R.flushNeeded();}}

    public void testCharSeparator()
    {__CLR4_5_2216216lvn1m5vl.R.globalSliceStart(getClass().getName(),2686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qslhuk22m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2216216lvn1m5vl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2216216lvn1m5vl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testCharSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2686,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qslhuk22m(){try{__CLR4_5_2216216lvn1m5vl.R.inc(2686);
        // tests the char methods of CommandLine that delegate to
        // the String methods
        __CLR4_5_2216216lvn1m5vl.R.inc(2687);String[] values = new String[] { "key", "value", "key", "value" };
        __CLR4_5_2216216lvn1m5vl.R.inc(2688);assertTrue( _cmdline.hasOption( "j" ) );
        __CLR4_5_2216216lvn1m5vl.R.inc(2689);assertTrue( _cmdline.hasOption( 'j' ) );
        __CLR4_5_2216216lvn1m5vl.R.inc(2690);assertEquals( 4, _cmdline.getOptionValues( "j" ).length );
        __CLR4_5_2216216lvn1m5vl.R.inc(2691);assertEquals( 4, _cmdline.getOptionValues( 'j' ).length );
        __CLR4_5_2216216lvn1m5vl.R.inc(2692);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( "j" ) ) );
        __CLR4_5_2216216lvn1m5vl.R.inc(2693);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( 'j' ) ) );

        __CLR4_5_2216216lvn1m5vl.R.inc(2694);values = new String[] { "key1", "value1", "key2", "value2" };
        __CLR4_5_2216216lvn1m5vl.R.inc(2695);assertTrue( _cmdline.hasOption( "k" ) );
        __CLR4_5_2216216lvn1m5vl.R.inc(2696);assertTrue( _cmdline.hasOption( 'k' ) );
        __CLR4_5_2216216lvn1m5vl.R.inc(2697);assertEquals(4, _cmdline.getOptionValues( "k" ).length);
        __CLR4_5_2216216lvn1m5vl.R.inc(2698);assertEquals(4, _cmdline.getOptionValues( 'k' ).length);
        __CLR4_5_2216216lvn1m5vl.R.inc(2699);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( "k" ) ) );
        __CLR4_5_2216216lvn1m5vl.R.inc(2700);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( 'k' ) ) );

        __CLR4_5_2216216lvn1m5vl.R.inc(2701);values = new String[] { "key", "value" };
        __CLR4_5_2216216lvn1m5vl.R.inc(2702);assertTrue( _cmdline.hasOption( "m" ) );
        __CLR4_5_2216216lvn1m5vl.R.inc(2703);assertTrue( _cmdline.hasOption( 'm' ) );
        __CLR4_5_2216216lvn1m5vl.R.inc(2704);assertEquals(2, _cmdline.getOptionValues( "m" ).length);
        __CLR4_5_2216216lvn1m5vl.R.inc(2705);assertEquals(2, _cmdline.getOptionValues( 'm' ).length);
        __CLR4_5_2216216lvn1m5vl.R.inc(2706);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( "m" ) ) );
        __CLR4_5_2216216lvn1m5vl.R.inc(2707);assertTrue( Arrays.equals( values, _cmdline.getOptionValues( 'm' ) ) );
    }finally{__CLR4_5_2216216lvn1m5vl.R.flushNeeded();}}

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
