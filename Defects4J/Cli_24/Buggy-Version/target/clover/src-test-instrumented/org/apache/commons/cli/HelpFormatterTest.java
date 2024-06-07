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
{static class __CLR4_5_217n17nlvn1lj44{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521104441L,8589935092L,1797,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String EOL = System.getProperty("line.separator");

    public void testFindWrapPos() throws Exception
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r35iai17n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testFindWrapPos",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1571,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r35iai17n() throws Exception{try{__CLR4_5_217n17nlvn1lj44.R.inc(1571);
        __CLR4_5_217n17nlvn1lj44.R.inc(1572);HelpFormatter hf = new HelpFormatter();

        __CLR4_5_217n17nlvn1lj44.R.inc(1573);String text = "This is a test.";
        //text width should be max 8; the wrap postition is 7
        __CLR4_5_217n17nlvn1lj44.R.inc(1574);assertEquals("wrap position", 7, hf.findWrapPos(text, 8, 0));
        //starting from 8 must give -1 - the wrap pos is after end
        __CLR4_5_217n17nlvn1lj44.R.inc(1575);assertEquals("wrap position 2", -1, hf.findWrapPos(text, 8, 8));
        //if there is no a good position before width to make a wrapping look for the next one
        __CLR4_5_217n17nlvn1lj44.R.inc(1576);text = "aaaa aa";
        __CLR4_5_217n17nlvn1lj44.R.inc(1577);assertEquals("wrap position 3", 4, hf.findWrapPos(text, 3, 0));
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testPrintWrapped() throws Exception
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pftwv17u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintWrapped",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pftwv17u() throws Exception{try{__CLR4_5_217n17nlvn1lj44.R.inc(1578);
        __CLR4_5_217n17nlvn1lj44.R.inc(1579);StringBuffer sb = new StringBuffer();
        __CLR4_5_217n17nlvn1lj44.R.inc(1580);HelpFormatter hf = new HelpFormatter();

        __CLR4_5_217n17nlvn1lj44.R.inc(1581);String text = "This is a test.";

        __CLR4_5_217n17nlvn1lj44.R.inc(1582);String expected = "This is a" + hf.getNewLine() + "test.";
        __CLR4_5_217n17nlvn1lj44.R.inc(1583);hf.renderWrappedText(sb, 12, 0, text);
        __CLR4_5_217n17nlvn1lj44.R.inc(1584);assertEquals("single line text", expected, sb.toString());

        __CLR4_5_217n17nlvn1lj44.R.inc(1585);sb.setLength(0);
        __CLR4_5_217n17nlvn1lj44.R.inc(1586);expected = "This is a" + hf.getNewLine() + "    test.";
        __CLR4_5_217n17nlvn1lj44.R.inc(1587);hf.renderWrappedText(sb, 12, 4, text);
        __CLR4_5_217n17nlvn1lj44.R.inc(1588);assertEquals("single line padded text", expected, sb.toString());

        __CLR4_5_217n17nlvn1lj44.R.inc(1589);text = "  -p,--period <PERIOD>  PERIOD is time duration of form " +
               "DATE[-DATE] where DATE has form YYYY[MM[DD]]";

        __CLR4_5_217n17nlvn1lj44.R.inc(1590);sb.setLength(0);
        __CLR4_5_217n17nlvn1lj44.R.inc(1591);expected = "  -p,--period <PERIOD>  PERIOD is time duration of" +
                hf.getNewLine() +
                "                        form DATE[-DATE] where DATE" +
                hf.getNewLine() +
                "                        has form YYYY[MM[DD]]";
        __CLR4_5_217n17nlvn1lj44.R.inc(1592);hf.renderWrappedText(sb, 53, 24, text);
        __CLR4_5_217n17nlvn1lj44.R.inc(1593);assertEquals("single line padded text 2", expected, sb.toString());

        __CLR4_5_217n17nlvn1lj44.R.inc(1594);text = "aaaa aaaa aaaa" + hf.getNewLine() +
               "aaaaaa" + hf.getNewLine() +
               "aaaaa";

        __CLR4_5_217n17nlvn1lj44.R.inc(1595);expected = text;
        __CLR4_5_217n17nlvn1lj44.R.inc(1596);sb.setLength(0);
        __CLR4_5_217n17nlvn1lj44.R.inc(1597);hf.renderWrappedText(sb, 16, 0, text);
        __CLR4_5_217n17nlvn1lj44.R.inc(1598);assertEquals("multi line text", expected, sb.toString());

        __CLR4_5_217n17nlvn1lj44.R.inc(1599);expected = "aaaa aaaa aaaa" + hf.getNewLine() +
                   "    aaaaaa" + hf.getNewLine() +
                   "    aaaaa";
        __CLR4_5_217n17nlvn1lj44.R.inc(1600);sb.setLength(0);
        __CLR4_5_217n17nlvn1lj44.R.inc(1601);hf.renderWrappedText(sb, 16, 4, text);
        __CLR4_5_217n17nlvn1lj44.R.inc(1602);assertEquals("multi-line padded text", expected, sb.toString());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testPrintOptions() throws Exception
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21byq7q18j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1603,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21byq7q18j() throws Exception{try{__CLR4_5_217n17nlvn1lj44.R.inc(1603);
        __CLR4_5_217n17nlvn1lj44.R.inc(1604);StringBuffer sb = new StringBuffer();
        __CLR4_5_217n17nlvn1lj44.R.inc(1605);HelpFormatter hf = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1606);final int leftPad = 1;
        __CLR4_5_217n17nlvn1lj44.R.inc(1607);final int descPad = 3;
        __CLR4_5_217n17nlvn1lj44.R.inc(1608);final String lpad = hf.createPadding(leftPad);
        __CLR4_5_217n17nlvn1lj44.R.inc(1609);final String dpad = hf.createPadding(descPad);
        __CLR4_5_217n17nlvn1lj44.R.inc(1610);Options options = null;
        __CLR4_5_217n17nlvn1lj44.R.inc(1611);String expected = null;

        __CLR4_5_217n17nlvn1lj44.R.inc(1612);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
        __CLR4_5_217n17nlvn1lj44.R.inc(1613);expected = lpad + "-a" + dpad + "aaaa aaaa aaaa aaaa aaaa";
        __CLR4_5_217n17nlvn1lj44.R.inc(1614);hf.renderOptions(sb, 60, options, leftPad, descPad);
        __CLR4_5_217n17nlvn1lj44.R.inc(1615);assertEquals("simple non-wrapped option", expected, sb.toString());

        __CLR4_5_217n17nlvn1lj44.R.inc(1616);int nextLineTabStop = leftPad + descPad + "-a".length();
        __CLR4_5_217n17nlvn1lj44.R.inc(1617);expected = lpad + "-a" + dpad + "aaaa aaaa aaaa" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "aaaa aaaa";
        __CLR4_5_217n17nlvn1lj44.R.inc(1618);sb.setLength(0);
        __CLR4_5_217n17nlvn1lj44.R.inc(1619);hf.renderOptions(sb, nextLineTabStop + 17, options, leftPad, descPad);
        __CLR4_5_217n17nlvn1lj44.R.inc(1620);assertEquals("simple wrapped option", expected, sb.toString());


        __CLR4_5_217n17nlvn1lj44.R.inc(1621);options = new Options().addOption("a", "aaa", false, "dddd dddd dddd dddd");
        __CLR4_5_217n17nlvn1lj44.R.inc(1622);expected = lpad + "-a,--aaa" + dpad + "dddd dddd dddd dddd";
        __CLR4_5_217n17nlvn1lj44.R.inc(1623);sb.setLength(0);
        __CLR4_5_217n17nlvn1lj44.R.inc(1624);hf.renderOptions(sb, 60, options, leftPad, descPad);
        __CLR4_5_217n17nlvn1lj44.R.inc(1625);assertEquals("long non-wrapped option", expected, sb.toString());

        __CLR4_5_217n17nlvn1lj44.R.inc(1626);nextLineTabStop = leftPad + descPad + "-a,--aaa".length();
        __CLR4_5_217n17nlvn1lj44.R.inc(1627);expected = lpad + "-a,--aaa" + dpad + "dddd dddd" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "dddd dddd";
        __CLR4_5_217n17nlvn1lj44.R.inc(1628);sb.setLength(0);
        __CLR4_5_217n17nlvn1lj44.R.inc(1629);hf.renderOptions(sb, 25, options, leftPad, descPad);
        __CLR4_5_217n17nlvn1lj44.R.inc(1630);assertEquals("long wrapped option", expected, sb.toString());

        __CLR4_5_217n17nlvn1lj44.R.inc(1631);options = new Options().
                addOption("a", "aaa", false, "dddd dddd dddd dddd").
                addOption("b", false, "feeee eeee eeee eeee");
        __CLR4_5_217n17nlvn1lj44.R.inc(1632);expected = lpad + "-a,--aaa" + dpad + "dddd dddd" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "dddd dddd" + hf.getNewLine() +
                   lpad + "-b      " + dpad + "feeee eeee" + hf.getNewLine() +
                   hf.createPadding(nextLineTabStop) + "eeee eeee";
        __CLR4_5_217n17nlvn1lj44.R.inc(1633);sb.setLength(0);
        __CLR4_5_217n17nlvn1lj44.R.inc(1634);hf.renderOptions(sb, 25, options, leftPad, descPad);
        __CLR4_5_217n17nlvn1lj44.R.inc(1635);assertEquals("multiple wrapped options", expected, sb.toString());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testPrintHelpWithEmptySyntax()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26nb0az19g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintHelpWithEmptySyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1636,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26nb0az19g(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1636);
        __CLR4_5_217n17nlvn1lj44.R.inc(1637);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1638);try
        {
            __CLR4_5_217n17nlvn1lj44.R.inc(1639);formatter.printHelp(null, new Options());
            __CLR4_5_217n17nlvn1lj44.R.inc(1640);fail("null command line syntax should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        __CLR4_5_217n17nlvn1lj44.R.inc(1641);try
        {
            __CLR4_5_217n17nlvn1lj44.R.inc(1642);formatter.printHelp("", new Options());
            __CLR4_5_217n17nlvn1lj44.R.inc(1643);fail("empty command line syntax should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testAutomaticUsage() throws Exception
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hizlbj19o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testAutomaticUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1644,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hizlbj19o() throws Exception{try{__CLR4_5_217n17nlvn1lj44.R.inc(1644);
        __CLR4_5_217n17nlvn1lj44.R.inc(1645);HelpFormatter hf = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1646);Options options = null;
        __CLR4_5_217n17nlvn1lj44.R.inc(1647);String expected = "usage: app [-a]";
        __CLR4_5_217n17nlvn1lj44.R.inc(1648);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_217n17nlvn1lj44.R.inc(1649);PrintWriter pw = new PrintWriter(out);

        __CLR4_5_217n17nlvn1lj44.R.inc(1650);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
        __CLR4_5_217n17nlvn1lj44.R.inc(1651);hf.printUsage(pw, 60, "app", options);
        __CLR4_5_217n17nlvn1lj44.R.inc(1652);pw.flush();
        __CLR4_5_217n17nlvn1lj44.R.inc(1653);assertEquals("simple auto usage", expected, out.toString().trim());
        __CLR4_5_217n17nlvn1lj44.R.inc(1654);out.reset();

        __CLR4_5_217n17nlvn1lj44.R.inc(1655);expected = "usage: app [-a] [-b]";
        __CLR4_5_217n17nlvn1lj44.R.inc(1656);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa")
                .addOption("b", false, "bbb");
        __CLR4_5_217n17nlvn1lj44.R.inc(1657);hf.printUsage(pw, 60, "app", options);
        __CLR4_5_217n17nlvn1lj44.R.inc(1658);pw.flush();
        __CLR4_5_217n17nlvn1lj44.R.inc(1659);assertEquals("simple auto usage", expected, out.toString().trim());
        __CLR4_5_217n17nlvn1lj44.R.inc(1660);out.reset();
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    // This test ensures the options are properly sorted
    // See https://issues.apache.org/jira/browse/CLI-131
    public void testPrintUsage()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oinql1a5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oinql1a5(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1661);
        __CLR4_5_217n17nlvn1lj44.R.inc(1662);Option optionA = new Option("a", "first");
        __CLR4_5_217n17nlvn1lj44.R.inc(1663);Option optionB = new Option("b", "second");
        __CLR4_5_217n17nlvn1lj44.R.inc(1664);Option optionC = new Option("c", "third");
        __CLR4_5_217n17nlvn1lj44.R.inc(1665);Options opts = new Options();
        __CLR4_5_217n17nlvn1lj44.R.inc(1666);opts.addOption(optionA);
        __CLR4_5_217n17nlvn1lj44.R.inc(1667);opts.addOption(optionB);
        __CLR4_5_217n17nlvn1lj44.R.inc(1668);opts.addOption(optionC);
        __CLR4_5_217n17nlvn1lj44.R.inc(1669);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1670);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_5_217n17nlvn1lj44.R.inc(1671);PrintWriter printWriter = new PrintWriter(bytesOut);
        __CLR4_5_217n17nlvn1lj44.R.inc(1672);helpFormatter.printUsage(printWriter, 80, "app", opts);
        __CLR4_5_217n17nlvn1lj44.R.inc(1673);printWriter.close();
        __CLR4_5_217n17nlvn1lj44.R.inc(1674);assertEquals("usage: app [-a] [-b] [-c]" + EOL, bytesOut.toString());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    // uses the test for CLI-131 to implement CLI-155
    public void testPrintSortedUsage()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rtrlm81aj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintSortedUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rtrlm81aj(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1675);
        __CLR4_5_217n17nlvn1lj44.R.inc(1676);Options opts = new Options();
        __CLR4_5_217n17nlvn1lj44.R.inc(1677);opts.addOption(new Option("a", "first"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1678);opts.addOption(new Option("b", "second"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1679);opts.addOption(new Option("c", "third"));

        __CLR4_5_217n17nlvn1lj44.R.inc(1680);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1681);helpFormatter.setOptionComparator(new Comparator()
        {
            public int compare(Object o1, Object o2)
            {try{__CLR4_5_217n17nlvn1lj44.R.inc(1682);
                // reverses the fuctionality of the default comparator
                __CLR4_5_217n17nlvn1lj44.R.inc(1683);Option opt1 = (Option) o1;
                __CLR4_5_217n17nlvn1lj44.R.inc(1684);Option opt2 = (Option) o2;
                __CLR4_5_217n17nlvn1lj44.R.inc(1685);return opt2.getKey().compareToIgnoreCase(opt1.getKey());
            }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}
        });

        __CLR4_5_217n17nlvn1lj44.R.inc(1686);StringWriter out = new StringWriter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1687);helpFormatter.printUsage(new PrintWriter(out), 80, "app", opts);

        __CLR4_5_217n17nlvn1lj44.R.inc(1688);assertEquals("usage: app [-c] [-b] [-a]" + EOL, out.toString());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testPrintSortedUsageWithNullComparator()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2747jar1ax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintSortedUsageWithNullComparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2747jar1ax(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1689);
        __CLR4_5_217n17nlvn1lj44.R.inc(1690);Options opts = new Options();
        __CLR4_5_217n17nlvn1lj44.R.inc(1691);opts.addOption(new Option("a", "first"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1692);opts.addOption(new Option("b", "second"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1693);opts.addOption(new Option("c", "third"));

        __CLR4_5_217n17nlvn1lj44.R.inc(1694);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1695);helpFormatter.setOptionComparator(null);

        __CLR4_5_217n17nlvn1lj44.R.inc(1696);StringWriter out = new StringWriter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1697);helpFormatter.printUsage(new PrintWriter(out), 80, "app", opts);

        __CLR4_5_217n17nlvn1lj44.R.inc(1698);assertEquals("usage: app [-a] [-b] [-c]" + EOL, out.toString());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testPrintOptionGroupUsage()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fl1ul51b7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptionGroupUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fl1ul51b7(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1699);
        __CLR4_5_217n17nlvn1lj44.R.inc(1700);OptionGroup group = new OptionGroup();
        __CLR4_5_217n17nlvn1lj44.R.inc(1701);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1702);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1703);group.addOption(OptionBuilder.create("c"));

        __CLR4_5_217n17nlvn1lj44.R.inc(1704);Options options = new Options();
        __CLR4_5_217n17nlvn1lj44.R.inc(1705);options.addOptionGroup(group);

        __CLR4_5_217n17nlvn1lj44.R.inc(1706);StringWriter out = new StringWriter();

        __CLR4_5_217n17nlvn1lj44.R.inc(1707);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1708);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_217n17nlvn1lj44.R.inc(1709);assertEquals("usage: app [-a | -b | -c]" + EOL, out.toString());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testPrintRequiredOptionGroupUsage()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2daqvw81bi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintRequiredOptionGroupUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2daqvw81bi(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1710);
        __CLR4_5_217n17nlvn1lj44.R.inc(1711);OptionGroup group = new OptionGroup();
        __CLR4_5_217n17nlvn1lj44.R.inc(1712);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1713);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1714);group.addOption(OptionBuilder.create("c"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1715);group.setRequired(true);

        __CLR4_5_217n17nlvn1lj44.R.inc(1716);Options options = new Options();
        __CLR4_5_217n17nlvn1lj44.R.inc(1717);options.addOptionGroup(group);

        __CLR4_5_217n17nlvn1lj44.R.inc(1718);StringWriter out = new StringWriter();

        __CLR4_5_217n17nlvn1lj44.R.inc(1719);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1720);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_217n17nlvn1lj44.R.inc(1721);assertEquals("usage: app -a | -b | -c" + EOL, out.toString());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testPrintOptionWithEmptyArgNameUsage()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9m1cy1bu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptionWithEmptyArgNameUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9m1cy1bu(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1722);
        __CLR4_5_217n17nlvn1lj44.R.inc(1723);Option option = new Option("f", true, null);
        __CLR4_5_217n17nlvn1lj44.R.inc(1724);option.setArgName("");
        __CLR4_5_217n17nlvn1lj44.R.inc(1725);option.setRequired(true);

        __CLR4_5_217n17nlvn1lj44.R.inc(1726);Options options = new Options();
        __CLR4_5_217n17nlvn1lj44.R.inc(1727);options.addOption(option);

        __CLR4_5_217n17nlvn1lj44.R.inc(1728);StringWriter out = new StringWriter();

        __CLR4_5_217n17nlvn1lj44.R.inc(1729);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1730);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_217n17nlvn1lj44.R.inc(1731);assertEquals("usage: app -f" + EOL, out.toString());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testRtrim()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mfm1491c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testRtrim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1732,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mfm1491c4(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1732);
        __CLR4_5_217n17nlvn1lj44.R.inc(1733);HelpFormatter formatter = new HelpFormatter();

        __CLR4_5_217n17nlvn1lj44.R.inc(1734);assertEquals(null, formatter.rtrim(null));
        __CLR4_5_217n17nlvn1lj44.R.inc(1735);assertEquals("", formatter.rtrim(""));
        __CLR4_5_217n17nlvn1lj44.R.inc(1736);assertEquals("  foo", formatter.rtrim("  foo  "));
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testAccessors()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hde3s11c9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hde3s11c9(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1737);
        __CLR4_5_217n17nlvn1lj44.R.inc(1738);HelpFormatter formatter = new HelpFormatter();

        __CLR4_5_217n17nlvn1lj44.R.inc(1739);formatter.setArgName("argname");
        __CLR4_5_217n17nlvn1lj44.R.inc(1740);assertEquals("arg name", "argname", formatter.getArgName());

        __CLR4_5_217n17nlvn1lj44.R.inc(1741);formatter.setDescPadding(3);
        __CLR4_5_217n17nlvn1lj44.R.inc(1742);assertEquals("desc padding", 3, formatter.getDescPadding());

        __CLR4_5_217n17nlvn1lj44.R.inc(1743);formatter.setLeftPadding(7);
        __CLR4_5_217n17nlvn1lj44.R.inc(1744);assertEquals("left padding", 7, formatter.getLeftPadding());

        __CLR4_5_217n17nlvn1lj44.R.inc(1745);formatter.setLongOptPrefix("~~");
        __CLR4_5_217n17nlvn1lj44.R.inc(1746);assertEquals("long opt prefix", "~~", formatter.getLongOptPrefix());

        __CLR4_5_217n17nlvn1lj44.R.inc(1747);formatter.setNewLine("\n");
        __CLR4_5_217n17nlvn1lj44.R.inc(1748);assertEquals("new line", "\n", formatter.getNewLine());

        __CLR4_5_217n17nlvn1lj44.R.inc(1749);formatter.setOptPrefix("~");
        __CLR4_5_217n17nlvn1lj44.R.inc(1750);assertEquals("opt prefix", "~", formatter.getOptPrefix());

        __CLR4_5_217n17nlvn1lj44.R.inc(1751);formatter.setSyntaxPrefix("-> ");
        __CLR4_5_217n17nlvn1lj44.R.inc(1752);assertEquals("syntax prefix", "-> ", formatter.getSyntaxPrefix());

        __CLR4_5_217n17nlvn1lj44.R.inc(1753);formatter.setWidth(80);
        __CLR4_5_217n17nlvn1lj44.R.inc(1754);assertEquals("width", 80, formatter.getWidth());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}
    
    public void testHeaderStartingWithLineSeparator()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f7bs6l1cr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testHeaderStartingWithLineSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f7bs6l1cr(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1755);
        // related to Bugzilla #21215
        __CLR4_5_217n17nlvn1lj44.R.inc(1756);Options options = new Options();
        __CLR4_5_217n17nlvn1lj44.R.inc(1757);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1758);String header = EOL + "Header";
        __CLR4_5_217n17nlvn1lj44.R.inc(1759);String footer = "Footer";
        __CLR4_5_217n17nlvn1lj44.R.inc(1760);StringWriter out = new StringWriter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1761);formatter.printHelp(new PrintWriter(out), 80, "foobar", header, options, 2, 2, footer, true);
        __CLR4_5_217n17nlvn1lj44.R.inc(1762);assertEquals(
                "usage: foobar" + EOL +
                "" + EOL +
                "Header" + EOL +
                "" + EOL +
                "Footer" + EOL
                , out.toString());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}

    public void testOptionWithoutShortFormat()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21jr0w71cz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testOptionWithoutShortFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21jr0w71cz(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1763);
        // related to Bugzilla #19383 (CLI-67)
        __CLR4_5_217n17nlvn1lj44.R.inc(1764);Options options = new Options();
        __CLR4_5_217n17nlvn1lj44.R.inc(1765);options.addOption(new Option("a", "aaa", false, "aaaaaaa"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1766);options.addOption(new Option(null, "bbb", false, "bbbbbbb"));
        __CLR4_5_217n17nlvn1lj44.R.inc(1767);options.addOption(new Option("c", null, false, "ccccccc"));

        __CLR4_5_217n17nlvn1lj44.R.inc(1768);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1769);StringWriter out = new StringWriter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1770);formatter.printHelp(new PrintWriter(out), 80, "foobar", "", options, 2, 2, "", true);
        __CLR4_5_217n17nlvn1lj44.R.inc(1771);assertEquals(
                "usage: foobar [-a] [--bbb] [-c]" + EOL +
                "  -a,--aaa  aaaaaaa" + EOL +
                "     --bbb  bbbbbbb" + EOL +
                "  -c        ccccccc" + EOL
                , out.toString());
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}
    

    public void testOptionWithoutShortFormat2()
    {__CLR4_5_217n17nlvn1lj44.R.globalSliceStart(getClass().getName(),1772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_257tj3t1d8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217n17nlvn1lj44.R.rethrow($CLV_t2$);}finally{__CLR4_5_217n17nlvn1lj44.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testOptionWithoutShortFormat2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_257tj3t1d8(){try{__CLR4_5_217n17nlvn1lj44.R.inc(1772);
        // related to Bugzilla #27635 (CLI-26)
        __CLR4_5_217n17nlvn1lj44.R.inc(1773);Option help = new Option("h", "help", false, "print this message");
        __CLR4_5_217n17nlvn1lj44.R.inc(1774);Option version = new Option("v", "version", false, "print version information");
        __CLR4_5_217n17nlvn1lj44.R.inc(1775);Option newRun = new Option("n", "new", false, "Create NLT cache entries only for new items");
        __CLR4_5_217n17nlvn1lj44.R.inc(1776);Option trackerRun = new Option("t", "tracker", false, "Create NLT cache entries only for tracker items");
        
        __CLR4_5_217n17nlvn1lj44.R.inc(1777);Option timeLimit = OptionBuilder.withLongOpt("limit")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Set time limit for execution, in mintues")
                                        .create("l");
        
        __CLR4_5_217n17nlvn1lj44.R.inc(1778);Option age = OptionBuilder.withLongOpt("age")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Age (in days) of cache item before being recomputed")
                                        .create("a");
        
        __CLR4_5_217n17nlvn1lj44.R.inc(1779);Option server = OptionBuilder.withLongOpt("server")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("The NLT server address")
                                        .create("s");
        
        __CLR4_5_217n17nlvn1lj44.R.inc(1780);Option numResults = OptionBuilder.withLongOpt("results")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Number of results per item")
                                        .create("r");
        
        __CLR4_5_217n17nlvn1lj44.R.inc(1781);Option configFile = OptionBuilder.withLongOpt("config")
                                        .hasArg()
                                        .withValueSeparator()
                                        .withDescription("Use the specified configuration file")
                                        .create();
        
        __CLR4_5_217n17nlvn1lj44.R.inc(1782);Options mOptions = new Options();
        __CLR4_5_217n17nlvn1lj44.R.inc(1783);mOptions.addOption(help);
        __CLR4_5_217n17nlvn1lj44.R.inc(1784);mOptions.addOption(version);
        __CLR4_5_217n17nlvn1lj44.R.inc(1785);mOptions.addOption(newRun);
        __CLR4_5_217n17nlvn1lj44.R.inc(1786);mOptions.addOption(trackerRun);
        __CLR4_5_217n17nlvn1lj44.R.inc(1787);mOptions.addOption(timeLimit);
        __CLR4_5_217n17nlvn1lj44.R.inc(1788);mOptions.addOption(age);
        __CLR4_5_217n17nlvn1lj44.R.inc(1789);mOptions.addOption(server);
        __CLR4_5_217n17nlvn1lj44.R.inc(1790);mOptions.addOption(numResults);
        __CLR4_5_217n17nlvn1lj44.R.inc(1791);mOptions.addOption(configFile);
        
        __CLR4_5_217n17nlvn1lj44.R.inc(1792);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1793);final String EOL = System.getProperty("line.separator");
        __CLR4_5_217n17nlvn1lj44.R.inc(1794);StringWriter out = new StringWriter();
        __CLR4_5_217n17nlvn1lj44.R.inc(1795);formatter.printHelp(new PrintWriter(out),80,"commandline","header",mOptions,2,2,"footer",true);
        __CLR4_5_217n17nlvn1lj44.R.inc(1796);assertEquals(
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
    }finally{__CLR4_5_217n17nlvn1lj44.R.flushNeeded();}}
}
