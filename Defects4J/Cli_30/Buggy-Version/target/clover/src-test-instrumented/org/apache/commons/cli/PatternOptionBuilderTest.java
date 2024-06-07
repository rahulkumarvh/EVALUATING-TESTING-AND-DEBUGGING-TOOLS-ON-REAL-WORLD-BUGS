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
{static class __CLR4_5_22gg2gglvn1nf9e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521191983L,8589935092L,3267,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void testSimplePattern() throws Exception
    {__CLR4_5_22gg2gglvn1nf9e.R.globalSliceStart(getClass().getName(),3184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_221nbxp2gg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gg2gglvn1nf9e.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gg2gglvn1nf9e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testSimplePattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_221nbxp2gg() throws Exception{try{__CLR4_5_22gg2gglvn1nf9e.R.inc(3184);
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3185);Options options = PatternOptionBuilder.parsePattern("a:b@cde>f+n%t/m*z#");
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3186);String[] args = new String[] {"-c", "-a", "foo", "-b", "java.util.Vector", "-e", "build.xml", "-f", "java.util.Calendar", "-n", "4.5", "-t", "http://commons.apache.org", "-z", "Thu Jun 06 17:48:57 EDT 2002", "-m", "test*"};

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3187);CommandLineParser parser = new PosixParser();
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3188);CommandLine line = parser.parse(options, args);

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3189);assertEquals("flag a", "foo", line.getOptionValue("a"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3190);assertEquals("string flag a", "foo", line.getOptionObject("a"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3191);assertEquals("object flag b", new Vector(), line.getOptionObject("b"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3192);assertTrue("boolean true flag c", line.hasOption("c"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3193);assertFalse("boolean false flag d", line.hasOption("d"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3194);assertEquals("file flag e", new File("build.xml"), line.getOptionObject("e"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3195);assertEquals("class flag f", Calendar.class, line.getOptionObject("f"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3196);assertEquals("number flag n", new Double(4.5), line.getOptionObject("n"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3197);assertEquals("url flag t", new URL("http://commons.apache.org"), line.getOptionObject("t"));

        // tests the char methods of CommandLine that delegate to the String methods
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3198);assertEquals("flag a", "foo", line.getOptionValue('a'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3199);assertEquals("string flag a", "foo", line.getOptionObject('a'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3200);assertEquals("object flag b", new Vector(), line.getOptionObject('b'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3201);assertTrue("boolean true flag c", line.hasOption('c'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3202);assertFalse("boolean false flag d", line.hasOption('d'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3203);assertEquals("file flag e", new File("build.xml"), line.getOptionObject('e'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3204);assertEquals("class flag f", Calendar.class, line.getOptionObject('f'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3205);assertEquals("number flag n", new Double(4.5), line.getOptionObject('n'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3206);assertEquals("url flag t", new URL("http://commons.apache.org"), line.getOptionObject('t'));

        // FILES NOT SUPPORTED YET
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3207);try {
            __CLR4_5_22gg2gglvn1nf9e.R.inc(3208);assertEquals("files flag m", new File[0], line.getOptionObject('m'));
            __CLR4_5_22gg2gglvn1nf9e.R.inc(3209);fail("Multiple files are not supported yet, should have failed");
        } catch(UnsupportedOperationException uoe) {
            // expected
        }

        // DATES NOT SUPPORTED YET
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3210);try {
            __CLR4_5_22gg2gglvn1nf9e.R.inc(3211);assertEquals("date flag z", new Date(1023400137276L), line.getOptionObject('z'));
            __CLR4_5_22gg2gglvn1nf9e.R.inc(3212);fail("Date is not supported yet, should have failed");
        } catch(UnsupportedOperationException uoe) {
            // expected
        }
    }finally{__CLR4_5_22gg2gglvn1nf9e.R.flushNeeded();}}

    public void testEmptyPattern() throws Exception
    {__CLR4_5_22gg2gglvn1nf9e.R.globalSliceStart(getClass().getName(),3213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28lkqu42h9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gg2gglvn1nf9e.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gg2gglvn1nf9e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testEmptyPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28lkqu42h9() throws Exception{try{__CLR4_5_22gg2gglvn1nf9e.R.inc(3213);
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3214);Options options = PatternOptionBuilder.parsePattern("");
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3215);assertTrue(options.getOptions().isEmpty());
    }finally{__CLR4_5_22gg2gglvn1nf9e.R.flushNeeded();}}

    public void testUntypedPattern() throws Exception
    {__CLR4_5_22gg2gglvn1nf9e.R.globalSliceStart(getClass().getName(),3216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21a6oco2hc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gg2gglvn1nf9e.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gg2gglvn1nf9e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testUntypedPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21a6oco2hc() throws Exception{try{__CLR4_5_22gg2gglvn1nf9e.R.inc(3216);
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3217);Options options = PatternOptionBuilder.parsePattern("abc");
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3218);CommandLineParser parser = new PosixParser();
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3219);CommandLine line = parser.parse(options, new String[] { "-abc" });

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3220);assertTrue(line.hasOption('a'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3221);assertNull("value a", line.getOptionObject('a'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3222);assertTrue(line.hasOption('b'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3223);assertNull("value b", line.getOptionObject('b'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3224);assertTrue(line.hasOption('c'));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3225);assertNull("value c", line.getOptionObject('c'));
    }finally{__CLR4_5_22gg2gglvn1nf9e.R.flushNeeded();}}

    public void testNumberPattern() throws Exception
    {__CLR4_5_22gg2gglvn1nf9e.R.globalSliceStart(getClass().getName(),3226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x35rd02hm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gg2gglvn1nf9e.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gg2gglvn1nf9e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testNumberPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x35rd02hm() throws Exception{try{__CLR4_5_22gg2gglvn1nf9e.R.inc(3226);
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3227);Options options = PatternOptionBuilder.parsePattern("n%d%x%");
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3228);CommandLineParser parser = new PosixParser();
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3229);CommandLine line = parser.parse(options, new String[] { "-n", "1", "-d", "2.1", "-x", "3,5" });

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3230);assertEquals("n object class", Long.class, line.getOptionObject("n").getClass());
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3231);assertEquals("n value", new Long(1), line.getOptionObject("n"));

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3232);assertEquals("d object class", Double.class, line.getOptionObject("d").getClass());
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3233);assertEquals("d value", new Double(2.1), line.getOptionObject("d"));

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3234);assertNull("x object", line.getOptionObject("x"));
    }finally{__CLR4_5_22gg2gglvn1nf9e.R.flushNeeded();}}

    public void testClassPattern() throws Exception
    {__CLR4_5_22gg2gglvn1nf9e.R.globalSliceStart(getClass().getName(),3235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2btz6fj2hv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gg2gglvn1nf9e.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gg2gglvn1nf9e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testClassPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3235,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2btz6fj2hv() throws Exception{try{__CLR4_5_22gg2gglvn1nf9e.R.inc(3235);
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3236);Options options = PatternOptionBuilder.parsePattern("c+d+");
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3237);CommandLineParser parser = new PosixParser();
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3238);CommandLine line = parser.parse(options, new String[] { "-c", "java.util.Calendar", "-d", "System.DateTime" });

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3239);assertEquals("c value", Calendar.class, line.getOptionObject("c"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3240);assertNull("d value", line.getOptionObject("d"));
    }finally{__CLR4_5_22gg2gglvn1nf9e.R.flushNeeded();}}

    public void testObjectPattern() throws Exception
    {__CLR4_5_22gg2gglvn1nf9e.R.globalSliceStart(getClass().getName(),3241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2awh6iu2i1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gg2gglvn1nf9e.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gg2gglvn1nf9e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testObjectPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2awh6iu2i1() throws Exception{try{__CLR4_5_22gg2gglvn1nf9e.R.inc(3241);
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3242);Options options = PatternOptionBuilder.parsePattern("o@i@n@");
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3243);CommandLineParser parser = new PosixParser();
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3244);CommandLine line = parser.parse(options, new String[] { "-o", "java.lang.String", "-i", "java.util.Calendar", "-n", "System.DateTime" });

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3245);assertEquals("o value", "", line.getOptionObject("o"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3246);assertNull("i value", line.getOptionObject("i"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3247);assertNull("n value", line.getOptionObject("n"));
    }finally{__CLR4_5_22gg2gglvn1nf9e.R.flushNeeded();}}

    public void testURLPattern() throws Exception
    {__CLR4_5_22gg2gglvn1nf9e.R.globalSliceStart(getClass().getName(),3248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tj3lfe2i8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gg2gglvn1nf9e.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gg2gglvn1nf9e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testURLPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3248,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tj3lfe2i8() throws Exception{try{__CLR4_5_22gg2gglvn1nf9e.R.inc(3248);
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3249);Options options = PatternOptionBuilder.parsePattern("u/v/");
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3250);CommandLineParser parser = new PosixParser();
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3251);CommandLine line = parser.parse(options, new String[] { "-u", "http://commons.apache.org", "-v", "foo://commons.apache.org" });

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3252);assertEquals("u value", new URL("http://commons.apache.org"), line.getOptionObject("u"));
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3253);assertNull("v value", line.getOptionObject("v"));
    }finally{__CLR4_5_22gg2gglvn1nf9e.R.flushNeeded();}}

    public void testExistingFilePattern() throws Exception
    {__CLR4_5_22gg2gglvn1nf9e.R.globalSliceStart(getClass().getName(),3254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26e64im2ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gg2gglvn1nf9e.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gg2gglvn1nf9e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testExistingFilePattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3254,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26e64im2ie() throws Exception{try{__CLR4_5_22gg2gglvn1nf9e.R.inc(3254);
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3255);Options options = PatternOptionBuilder.parsePattern("f<");
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3256);CommandLineParser parser = new PosixParser();
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3257);CommandLine line = parser.parse(options, new String[] { "-f", "test.properties" });

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3258);assertEquals("f value", new File("test.properties"), line.getOptionObject("f"));

        // todo test if an error is returned if the file doesn't exists (when it's implemented)
    }finally{__CLR4_5_22gg2gglvn1nf9e.R.flushNeeded();}}

    public void testRequiredOption() throws Exception
    {__CLR4_5_22gg2gglvn1nf9e.R.globalSliceStart(getClass().getName(),3259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xuxo432ij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gg2gglvn1nf9e.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gg2gglvn1nf9e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.PatternOptionBuilderTest.testRequiredOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3259,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xuxo432ij() throws Exception{try{__CLR4_5_22gg2gglvn1nf9e.R.inc(3259);
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3260);Options options = PatternOptionBuilder.parsePattern("!n%m%");
        __CLR4_5_22gg2gglvn1nf9e.R.inc(3261);CommandLineParser parser = new PosixParser();

        __CLR4_5_22gg2gglvn1nf9e.R.inc(3262);try
        {
            __CLR4_5_22gg2gglvn1nf9e.R.inc(3263);parser.parse(options, new String[]{""});
            __CLR4_5_22gg2gglvn1nf9e.R.inc(3264);fail("MissingOptionException wasn't thrown");
        }
        catch (MissingOptionException e)
        {
            __CLR4_5_22gg2gglvn1nf9e.R.inc(3265);assertEquals(1, e.getMissingOptions().size());
            __CLR4_5_22gg2gglvn1nf9e.R.inc(3266);assertTrue(e.getMissingOptions().contains("n"));
        }
    }finally{__CLR4_5_22gg2gglvn1nf9e.R.flushNeeded();}}
}
