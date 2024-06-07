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

/**
 * @author John Keyes (john at integralsource.com)
 * @version $Revision$
 */
public class OptionGroupTest extends TestCase
{static class __CLR4_5_21s11s1lvn1n6h6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,2432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options _options = null;
    private CommandLineParser parser = new PosixParser();

    public void setUp()
    {try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2305);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2306);Option file = new Option( "f", "file", false, "file to process" );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2307);Option dir = new Option( "d", "directory", false, "directory to process" );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2308);OptionGroup group = new OptionGroup();
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2309);group.addOption( file );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2310);group.addOption( dir );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2311);_options = new Options().addOptionGroup( group );

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2312);Option section = new Option( "s", "section", false, "section to process" );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2313);Option chapter = new Option( "c", "chapter", false, "chapter to process" );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2314);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2315);group2.addOption( section );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2316);group2.addOption( chapter );

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2317);_options.addOptionGroup( group2 );

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2318);Option importOpt = new Option( null, "import", false, "section to process" );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2319);Option exportOpt = new Option( null, "export", false, "chapter to process" );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2320);OptionGroup group3 = new OptionGroup();
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2321);group3.addOption( importOpt );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2322);group3.addOption( exportOpt );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2323);_options.addOptionGroup( group3 );

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2324);_options.addOption( "r", "revision", false, "revision number" );
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testSingleOptionFromGroup() throws Exception
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtsvgz1sl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOptionFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtsvgz1sl() throws Exception{try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2325);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2326);String[] args = new String[] { "-f" };

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2327);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2328);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2329);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2330);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2331);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2332);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2333);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testSingleOption() throws Exception
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzm1vu1su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2334,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzm1vu1su() throws Exception{try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2334);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2335);String[] args = new String[] { "-r" };

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2336);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2337);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2338);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2339);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2340);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2341);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2342);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testTwoValidOptions() throws Exception
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clxkjn1t3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2343,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clxkjn1t3() throws Exception{try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2343);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2344);String[] args = new String[] { "-r", "-f" };

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2345);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2346);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2347);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2348);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2349);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2350);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2351);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testSingleLongOption() throws Exception
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_246cezy1tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleLongOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2352,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_246cezy1tc() throws Exception{try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2352);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2353);String[] args = new String[] { "--file" };

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2354);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2355);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2356);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2357);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2358);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2359);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2360);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testTwoValidLongOptions() throws Exception
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtw4vb1tl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidLongOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtw4vb1tl() throws Exception{try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2361);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2362);String[] args = new String[] { "--revision", "--file" };

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2363);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2364);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2365);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2366);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2367);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2368);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2369);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testNoOptionsExtraArgs() throws Exception
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23uskdl1tu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testNoOptionsExtraArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23uskdl1tu() throws Exception{try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2370);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2371);String[] args = new String[] { "arg1", "arg2" };

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2372);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2373);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2374);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2375);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2376);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2377);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2378);assertTrue( "Confirm TWO extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testTwoOptionsFromGroup() throws Exception
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n65unc1u3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2379,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n65unc1u3() throws Exception{try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2379);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2380);String[] args = new String[] { "-f", "-d" };

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2381);try
        {
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2382);parser.parse( _options, args);
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2383);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2384);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2385);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2386);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testTwoLongOptionsFromGroup() throws Exception
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pvi6vg1ub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoLongOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pvi6vg1ub() throws Exception{try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2387);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2388);String[] args = new String[] { "--file", "--directory" };

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2389);try
        {
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2390);parser.parse(_options, args);
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2391);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2392);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2393);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2394);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testTwoOptionsFromDifferentGroup() throws Exception
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzdjqd1uj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromDifferentGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzdjqd1uj() throws Exception{try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2395);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2396);String[] args = new String[] { "-f", "-s" };

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2397);CommandLine cl = parser.parse( _options, args);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2398);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2399);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2400);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2401);assertTrue( "Confirm -s is set", cl.hasOption("s") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2402);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2403);assertTrue( "Confirm NO extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testValidLongOnlyOptions() throws Exception
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297e32r1us();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testValidLongOnlyOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2404,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297e32r1us() throws Exception{try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2404);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2405);CommandLine cl1 = parser.parse(_options, new String[]{"--export"});
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2406);assertTrue("Confirm --export is set", cl1.hasOption("export"));

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2407);CommandLine cl2 = parser.parse(_options, new String[]{"--import"});
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2408);assertTrue("Confirm --import is set", cl2.hasOption("import"));
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testToString()
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid1ux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid1ux(){try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2409);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2410);OptionGroup group1 = new OptionGroup();
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2411);group1.addOption(new Option(null, "foo", false, "Foo"));
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2412);group1.addOption(new Option(null, "bar", false, "Bar"));

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2413);if ((((!"[--bar Bar, --foo Foo]".equals(group1.toString()))&&(__CLR4_5_21s11s1lvn1n6h6.R.iget(2414)!=0|true))||(__CLR4_5_21s11s1lvn1n6h6.R.iget(2415)==0&false))) {{
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2416);assertEquals("[--foo Foo, --bar Bar]", group1.toString());
        }

        }__CLR4_5_21s11s1lvn1n6h6.R.inc(2417);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2418);group2.addOption(new Option("f", "foo", false, "Foo"));
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2419);group2.addOption(new Option("b", "bar", false, "Bar"));

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2420);if ((((!"[-b Bar, -f Foo]".equals(group2.toString()))&&(__CLR4_5_21s11s1lvn1n6h6.R.iget(2421)!=0|true))||(__CLR4_5_21s11s1lvn1n6h6.R.iget(2422)==0&false))) {{
            __CLR4_5_21s11s1lvn1n6h6.R.inc(2423);assertEquals("[-f Foo, -b Bar]", group2.toString());
        }
    }}finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}

    public void testGetNames()
    {__CLR4_5_21s11s1lvn1n6h6.R.globalSliceStart(getClass().getName(),2424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s5d1it1vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s11s1lvn1n6h6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s11s1lvn1n6h6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testGetNames",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s5d1it1vc(){try{__CLR4_5_21s11s1lvn1n6h6.R.inc(2424);
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2425);OptionGroup group = new OptionGroup();
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2426);group.addOption(OptionBuilder.create('a'));
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2427);group.addOption(OptionBuilder.create('b'));

        __CLR4_5_21s11s1lvn1n6h6.R.inc(2428);assertNotNull("null names", group.getNames());
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2429);assertEquals(2, group.getNames().size());
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2430);assertTrue(group.getNames().contains("a"));
        __CLR4_5_21s11s1lvn1n6h6.R.inc(2431);assertTrue(group.getNames().contains("b"));
    }finally{__CLR4_5_21s11s1lvn1n6h6.R.flushNeeded();}}
}
