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
{static class __CLR4_5_22bu2bulvn1n6n8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,3101,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void testSimplePattern() throws Exception
    {__CLR4_5_22bu2bulvn1n6n8.R.globalSliceStart(getClass().getName(),3018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_221nbxp2bu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22bu2bulvn1n6n8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22bu2bulvn1n6n8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testSimplePattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_221nbxp2bu() throws Exception{try{__CLR4_5_22bu2bulvn1n6n8.R.inc(3018);
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3019);Options options = PatternOptionBuilder.parsePattern("a:b@cde>f+n%t/m*z#");
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3020);String[] args = new String[] {"-c", "-a", "foo", "-b", "java.util.Vector", "-e", "build.xml", "-f", "java.util.Calendar", "-n", "4.5", "-t", "http://commons.apache.org", "-z", "Thu Jun 06 17:48:57 EDT 2002", "-m", "test*"};

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3021);CommandLineParser parser = new PosixParser();
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3022);CommandLine line = parser.parse(options, args);

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3023);assertEquals("flag a", "foo", line.getOptionValue("a"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3024);assertEquals("string flag a", "foo", line.getOptionObject("a"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3025);assertEquals("object flag b", new Vector(), line.getOptionObject("b"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3026);assertTrue("boolean true flag c", line.hasOption("c"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3027);assertFalse("boolean false flag d", line.hasOption("d"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3028);assertEquals("file flag e", new File("build.xml"), line.getOptionObject("e"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3029);assertEquals("class flag f", Calendar.class, line.getOptionObject("f"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3030);assertEquals("number flag n", new Double(4.5), line.getOptionObject("n"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3031);assertEquals("url flag t", new URL("http://commons.apache.org"), line.getOptionObject("t"));

        // tests the char methods of CommandLine that delegate to the String methods
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3032);assertEquals("flag a", "foo", line.getOptionValue('a'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3033);assertEquals("string flag a", "foo", line.getOptionObject('a'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3034);assertEquals("object flag b", new Vector(), line.getOptionObject('b'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3035);assertTrue("boolean true flag c", line.hasOption('c'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3036);assertFalse("boolean false flag d", line.hasOption('d'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3037);assertEquals("file flag e", new File("build.xml"), line.getOptionObject('e'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3038);assertEquals("class flag f", Calendar.class, line.getOptionObject('f'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3039);assertEquals("number flag n", new Double(4.5), line.getOptionObject('n'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3040);assertEquals("url flag t", new URL("http://commons.apache.org"), line.getOptionObject('t'));

        // FILES NOT SUPPORTED YET
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3041);try {
            __CLR4_5_22bu2bulvn1n6n8.R.inc(3042);assertEquals("files flag m", new File[0], line.getOptionObject('m'));
            __CLR4_5_22bu2bulvn1n6n8.R.inc(3043);fail("Multiple files are not supported yet, should have failed");
        } catch(UnsupportedOperationException uoe) {
            // expected
        }

        // DATES NOT SUPPORTED YET
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3044);try {
            __CLR4_5_22bu2bulvn1n6n8.R.inc(3045);assertEquals("date flag z", new Date(1023400137276L), line.getOptionObject('z'));
            __CLR4_5_22bu2bulvn1n6n8.R.inc(3046);fail("Date is not supported yet, should have failed");
        } catch(UnsupportedOperationException uoe) {
            // expected
        }
    }finally{__CLR4_5_22bu2bulvn1n6n8.R.flushNeeded();}}

    public void testEmptyPattern() throws Exception
    {__CLR4_5_22bu2bulvn1n6n8.R.globalSliceStart(getClass().getName(),3047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28lkqu42cn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22bu2bulvn1n6n8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22bu2bulvn1n6n8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testEmptyPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28lkqu42cn() throws Exception{try{__CLR4_5_22bu2bulvn1n6n8.R.inc(3047);
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3048);Options options = PatternOptionBuilder.parsePattern("");
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3049);assertTrue(options.getOptions().isEmpty());
    }finally{__CLR4_5_22bu2bulvn1n6n8.R.flushNeeded();}}

    public void testUntypedPattern() throws Exception
    {__CLR4_5_22bu2bulvn1n6n8.R.globalSliceStart(getClass().getName(),3050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21a6oco2cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22bu2bulvn1n6n8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22bu2bulvn1n6n8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testUntypedPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21a6oco2cq() throws Exception{try{__CLR4_5_22bu2bulvn1n6n8.R.inc(3050);
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3051);Options options = PatternOptionBuilder.parsePattern("abc");
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3052);CommandLineParser parser = new PosixParser();
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3053);CommandLine line = parser.parse(options, new String[] { "-abc" });

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3054);assertTrue(line.hasOption('a'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3055);assertNull("value a", line.getOptionObject('a'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3056);assertTrue(line.hasOption('b'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3057);assertNull("value b", line.getOptionObject('b'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3058);assertTrue(line.hasOption('c'));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3059);assertNull("value c", line.getOptionObject('c'));
    }finally{__CLR4_5_22bu2bulvn1n6n8.R.flushNeeded();}}

    public void testNumberPattern() throws Exception
    {__CLR4_5_22bu2bulvn1n6n8.R.globalSliceStart(getClass().getName(),3060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x35rd02d0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22bu2bulvn1n6n8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22bu2bulvn1n6n8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testNumberPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x35rd02d0() throws Exception{try{__CLR4_5_22bu2bulvn1n6n8.R.inc(3060);
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3061);Options options = PatternOptionBuilder.parsePattern("n%d%x%");
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3062);CommandLineParser parser = new PosixParser();
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3063);CommandLine line = parser.parse(options, new String[] { "-n", "1", "-d", "2.1", "-x", "3,5" });

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3064);assertEquals("n object class", Long.class, line.getOptionObject("n").getClass());
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3065);assertEquals("n value", new Long(1), line.getOptionObject("n"));

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3066);assertEquals("d object class", Double.class, line.getOptionObject("d").getClass());
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3067);assertEquals("d value", new Double(2.1), line.getOptionObject("d"));

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3068);assertNull("x object", line.getOptionObject("x"));
    }finally{__CLR4_5_22bu2bulvn1n6n8.R.flushNeeded();}}

    public void testClassPattern() throws Exception
    {__CLR4_5_22bu2bulvn1n6n8.R.globalSliceStart(getClass().getName(),3069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2btz6fj2d9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22bu2bulvn1n6n8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22bu2bulvn1n6n8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testClassPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3069,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2btz6fj2d9() throws Exception{try{__CLR4_5_22bu2bulvn1n6n8.R.inc(3069);
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3070);Options options = PatternOptionBuilder.parsePattern("c+d+");
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3071);CommandLineParser parser = new PosixParser();
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3072);CommandLine line = parser.parse(options, new String[] { "-c", "java.util.Calendar", "-d", "System.DateTime" });

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3073);assertEquals("c value", Calendar.class, line.getOptionObject("c"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3074);assertNull("d value", line.getOptionObject("d"));
    }finally{__CLR4_5_22bu2bulvn1n6n8.R.flushNeeded();}}

    public void testObjectPattern() throws Exception
    {__CLR4_5_22bu2bulvn1n6n8.R.globalSliceStart(getClass().getName(),3075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2awh6iu2df();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22bu2bulvn1n6n8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22bu2bulvn1n6n8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testObjectPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3075,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2awh6iu2df() throws Exception{try{__CLR4_5_22bu2bulvn1n6n8.R.inc(3075);
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3076);Options options = PatternOptionBuilder.parsePattern("o@i@n@");
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3077);CommandLineParser parser = new PosixParser();
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3078);CommandLine line = parser.parse(options, new String[] { "-o", "java.lang.String", "-i", "java.util.Calendar", "-n", "System.DateTime" });

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3079);assertEquals("o value", "", line.getOptionObject("o"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3080);assertNull("i value", line.getOptionObject("i"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3081);assertNull("n value", line.getOptionObject("n"));
    }finally{__CLR4_5_22bu2bulvn1n6n8.R.flushNeeded();}}

    public void testURLPattern() throws Exception
    {__CLR4_5_22bu2bulvn1n6n8.R.globalSliceStart(getClass().getName(),3082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tj3lfe2dm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22bu2bulvn1n6n8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22bu2bulvn1n6n8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testURLPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tj3lfe2dm() throws Exception{try{__CLR4_5_22bu2bulvn1n6n8.R.inc(3082);
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3083);Options options = PatternOptionBuilder.parsePattern("u/v/");
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3084);CommandLineParser parser = new PosixParser();
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3085);CommandLine line = parser.parse(options, new String[] { "-u", "http://commons.apache.org", "-v", "foo://commons.apache.org" });

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3086);assertEquals("u value", new URL("http://commons.apache.org"), line.getOptionObject("u"));
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3087);assertNull("v value", line.getOptionObject("v"));
    }finally{__CLR4_5_22bu2bulvn1n6n8.R.flushNeeded();}}

    public void testExistingFilePattern() throws Exception
    {__CLR4_5_22bu2bulvn1n6n8.R.globalSliceStart(getClass().getName(),3088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26e64im2ds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22bu2bulvn1n6n8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22bu2bulvn1n6n8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testExistingFilePattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26e64im2ds() throws Exception{try{__CLR4_5_22bu2bulvn1n6n8.R.inc(3088);
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3089);Options options = PatternOptionBuilder.parsePattern("f<");
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3090);CommandLineParser parser = new PosixParser();
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3091);CommandLine line = parser.parse(options, new String[] { "-f", "test.properties" });

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3092);assertEquals("f value", new File("test.properties"), line.getOptionObject("f"));

        // todo test if an error is returned if the file doesn't exists (when it's implemented)
    }finally{__CLR4_5_22bu2bulvn1n6n8.R.flushNeeded();}}

    public void testRequiredOption() throws Exception
    {__CLR4_5_22bu2bulvn1n6n8.R.globalSliceStart(getClass().getName(),3093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xuxo432dx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22bu2bulvn1n6n8.R.rethrow($CLV_t2$);}finally{__CLR4_5_22bu2bulvn1n6n8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3093,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xuxo432dx() throws Exception{try{__CLR4_5_22bu2bulvn1n6n8.R.inc(3093);
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3094);Options options = PatternOptionBuilder.parsePattern("!n%m%");
        __CLR4_5_22bu2bulvn1n6n8.R.inc(3095);CommandLineParser parser = new PosixParser();

        __CLR4_5_22bu2bulvn1n6n8.R.inc(3096);try
        {
            __CLR4_5_22bu2bulvn1n6n8.R.inc(3097);parser.parse(options, new String[]{""});
            __CLR4_5_22bu2bulvn1n6n8.R.inc(3098);fail("MissingOptionException wasn't thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_22bu2bulvn1n6n8.R.inc(3099);assertEquals(1, e.getMissingOptions().size());
            __CLR4_5_22bu2bulvn1n6n8.R.inc(3100);assertTrue(e.getMissingOptions().contains("n"));
        }
    }finally{__CLR4_5_22bu2bulvn1n6n8.R.flushNeeded();}}
}
