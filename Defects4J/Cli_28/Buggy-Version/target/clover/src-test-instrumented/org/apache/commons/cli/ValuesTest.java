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
{static class __CLR4_5_22iw2iwlvn1n6qr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,3326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private CommandLine cmd;

    public void setUp() throws Exception
    {try{__CLR4_5_22iw2iwlvn1n6qr.R.inc(3272);
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3273);Options options = new Options();

        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3274);options.addOption("a", false, "toggle -a");
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3275);options.addOption("b", true, "set -b");
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3276);options.addOption("c", "c", false, "toggle -c");
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3277);options.addOption("d", "d", true, "set -d");

        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3278);options.addOption(OptionBuilder.withLongOpt("e").hasArgs().withDescription("set -e ").create('e'));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3279);options.addOption("f", "f", false, "jk");
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3280);options.addOption(OptionBuilder.withLongOpt("g").hasArgs(2).withDescription("set -g").create('g'));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3281);options.addOption(OptionBuilder.withLongOpt("h").hasArg().withDescription("set -h").create('h'));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3282);options.addOption(OptionBuilder.withLongOpt("i").withDescription("set -i").create('i'));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3283);options.addOption(OptionBuilder.withLongOpt("j").hasArgs().withDescription("set -j").withValueSeparator('=').create('j'));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3284);options.addOption(OptionBuilder.withLongOpt("k").hasArgs().withDescription("set -k").withValueSeparator('=').create('k'));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3285);options.addOption(OptionBuilder.withLongOpt("m").hasArgs().withDescription("set -m").withValueSeparator().create('m'));

        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3286);String[] args = new String[] { "-a",
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

        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3287);CommandLineParser parser = new PosixParser();

        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3288);cmd = parser.parse(options,args);
    }finally{__CLR4_5_22iw2iwlvn1n6qr.R.flushNeeded();}}

    public void testShortArgs()
    {__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceStart(getClass().getName(),3289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jty45u2jd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22iw2iwlvn1n6qr.R.rethrow($CLV_t2$);}finally{__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testShortArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jty45u2jd(){try{__CLR4_5_22iw2iwlvn1n6qr.R.inc(3289);
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3290);assertTrue("Option a is not set", cmd.hasOption("a"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3291);assertTrue("Option c is not set", cmd.hasOption("c"));

        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3292);assertNull(cmd.getOptionValues("a"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3293);assertNull(cmd.getOptionValues("c"));
    }finally{__CLR4_5_22iw2iwlvn1n6qr.R.flushNeeded();}}

    public void testShortArgsWithValue()
    {__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceStart(getClass().getName(),3294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sj2saz2ji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22iw2iwlvn1n6qr.R.rethrow($CLV_t2$);}finally{__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testShortArgsWithValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3294,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sj2saz2ji(){try{__CLR4_5_22iw2iwlvn1n6qr.R.inc(3294);
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3295);assertTrue("Option b is not set", cmd.hasOption("b"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3296);assertTrue(cmd.getOptionValue("b").equals("foo"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3297);assertEquals(1, cmd.getOptionValues("b").length);

        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3298);assertTrue("Option d is not set", cmd.hasOption("d"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3299);assertTrue(cmd.getOptionValue("d").equals("bar"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3300);assertEquals(1, cmd.getOptionValues("d").length);
    }finally{__CLR4_5_22iw2iwlvn1n6qr.R.flushNeeded();}}

    public void testMultipleArgValues()
    {__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceStart(getClass().getName(),3301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eqlml2jp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22iw2iwlvn1n6qr.R.rethrow($CLV_t2$);}finally{__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testMultipleArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eqlml2jp(){try{__CLR4_5_22iw2iwlvn1n6qr.R.inc(3301);
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3302);assertTrue("Option e is not set", cmd.hasOption("e"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3303);ArrayAssert.assertEquals(new String[] { "one", "two" }, cmd.getOptionValues("e"));
    }finally{__CLR4_5_22iw2iwlvn1n6qr.R.flushNeeded();}}

    public void testTwoArgValues()
    {__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceStart(getClass().getName(),3304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qmk4uz2js();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22iw2iwlvn1n6qr.R.rethrow($CLV_t2$);}finally{__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testTwoArgValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3304,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qmk4uz2js(){try{__CLR4_5_22iw2iwlvn1n6qr.R.inc(3304);
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3305);assertTrue("Option g is not set", cmd.hasOption("g"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3306);ArrayAssert.assertEquals(new String[] { "val1", "val2" }, cmd.getOptionValues("g"));
    }finally{__CLR4_5_22iw2iwlvn1n6qr.R.flushNeeded();}}

    public void testComplexValues()
    {__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceStart(getClass().getName(),3307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g011af2jv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22iw2iwlvn1n6qr.R.rethrow($CLV_t2$);}finally{__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testComplexValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3307,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g011af2jv(){try{__CLR4_5_22iw2iwlvn1n6qr.R.inc(3307);
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3308);assertTrue("Option i is not set", cmd.hasOption("i"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3309);assertTrue("Option h is not set", cmd.hasOption("h"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3310);ArrayAssert.assertEquals(new String[] { "val1", "val2" }, cmd.getOptionValues("h"));
    }finally{__CLR4_5_22iw2iwlvn1n6qr.R.flushNeeded();}}

    public void testExtraArgs()
    {__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceStart(getClass().getName(),3311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4eohq2jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22iw2iwlvn1n6qr.R.rethrow($CLV_t2$);}finally{__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testExtraArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4eohq2jz(){try{__CLR4_5_22iw2iwlvn1n6qr.R.inc(3311);
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3312);ArrayAssert.assertEquals("Extra args", new String[] { "arg1", "arg2", "arg3" }, cmd.getArgs());
    }finally{__CLR4_5_22iw2iwlvn1n6qr.R.flushNeeded();}}

    public void testCharSeparator()
    {__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceStart(getClass().getName(),3313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qslhuk2k1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22iw2iwlvn1n6qr.R.rethrow($CLV_t2$);}finally{__CLR4_5_22iw2iwlvn1n6qr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ValuesTest.testCharSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qslhuk2k1(){try{__CLR4_5_22iw2iwlvn1n6qr.R.inc(3313);
        // tests the char methods of CommandLine that delegate to the String methods
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3314);assertTrue("Option j is not set", cmd.hasOption("j"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3315);assertTrue("Option j is not set", cmd.hasOption('j'));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3316);ArrayAssert.assertEquals(new String[] { "key", "value", "key", "value" }, cmd.getOptionValues("j"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3317);ArrayAssert.assertEquals(new String[] { "key", "value", "key", "value" }, cmd.getOptionValues('j'));

        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3318);assertTrue("Option k is not set", cmd.hasOption("k"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3319);assertTrue("Option k is not set", cmd.hasOption('k'));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3320);ArrayAssert.assertEquals(new String[] { "key1", "value1", "key2", "value2" }, cmd.getOptionValues("k"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3321);ArrayAssert.assertEquals(new String[] { "key1", "value1", "key2", "value2" }, cmd.getOptionValues('k'));

        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3322);assertTrue("Option m is not set", cmd.hasOption("m"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3323);assertTrue("Option m is not set", cmd.hasOption('m'));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3324);ArrayAssert.assertEquals(new String[] { "key", "value" }, cmd.getOptionValues("m"));
        __CLR4_5_22iw2iwlvn1n6qr.R.inc(3325);ArrayAssert.assertEquals(new String[] { "key", "value" }, cmd.getOptionValues('m'));
    }finally{__CLR4_5_22iw2iwlvn1n6qr.R.flushNeeded();}}

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
