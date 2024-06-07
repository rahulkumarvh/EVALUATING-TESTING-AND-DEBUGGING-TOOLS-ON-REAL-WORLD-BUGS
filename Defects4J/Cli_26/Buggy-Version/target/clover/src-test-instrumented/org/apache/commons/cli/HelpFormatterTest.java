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
{static class __CLR4_5_217o17olvn1m5m6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0036\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521133496L,8589935092L,1798,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String EOL = System.getProperty("line.separator");

    public void testFindWrapPos() throws Exception
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r35iai17o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testFindWrapPos",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1572,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r35iai17o() throws Exception{try{__CLR4_5_217o17olvn1m5m6.R.inc(1572);
        __CLR4_5_217o17olvn1m5m6.R.inc(1573);HelpFormatter hf = new HelpFormatter();

        __CLR4_5_217o17olvn1m5m6.R.inc(1574);String text = "This is a test.";
        //text width should be max 8; the wrap position is 7
        __CLR4_5_217o17olvn1m5m6.R.inc(1575);assertEquals("wrap position", 7, hf.findWrapPos(text, 8, 0));
        //starting from 8 must give -1 - the wrap pos is after end
        __CLR4_5_217o17olvn1m5m6.R.inc(1576);assertEquals("wrap position 2", -1, hf.findWrapPos(text, 8, 8));
        //if there is no a good position before width to make a wrapping look for the next one
        __CLR4_5_217o17olvn1m5m6.R.inc(1577);text = "aaaa aa";
        __CLR4_5_217o17olvn1m5m6.R.inc(1578);assertEquals("wrap position 3", 4, hf.findWrapPos(text, 3, 0));
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testPrintWrapped() throws Exception
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pftwv17v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintWrapped",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1579,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pftwv17v() throws Exception{try{__CLR4_5_217o17olvn1m5m6.R.inc(1579);
        __CLR4_5_217o17olvn1m5m6.R.inc(1580);StringBuffer sb = new StringBuffer();
        __CLR4_5_217o17olvn1m5m6.R.inc(1581);HelpFormatter hf = new HelpFormatter();

        __CLR4_5_217o17olvn1m5m6.R.inc(1582);String text = "This is a test.";

        __CLR4_5_217o17olvn1m5m6.R.inc(1583);String expected = "This is a" + hf.getNewLine() + "test.";
        __CLR4_5_217o17olvn1m5m6.R.inc(1584);hf.renderWrappedText(sb, 12, 0, text);
        __CLR4_5_217o17olvn1m5m6.R.inc(1585);assertEquals("single line text", expected, sb.toString());

        __CLR4_5_217o17olvn1m5m6.R.inc(1586);sb.setLength(0);
        __CLR4_5_217o17olvn1m5m6.R.inc(1587);expected = "This is a" + hf.getNewLine() + "    test.";
        __CLR4_5_217o17olvn1m5m6.R.inc(1588);hf.renderWrappedText(sb, 12, 4, text);
        __CLR4_5_217o17olvn1m5m6.R.inc(1589);assertEquals("single line padded text", expected, sb.toString());

        __CLR4_5_217o17olvn1m5m6.R.inc(1590);text = "  -p,--period <PERIOD>  PERIOD is time duration of form " +
               "DATE[-DATE] where DATE has form YYYY[MM[DD]]";

        __CLR4_5_217o17olvn1m5m6.R.inc(1591);sb.setLength(0);
        __CLR4_5_217o17olvn1m5m6.R.inc(1592);expected = "  -p,--period <PERIOD>  PERIOD is time duration of" +
                hf.getNewLine() +
                "                        form DATE[-DATE] where DATE" +
                hf.getNewLine() +
                "                        has form YYYY[MM[DD]]";
        __CLR4_5_217o17olvn1m5m6.R.inc(1593);hf.renderWrappedText(sb, 53, 24, text);
        __CLR4_5_217o17olvn1m5m6.R.inc(1594);assertEquals("single line padded text 2", expected, sb.toString());

        __CLR4_5_217o17olvn1m5m6.R.inc(1595);text = "aaaa aaaa aaaa" + hf.getNewLine() +
               "aaaaaa" + hf.getNewLine() +
               "aaaaa";

        __CLR4_5_217o17olvn1m5m6.R.inc(1596);expected = text;
        __CLR4_5_217o17olvn1m5m6.R.inc(1597);sb.setLength(0);
        __CLR4_5_217o17olvn1m5m6.R.inc(1598);hf.renderWrappedText(sb, 16, 0, text);
        __CLR4_5_217o17olvn1m5m6.R.inc(1599);assertEquals("multi line text", expected, sb.toString());

        __CLR4_5_217o17olvn1m5m6.R.inc(1600);expected = "aaaa aaaa aaaa" + hf.getNewLine() +
                   "    aaaaaa" + hf.getNewLine() +
                   "    aaaaa";
        __CLR4_5_217o17olvn1m5m6.R.inc(1601);sb.setLength(0);
        __CLR4_5_217o17olvn1m5m6.R.inc(1602);hf.renderWrappedText(sb, 16, 4, text);
        __CLR4_5_217o17olvn1m5m6.R.inc(1603);assertEquals("multi-line padded text", expected, sb.toString());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testPrintOptions() throws Exception
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21byq7q18k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1604,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21byq7q18k() throws Exception{try{__CLR4_5_217o17olvn1m5m6.R.inc(1604);
        __CLR4_5_217o17olvn1m5m6.R.inc(1605);StringBuffer sb = new StringBuffer();
        __CLR4_5_217o17olvn1m5m6.R.inc(1606);HelpFormatter hf = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1607);final int leftPad = 1;
        __CLR4_5_217o17olvn1m5m6.R.inc(1608);final int descPad = 3;
        __CLR4_5_217o17olvn1m5m6.R.inc(1609);final String lpad = hf.createPadding(leftPad);
        __CLR4_5_217o17olvn1m5m6.R.inc(1610);final String dpad = hf.createPadding(descPad);
        __CLR4_5_217o17olvn1m5m6.R.inc(1611);Options options = null;
        __CLR4_5_217o17olvn1m5m6.R.inc(1612);String expected = null;

        __CLR4_5_217o17olvn1m5m6.R.inc(1613);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
        __CLR4_5_217o17olvn1m5m6.R.inc(1614);expected = lpad + "-a" + dpad + "aaaa aaaa aaaa aaaa aaaa";
        __CLR4_5_217o17olvn1m5m6.R.inc(1615);hf.renderOptions(sb, 60, options, leftPad, descPad);
        __CLR4_5_217o17olvn1m5m6.R.inc(1616);assertEquals("simple non-wrapped option", expected, sb.toString());

        __CLR4_5_217o17olvn1m5m6.R.inc(1617);int nextLineTabStop = leftPad + descPad + "-a".length();
        __CLR4_5_217o17olvn1m5m6.R.inc(1618);expected = lpad + "-a" + dpad + "aaaa aaaa aaaa" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "aaaa aaaa";
        __CLR4_5_217o17olvn1m5m6.R.inc(1619);sb.setLength(0);
        __CLR4_5_217o17olvn1m5m6.R.inc(1620);hf.renderOptions(sb, nextLineTabStop + 17, options, leftPad, descPad);
        __CLR4_5_217o17olvn1m5m6.R.inc(1621);assertEquals("simple wrapped option", expected, sb.toString());


        __CLR4_5_217o17olvn1m5m6.R.inc(1622);options = new Options().addOption("a", "aaa", false, "dddd dddd dddd dddd");
        __CLR4_5_217o17olvn1m5m6.R.inc(1623);expected = lpad + "-a,--aaa" + dpad + "dddd dddd dddd dddd";
        __CLR4_5_217o17olvn1m5m6.R.inc(1624);sb.setLength(0);
        __CLR4_5_217o17olvn1m5m6.R.inc(1625);hf.renderOptions(sb, 60, options, leftPad, descPad);
        __CLR4_5_217o17olvn1m5m6.R.inc(1626);assertEquals("long non-wrapped option", expected, sb.toString());

        __CLR4_5_217o17olvn1m5m6.R.inc(1627);nextLineTabStop = leftPad + descPad + "-a,--aaa".length();
        __CLR4_5_217o17olvn1m5m6.R.inc(1628);expected = lpad + "-a,--aaa" + dpad + "dddd dddd" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "dddd dddd";
        __CLR4_5_217o17olvn1m5m6.R.inc(1629);sb.setLength(0);
        __CLR4_5_217o17olvn1m5m6.R.inc(1630);hf.renderOptions(sb, 25, options, leftPad, descPad);
        __CLR4_5_217o17olvn1m5m6.R.inc(1631);assertEquals("long wrapped option", expected, sb.toString());

        __CLR4_5_217o17olvn1m5m6.R.inc(1632);options = new Options().
                addOption("a", "aaa", false, "dddd dddd dddd dddd").
                addOption("b", false, "feeee eeee eeee eeee");
        __CLR4_5_217o17olvn1m5m6.R.inc(1633);expected = lpad + "-a,--aaa" + dpad + "dddd dddd" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "dddd dddd" + hf.getNewLine() +
                   lpad + "-b      " + dpad + "feeee eeee" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "eeee eeee";
        __CLR4_5_217o17olvn1m5m6.R.inc(1634);sb.setLength(0);
        __CLR4_5_217o17olvn1m5m6.R.inc(1635);hf.renderOptions(sb, 25, options, leftPad, descPad);
        __CLR4_5_217o17olvn1m5m6.R.inc(1636);assertEquals("multiple wrapped options", expected, sb.toString());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testPrintHelpWithEmptySyntax()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26nb0az19h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintHelpWithEmptySyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1637,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26nb0az19h(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1637);
        __CLR4_5_217o17olvn1m5m6.R.inc(1638);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1639);try
        {
            __CLR4_5_217o17olvn1m5m6.R.inc(1640);formatter.printHelp(null, new Options());
            __CLR4_5_217o17olvn1m5m6.R.inc(1641);fail("null command line syntax should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        __CLR4_5_217o17olvn1m5m6.R.inc(1642);try
        {
            __CLR4_5_217o17olvn1m5m6.R.inc(1643);formatter.printHelp("", new Options());
            __CLR4_5_217o17olvn1m5m6.R.inc(1644);fail("empty command line syntax should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testAutomaticUsage() throws Exception
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hizlbj19p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testAutomaticUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hizlbj19p() throws Exception{try{__CLR4_5_217o17olvn1m5m6.R.inc(1645);
        __CLR4_5_217o17olvn1m5m6.R.inc(1646);HelpFormatter hf = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1647);Options options = null;
        __CLR4_5_217o17olvn1m5m6.R.inc(1648);String expected = "usage: app [-a]";
        __CLR4_5_217o17olvn1m5m6.R.inc(1649);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_217o17olvn1m5m6.R.inc(1650);PrintWriter pw = new PrintWriter(out);

        __CLR4_5_217o17olvn1m5m6.R.inc(1651);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
        __CLR4_5_217o17olvn1m5m6.R.inc(1652);hf.printUsage(pw, 60, "app", options);
        __CLR4_5_217o17olvn1m5m6.R.inc(1653);pw.flush();
        __CLR4_5_217o17olvn1m5m6.R.inc(1654);assertEquals("simple auto usage", expected, out.toString().trim());
        __CLR4_5_217o17olvn1m5m6.R.inc(1655);out.reset();

        __CLR4_5_217o17olvn1m5m6.R.inc(1656);expected = "usage: app [-a] [-b]";
        __CLR4_5_217o17olvn1m5m6.R.inc(1657);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa")
                .addOption("b", false, "bbb");
        __CLR4_5_217o17olvn1m5m6.R.inc(1658);hf.printUsage(pw, 60, "app", options);
        __CLR4_5_217o17olvn1m5m6.R.inc(1659);pw.flush();
        __CLR4_5_217o17olvn1m5m6.R.inc(1660);assertEquals("simple auto usage", expected, out.toString().trim());
        __CLR4_5_217o17olvn1m5m6.R.inc(1661);out.reset();
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    // This test ensures the options are properly sorted
    // See https://issues.apache.org/jira/browse/CLI-131
    public void testPrintUsage()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oinql1a6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oinql1a6(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1662);
        __CLR4_5_217o17olvn1m5m6.R.inc(1663);Option optionA = new Option("a", "first");
        __CLR4_5_217o17olvn1m5m6.R.inc(1664);Option optionB = new Option("b", "second");
        __CLR4_5_217o17olvn1m5m6.R.inc(1665);Option optionC = new Option("c", "third");
        __CLR4_5_217o17olvn1m5m6.R.inc(1666);Options opts = new Options();
        __CLR4_5_217o17olvn1m5m6.R.inc(1667);opts.addOption(optionA);
        __CLR4_5_217o17olvn1m5m6.R.inc(1668);opts.addOption(optionB);
        __CLR4_5_217o17olvn1m5m6.R.inc(1669);opts.addOption(optionC);
        __CLR4_5_217o17olvn1m5m6.R.inc(1670);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1671);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_5_217o17olvn1m5m6.R.inc(1672);PrintWriter printWriter = new PrintWriter(bytesOut);
        __CLR4_5_217o17olvn1m5m6.R.inc(1673);helpFormatter.printUsage(printWriter, 80, "app", opts);
        __CLR4_5_217o17olvn1m5m6.R.inc(1674);printWriter.close();
        __CLR4_5_217o17olvn1m5m6.R.inc(1675);assertEquals("usage: app [-a] [-b] [-c]" + EOL, bytesOut.toString());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    // uses the test for CLI-131 to implement CLI-155
    public void testPrintSortedUsage()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rtrlm81ak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintSortedUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rtrlm81ak(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1676);
        __CLR4_5_217o17olvn1m5m6.R.inc(1677);Options opts = new Options();
        __CLR4_5_217o17olvn1m5m6.R.inc(1678);opts.addOption(new Option("a", "first"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1679);opts.addOption(new Option("b", "second"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1680);opts.addOption(new Option("c", "third"));

        __CLR4_5_217o17olvn1m5m6.R.inc(1681);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1682);helpFormatter.setOptionComparator(new Comparator()
        {
            public int compare(Object o1, Object o2)
            {try{__CLR4_5_217o17olvn1m5m6.R.inc(1683);
                // reverses the fuctionality of the default comparator
                __CLR4_5_217o17olvn1m5m6.R.inc(1684);Option opt1 = (Option) o1;
                __CLR4_5_217o17olvn1m5m6.R.inc(1685);Option opt2 = (Option) o2;
                __CLR4_5_217o17olvn1m5m6.R.inc(1686);return opt2.getKey().compareToIgnoreCase(opt1.getKey());
            }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}
        });

        __CLR4_5_217o17olvn1m5m6.R.inc(1687);StringWriter out = new StringWriter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1688);helpFormatter.printUsage(new PrintWriter(out), 80, "app", opts);

        __CLR4_5_217o17olvn1m5m6.R.inc(1689);assertEquals("usage: app [-c] [-b] [-a]" + EOL, out.toString());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testPrintSortedUsageWithNullComparator()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2747jar1ay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintSortedUsageWithNullComparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1690,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2747jar1ay(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1690);
        __CLR4_5_217o17olvn1m5m6.R.inc(1691);Options opts = new Options();
        __CLR4_5_217o17olvn1m5m6.R.inc(1692);opts.addOption(new Option("a", "first"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1693);opts.addOption(new Option("b", "second"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1694);opts.addOption(new Option("c", "third"));

        __CLR4_5_217o17olvn1m5m6.R.inc(1695);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1696);helpFormatter.setOptionComparator(null);

        __CLR4_5_217o17olvn1m5m6.R.inc(1697);StringWriter out = new StringWriter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1698);helpFormatter.printUsage(new PrintWriter(out), 80, "app", opts);

        __CLR4_5_217o17olvn1m5m6.R.inc(1699);assertEquals("usage: app [-a] [-b] [-c]" + EOL, out.toString());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testPrintOptionGroupUsage()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fl1ul51b8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptionGroupUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1700,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fl1ul51b8(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1700);
        __CLR4_5_217o17olvn1m5m6.R.inc(1701);OptionGroup group = new OptionGroup();
        __CLR4_5_217o17olvn1m5m6.R.inc(1702);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1703);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1704);group.addOption(OptionBuilder.create("c"));

        __CLR4_5_217o17olvn1m5m6.R.inc(1705);Options options = new Options();
        __CLR4_5_217o17olvn1m5m6.R.inc(1706);options.addOptionGroup(group);

        __CLR4_5_217o17olvn1m5m6.R.inc(1707);StringWriter out = new StringWriter();

        __CLR4_5_217o17olvn1m5m6.R.inc(1708);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1709);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_217o17olvn1m5m6.R.inc(1710);assertEquals("usage: app [-a | -b | -c]" + EOL, out.toString());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testPrintRequiredOptionGroupUsage()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2daqvw81bj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintRequiredOptionGroupUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1711,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2daqvw81bj(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1711);
        __CLR4_5_217o17olvn1m5m6.R.inc(1712);OptionGroup group = new OptionGroup();
        __CLR4_5_217o17olvn1m5m6.R.inc(1713);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1714);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1715);group.addOption(OptionBuilder.create("c"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1716);group.setRequired(true);

        __CLR4_5_217o17olvn1m5m6.R.inc(1717);Options options = new Options();
        __CLR4_5_217o17olvn1m5m6.R.inc(1718);options.addOptionGroup(group);

        __CLR4_5_217o17olvn1m5m6.R.inc(1719);StringWriter out = new StringWriter();

        __CLR4_5_217o17olvn1m5m6.R.inc(1720);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1721);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_217o17olvn1m5m6.R.inc(1722);assertEquals("usage: app -a | -b | -c" + EOL, out.toString());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testPrintOptionWithEmptyArgNameUsage()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9m1cy1bv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptionWithEmptyArgNameUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9m1cy1bv(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1723);
        __CLR4_5_217o17olvn1m5m6.R.inc(1724);Option option = new Option("f", true, null);
        __CLR4_5_217o17olvn1m5m6.R.inc(1725);option.setArgName("");
        __CLR4_5_217o17olvn1m5m6.R.inc(1726);option.setRequired(true);

        __CLR4_5_217o17olvn1m5m6.R.inc(1727);Options options = new Options();
        __CLR4_5_217o17olvn1m5m6.R.inc(1728);options.addOption(option);

        __CLR4_5_217o17olvn1m5m6.R.inc(1729);StringWriter out = new StringWriter();

        __CLR4_5_217o17olvn1m5m6.R.inc(1730);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1731);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_217o17olvn1m5m6.R.inc(1732);assertEquals("usage: app -f" + EOL, out.toString());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testRtrim()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mfm1491c5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testRtrim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1733,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mfm1491c5(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1733);
        __CLR4_5_217o17olvn1m5m6.R.inc(1734);HelpFormatter formatter = new HelpFormatter();

        __CLR4_5_217o17olvn1m5m6.R.inc(1735);assertEquals(null, formatter.rtrim(null));
        __CLR4_5_217o17olvn1m5m6.R.inc(1736);assertEquals("", formatter.rtrim(""));
        __CLR4_5_217o17olvn1m5m6.R.inc(1737);assertEquals("  foo", formatter.rtrim("  foo  "));
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testAccessors()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hde3s11ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1738,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hde3s11ca(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1738);
        __CLR4_5_217o17olvn1m5m6.R.inc(1739);HelpFormatter formatter = new HelpFormatter();

        __CLR4_5_217o17olvn1m5m6.R.inc(1740);formatter.setArgName("argname");
        __CLR4_5_217o17olvn1m5m6.R.inc(1741);assertEquals("arg name", "argname", formatter.getArgName());

        __CLR4_5_217o17olvn1m5m6.R.inc(1742);formatter.setDescPadding(3);
        __CLR4_5_217o17olvn1m5m6.R.inc(1743);assertEquals("desc padding", 3, formatter.getDescPadding());

        __CLR4_5_217o17olvn1m5m6.R.inc(1744);formatter.setLeftPadding(7);
        __CLR4_5_217o17olvn1m5m6.R.inc(1745);assertEquals("left padding", 7, formatter.getLeftPadding());

        __CLR4_5_217o17olvn1m5m6.R.inc(1746);formatter.setLongOptPrefix("~~");
        __CLR4_5_217o17olvn1m5m6.R.inc(1747);assertEquals("long opt prefix", "~~", formatter.getLongOptPrefix());

        __CLR4_5_217o17olvn1m5m6.R.inc(1748);formatter.setNewLine("\n");
        __CLR4_5_217o17olvn1m5m6.R.inc(1749);assertEquals("new line", "\n", formatter.getNewLine());

        __CLR4_5_217o17olvn1m5m6.R.inc(1750);formatter.setOptPrefix("~");
        __CLR4_5_217o17olvn1m5m6.R.inc(1751);assertEquals("opt prefix", "~", formatter.getOptPrefix());

        __CLR4_5_217o17olvn1m5m6.R.inc(1752);formatter.setSyntaxPrefix("-> ");
        __CLR4_5_217o17olvn1m5m6.R.inc(1753);assertEquals("syntax prefix", "-> ", formatter.getSyntaxPrefix());

        __CLR4_5_217o17olvn1m5m6.R.inc(1754);formatter.setWidth(80);
        __CLR4_5_217o17olvn1m5m6.R.inc(1755);assertEquals("width", 80, formatter.getWidth());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}
    
    public void testHeaderStartingWithLineSeparator()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f7bs6l1cs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testHeaderStartingWithLineSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1756,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f7bs6l1cs(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1756);
        // related to Bugzilla #21215
        __CLR4_5_217o17olvn1m5m6.R.inc(1757);Options options = new Options();
        __CLR4_5_217o17olvn1m5m6.R.inc(1758);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1759);String header = EOL + "Header";
        __CLR4_5_217o17olvn1m5m6.R.inc(1760);String footer = "Footer";
        __CLR4_5_217o17olvn1m5m6.R.inc(1761);StringWriter out = new StringWriter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1762);formatter.printHelp(new PrintWriter(out), 80, "foobar", header, options, 2, 2, footer, true);
        __CLR4_5_217o17olvn1m5m6.R.inc(1763);assertEquals(
                "usage: foobar" + EOL +
                "" + EOL +
                "Header" + EOL +
                "" + EOL +
                "Footer" + EOL
                , out.toString());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}

    public void testOptionWithoutShortFormat()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21jr0w71d0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testOptionWithoutShortFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1764,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21jr0w71d0(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1764);
        // related to Bugzilla #19383 (CLI-67)
        __CLR4_5_217o17olvn1m5m6.R.inc(1765);Options options = new Options();
        __CLR4_5_217o17olvn1m5m6.R.inc(1766);options.addOption(new Option("a", "aaa", false, "aaaaaaa"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1767);options.addOption(new Option(null, "bbb", false, "bbbbbbb"));
        __CLR4_5_217o17olvn1m5m6.R.inc(1768);options.addOption(new Option("c", null, false, "ccccccc"));

        __CLR4_5_217o17olvn1m5m6.R.inc(1769);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1770);StringWriter out = new StringWriter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1771);formatter.printHelp(new PrintWriter(out), 80, "foobar", "", options, 2, 2, "", true);
        __CLR4_5_217o17olvn1m5m6.R.inc(1772);assertEquals(
                "usage: foobar [-a] [--bbb] [-c]" + EOL +
                "  -a,--aaa  aaaaaaa" + EOL +
                "     --bbb  bbbbbbb" + EOL +
                "  -c        ccccccc" + EOL
                , out.toString());
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}
    

    public void testOptionWithoutShortFormat2()
    {__CLR4_5_217o17olvn1m5m6.R.globalSliceStart(getClass().getName(),1773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_257tj3t1d9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217o17olvn1m5m6.R.rethrow($CLV_t2$);}finally{__CLR4_5_217o17olvn1m5m6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testOptionWithoutShortFormat2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1773,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_257tj3t1d9(){try{__CLR4_5_217o17olvn1m5m6.R.inc(1773);
        // related to Bugzilla #27635 (CLI-26)
        __CLR4_5_217o17olvn1m5m6.R.inc(1774);Option help = new Option("h", "help", false, "print this message");
        __CLR4_5_217o17olvn1m5m6.R.inc(1775);Option version = new Option("v", "version", false, "print version information");
        __CLR4_5_217o17olvn1m5m6.R.inc(1776);Option newRun = new Option("n", "new", false, "Create NLT cache entries only for new items");
        __CLR4_5_217o17olvn1m5m6.R.inc(1777);Option trackerRun = new Option("t", "tracker", false, "Create NLT cache entries only for tracker items");
        
        __CLR4_5_217o17olvn1m5m6.R.inc(1778);Option timeLimit = OptionBuilder.withLongOpt("limit")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Set time limit for execution, in mintues")
                                        .create("l");
        
        __CLR4_5_217o17olvn1m5m6.R.inc(1779);Option age = OptionBuilder.withLongOpt("age")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Age (in days) of cache item before being recomputed")
                                        .create("a");
        
        __CLR4_5_217o17olvn1m5m6.R.inc(1780);Option server = OptionBuilder.withLongOpt("server")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("The NLT server address")
                                        .create("s");
        
        __CLR4_5_217o17olvn1m5m6.R.inc(1781);Option numResults = OptionBuilder.withLongOpt("results")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Number of results per item")
                                        .create("r");
        
        __CLR4_5_217o17olvn1m5m6.R.inc(1782);Option configFile = OptionBuilder.withLongOpt("config")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Use the specified configuration file")
                                        .create();
        
        __CLR4_5_217o17olvn1m5m6.R.inc(1783);Options mOptions = new Options();
        __CLR4_5_217o17olvn1m5m6.R.inc(1784);mOptions.addOption(help);
        __CLR4_5_217o17olvn1m5m6.R.inc(1785);mOptions.addOption(version);
        __CLR4_5_217o17olvn1m5m6.R.inc(1786);mOptions.addOption(newRun);
        __CLR4_5_217o17olvn1m5m6.R.inc(1787);mOptions.addOption(trackerRun);
        __CLR4_5_217o17olvn1m5m6.R.inc(1788);mOptions.addOption(timeLimit);
        __CLR4_5_217o17olvn1m5m6.R.inc(1789);mOptions.addOption(age);
        __CLR4_5_217o17olvn1m5m6.R.inc(1790);mOptions.addOption(server);
        __CLR4_5_217o17olvn1m5m6.R.inc(1791);mOptions.addOption(numResults);
        __CLR4_5_217o17olvn1m5m6.R.inc(1792);mOptions.addOption(configFile);
        
        __CLR4_5_217o17olvn1m5m6.R.inc(1793);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1794);final String EOL = System.getProperty("line.separator");
        __CLR4_5_217o17olvn1m5m6.R.inc(1795);StringWriter out = new StringWriter();
        __CLR4_5_217o17olvn1m5m6.R.inc(1796);formatter.printHelp(new PrintWriter(out),80,"commandline","header",mOptions,2,2,"footer",true);
        __CLR4_5_217o17olvn1m5m6.R.inc(1797);assertEquals(
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
    }finally{__CLR4_5_217o17olvn1m5m6.R.flushNeeded();}}
}
