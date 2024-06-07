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
 **/
public class HelpFormatterTest extends TestCase
{static class __CLR4_5_2181181lvl36y2g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402850486L,8589935092L,1773,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
   private static final String EOL = System.getProperty("line.separator");

   public static void main( String[] args )
   {try{__CLR4_5_2181181lvl36y2g.R.inc(1585);
      __CLR4_5_2181181lvl36y2g.R.inc(1586);String[] testName = { HelpFormatterTest.class.getName() };
      __CLR4_5_2181181lvl36y2g.R.inc(1587);junit.textui.TestRunner.main(testName);
   }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

   public void testFindWrapPos() throws Exception
   {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r35iai184();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testFindWrapPos",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r35iai184() throws Exception{try{__CLR4_5_2181181lvl36y2g.R.inc(1588);
      __CLR4_5_2181181lvl36y2g.R.inc(1589);HelpFormatter hf = new HelpFormatter();

      __CLR4_5_2181181lvl36y2g.R.inc(1590);String text = "This is a test.";
      //text width should be max 8; the wrap postition is 7
      __CLR4_5_2181181lvl36y2g.R.inc(1591);assertEquals("wrap position", 7, hf.findWrapPos(text, 8, 0));
      //starting from 8 must give -1 - the wrap pos is after end
      __CLR4_5_2181181lvl36y2g.R.inc(1592);assertEquals("wrap position 2", -1, hf.findWrapPos(text, 8, 8));
      //if there is no a good position before width to make a wrapping look for the next one
      __CLR4_5_2181181lvl36y2g.R.inc(1593);text = "aaaa aa";
      __CLR4_5_2181181lvl36y2g.R.inc(1594);assertEquals("wrap position 3", 4, hf.findWrapPos(text, 3, 0));
   }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

   public void testPrintWrapped() throws Exception
   {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pftwv18b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintWrapped",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pftwv18b() throws Exception{try{__CLR4_5_2181181lvl36y2g.R.inc(1595);
      __CLR4_5_2181181lvl36y2g.R.inc(1596);StringBuffer sb = new StringBuffer();
      __CLR4_5_2181181lvl36y2g.R.inc(1597);HelpFormatter hf = new HelpFormatter();

      __CLR4_5_2181181lvl36y2g.R.inc(1598);String text = "This is a test.";
      __CLR4_5_2181181lvl36y2g.R.inc(1599);String expected;

      __CLR4_5_2181181lvl36y2g.R.inc(1600);expected = "This is a" + hf.getNewLine() + "test.";
      __CLR4_5_2181181lvl36y2g.R.inc(1601);hf.renderWrappedText(sb, 12, 0, text);
      __CLR4_5_2181181lvl36y2g.R.inc(1602);assertEquals("single line text", expected, sb.toString());

      __CLR4_5_2181181lvl36y2g.R.inc(1603);sb.setLength(0);
      __CLR4_5_2181181lvl36y2g.R.inc(1604);expected = "This is a" + hf.getNewLine() + "    test.";
      __CLR4_5_2181181lvl36y2g.R.inc(1605);hf.renderWrappedText(sb, 12, 4, text);
      __CLR4_5_2181181lvl36y2g.R.inc(1606);assertEquals("single line padded text", expected, sb.toString());

      __CLR4_5_2181181lvl36y2g.R.inc(1607);text = "  -p,--period <PERIOD>  PERIOD is time duration of form " +
          "DATE[-DATE] where DATE has form YYYY[MM[DD]]";

      __CLR4_5_2181181lvl36y2g.R.inc(1608);sb.setLength(0);
      __CLR4_5_2181181lvl36y2g.R.inc(1609);expected = "  -p,--period <PERIOD>  PERIOD is time duration of" +
                 hf.getNewLine() +
                 "                        form DATE[-DATE] where DATE" +
                 hf.getNewLine() +
                 "                        has form YYYY[MM[DD]]";
      __CLR4_5_2181181lvl36y2g.R.inc(1610);hf.renderWrappedText(sb, 53, 24, text);
      __CLR4_5_2181181lvl36y2g.R.inc(1611);assertEquals("single line padded text 2", expected, sb.toString());

      __CLR4_5_2181181lvl36y2g.R.inc(1612);text =
         "aaaa aaaa aaaa" + hf.getNewLine() +
         "aaaaaa" + hf.getNewLine() +
         "aaaaa";

      __CLR4_5_2181181lvl36y2g.R.inc(1613);expected = text;
      __CLR4_5_2181181lvl36y2g.R.inc(1614);sb.setLength(0);
      __CLR4_5_2181181lvl36y2g.R.inc(1615);hf.renderWrappedText(sb, 16, 0, text);
      __CLR4_5_2181181lvl36y2g.R.inc(1616);assertEquals("multi line text", expected, sb.toString());

      __CLR4_5_2181181lvl36y2g.R.inc(1617);expected =
         "aaaa aaaa aaaa" + hf.getNewLine() +
         "    aaaaaa" + hf.getNewLine() +
         "    aaaaa";
      __CLR4_5_2181181lvl36y2g.R.inc(1618);sb.setLength(0);
      __CLR4_5_2181181lvl36y2g.R.inc(1619);hf.renderWrappedText(sb, 16, 4, text);
      __CLR4_5_2181181lvl36y2g.R.inc(1620);assertEquals("multi-line padded text", expected, sb.toString());
   }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

   public void testPrintOptions() throws Exception
   {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21byq7q191();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21byq7q191() throws Exception{try{__CLR4_5_2181181lvl36y2g.R.inc(1621);
       __CLR4_5_2181181lvl36y2g.R.inc(1622);StringBuffer sb = new StringBuffer();
       __CLR4_5_2181181lvl36y2g.R.inc(1623);HelpFormatter hf = new HelpFormatter();
       __CLR4_5_2181181lvl36y2g.R.inc(1624);final int leftPad = 1;
       __CLR4_5_2181181lvl36y2g.R.inc(1625);final int descPad = 3;
       __CLR4_5_2181181lvl36y2g.R.inc(1626);final String lpad = hf.createPadding(leftPad);
       __CLR4_5_2181181lvl36y2g.R.inc(1627);final String dpad = hf.createPadding(descPad);
       __CLR4_5_2181181lvl36y2g.R.inc(1628);Options options = null;
       __CLR4_5_2181181lvl36y2g.R.inc(1629);String expected = null;

       __CLR4_5_2181181lvl36y2g.R.inc(1630);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
       __CLR4_5_2181181lvl36y2g.R.inc(1631);expected = lpad + "-a" + dpad + "aaaa aaaa aaaa aaaa aaaa";
       __CLR4_5_2181181lvl36y2g.R.inc(1632);hf.renderOptions(sb, 60, options, leftPad, descPad);
       __CLR4_5_2181181lvl36y2g.R.inc(1633);assertEquals("simple non-wrapped option", expected, sb.toString());

       __CLR4_5_2181181lvl36y2g.R.inc(1634);int nextLineTabStop = leftPad+descPad+"-a".length();
       __CLR4_5_2181181lvl36y2g.R.inc(1635);expected =
           lpad + "-a" + dpad + "aaaa aaaa aaaa" + hf.getNewLine() +
           hf.createPadding(nextLineTabStop) + "aaaa aaaa";
       __CLR4_5_2181181lvl36y2g.R.inc(1636);sb.setLength(0);
       __CLR4_5_2181181lvl36y2g.R.inc(1637);hf.renderOptions(sb, nextLineTabStop+17, options, leftPad, descPad);
       __CLR4_5_2181181lvl36y2g.R.inc(1638);assertEquals("simple wrapped option", expected, sb.toString());


       __CLR4_5_2181181lvl36y2g.R.inc(1639);options = new Options().addOption("a", "aaa", false, "dddd dddd dddd dddd");
       __CLR4_5_2181181lvl36y2g.R.inc(1640);expected = lpad + "-a,--aaa" + dpad + "dddd dddd dddd dddd";
       __CLR4_5_2181181lvl36y2g.R.inc(1641);sb.setLength(0);
       __CLR4_5_2181181lvl36y2g.R.inc(1642);hf.renderOptions(sb, 60, options, leftPad, descPad);
       __CLR4_5_2181181lvl36y2g.R.inc(1643);assertEquals("long non-wrapped option", expected, sb.toString());

       __CLR4_5_2181181lvl36y2g.R.inc(1644);nextLineTabStop = leftPad+descPad+"-a,--aaa".length();
       __CLR4_5_2181181lvl36y2g.R.inc(1645);expected =
           lpad + "-a,--aaa" + dpad + "dddd dddd" + hf.getNewLine() +
           hf.createPadding(nextLineTabStop) + "dddd dddd";
       __CLR4_5_2181181lvl36y2g.R.inc(1646);sb.setLength(0);
       __CLR4_5_2181181lvl36y2g.R.inc(1647);hf.renderOptions(sb, 25, options, leftPad, descPad);
       __CLR4_5_2181181lvl36y2g.R.inc(1648);assertEquals("long wrapped option", expected, sb.toString());

       __CLR4_5_2181181lvl36y2g.R.inc(1649);options = new Options().
           addOption("a", "aaa", false, "dddd dddd dddd dddd").
           addOption("b", false, "feeee eeee eeee eeee");
       __CLR4_5_2181181lvl36y2g.R.inc(1650);expected =
           lpad + "-a,--aaa" + dpad + "dddd dddd" + hf.getNewLine() +
           hf.createPadding(nextLineTabStop) + "dddd dddd" + hf.getNewLine() +
           lpad + "-b      " + dpad + "feeee eeee" + hf.getNewLine() +
           hf.createPadding(nextLineTabStop) + "eeee eeee";
       __CLR4_5_2181181lvl36y2g.R.inc(1651);sb.setLength(0);
       __CLR4_5_2181181lvl36y2g.R.inc(1652);hf.renderOptions(sb, 25, options, leftPad, descPad);
       __CLR4_5_2181181lvl36y2g.R.inc(1653);assertEquals("multiple wrapped options", expected, sb.toString());
   }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

    public void testPrintHelpWithEmptySyntax()
    {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26nb0az19y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintHelpWithEmptySyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26nb0az19y(){try{__CLR4_5_2181181lvl36y2g.R.inc(1654);
        __CLR4_5_2181181lvl36y2g.R.inc(1655);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_2181181lvl36y2g.R.inc(1656);try
        {
            __CLR4_5_2181181lvl36y2g.R.inc(1657);formatter.printHelp(null, new Options());
            __CLR4_5_2181181lvl36y2g.R.inc(1658);fail("null command line syntax should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        __CLR4_5_2181181lvl36y2g.R.inc(1659);try
        {
            __CLR4_5_2181181lvl36y2g.R.inc(1660);formatter.printHelp("", new Options());
            __CLR4_5_2181181lvl36y2g.R.inc(1661);fail("empty command line syntax should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}


   public void testAutomaticUsage() throws Exception
   {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hizlbj1a6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testAutomaticUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hizlbj1a6() throws Exception{try{__CLR4_5_2181181lvl36y2g.R.inc(1662);
       __CLR4_5_2181181lvl36y2g.R.inc(1663);HelpFormatter hf = new HelpFormatter();
       __CLR4_5_2181181lvl36y2g.R.inc(1664);Options options = null;
       __CLR4_5_2181181lvl36y2g.R.inc(1665);String expected = "usage: app [-a]";
       __CLR4_5_2181181lvl36y2g.R.inc(1666);ByteArrayOutputStream out = new ByteArrayOutputStream( );
       __CLR4_5_2181181lvl36y2g.R.inc(1667);PrintWriter pw = new PrintWriter( out );

       __CLR4_5_2181181lvl36y2g.R.inc(1668);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
       __CLR4_5_2181181lvl36y2g.R.inc(1669);hf.printUsage( pw, 60, "app", options );
       __CLR4_5_2181181lvl36y2g.R.inc(1670);pw.flush();
       __CLR4_5_2181181lvl36y2g.R.inc(1671);assertEquals("simple auto usage", expected, out.toString().trim());
       __CLR4_5_2181181lvl36y2g.R.inc(1672);out.reset();

       __CLR4_5_2181181lvl36y2g.R.inc(1673);expected = "usage: app [-a] [-b]";
       __CLR4_5_2181181lvl36y2g.R.inc(1674);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa")
       .addOption("b", false, "bbb" );
       __CLR4_5_2181181lvl36y2g.R.inc(1675);hf.printUsage( pw, 60, "app", options );
       __CLR4_5_2181181lvl36y2g.R.inc(1676);pw.flush();
       __CLR4_5_2181181lvl36y2g.R.inc(1677);assertEquals("simple auto usage", expected, out.toString().trim());
       __CLR4_5_2181181lvl36y2g.R.inc(1678);out.reset();
   }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

    // This test ensures the options are properly sorted
    // See https://issues.apache.org/jira/browse/CLI-131
    public void testPrintUsage()
    {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oinql1an();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1679,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oinql1an(){try{__CLR4_5_2181181lvl36y2g.R.inc(1679);
        __CLR4_5_2181181lvl36y2g.R.inc(1680);Option optionA = new Option("a", "first");
        __CLR4_5_2181181lvl36y2g.R.inc(1681);Option optionB = new Option("b", "second");
        __CLR4_5_2181181lvl36y2g.R.inc(1682);Option optionC = new Option("c", "third");
        __CLR4_5_2181181lvl36y2g.R.inc(1683);Options opts = new Options();
        __CLR4_5_2181181lvl36y2g.R.inc(1684);opts.addOption(optionA);
        __CLR4_5_2181181lvl36y2g.R.inc(1685);opts.addOption(optionB);
        __CLR4_5_2181181lvl36y2g.R.inc(1686);opts.addOption(optionC);
        __CLR4_5_2181181lvl36y2g.R.inc(1687);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_2181181lvl36y2g.R.inc(1688);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_5_2181181lvl36y2g.R.inc(1689);PrintWriter printWriter = new PrintWriter(bytesOut);
        __CLR4_5_2181181lvl36y2g.R.inc(1690);helpFormatter.printUsage(printWriter, 80, "app", opts);
        __CLR4_5_2181181lvl36y2g.R.inc(1691);printWriter.close();
        __CLR4_5_2181181lvl36y2g.R.inc(1692);assertEquals("usage: app [-a] [-b] [-c]" + EOL, bytesOut.toString());
    }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

    // uses the test for CLI-131 to implement CLI-155
    public void testPrintSortedUsage()
    {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rtrlm81b1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintSortedUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rtrlm81b1(){try{__CLR4_5_2181181lvl36y2g.R.inc(1693);
        __CLR4_5_2181181lvl36y2g.R.inc(1694);Options opts = new Options();
        __CLR4_5_2181181lvl36y2g.R.inc(1695);opts.addOption(new Option("a", "first"));
        __CLR4_5_2181181lvl36y2g.R.inc(1696);opts.addOption(new Option("b", "second"));
        __CLR4_5_2181181lvl36y2g.R.inc(1697);opts.addOption(new Option("c", "third"));

        __CLR4_5_2181181lvl36y2g.R.inc(1698);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_2181181lvl36y2g.R.inc(1699);helpFormatter.setOptionComparator(new Comparator()
        {
            public int compare(Object o1, Object o2)
            {try{__CLR4_5_2181181lvl36y2g.R.inc(1700);
                // reverses the fuctionality of the default comparator
                __CLR4_5_2181181lvl36y2g.R.inc(1701);Option opt1 = (Option) o1;
                __CLR4_5_2181181lvl36y2g.R.inc(1702);Option opt2 = (Option) o2;
                __CLR4_5_2181181lvl36y2g.R.inc(1703);return opt2.getKey().compareToIgnoreCase(opt1.getKey());
            }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}
        });

        __CLR4_5_2181181lvl36y2g.R.inc(1704);StringWriter out = new StringWriter();
        __CLR4_5_2181181lvl36y2g.R.inc(1705);helpFormatter.printUsage(new PrintWriter(out), 80, "app", opts);

        __CLR4_5_2181181lvl36y2g.R.inc(1706);assertEquals("usage: app [-c] [-b] [-a]" + EOL, out.toString());
    }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

    public void testPrintSortedUsageWithNullComparator()
    {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2747jar1bf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintSortedUsageWithNullComparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2747jar1bf(){try{__CLR4_5_2181181lvl36y2g.R.inc(1707);
        __CLR4_5_2181181lvl36y2g.R.inc(1708);Options opts = new Options();
        __CLR4_5_2181181lvl36y2g.R.inc(1709);opts.addOption(new Option("a", "first"));
        __CLR4_5_2181181lvl36y2g.R.inc(1710);opts.addOption(new Option("b", "second"));
        __CLR4_5_2181181lvl36y2g.R.inc(1711);opts.addOption(new Option("c", "third"));

        __CLR4_5_2181181lvl36y2g.R.inc(1712);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_2181181lvl36y2g.R.inc(1713);helpFormatter.setOptionComparator(null);

        __CLR4_5_2181181lvl36y2g.R.inc(1714);StringWriter out = new StringWriter();
        __CLR4_5_2181181lvl36y2g.R.inc(1715);helpFormatter.printUsage(new PrintWriter(out), 80, "app", opts);

        __CLR4_5_2181181lvl36y2g.R.inc(1716);assertEquals("usage: app [-a] [-b] [-c]" + EOL, out.toString());
    }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

    public void testPrintOptionGroupUsage()
    {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fl1ul51bp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptionGroupUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1717,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fl1ul51bp(){try{__CLR4_5_2181181lvl36y2g.R.inc(1717);
        __CLR4_5_2181181lvl36y2g.R.inc(1718);OptionGroup group = new OptionGroup();
        __CLR4_5_2181181lvl36y2g.R.inc(1719);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_2181181lvl36y2g.R.inc(1720);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_2181181lvl36y2g.R.inc(1721);group.addOption(OptionBuilder.create("c"));

        __CLR4_5_2181181lvl36y2g.R.inc(1722);Options options = new Options();
        __CLR4_5_2181181lvl36y2g.R.inc(1723);options.addOptionGroup(group);

        __CLR4_5_2181181lvl36y2g.R.inc(1724);StringWriter out = new StringWriter();

        __CLR4_5_2181181lvl36y2g.R.inc(1725);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_2181181lvl36y2g.R.inc(1726);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_2181181lvl36y2g.R.inc(1727);assertEquals("usage: app [-a | -b | -c]" + EOL, out.toString());
    }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

    public void testPrintRequiredOptionGroupUsage()
    {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2daqvw81c0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintRequiredOptionGroupUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2daqvw81c0(){try{__CLR4_5_2181181lvl36y2g.R.inc(1728);
        __CLR4_5_2181181lvl36y2g.R.inc(1729);OptionGroup group = new OptionGroup();
        __CLR4_5_2181181lvl36y2g.R.inc(1730);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_2181181lvl36y2g.R.inc(1731);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_2181181lvl36y2g.R.inc(1732);group.addOption(OptionBuilder.create("c"));
        __CLR4_5_2181181lvl36y2g.R.inc(1733);group.setRequired(true);

        __CLR4_5_2181181lvl36y2g.R.inc(1734);Options options = new Options();
        __CLR4_5_2181181lvl36y2g.R.inc(1735);options.addOptionGroup(group);

        __CLR4_5_2181181lvl36y2g.R.inc(1736);StringWriter out = new StringWriter();

        __CLR4_5_2181181lvl36y2g.R.inc(1737);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_2181181lvl36y2g.R.inc(1738);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_2181181lvl36y2g.R.inc(1739);assertEquals("usage: app -a | -b | -c" + EOL, out.toString());
    }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

    public void testPrintOptionWithEmptyArgNameUsage()
    {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9m1cy1cc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptionWithEmptyArgNameUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9m1cy1cc(){try{__CLR4_5_2181181lvl36y2g.R.inc(1740);
        __CLR4_5_2181181lvl36y2g.R.inc(1741);Option option = new Option("f", true, null);
        __CLR4_5_2181181lvl36y2g.R.inc(1742);option.setArgName("");
        __CLR4_5_2181181lvl36y2g.R.inc(1743);option.setRequired(true);

        __CLR4_5_2181181lvl36y2g.R.inc(1744);Options options = new Options();
        __CLR4_5_2181181lvl36y2g.R.inc(1745);options.addOption(option);

        __CLR4_5_2181181lvl36y2g.R.inc(1746);StringWriter out = new StringWriter();

        __CLR4_5_2181181lvl36y2g.R.inc(1747);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_2181181lvl36y2g.R.inc(1748);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_2181181lvl36y2g.R.inc(1749);assertEquals("usage: app -f" + EOL, out.toString());
    }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

    public void testRtrim()
    {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mfm1491cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testRtrim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mfm1491cm(){try{__CLR4_5_2181181lvl36y2g.R.inc(1750);
        __CLR4_5_2181181lvl36y2g.R.inc(1751);HelpFormatter formatter = new HelpFormatter();

        __CLR4_5_2181181lvl36y2g.R.inc(1752);assertEquals(null, formatter.rtrim(null));
        __CLR4_5_2181181lvl36y2g.R.inc(1753);assertEquals("", formatter.rtrim(""));
        __CLR4_5_2181181lvl36y2g.R.inc(1754);assertEquals("  foo", formatter.rtrim("  foo  "));
    }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

    public void testAccessors()
    {__CLR4_5_2181181lvl36y2g.R.globalSliceStart(getClass().getName(),1755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hde3s11cr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2181181lvl36y2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2181181lvl36y2g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hde3s11cr(){try{__CLR4_5_2181181lvl36y2g.R.inc(1755);
        __CLR4_5_2181181lvl36y2g.R.inc(1756);HelpFormatter formatter = new HelpFormatter();

        __CLR4_5_2181181lvl36y2g.R.inc(1757);formatter.setArgName("argname");
        __CLR4_5_2181181lvl36y2g.R.inc(1758);assertEquals("arg name", "argname", formatter.getArgName());

        __CLR4_5_2181181lvl36y2g.R.inc(1759);formatter.setDescPadding(3);
        __CLR4_5_2181181lvl36y2g.R.inc(1760);assertEquals("desc padding", 3, formatter.getDescPadding());

        __CLR4_5_2181181lvl36y2g.R.inc(1761);formatter.setLeftPadding(7);
        __CLR4_5_2181181lvl36y2g.R.inc(1762);assertEquals("left padding", 7, formatter.getLeftPadding());

        __CLR4_5_2181181lvl36y2g.R.inc(1763);formatter.setLongOptPrefix("~~");
        __CLR4_5_2181181lvl36y2g.R.inc(1764);assertEquals("long opt prefix", "~~", formatter.getLongOptPrefix());

        __CLR4_5_2181181lvl36y2g.R.inc(1765);formatter.setNewLine("\n");
        __CLR4_5_2181181lvl36y2g.R.inc(1766);assertEquals("new line", "\n", formatter.getNewLine());

        __CLR4_5_2181181lvl36y2g.R.inc(1767);formatter.setOptPrefix("~");
        __CLR4_5_2181181lvl36y2g.R.inc(1768);assertEquals("opt prefix", "~", formatter.getOptPrefix());

        __CLR4_5_2181181lvl36y2g.R.inc(1769);formatter.setSyntaxPrefix("-> ");
        __CLR4_5_2181181lvl36y2g.R.inc(1770);assertEquals("syntax prefix", "-> ", formatter.getSyntaxPrefix());

        __CLR4_5_2181181lvl36y2g.R.inc(1771);formatter.setWidth(80);
        __CLR4_5_2181181lvl36y2g.R.inc(1772);assertEquals("width", 80, formatter.getWidth());
    }finally{__CLR4_5_2181181lvl36y2g.R.flushNeeded();}}

}
