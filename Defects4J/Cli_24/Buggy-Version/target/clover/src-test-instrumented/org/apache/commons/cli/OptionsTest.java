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
{static class __CLR4_5_21kq1kqlvn1lj74{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521104441L,8589935092L,2123,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void testSimple()
    {__CLR4_5_21kq1kqlvn1lj74.R.globalSliceStart(getClass().getName(),2042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uh9yj1kq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kq1kqlvn1lj74.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kq1kqlvn1lj74.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2042,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uh9yj1kq(){try{__CLR4_5_21kq1kqlvn1lj74.R.inc(2042);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2043);Options opts = new Options();

        __CLR4_5_21kq1kqlvn1lj74.R.inc(2044);opts.addOption("a", false, "toggle -a");
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2045);opts.addOption("b", true, "toggle -b");

        __CLR4_5_21kq1kqlvn1lj74.R.inc(2046);assertTrue(opts.hasOption("a"));
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2047);assertTrue(opts.hasOption("b"));
    }finally{__CLR4_5_21kq1kqlvn1lj74.R.flushNeeded();}}

    public void testDuplicateSimple()
    {__CLR4_5_21kq1kqlvn1lj74.R.globalSliceStart(getClass().getName(),2048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ibqqvm1kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kq1kqlvn1lj74.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kq1kqlvn1lj74.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testDuplicateSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2048,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ibqqvm1kw(){try{__CLR4_5_21kq1kqlvn1lj74.R.inc(2048);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2049);Options opts = new Options();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2050);opts.addOption("a", false, "toggle -a");
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2051);opts.addOption("a", true, "toggle -a*");

        __CLR4_5_21kq1kqlvn1lj74.R.inc(2052);assertEquals("last one in wins", "toggle -a*", opts.getOption("a").getDescription());
    }finally{__CLR4_5_21kq1kqlvn1lj74.R.flushNeeded();}}

    public void testLong()
    {__CLR4_5_21kq1kqlvn1lj74.R.globalSliceStart(getClass().getName(),2053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mz1l1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kq1kqlvn1lj74.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kq1kqlvn1lj74.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mz1l1(){try{__CLR4_5_21kq1kqlvn1lj74.R.inc(2053);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2054);Options opts = new Options();

        __CLR4_5_21kq1kqlvn1lj74.R.inc(2055);opts.addOption("a", "--a", false, "toggle -a");
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2056);opts.addOption("b", "--b", true, "set -b");

        __CLR4_5_21kq1kqlvn1lj74.R.inc(2057);assertTrue(opts.hasOption("a"));
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2058);assertTrue(opts.hasOption("b"));
    }finally{__CLR4_5_21kq1kqlvn1lj74.R.flushNeeded();}}

    public void testDuplicateLong()
    {__CLR4_5_21kq1kqlvn1lj74.R.globalSliceStart(getClass().getName(),2059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i3lt241l7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kq1kqlvn1lj74.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kq1kqlvn1lj74.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testDuplicateLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i3lt241l7(){try{__CLR4_5_21kq1kqlvn1lj74.R.inc(2059);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2060);Options opts = new Options();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2061);opts.addOption("a", "--a", false, "toggle -a");
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2062);opts.addOption("a", "--a", false, "toggle -a*");
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2063);assertEquals("last one in wins", "toggle -a*", opts.getOption("a").getDescription());
    }finally{__CLR4_5_21kq1kqlvn1lj74.R.flushNeeded();}}

    public void testHelpOptions()
    {__CLR4_5_21kq1kqlvn1lj74.R.globalSliceStart(getClass().getName(),2064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ik63y1lc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kq1kqlvn1lj74.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kq1kqlvn1lj74.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testHelpOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ik63y1lc(){try{__CLR4_5_21kq1kqlvn1lj74.R.inc(2064);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2065);Option longOnly1 = OptionBuilder.withLongOpt("long-only1").create();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2066);Option longOnly2 = OptionBuilder.withLongOpt("long-only2").create();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2067);Option shortOnly1 = OptionBuilder.create("1");
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2068);Option shortOnly2 = OptionBuilder.create("2");
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2069);Option bothA = OptionBuilder.withLongOpt("bothA").create("a");
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2070);Option bothB = OptionBuilder.withLongOpt("bothB").create("b");
        
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2071);Options options = new Options();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2072);options.addOption(longOnly1);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2073);options.addOption(longOnly2);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2074);options.addOption(shortOnly1);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2075);options.addOption(shortOnly2);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2076);options.addOption(bothA);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2077);options.addOption(bothB);
        
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2078);Collection allOptions = new ArrayList();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2079);allOptions.add(longOnly1);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2080);allOptions.add(longOnly2);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2081);allOptions.add(shortOnly1);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2082);allOptions.add(shortOnly2);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2083);allOptions.add(bothA);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2084);allOptions.add(bothB);
        
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2085);Collection helpOptions = options.helpOptions();
        
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2086);assertTrue("Everything in all should be in help", helpOptions.containsAll(allOptions));
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2087);assertTrue("Everything in help should be in all", allOptions.containsAll(helpOptions));        
    }finally{__CLR4_5_21kq1kqlvn1lj74.R.flushNeeded();}}

    public void testMissingOptionException() throws ParseException
    {__CLR4_5_21kq1kqlvn1lj74.R.globalSliceStart(getClass().getName(),2088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gibgst1m0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kq1kqlvn1lj74.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kq1kqlvn1lj74.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testMissingOptionException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gibgst1m0() throws ParseException{try{__CLR4_5_21kq1kqlvn1lj74.R.inc(2088);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2089);Options options = new Options();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2090);options.addOption(OptionBuilder.isRequired().create("f"));
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2091);try
        {
            __CLR4_5_21kq1kqlvn1lj74.R.inc(2092);new PosixParser().parse(options, new String[0]);
            __CLR4_5_21kq1kqlvn1lj74.R.inc(2093);fail("Expected MissingOptionException to be thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21kq1kqlvn1lj74.R.inc(2094);assertEquals("Missing required option: f", e.getMessage());
        }
    }finally{__CLR4_5_21kq1kqlvn1lj74.R.flushNeeded();}}

    public void testMissingOptionsException() throws ParseException
    {__CLR4_5_21kq1kqlvn1lj74.R.globalSliceStart(getClass().getName(),2095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pcdd2s1m7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kq1kqlvn1lj74.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kq1kqlvn1lj74.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testMissingOptionsException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pcdd2s1m7() throws ParseException{try{__CLR4_5_21kq1kqlvn1lj74.R.inc(2095);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2096);Options options = new Options();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2097);options.addOption(OptionBuilder.isRequired().create("f"));
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2098);options.addOption(OptionBuilder.isRequired().create("x"));
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2099);try
        {
            __CLR4_5_21kq1kqlvn1lj74.R.inc(2100);new PosixParser().parse(options, new String[0]);
            __CLR4_5_21kq1kqlvn1lj74.R.inc(2101);fail("Expected MissingOptionException to be thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21kq1kqlvn1lj74.R.inc(2102);assertEquals("Missing required options: f, x", e.getMessage());
        }
    }finally{__CLR4_5_21kq1kqlvn1lj74.R.flushNeeded();}}

    public void testToString()
    {__CLR4_5_21kq1kqlvn1lj74.R.globalSliceStart(getClass().getName(),2103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid1mf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kq1kqlvn1lj74.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kq1kqlvn1lj74.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2103,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid1mf(){try{__CLR4_5_21kq1kqlvn1lj74.R.inc(2103);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2104);Options options = new Options();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2105);options.addOption("f", "foo", true, "Foo");
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2106);options.addOption("b", "bar", false, "Bar");

        __CLR4_5_21kq1kqlvn1lj74.R.inc(2107);String s = options.toString();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2108);assertNotNull("null string returned", s);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2109);assertTrue("foo option missing", s.toLowerCase().indexOf("foo") != -1);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2110);assertTrue("bar option missing", s.toLowerCase().indexOf("bar") != -1);
    }finally{__CLR4_5_21kq1kqlvn1lj74.R.flushNeeded();}}

    public void testGetOptionsGroups()
    {__CLR4_5_21kq1kqlvn1lj74.R.globalSliceStart(getClass().getName(),2111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzfkph1mn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kq1kqlvn1lj74.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kq1kqlvn1lj74.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionsTest.testGetOptionsGroups",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2111,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzfkph1mn(){try{__CLR4_5_21kq1kqlvn1lj74.R.inc(2111);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2112);Options options = new Options();

        __CLR4_5_21kq1kqlvn1lj74.R.inc(2113);OptionGroup group1 = new OptionGroup();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2114);group1.addOption(OptionBuilder.create('a'));
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2115);group1.addOption(OptionBuilder.create('b'));

        __CLR4_5_21kq1kqlvn1lj74.R.inc(2116);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2117);group2.addOption(OptionBuilder.create('x'));
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2118);group2.addOption(OptionBuilder.create('y'));

        __CLR4_5_21kq1kqlvn1lj74.R.inc(2119);options.addOptionGroup(group1);
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2120);options.addOptionGroup(group2);

        __CLR4_5_21kq1kqlvn1lj74.R.inc(2121);assertNotNull(options.getOptionGroups());
        __CLR4_5_21kq1kqlvn1lj74.R.inc(2122);assertEquals(2, options.getOptionGroups().size());
    }finally{__CLR4_5_21kq1kqlvn1lj74.R.flushNeeded();}}
}
