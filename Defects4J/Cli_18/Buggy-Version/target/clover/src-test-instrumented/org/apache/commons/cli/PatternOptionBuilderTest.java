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
import java.util.Vector;

import junit.framework.TestCase;

/** 
 * Test case for the PatternOptionBuilder class 
 *
 * @author Henri Yandell
 * @version $Revision$, $Date$
 */
public class PatternOptionBuilderTest extends TestCase
{static class __CLR4_5_21q01q0lvkk1tm5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370698324L,8589935092L,2309,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void testSimplePattern() throws Exception
    {__CLR4_5_21q01q0lvkk1tm5.R.globalSliceStart(getClass().getName(),2232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_221nbxp1q0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q01q0lvkk1tm5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q01q0lvkk1tm5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testSimplePattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2232,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_221nbxp1q0() throws Exception{try{__CLR4_5_21q01q0lvkk1tm5.R.inc(2232);
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2233);Options options = PatternOptionBuilder.parsePattern("a:b@cde>f+n%t/");
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2234);String[] args = new String[]{"-c", "-a", "foo", "-b", "java.util.Vector", "-e", "build.xml", "-f", "java.util.Calendar", "-n", "4.5", "-t", "http://jakarta.apache.org/"};

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2235);CommandLineParser parser = new PosixParser();
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2236);CommandLine line = parser.parse(options, args);

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2237);assertEquals("flag a", "foo", line.getOptionValue("a"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2238);assertEquals("string flag a", "foo", line.getOptionObject("a"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2239);assertEquals("object flag b", new Vector(), line.getOptionObject("b"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2240);assertTrue("boolean true flag c", line.hasOption("c"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2241);assertFalse("boolean false flag d", line.hasOption("d"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2242);assertEquals("file flag e", new File("build.xml"), line.getOptionObject("e"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2243);assertEquals("class flag f", Calendar.class, line.getOptionObject("f"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2244);assertEquals("number flag n", new Double(4.5), line.getOptionObject("n"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2245);assertEquals("url flag t", new URL("http://jakarta.apache.org/"), line.getOptionObject("t"));

        // tests the char methods of CommandLine that delegate to the String methods
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2246);assertEquals("flag a", "foo", line.getOptionValue('a'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2247);assertEquals("string flag a", "foo", line.getOptionObject('a'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2248);assertEquals("object flag b", new Vector(), line.getOptionObject('b'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2249);assertTrue("boolean true flag c", line.hasOption('c'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2250);assertFalse("boolean false flag d", line.hasOption('d'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2251);assertEquals("file flag e", new File("build.xml"), line.getOptionObject('e'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2252);assertEquals("class flag f", Calendar.class, line.getOptionObject('f'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2253);assertEquals("number flag n", new Double(4.5), line.getOptionObject('n'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2254);assertEquals("url flag t", new URL("http://jakarta.apache.org/"), line.getOptionObject('t'));

        /// DATES NOT SUPPORTED YET.
        //      assertEquals("number flag t", new Date(1023400137276L), line.getOptionObject('z'));
        //     input is:  "Thu Jun 06 17:48:57 EDT 2002"
    }finally{__CLR4_5_21q01q0lvkk1tm5.R.flushNeeded();}}

    public void testEmptyPattern() throws Exception
    {__CLR4_5_21q01q0lvkk1tm5.R.globalSliceStart(getClass().getName(),2255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28lkqu41qn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q01q0lvkk1tm5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q01q0lvkk1tm5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testEmptyPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28lkqu41qn() throws Exception{try{__CLR4_5_21q01q0lvkk1tm5.R.inc(2255);
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2256);Options options = PatternOptionBuilder.parsePattern("");
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2257);assertTrue(options.getOptions().isEmpty());
    }finally{__CLR4_5_21q01q0lvkk1tm5.R.flushNeeded();}}

    public void testUntypedPattern() throws Exception
    {__CLR4_5_21q01q0lvkk1tm5.R.globalSliceStart(getClass().getName(),2258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21a6oco1qq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q01q0lvkk1tm5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q01q0lvkk1tm5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testUntypedPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2258,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21a6oco1qq() throws Exception{try{__CLR4_5_21q01q0lvkk1tm5.R.inc(2258);
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2259);Options options = PatternOptionBuilder.parsePattern("abc");
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2260);CommandLineParser parser = new PosixParser();
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2261);CommandLine line = parser.parse(options, new String[] { "-abc" });

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2262);assertTrue(line.hasOption('a'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2263);assertNull("value a", line.getOptionObject('a'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2264);assertTrue(line.hasOption('b'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2265);assertNull("value b", line.getOptionObject('b'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2266);assertTrue(line.hasOption('c'));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2267);assertNull("value c", line.getOptionObject('c'));
    }finally{__CLR4_5_21q01q0lvkk1tm5.R.flushNeeded();}}

    public void testNumberPattern() throws Exception
    {__CLR4_5_21q01q0lvkk1tm5.R.globalSliceStart(getClass().getName(),2268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x35rd01r0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q01q0lvkk1tm5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q01q0lvkk1tm5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testNumberPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x35rd01r0() throws Exception{try{__CLR4_5_21q01q0lvkk1tm5.R.inc(2268);
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2269);Options options = PatternOptionBuilder.parsePattern("n%d%x%");
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2270);CommandLineParser parser = new PosixParser();
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2271);CommandLine line = parser.parse(options, new String[] { "-n", "1", "-d", "2.1", "-x", "3,5" });

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2272);assertEquals("n object class", Long.class, line.getOptionObject("n").getClass());
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2273);assertEquals("n value", new Long(1), line.getOptionObject("n"));

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2274);assertEquals("d object class", Double.class, line.getOptionObject("d").getClass());
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2275);assertEquals("d value", new Double(2.1), line.getOptionObject("d"));

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2276);assertNull("x object", line.getOptionObject("x"));
    }finally{__CLR4_5_21q01q0lvkk1tm5.R.flushNeeded();}}

    public void testClassPattern() throws Exception
    {__CLR4_5_21q01q0lvkk1tm5.R.globalSliceStart(getClass().getName(),2277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2btz6fj1r9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q01q0lvkk1tm5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q01q0lvkk1tm5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testClassPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2btz6fj1r9() throws Exception{try{__CLR4_5_21q01q0lvkk1tm5.R.inc(2277);
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2278);Options options = PatternOptionBuilder.parsePattern("c+d+");
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2279);CommandLineParser parser = new PosixParser();
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2280);CommandLine line = parser.parse(options, new String[] { "-c", "java.util.Calendar", "-d", "System.DateTime" });

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2281);assertEquals("c value", Calendar.class, line.getOptionObject("c"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2282);assertNull("d value", line.getOptionObject("d"));
    }finally{__CLR4_5_21q01q0lvkk1tm5.R.flushNeeded();}}

    public void testObjectPattern() throws Exception
    {__CLR4_5_21q01q0lvkk1tm5.R.globalSliceStart(getClass().getName(),2283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2awh6iu1rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q01q0lvkk1tm5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q01q0lvkk1tm5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testObjectPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2awh6iu1rf() throws Exception{try{__CLR4_5_21q01q0lvkk1tm5.R.inc(2283);
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2284);Options options = PatternOptionBuilder.parsePattern("o@i@n@");
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2285);CommandLineParser parser = new PosixParser();
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2286);CommandLine line = parser.parse(options, new String[] { "-o", "java.lang.String", "-i", "java.util.Calendar", "-n", "System.DateTime" });

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2287);assertEquals("o value", "", line.getOptionObject("o"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2288);assertNull("i value", line.getOptionObject("i"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2289);assertNull("n value", line.getOptionObject("n"));
    }finally{__CLR4_5_21q01q0lvkk1tm5.R.flushNeeded();}}

    public void testURLPattern() throws Exception
    {__CLR4_5_21q01q0lvkk1tm5.R.globalSliceStart(getClass().getName(),2290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tj3lfe1rm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q01q0lvkk1tm5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q01q0lvkk1tm5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testURLPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2290,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tj3lfe1rm() throws Exception{try{__CLR4_5_21q01q0lvkk1tm5.R.inc(2290);
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2291);Options options = PatternOptionBuilder.parsePattern("u/v/");
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2292);CommandLineParser parser = new PosixParser();
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2293);CommandLine line = parser.parse(options, new String[] { "-u", "http://commons.apache.org", "-v", "foo://commons.apache.org" });

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2294);assertEquals("u value", new URL("http://commons.apache.org"), line.getOptionObject("u"));
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2295);assertNull("v value", line.getOptionObject("v"));
    }finally{__CLR4_5_21q01q0lvkk1tm5.R.flushNeeded();}}

    public void testExistingFilePattern() throws Exception
    {__CLR4_5_21q01q0lvkk1tm5.R.globalSliceStart(getClass().getName(),2296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26e64im1rs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q01q0lvkk1tm5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q01q0lvkk1tm5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testExistingFilePattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26e64im1rs() throws Exception{try{__CLR4_5_21q01q0lvkk1tm5.R.inc(2296);
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2297);Options options = PatternOptionBuilder.parsePattern("f<");
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2298);CommandLineParser parser = new PosixParser();
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2299);CommandLine line = parser.parse(options, new String[] { "-f", "test.properties" });

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2300);assertEquals("f value", new File("test.properties"), line.getOptionObject("f"));

        // todo test if an error is returned if the file doesn't exists (when it's implemented)
    }finally{__CLR4_5_21q01q0lvkk1tm5.R.flushNeeded();}}

    public void testRequiredOption() throws Exception
    {__CLR4_5_21q01q0lvkk1tm5.R.globalSliceStart(getClass().getName(),2301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xuxo431rx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q01q0lvkk1tm5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q01q0lvkk1tm5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xuxo431rx() throws Exception{try{__CLR4_5_21q01q0lvkk1tm5.R.inc(2301);
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2302);Options options = PatternOptionBuilder.parsePattern("!n%m%");
        __CLR4_5_21q01q0lvkk1tm5.R.inc(2303);CommandLineParser parser = new PosixParser();

        __CLR4_5_21q01q0lvkk1tm5.R.inc(2304);try
        {
            __CLR4_5_21q01q0lvkk1tm5.R.inc(2305);parser.parse(options, new String[]{""});
            __CLR4_5_21q01q0lvkk1tm5.R.inc(2306);fail("MissingOptionException wasn't thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_21q01q0lvkk1tm5.R.inc(2307);assertEquals(1, e.getMissingOptions().size());
            __CLR4_5_21q01q0lvkk1tm5.R.inc(2308);assertTrue(e.getMissingOptions().contains("n"));
        }
    }finally{__CLR4_5_21q01q0lvkk1tm5.R.flushNeeded();}}
}
