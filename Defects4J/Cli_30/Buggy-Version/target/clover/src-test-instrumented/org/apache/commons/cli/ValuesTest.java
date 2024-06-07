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

import junit.framework.TestCase;
import junitx.framework.ArrayAssert;

public class ValuesTest extends TestCase
{static class __CLR4_5_22lx2lxlvn1nffa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521191983L,8589935092L,3435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private CommandLine cmd;

    public void setUp() throws Exception
    {try{__CLR4_5_22lx2lxlvn1nffa.R.inc(3381);
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3382);Options options = new Options();

        __CLR4_5_22lx2lxlvn1nffa.R.inc(3383);options.addOption("a", false, "toggle -a");
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3384);options.addOption("b", true, "set -b");
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3385);options.addOption("c", "c", false, "toggle -c");
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3386);options.addOption("d", "d", true, "set -d");

        __CLR4_5_22lx2lxlvn1nffa.R.inc(3387);options.addOption(OptionBuilder.withLongOpt("e").hasArgs().withDescription("set -e ").create('e'));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3388);options.addOption("f", "f", false, "jk");
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3389);options.addOption(OptionBuilder.withLongOpt("g").hasArgs(2).withDescription("set -g").create('g'));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3390);options.addOption(OptionBuilder.withLongOpt("h").hasArg().withDescription("set -h").create('h'));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3391);options.addOption(OptionBuilder.withLongOpt("i").withDescription("set -i").create('i'));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3392);options.addOption(OptionBuilder.withLongOpt("j").hasArgs().withDescription("set -j").withValueSeparator('=').create('j'));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3393);options.addOption(OptionBuilder.withLongOpt("k").hasArgs().withDescription("set -k").withValueSeparator('=').create('k'));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3394);options.addOption(OptionBuilder.withLongOpt("m").hasArgs().withDescription("set -m").withValueSeparator().create('m'));

        __CLR4_5_22lx2lxlvn1nffa.R.inc(3395);String[] args = new String[] { "-a",
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

        __CLR4_5_22lx2lxlvn1nffa.R.inc(3396);CommandLineParser parser = new PosixParser();

        __CLR4_5_22lx2lxlvn1nffa.R.inc(3397);cmd = parser.parse(options,args);
    }finally{__CLR4_5_22lx2lxlvn1nffa.R.flushNeeded();}}

    public void testShortArgs()
    {__CLR4_5_22lx2lxlvn1nffa.R.globalSliceStart(getClass().getName(),3398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jty45u2me();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22lx2lxlvn1nffa.R.rethrow($CLV_t2$);}finally{__CLR4_5_22lx2lxlvn1nffa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testShortArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jty45u2me(){try{__CLR4_5_22lx2lxlvn1nffa.R.inc(3398);
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3399);assertTrue("Option a is not set", cmd.hasOption("a"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3400);assertTrue("Option c is not set", cmd.hasOption("c"));

        __CLR4_5_22lx2lxlvn1nffa.R.inc(3401);assertNull(cmd.getOptionValues("a"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3402);assertNull(cmd.getOptionValues("c"));
    }finally{__CLR4_5_22lx2lxlvn1nffa.R.flushNeeded();}}

    public void testShortArgsWithValue()
    {__CLR4_5_22lx2lxlvn1nffa.R.globalSliceStart(getClass().getName(),3403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sj2saz2mj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22lx2lxlvn1nffa.R.rethrow($CLV_t2$);}finally{__CLR4_5_22lx2lxlvn1nffa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testShortArgsWithValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3403,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sj2saz2mj(){try{__CLR4_5_22lx2lxlvn1nffa.R.inc(3403);
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3404);assertTrue("Option b is not set", cmd.hasOption("b"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3405);assertTrue(cmd.getOptionValue("b").equals("foo"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3406);assertEquals(1, cmd.getOptionValues("b").length);

        __CLR4_5_22lx2lxlvn1nffa.R.inc(3407);assertTrue("Option d is not set", cmd.hasOption("d"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3408);assertTrue(cmd.getOptionValue("d").equals("bar"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3409);assertEquals(1, cmd.getOptionValues("d").length);
    }finally{__CLR4_5_22lx2lxlvn1nffa.R.flushNeeded();}}

    public void testMultipleArgValues()
    {__CLR4_5_22lx2lxlvn1nffa.R.globalSliceStart(getClass().getName(),3410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eqlml2mq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22lx2lxlvn1nffa.R.rethrow($CLV_t2$);}finally{__CLR4_5_22lx2lxlvn1nffa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testMultipleArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eqlml2mq(){try{__CLR4_5_22lx2lxlvn1nffa.R.inc(3410);
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3411);assertTrue("Option e is not set", cmd.hasOption("e"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3412);ArrayAssert.assertEquals(new String[] { "one", "two" }, cmd.getOptionValues("e"));
    }finally{__CLR4_5_22lx2lxlvn1nffa.R.flushNeeded();}}

    public void testTwoArgValues()
    {__CLR4_5_22lx2lxlvn1nffa.R.globalSliceStart(getClass().getName(),3413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qmk4uz2mt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22lx2lxlvn1nffa.R.rethrow($CLV_t2$);}finally{__CLR4_5_22lx2lxlvn1nffa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testTwoArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3413,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qmk4uz2mt(){try{__CLR4_5_22lx2lxlvn1nffa.R.inc(3413);
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3414);assertTrue("Option g is not set", cmd.hasOption("g"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3415);ArrayAssert.assertEquals(new String[] { "val1", "val2" }, cmd.getOptionValues("g"));
    }finally{__CLR4_5_22lx2lxlvn1nffa.R.flushNeeded();}}

    public void testComplexValues()
    {__CLR4_5_22lx2lxlvn1nffa.R.globalSliceStart(getClass().getName(),3416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g011af2mw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22lx2lxlvn1nffa.R.rethrow($CLV_t2$);}finally{__CLR4_5_22lx2lxlvn1nffa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testComplexValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g011af2mw(){try{__CLR4_5_22lx2lxlvn1nffa.R.inc(3416);
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3417);assertTrue("Option i is not set", cmd.hasOption("i"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3418);assertTrue("Option h is not set", cmd.hasOption("h"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3419);ArrayAssert.assertEquals(new String[] { "val1", "val2" }, cmd.getOptionValues("h"));
    }finally{__CLR4_5_22lx2lxlvn1nffa.R.flushNeeded();}}

    public void testExtraArgs()
    {__CLR4_5_22lx2lxlvn1nffa.R.globalSliceStart(getClass().getName(),3420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4eohq2n0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22lx2lxlvn1nffa.R.rethrow($CLV_t2$);}finally{__CLR4_5_22lx2lxlvn1nffa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testExtraArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4eohq2n0(){try{__CLR4_5_22lx2lxlvn1nffa.R.inc(3420);
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3421);ArrayAssert.assertEquals("Extra args", new String[] { "arg1", "arg2", "arg3" }, cmd.getArgs());
    }finally{__CLR4_5_22lx2lxlvn1nffa.R.flushNeeded();}}

    public void testCharSeparator()
    {__CLR4_5_22lx2lxlvn1nffa.R.globalSliceStart(getClass().getName(),3422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qslhuk2n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22lx2lxlvn1nffa.R.rethrow($CLV_t2$);}finally{__CLR4_5_22lx2lxlvn1nffa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testCharSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3422,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qslhuk2n2(){try{__CLR4_5_22lx2lxlvn1nffa.R.inc(3422);
        // tests the char methods of CommandLine that delegate to the String methods
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3423);assertTrue("Option j is not set", cmd.hasOption("j"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3424);assertTrue("Option j is not set", cmd.hasOption('j'));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3425);ArrayAssert.assertEquals(new String[] { "key", "value", "key", "value" }, cmd.getOptionValues("j"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3426);ArrayAssert.assertEquals(new String[] { "key", "value", "key", "value" }, cmd.getOptionValues('j'));

        __CLR4_5_22lx2lxlvn1nffa.R.inc(3427);assertTrue("Option k is not set", cmd.hasOption("k"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3428);assertTrue("Option k is not set", cmd.hasOption('k'));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3429);ArrayAssert.assertEquals(new String[] { "key1", "value1", "key2", "value2" }, cmd.getOptionValues("k"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3430);ArrayAssert.assertEquals(new String[] { "key1", "value1", "key2", "value2" }, cmd.getOptionValues('k'));

        __CLR4_5_22lx2lxlvn1nffa.R.inc(3431);assertTrue("Option m is not set", cmd.hasOption("m"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3432);assertTrue("Option m is not set", cmd.hasOption('m'));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3433);ArrayAssert.assertEquals(new String[] { "key", "value" }, cmd.getOptionValues("m"));
        __CLR4_5_22lx2lxlvn1nffa.R.inc(3434);ArrayAssert.assertEquals(new String[] { "key", "value" }, cmd.getOptionValues('m'));
    }finally{__CLR4_5_22lx2lxlvn1nffa.R.flushNeeded();}}

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
