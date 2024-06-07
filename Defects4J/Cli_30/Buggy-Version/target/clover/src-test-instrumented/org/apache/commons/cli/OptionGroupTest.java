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

import java.util.Properties;

import junit.framework.TestCase;

/**
 * @author John Keyes (john at integralsource.com)
 * @version $Revision$
 */
public class OptionGroupTest extends TestCase
{static class __CLR4_5_21t81t8lvn1nexf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521191983L,8589935092L,2482,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options _options = null;
    private Parser parser = new PosixParser();

    public void setUp()
    {try{__CLR4_5_21t81t8lvn1nexf.R.inc(2348);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2349);Option file = new Option( "f", "file", false, "file to process" );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2350);Option dir = new Option( "d", "directory", false, "directory to process" );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2351);OptionGroup group = new OptionGroup();
        __CLR4_5_21t81t8lvn1nexf.R.inc(2352);group.addOption( file );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2353);group.addOption( dir );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2354);_options = new Options().addOptionGroup( group );

        __CLR4_5_21t81t8lvn1nexf.R.inc(2355);Option section = new Option( "s", "section", false, "section to process" );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2356);Option chapter = new Option( "c", "chapter", false, "chapter to process" );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2357);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21t81t8lvn1nexf.R.inc(2358);group2.addOption( section );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2359);group2.addOption( chapter );

        __CLR4_5_21t81t8lvn1nexf.R.inc(2360);_options.addOptionGroup( group2 );

        __CLR4_5_21t81t8lvn1nexf.R.inc(2361);Option importOpt = new Option( null, "import", false, "section to process" );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2362);Option exportOpt = new Option( null, "export", false, "chapter to process" );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2363);OptionGroup group3 = new OptionGroup();
        __CLR4_5_21t81t8lvn1nexf.R.inc(2364);group3.addOption( importOpt );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2365);group3.addOption( exportOpt );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2366);_options.addOptionGroup( group3 );

        __CLR4_5_21t81t8lvn1nexf.R.inc(2367);_options.addOption( "r", "revision", false, "revision number" );
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testSingleOptionFromGroup() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtsvgz1ts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOptionFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2368,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtsvgz1ts() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2368);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2369);String[] args = new String[] { "-f" };

        __CLR4_5_21t81t8lvn1nexf.R.inc(2370);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21t81t8lvn1nexf.R.inc(2371);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2372);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2373);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2374);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2375);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2376);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testSingleOption() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzm1vu1u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2377,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzm1vu1u1() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2377);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2378);String[] args = new String[] { "-r" };

        __CLR4_5_21t81t8lvn1nexf.R.inc(2379);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21t81t8lvn1nexf.R.inc(2380);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2381);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2382);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2383);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2384);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2385);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testTwoValidOptions() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clxkjn1ua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2386,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clxkjn1ua() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2386);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2387);String[] args = new String[] { "-r", "-f" };

        __CLR4_5_21t81t8lvn1nexf.R.inc(2388);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21t81t8lvn1nexf.R.inc(2389);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2390);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2391);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2392);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2393);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2394);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testSingleLongOption() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_246cezy1uj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleLongOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_246cezy1uj() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2395);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2396);String[] args = new String[] { "--file" };

        __CLR4_5_21t81t8lvn1nexf.R.inc(2397);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21t81t8lvn1nexf.R.inc(2398);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2399);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2400);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2401);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2402);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2403);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testTwoValidLongOptions() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtw4vb1us();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidLongOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2404,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtw4vb1us() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2404);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2405);String[] args = new String[] { "--revision", "--file" };

        __CLR4_5_21t81t8lvn1nexf.R.inc(2406);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21t81t8lvn1nexf.R.inc(2407);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2408);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2409);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2410);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2411);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2412);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testNoOptionsExtraArgs() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23uskdl1v1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testNoOptionsExtraArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2413,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23uskdl1v1() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2413);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2414);String[] args = new String[] { "arg1", "arg2" };

        __CLR4_5_21t81t8lvn1nexf.R.inc(2415);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21t81t8lvn1nexf.R.inc(2416);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2417);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2418);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2419);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2420);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2421);assertTrue( "Confirm TWO extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testTwoOptionsFromGroup() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n65unc1va();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2422,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n65unc1va() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2422);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2423);String[] args = new String[] { "-f", "-d" };

        __CLR4_5_21t81t8lvn1nexf.R.inc(2424);try
        {
            __CLR4_5_21t81t8lvn1nexf.R.inc(2425);parser.parse( _options, args);
            __CLR4_5_21t81t8lvn1nexf.R.inc(2426);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21t81t8lvn1nexf.R.inc(2427);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21t81t8lvn1nexf.R.inc(2428);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21t81t8lvn1nexf.R.inc(2429);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testTwoLongOptionsFromGroup() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pvi6vg1vi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoLongOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pvi6vg1vi() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2430);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2431);String[] args = new String[] { "--file", "--directory" };

        __CLR4_5_21t81t8lvn1nexf.R.inc(2432);try
        {
            __CLR4_5_21t81t8lvn1nexf.R.inc(2433);parser.parse(_options, args);
            __CLR4_5_21t81t8lvn1nexf.R.inc(2434);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21t81t8lvn1nexf.R.inc(2435);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21t81t8lvn1nexf.R.inc(2436);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21t81t8lvn1nexf.R.inc(2437);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testTwoOptionsFromDifferentGroup() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzdjqd1vq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromDifferentGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzdjqd1vq() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2438);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2439);String[] args = new String[] { "-f", "-s" };

        __CLR4_5_21t81t8lvn1nexf.R.inc(2440);CommandLine cl = parser.parse( _options, args);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2441);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2442);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2443);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2444);assertTrue( "Confirm -s is set", cl.hasOption("s") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2445);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21t81t8lvn1nexf.R.inc(2446);assertTrue( "Confirm NO extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testTwoOptionsFromGroupWithProperties() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25fddan1vz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromGroupWithProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25fddan1vz() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2447);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2448);String[] args = new String[] { "-f" };
        
        __CLR4_5_21t81t8lvn1nexf.R.inc(2449);Properties properties = new Properties();
        __CLR4_5_21t81t8lvn1nexf.R.inc(2450);properties.put("d", "true");
        
        __CLR4_5_21t81t8lvn1nexf.R.inc(2451);CommandLine cl = parser.parse( _options, args, properties);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2452);assertTrue(cl.hasOption("f"));
        __CLR4_5_21t81t8lvn1nexf.R.inc(2453);assertTrue(!cl.hasOption("d"));
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testValidLongOnlyOptions() throws Exception
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297e32r1w6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testValidLongOnlyOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297e32r1w6() throws Exception{try{__CLR4_5_21t81t8lvn1nexf.R.inc(2454);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2455);CommandLine cl1 = parser.parse(_options, new String[]{"--export"});
        __CLR4_5_21t81t8lvn1nexf.R.inc(2456);assertTrue("Confirm --export is set", cl1.hasOption("export"));

        __CLR4_5_21t81t8lvn1nexf.R.inc(2457);CommandLine cl2 = parser.parse(_options, new String[]{"--import"});
        __CLR4_5_21t81t8lvn1nexf.R.inc(2458);assertTrue("Confirm --import is set", cl2.hasOption("import"));
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testToString()
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid1wb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2459,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid1wb(){try{__CLR4_5_21t81t8lvn1nexf.R.inc(2459);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2460);OptionGroup group1 = new OptionGroup();
        __CLR4_5_21t81t8lvn1nexf.R.inc(2461);group1.addOption(new Option(null, "foo", false, "Foo"));
        __CLR4_5_21t81t8lvn1nexf.R.inc(2462);group1.addOption(new Option(null, "bar", false, "Bar"));

        __CLR4_5_21t81t8lvn1nexf.R.inc(2463);if ((((!"[--bar Bar, --foo Foo]".equals(group1.toString()))&&(__CLR4_5_21t81t8lvn1nexf.R.iget(2464)!=0|true))||(__CLR4_5_21t81t8lvn1nexf.R.iget(2465)==0&false))) {{
            __CLR4_5_21t81t8lvn1nexf.R.inc(2466);assertEquals("[--foo Foo, --bar Bar]", group1.toString());
        }

        }__CLR4_5_21t81t8lvn1nexf.R.inc(2467);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21t81t8lvn1nexf.R.inc(2468);group2.addOption(new Option("f", "foo", false, "Foo"));
        __CLR4_5_21t81t8lvn1nexf.R.inc(2469);group2.addOption(new Option("b", "bar", false, "Bar"));

        __CLR4_5_21t81t8lvn1nexf.R.inc(2470);if ((((!"[-b Bar, -f Foo]".equals(group2.toString()))&&(__CLR4_5_21t81t8lvn1nexf.R.iget(2471)!=0|true))||(__CLR4_5_21t81t8lvn1nexf.R.iget(2472)==0&false))) {{
            __CLR4_5_21t81t8lvn1nexf.R.inc(2473);assertEquals("[-f Foo, -b Bar]", group2.toString());
        }
    }}finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}

    public void testGetNames()
    {__CLR4_5_21t81t8lvn1nexf.R.globalSliceStart(getClass().getName(),2474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s5d1it1wq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t81t8lvn1nexf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t81t8lvn1nexf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testGetNames",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s5d1it1wq(){try{__CLR4_5_21t81t8lvn1nexf.R.inc(2474);
        __CLR4_5_21t81t8lvn1nexf.R.inc(2475);OptionGroup group = new OptionGroup();
        __CLR4_5_21t81t8lvn1nexf.R.inc(2476);group.addOption(OptionBuilder.create('a'));
        __CLR4_5_21t81t8lvn1nexf.R.inc(2477);group.addOption(OptionBuilder.create('b'));

        __CLR4_5_21t81t8lvn1nexf.R.inc(2478);assertNotNull("null names", group.getNames());
        __CLR4_5_21t81t8lvn1nexf.R.inc(2479);assertEquals(2, group.getNames().size());
        __CLR4_5_21t81t8lvn1nexf.R.inc(2480);assertTrue(group.getNames().contains("a"));
        __CLR4_5_21t81t8lvn1nexf.R.inc(2481);assertTrue(group.getNames().contains("b"));
    }finally{__CLR4_5_21t81t8lvn1nexf.R.flushNeeded();}}
}
