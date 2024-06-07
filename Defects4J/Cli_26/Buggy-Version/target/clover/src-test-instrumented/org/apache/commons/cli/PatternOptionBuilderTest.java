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

import java.io.File;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import junit.framework.TestCase;

/** 
 * Test case for the PatternOptionBuilder class 
 *
 * @version $Revision$, $Date$
 */
public class PatternOptionBuilderTest extends TestCase
{static class __CLR4_5_21se1selvn1m5tq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0036\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521133496L,8589935092L,2401,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void testSimplePattern() throws Exception
    {__CLR4_5_21se1selvn1m5tq.R.globalSliceStart(getClass().getName(),2318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_221nbxp1se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21se1selvn1m5tq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21se1selvn1m5tq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testSimplePattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2318,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_221nbxp1se() throws Exception{try{__CLR4_5_21se1selvn1m5tq.R.inc(2318);
        __CLR4_5_21se1selvn1m5tq.R.inc(2319);Options options = PatternOptionBuilder.parsePattern("a:b@cde>f+n%t/m*z#");
        __CLR4_5_21se1selvn1m5tq.R.inc(2320);String[] args = new String[] {"-c", "-a", "foo", "-b", "java.util.Vector", "-e", "build.xml", "-f", "java.util.Calendar", "-n", "4.5", "-t", "http://commons.apache.org", "-z", "Thu Jun 06 17:48:57 EDT 2002", "-m", "test*"};

        __CLR4_5_21se1selvn1m5tq.R.inc(2321);CommandLineParser parser = new PosixParser();
        __CLR4_5_21se1selvn1m5tq.R.inc(2322);CommandLine line = parser.parse(options, args);

        __CLR4_5_21se1selvn1m5tq.R.inc(2323);assertEquals("flag a", "foo", line.getOptionValue("a"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2324);assertEquals("string flag a", "foo", line.getOptionObject("a"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2325);assertEquals("object flag b", new Vector(), line.getOptionObject("b"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2326);assertTrue("boolean true flag c", line.hasOption("c"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2327);assertFalse("boolean false flag d", line.hasOption("d"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2328);assertEquals("file flag e", new File("build.xml"), line.getOptionObject("e"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2329);assertEquals("class flag f", Calendar.class, line.getOptionObject("f"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2330);assertEquals("number flag n", new Double(4.5), line.getOptionObject("n"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2331);assertEquals("url flag t", new URL("http://commons.apache.org"), line.getOptionObject("t"));

        // tests the char methods of CommandLine that delegate to the String methods
        __CLR4_5_21se1selvn1m5tq.R.inc(2332);assertEquals("flag a", "foo", line.getOptionValue('a'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2333);assertEquals("string flag a", "foo", line.getOptionObject('a'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2334);assertEquals("object flag b", new Vector(), line.getOptionObject('b'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2335);assertTrue("boolean true flag c", line.hasOption('c'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2336);assertFalse("boolean false flag d", line.hasOption('d'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2337);assertEquals("file flag e", new File("build.xml"), line.getOptionObject('e'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2338);assertEquals("class flag f", Calendar.class, line.getOptionObject('f'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2339);assertEquals("number flag n", new Double(4.5), line.getOptionObject('n'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2340);assertEquals("url flag t", new URL("http://commons.apache.org"), line.getOptionObject('t'));

        // FILES NOT SUPPORTED YET
        __CLR4_5_21se1selvn1m5tq.R.inc(2341);try {
            __CLR4_5_21se1selvn1m5tq.R.inc(2342);assertEquals("files flag m", new File[0], line.getOptionObject('m'));
            __CLR4_5_21se1selvn1m5tq.R.inc(2343);fail("Multiple files are not supported yet, should have failed");
        } catch(UnsupportedOperationException uoe) {
            // expected
        }

        // DATES NOT SUPPORTED YET
        __CLR4_5_21se1selvn1m5tq.R.inc(2344);try {
            __CLR4_5_21se1selvn1m5tq.R.inc(2345);assertEquals("date flag z", new Date(1023400137276L), line.getOptionObject('z'));
            __CLR4_5_21se1selvn1m5tq.R.inc(2346);fail("Date is not supported yet, should have failed");
        } catch(UnsupportedOperationException uoe) {
            // expected
        }
    }finally{__CLR4_5_21se1selvn1m5tq.R.flushNeeded();}}

    public void testEmptyPattern() throws Exception
    {__CLR4_5_21se1selvn1m5tq.R.globalSliceStart(getClass().getName(),2347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28lkqu41t7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21se1selvn1m5tq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21se1selvn1m5tq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testEmptyPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2347,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28lkqu41t7() throws Exception{try{__CLR4_5_21se1selvn1m5tq.R.inc(2347);
        __CLR4_5_21se1selvn1m5tq.R.inc(2348);Options options = PatternOptionBuilder.parsePattern("");
        __CLR4_5_21se1selvn1m5tq.R.inc(2349);assertTrue(options.getOptions().isEmpty());
    }finally{__CLR4_5_21se1selvn1m5tq.R.flushNeeded();}}

    public void testUntypedPattern() throws Exception
    {__CLR4_5_21se1selvn1m5tq.R.globalSliceStart(getClass().getName(),2350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21a6oco1ta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21se1selvn1m5tq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21se1selvn1m5tq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testUntypedPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21a6oco1ta() throws Exception{try{__CLR4_5_21se1selvn1m5tq.R.inc(2350);
        __CLR4_5_21se1selvn1m5tq.R.inc(2351);Options options = PatternOptionBuilder.parsePattern("abc");
        __CLR4_5_21se1selvn1m5tq.R.inc(2352);CommandLineParser parser = new PosixParser();
        __CLR4_5_21se1selvn1m5tq.R.inc(2353);CommandLine line = parser.parse(options, new String[] { "-abc" });

        __CLR4_5_21se1selvn1m5tq.R.inc(2354);assertTrue(line.hasOption('a'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2355);assertNull("value a", line.getOptionObject('a'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2356);assertTrue(line.hasOption('b'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2357);assertNull("value b", line.getOptionObject('b'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2358);assertTrue(line.hasOption('c'));
        __CLR4_5_21se1selvn1m5tq.R.inc(2359);assertNull("value c", line.getOptionObject('c'));
    }finally{__CLR4_5_21se1selvn1m5tq.R.flushNeeded();}}

    public void testNumberPattern() throws Exception
    {__CLR4_5_21se1selvn1m5tq.R.globalSliceStart(getClass().getName(),2360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x35rd01tk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21se1selvn1m5tq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21se1selvn1m5tq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testNumberPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x35rd01tk() throws Exception{try{__CLR4_5_21se1selvn1m5tq.R.inc(2360);
        __CLR4_5_21se1selvn1m5tq.R.inc(2361);Options options = PatternOptionBuilder.parsePattern("n%d%x%");
        __CLR4_5_21se1selvn1m5tq.R.inc(2362);CommandLineParser parser = new PosixParser();
        __CLR4_5_21se1selvn1m5tq.R.inc(2363);CommandLine line = parser.parse(options, new String[] { "-n", "1", "-d", "2.1", "-x", "3,5" });

        __CLR4_5_21se1selvn1m5tq.R.inc(2364);assertEquals("n object class", Long.class, line.getOptionObject("n").getClass());
        __CLR4_5_21se1selvn1m5tq.R.inc(2365);assertEquals("n value", new Long(1), line.getOptionObject("n"));

        __CLR4_5_21se1selvn1m5tq.R.inc(2366);assertEquals("d object class", Double.class, line.getOptionObject("d").getClass());
        __CLR4_5_21se1selvn1m5tq.R.inc(2367);assertEquals("d value", new Double(2.1), line.getOptionObject("d"));

        __CLR4_5_21se1selvn1m5tq.R.inc(2368);assertNull("x object", line.getOptionObject("x"));
    }finally{__CLR4_5_21se1selvn1m5tq.R.flushNeeded();}}

    public void testClassPattern() throws Exception
    {__CLR4_5_21se1selvn1m5tq.R.globalSliceStart(getClass().getName(),2369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2btz6fj1tt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21se1selvn1m5tq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21se1selvn1m5tq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testClassPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2btz6fj1tt() throws Exception{try{__CLR4_5_21se1selvn1m5tq.R.inc(2369);
        __CLR4_5_21se1selvn1m5tq.R.inc(2370);Options options = PatternOptionBuilder.parsePattern("c+d+");
        __CLR4_5_21se1selvn1m5tq.R.inc(2371);CommandLineParser parser = new PosixParser();
        __CLR4_5_21se1selvn1m5tq.R.inc(2372);CommandLine line = parser.parse(options, new String[] { "-c", "java.util.Calendar", "-d", "System.DateTime" });

        __CLR4_5_21se1selvn1m5tq.R.inc(2373);assertEquals("c value", Calendar.class, line.getOptionObject("c"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2374);assertNull("d value", line.getOptionObject("d"));
    }finally{__CLR4_5_21se1selvn1m5tq.R.flushNeeded();}}

    public void testObjectPattern() throws Exception
    {__CLR4_5_21se1selvn1m5tq.R.globalSliceStart(getClass().getName(),2375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2awh6iu1tz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21se1selvn1m5tq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21se1selvn1m5tq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testObjectPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2375,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2awh6iu1tz() throws Exception{try{__CLR4_5_21se1selvn1m5tq.R.inc(2375);
        __CLR4_5_21se1selvn1m5tq.R.inc(2376);Options options = PatternOptionBuilder.parsePattern("o@i@n@");
        __CLR4_5_21se1selvn1m5tq.R.inc(2377);CommandLineParser parser = new PosixParser();
        __CLR4_5_21se1selvn1m5tq.R.inc(2378);CommandLine line = parser.parse(options, new String[] { "-o", "java.lang.String", "-i", "java.util.Calendar", "-n", "System.DateTime" });

        __CLR4_5_21se1selvn1m5tq.R.inc(2379);assertEquals("o value", "", line.getOptionObject("o"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2380);assertNull("i value", line.getOptionObject("i"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2381);assertNull("n value", line.getOptionObject("n"));
    }finally{__CLR4_5_21se1selvn1m5tq.R.flushNeeded();}}

    public void testURLPattern() throws Exception
    {__CLR4_5_21se1selvn1m5tq.R.globalSliceStart(getClass().getName(),2382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tj3lfe1u6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21se1selvn1m5tq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21se1selvn1m5tq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testURLPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2382,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tj3lfe1u6() throws Exception{try{__CLR4_5_21se1selvn1m5tq.R.inc(2382);
        __CLR4_5_21se1selvn1m5tq.R.inc(2383);Options options = PatternOptionBuilder.parsePattern("u/v/");
        __CLR4_5_21se1selvn1m5tq.R.inc(2384);CommandLineParser parser = new PosixParser();
        __CLR4_5_21se1selvn1m5tq.R.inc(2385);CommandLine line = parser.parse(options, new String[] { "-u", "http://commons.apache.org", "-v", "foo://commons.apache.org" });

        __CLR4_5_21se1selvn1m5tq.R.inc(2386);assertEquals("u value", new URL("http://commons.apache.org"), line.getOptionObject("u"));
        __CLR4_5_21se1selvn1m5tq.R.inc(2387);assertNull("v value", line.getOptionObject("v"));
    }finally{__CLR4_5_21se1selvn1m5tq.R.flushNeeded();}}

    public void testExistingFilePattern() throws Exception
    {__CLR4_5_21se1selvn1m5tq.R.globalSliceStart(getClass().getName(),2388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26e64im1uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21se1selvn1m5tq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21se1selvn1m5tq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testExistingFilePattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26e64im1uc() throws Exception{try{__CLR4_5_21se1selvn1m5tq.R.inc(2388);
        __CLR4_5_21se1selvn1m5tq.R.inc(2389);Options options = PatternOptionBuilder.parsePattern("f<");
        __CLR4_5_21se1selvn1m5tq.R.inc(2390);CommandLineParser parser = new PosixParser();
        __CLR4_5_21se1selvn1m5tq.R.inc(2391);CommandLine line = parser.parse(options, new String[] { "-f", "test.properties" });

        __CLR4_5_21se1selvn1m5tq.R.inc(2392);assertEquals("f value", new File("test.properties"), line.getOptionObject("f"));

        // todo test if an error is returned if the file doesn't exists (when it's implemented)
    }finally{__CLR4_5_21se1selvn1m5tq.R.flushNeeded();}}

    public void testRequiredOption() throws Exception
    {__CLR4_5_21se1selvn1m5tq.R.globalSliceStart(getClass().getName(),2393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xuxo431uh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21se1selvn1m5tq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21se1selvn1m5tq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2393,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xuxo431uh() throws Exception{try{__CLR4_5_21se1selvn1m5tq.R.inc(2393);
        __CLR4_5_21se1selvn1m5tq.R.inc(2394);Options options = PatternOptionBuilder.parsePattern("!n%m%");
        __CLR4_5_21se1selvn1m5tq.R.inc(2395);CommandLineParser parser = new PosixParser();

        __CLR4_5_21se1selvn1m5tq.R.inc(2396);try
        {
            __CLR4_5_21se1selvn1m5tq.R.inc(2397);parser.parse(options, new String[]{""});
            __CLR4_5_21se1selvn1m5tq.R.inc(2398);fail("MissingOptionException wasn't thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21se1selvn1m5tq.R.inc(2399);assertEquals(1, e.getMissingOptions().size());
            __CLR4_5_21se1selvn1m5tq.R.inc(2400);assertTrue(e.getMissingOptions().contains("n"));
        }
    }finally{__CLR4_5_21se1selvn1m5tq.R.flushNeeded();}}
}
