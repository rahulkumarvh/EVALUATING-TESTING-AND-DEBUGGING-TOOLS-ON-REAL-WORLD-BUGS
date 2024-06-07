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

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import junit.framework.TestCase;

/** 
 * Test case for the HelpFormatter class 
 *
 * @author Slawek Zachcial
 * @author John Keyes ( john at integralsource.com )
 * @author brianegge
 */
public class HelpFormatterTest extends TestCase
{static class __CLR4_5_21j91j9lvn1n6g4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,2237,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String EOL = System.getProperty("line.separator");

    public void testFindWrapPos() throws Exception
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),1989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r35iai1j9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testFindWrapPos",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1989,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r35iai1j9() throws Exception{try{__CLR4_5_21j91j9lvn1n6g4.R.inc(1989);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(1990);HelpFormatter hf = new HelpFormatter();

        __CLR4_5_21j91j9lvn1n6g4.R.inc(1991);String text = "This is a test.";
        //text width should be max 8; the wrap position is 7
        __CLR4_5_21j91j9lvn1n6g4.R.inc(1992);assertEquals("wrap position", 7, hf.findWrapPos(text, 8, 0));
        //starting from 8 must give -1 - the wrap pos is after end
        __CLR4_5_21j91j9lvn1n6g4.R.inc(1993);assertEquals("wrap position 2", -1, hf.findWrapPos(text, 8, 8));
        //if there is no a good position before width to make a wrapping look for the next one
        __CLR4_5_21j91j9lvn1n6g4.R.inc(1994);text = "aaaa aa";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(1995);assertEquals("wrap position 3", 4, hf.findWrapPos(text, 3, 0));
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testPrintWrapped() throws Exception
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),1996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pftwv1jg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintWrapped",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1996,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pftwv1jg() throws Exception{try{__CLR4_5_21j91j9lvn1n6g4.R.inc(1996);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(1997);StringBuffer sb = new StringBuffer();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(1998);HelpFormatter hf = new HelpFormatter();

        __CLR4_5_21j91j9lvn1n6g4.R.inc(1999);String text = "This is a test.";

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2000);String expected = "This is a" + hf.getNewLine() + "test.";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2001);hf.renderWrappedText(sb, 12, 0, text);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2002);assertEquals("single line text", expected, sb.toString());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2003);sb.setLength(0);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2004);expected = "This is a" + hf.getNewLine() + "    test.";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2005);hf.renderWrappedText(sb, 12, 4, text);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2006);assertEquals("single line padded text", expected, sb.toString());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2007);text = "  -p,--period <PERIOD>  PERIOD is time duration of form " +
               "DATE[-DATE] where DATE has form YYYY[MM[DD]]";

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2008);sb.setLength(0);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2009);expected = "  -p,--period <PERIOD>  PERIOD is time duration of" +
                hf.getNewLine() +
                "                        form DATE[-DATE] where DATE" +
                hf.getNewLine() +
                "                        has form YYYY[MM[DD]]";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2010);hf.renderWrappedText(sb, 53, 24, text);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2011);assertEquals("single line padded text 2", expected, sb.toString());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2012);text = "aaaa aaaa aaaa" + hf.getNewLine() +
               "aaaaaa" + hf.getNewLine() +
               "aaaaa";

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2013);expected = text;
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2014);sb.setLength(0);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2015);hf.renderWrappedText(sb, 16, 0, text);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2016);assertEquals("multi line text", expected, sb.toString());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2017);expected = "aaaa aaaa aaaa" + hf.getNewLine() +
                   "    aaaaaa" + hf.getNewLine() +
                   "    aaaaa";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2018);sb.setLength(0);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2019);hf.renderWrappedText(sb, 16, 4, text);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2020);assertEquals("multi-line padded text", expected, sb.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testPrintOptions() throws Exception
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21byq7q1k5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2021,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21byq7q1k5() throws Exception{try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2021);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2022);StringBuffer sb = new StringBuffer();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2023);HelpFormatter hf = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2024);final int leftPad = 1;
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2025);final int descPad = 3;
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2026);final String lpad = hf.createPadding(leftPad);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2027);final String dpad = hf.createPadding(descPad);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2028);Options options = null;
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2029);String expected = null;

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2030);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2031);expected = lpad + "-a" + dpad + "aaaa aaaa aaaa aaaa aaaa";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2032);hf.renderOptions(sb, 60, options, leftPad, descPad);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2033);assertEquals("simple non-wrapped option", expected, sb.toString());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2034);int nextLineTabStop = leftPad + descPad + "-a".length();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2035);expected = lpad + "-a" + dpad + "aaaa aaaa aaaa" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "aaaa aaaa";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2036);sb.setLength(0);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2037);hf.renderOptions(sb, nextLineTabStop + 17, options, leftPad, descPad);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2038);assertEquals("simple wrapped option", expected, sb.toString());


        __CLR4_5_21j91j9lvn1n6g4.R.inc(2039);options = new Options().addOption("a", "aaa", false, "dddd dddd dddd dddd");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2040);expected = lpad + "-a,--aaa" + dpad + "dddd dddd dddd dddd";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2041);sb.setLength(0);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2042);hf.renderOptions(sb, 60, options, leftPad, descPad);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2043);assertEquals("long non-wrapped option", expected, sb.toString());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2044);nextLineTabStop = leftPad + descPad + "-a,--aaa".length();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2045);expected = lpad + "-a,--aaa" + dpad + "dddd dddd" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "dddd dddd";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2046);sb.setLength(0);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2047);hf.renderOptions(sb, 25, options, leftPad, descPad);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2048);assertEquals("long wrapped option", expected, sb.toString());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2049);options = new Options().
                addOption("a", "aaa", false, "dddd dddd dddd dddd").
                addOption("b", false, "feeee eeee eeee eeee");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2050);expected = lpad + "-a,--aaa" + dpad + "dddd dddd" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "dddd dddd" + hf.getNewLine() +
                   lpad + "-b      " + dpad + "feeee eeee" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "eeee eeee";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2051);sb.setLength(0);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2052);hf.renderOptions(sb, 25, options, leftPad, descPad);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2053);assertEquals("multiple wrapped options", expected, sb.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testPrintHelpWithEmptySyntax()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26nb0az1l2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintHelpWithEmptySyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2054,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26nb0az1l2(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2054);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2055);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2056);try
        {
            __CLR4_5_21j91j9lvn1n6g4.R.inc(2057);formatter.printHelp(null, new Options());
            __CLR4_5_21j91j9lvn1n6g4.R.inc(2058);fail("null command line syntax should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2059);try
        {
            __CLR4_5_21j91j9lvn1n6g4.R.inc(2060);formatter.printHelp("", new Options());
            __CLR4_5_21j91j9lvn1n6g4.R.inc(2061);fail("empty command line syntax should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testAutomaticUsage() throws Exception
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hizlbj1la();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testAutomaticUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hizlbj1la() throws Exception{try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2062);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2063);HelpFormatter hf = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2064);Options options = null;
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2065);String expected = "usage: app [-a]";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2066);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2067);PrintWriter pw = new PrintWriter(out);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2068);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2069);hf.printUsage(pw, 60, "app", options);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2070);pw.flush();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2071);assertEquals("simple auto usage", expected, out.toString().trim());
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2072);out.reset();

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2073);expected = "usage: app [-a] [-b]";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2074);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa")
                .addOption("b", false, "bbb");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2075);hf.printUsage(pw, 60, "app", options);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2076);pw.flush();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2077);assertEquals("simple auto usage", expected, out.toString().trim());
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2078);out.reset();
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    // This test ensures the options are properly sorted
    // See https://issues.apache.org/jira/browse/CLI-131
    public void testPrintUsage()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oinql1lr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oinql1lr(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2079);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2080);Option optionA = new Option("a", "first");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2081);Option optionB = new Option("b", "second");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2082);Option optionC = new Option("c", "third");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2083);Options opts = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2084);opts.addOption(optionA);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2085);opts.addOption(optionB);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2086);opts.addOption(optionC);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2087);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2088);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2089);PrintWriter printWriter = new PrintWriter(bytesOut);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2090);helpFormatter.printUsage(printWriter, 80, "app", opts);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2091);printWriter.close();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2092);assertEquals("usage: app [-a] [-b] [-c]" + EOL, bytesOut.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    // uses the test for CLI-131 to implement CLI-155
    public void testPrintSortedUsage()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rtrlm81m5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintSortedUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2093,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rtrlm81m5(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2093);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2094);Options opts = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2095);opts.addOption(new Option("a", "first"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2096);opts.addOption(new Option("b", "second"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2097);opts.addOption(new Option("c", "third"));

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2098);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2099);helpFormatter.setOptionComparator(new Comparator()
        {
            public int compare(Object o1, Object o2)
            {try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2100);
                // reverses the fuctionality of the default comparator
                __CLR4_5_21j91j9lvn1n6g4.R.inc(2101);Option opt1 = (Option) o1;
                __CLR4_5_21j91j9lvn1n6g4.R.inc(2102);Option opt2 = (Option) o2;
                __CLR4_5_21j91j9lvn1n6g4.R.inc(2103);return opt2.getKey().compareToIgnoreCase(opt1.getKey());
            }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}
        });

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2104);StringWriter out = new StringWriter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2105);helpFormatter.printUsage(new PrintWriter(out), 80, "app", opts);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2106);assertEquals("usage: app [-c] [-b] [-a]" + EOL, out.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testPrintSortedUsageWithNullComparator()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2747jar1mj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintSortedUsageWithNullComparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2107,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2747jar1mj(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2107);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2108);Options opts = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2109);opts.addOption(new Option("a", "first"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2110);opts.addOption(new Option("b", "second"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2111);opts.addOption(new Option("c", "third"));

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2112);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2113);helpFormatter.setOptionComparator(null);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2114);StringWriter out = new StringWriter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2115);helpFormatter.printUsage(new PrintWriter(out), 80, "app", opts);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2116);assertEquals("usage: app [-a] [-b] [-c]" + EOL, out.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testPrintOptionGroupUsage()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fl1ul51mt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptionGroupUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fl1ul51mt(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2117);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2118);OptionGroup group = new OptionGroup();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2119);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2120);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2121);group.addOption(OptionBuilder.create("c"));

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2122);Options options = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2123);options.addOptionGroup(group);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2124);StringWriter out = new StringWriter();

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2125);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2126);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2127);assertEquals("usage: app [-a | -b | -c]" + EOL, out.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testPrintRequiredOptionGroupUsage()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2daqvw81n4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintRequiredOptionGroupUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2128,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2daqvw81n4(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2128);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2129);OptionGroup group = new OptionGroup();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2130);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2131);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2132);group.addOption(OptionBuilder.create("c"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2133);group.setRequired(true);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2134);Options options = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2135);options.addOptionGroup(group);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2136);StringWriter out = new StringWriter();

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2137);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2138);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2139);assertEquals("usage: app -a | -b | -c" + EOL, out.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testPrintOptionWithEmptyArgNameUsage()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9m1cy1ng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptionWithEmptyArgNameUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9m1cy1ng(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2140);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2141);Option option = new Option("f", true, null);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2142);option.setArgName("");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2143);option.setRequired(true);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2144);Options options = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2145);options.addOption(option);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2146);StringWriter out = new StringWriter();

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2147);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2148);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2149);assertEquals("usage: app -f" + EOL, out.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testRtrim()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mfm1491nq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testRtrim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2150,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mfm1491nq(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2150);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2151);HelpFormatter formatter = new HelpFormatter();

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2152);assertEquals(null, formatter.rtrim(null));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2153);assertEquals("", formatter.rtrim(""));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2154);assertEquals("  foo", formatter.rtrim("  foo  "));
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testAccessors()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hde3s11nv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hde3s11nv(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2155);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2156);HelpFormatter formatter = new HelpFormatter();

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2157);formatter.setArgName("argname");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2158);assertEquals("arg name", "argname", formatter.getArgName());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2159);formatter.setDescPadding(3);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2160);assertEquals("desc padding", 3, formatter.getDescPadding());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2161);formatter.setLeftPadding(7);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2162);assertEquals("left padding", 7, formatter.getLeftPadding());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2163);formatter.setLongOptPrefix("~~");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2164);assertEquals("long opt prefix", "~~", formatter.getLongOptPrefix());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2165);formatter.setNewLine("\n");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2166);assertEquals("new line", "\n", formatter.getNewLine());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2167);formatter.setOptPrefix("~");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2168);assertEquals("opt prefix", "~", formatter.getOptPrefix());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2169);formatter.setSyntaxPrefix("-> ");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2170);assertEquals("syntax prefix", "-> ", formatter.getSyntaxPrefix());

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2171);formatter.setWidth(80);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2172);assertEquals("width", 80, formatter.getWidth());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}
    
    public void testHeaderStartingWithLineSeparator()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f7bs6l1od();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testHeaderStartingWithLineSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f7bs6l1od(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2173);
        // related to Bugzilla #21215
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2174);Options options = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2175);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2176);String header = EOL + "Header";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2177);String footer = "Footer";
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2178);StringWriter out = new StringWriter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2179);formatter.printHelp(new PrintWriter(out), 80, "foobar", header, options, 2, 2, footer, true);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2180);assertEquals(
                "usage: foobar" + EOL +
                "" + EOL +
                "Header" + EOL +
                "" + EOL +
                "Footer" + EOL
                , out.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testOptionWithoutShortFormat()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21jr0w71ol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testOptionWithoutShortFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21jr0w71ol(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2181);
        // related to Bugzilla #19383 (CLI-67)
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2182);Options options = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2183);options.addOption(new Option("a", "aaa", false, "aaaaaaa"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2184);options.addOption(new Option(null, "bbb", false, "bbbbbbb"));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2185);options.addOption(new Option("c", null, false, "ccccccc"));

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2186);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2187);StringWriter out = new StringWriter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2188);formatter.printHelp(new PrintWriter(out), 80, "foobar", "", options, 2, 2, "", true);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2189);assertEquals(
                "usage: foobar [-a] [--bbb] [-c]" + EOL +
                "  -a,--aaa  aaaaaaa" + EOL +
                "     --bbb  bbbbbbb" + EOL +
                "  -c        ccccccc" + EOL
                , out.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}
    

    public void testOptionWithoutShortFormat2()
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_257tj3t1ou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testOptionWithoutShortFormat2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2190,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_257tj3t1ou(){try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2190);
        // related to Bugzilla #27635 (CLI-26)
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2191);Option help = new Option("h", "help", false, "print this message");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2192);Option version = new Option("v", "version", false, "print version information");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2193);Option newRun = new Option("n", "new", false, "Create NLT cache entries only for new items");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2194);Option trackerRun = new Option("t", "tracker", false, "Create NLT cache entries only for tracker items");
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2195);Option timeLimit = OptionBuilder.withLongOpt("limit")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Set time limit for execution, in mintues")
                                        .create("l");
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2196);Option age = OptionBuilder.withLongOpt("age")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Age (in days) of cache item before being recomputed")
                                        .create("a");
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2197);Option server = OptionBuilder.withLongOpt("server")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("The NLT server address")
                                        .create("s");
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2198);Option numResults = OptionBuilder.withLongOpt("results")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Number of results per item")
                                        .create("r");
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2199);Option configFile = OptionBuilder.withLongOpt("config")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Use the specified configuration file")
                                        .create();
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2200);Options mOptions = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2201);mOptions.addOption(help);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2202);mOptions.addOption(version);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2203);mOptions.addOption(newRun);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2204);mOptions.addOption(trackerRun);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2205);mOptions.addOption(timeLimit);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2206);mOptions.addOption(age);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2207);mOptions.addOption(server);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2208);mOptions.addOption(numResults);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2209);mOptions.addOption(configFile);
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2210);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2211);final String EOL = System.getProperty("line.separator");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2212);StringWriter out = new StringWriter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2213);formatter.printHelp(new PrintWriter(out),80,"commandline","header",mOptions,2,2,"footer",true);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2214);assertEquals(
                "usage: commandline [-a <arg>] [--config <arg>] [-h] [-l <arg>] [-n] [-r <arg>]" + EOL +
                "       [-s <arg>] [-t] [-v]" + EOL +
                "header"+EOL+
                "  -a,--age <arg>      Age (in days) of cache item before being recomputed"+EOL+
                "     --config <arg>   Use the specified configuration file"+EOL+
                "  -h,--help           print this message"+EOL+
                "  -l,--limit <arg>    Set time limit for execution, in mintues"+EOL+
                "  -n,--new            Create NLT cache entries only for new items"+EOL+
                "  -r,--results <arg>  Number of results per item"+EOL+
                "  -s,--server <arg>   The NLT server address"+EOL+
                "  -t,--tracker        Create NLT cache entries only for tracker items"+EOL+
                "  -v,--version        print version information"+EOL+
                "footer"+EOL
                ,out.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}
    
    public void testHelpWithLongOptSeparator() throws Exception
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2il4gsy1pj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testHelpWithLongOptSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2il4gsy1pj() throws Exception{try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2215);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2216);Options options = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2217);options.addOption( "f", true, "the file" );
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2218);options.addOption(OptionBuilder.withLongOpt("size").withDescription("the size").hasArg().withArgName("SIZE").create('s'));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2219);options.addOption(OptionBuilder.withLongOpt("age").withDescription("the age").hasArg().create());
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2220);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2221);assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2222);formatter.setLongOptSeparator("=");
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2223);assertEquals("=", formatter.getLongOptSeparator());
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2224);StringWriter out = new StringWriter();

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2225);formatter.printHelp(new PrintWriter(out), 80, "create", "header", options, 2, 2, "footer");

        __CLR4_5_21j91j9lvn1n6g4.R.inc(2226);assertEquals(
                "usage: create" + EOL +
                "header" + EOL +
                "     --age=<arg>    the age" + EOL +
                "  -f <arg>          the file" + EOL +
                "  -s,--size=<SIZE>  the size" + EOL +
                "footer" + EOL,
                out.toString());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}

    public void testUsageWithLongOptSeparator() throws Exception
    {__CLR4_5_21j91j9lvn1n6g4.R.globalSliceStart(getClass().getName(),2227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29v7vpy1pv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j91j9lvn1n6g4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j91j9lvn1n6g4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testUsageWithLongOptSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29v7vpy1pv() throws Exception{try{__CLR4_5_21j91j9lvn1n6g4.R.inc(2227);
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2228);Options options = new Options();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2229);options.addOption( "f", true, "the file" );
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2230);options.addOption(OptionBuilder.withLongOpt("size").withDescription("the size").hasArg().withArgName("SIZE").create('s'));
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2231);options.addOption(OptionBuilder.withLongOpt("age").withDescription("the age").hasArg().create());
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2232);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2233);formatter.setLongOptSeparator("=");
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2234);StringWriter out = new StringWriter();
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2235);formatter.printUsage(new PrintWriter(out), 80, "create", options);
        
        __CLR4_5_21j91j9lvn1n6g4.R.inc(2236);assertEquals("usage: create [--age=<arg>] [-f <arg>] [-s <SIZE>]", out.toString().trim());
    }finally{__CLR4_5_21j91j9lvn1n6g4.R.flushNeeded();}}
}
