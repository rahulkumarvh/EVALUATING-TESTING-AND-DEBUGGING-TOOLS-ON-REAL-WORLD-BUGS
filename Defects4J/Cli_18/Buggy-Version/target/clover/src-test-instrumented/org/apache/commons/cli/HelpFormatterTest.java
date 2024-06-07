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
{static class __CLR4_5_21bc1bclvkk1tdz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370698324L,8589935092L,1892,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
   private static final String EOL = System.getProperty("line.separator");

   public static void main( String[] args )
   {try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1704);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1705);String[] testName = { HelpFormatterTest.class.getName() };
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1706);junit.textui.TestRunner.main(testName);
   }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

   public void testFindWrapPos() throws Exception
   {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r35iai1bf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testFindWrapPos",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r35iai1bf() throws Exception{try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1707);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1708);HelpFormatter hf = new HelpFormatter();

      __CLR4_5_21bc1bclvkk1tdz.R.inc(1709);String text = "This is a test.";
      //text width should be max 8; the wrap postition is 7
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1710);assertEquals("wrap position", 7, hf.findWrapPos(text, 8, 0));
      //starting from 8 must give -1 - the wrap pos is after end
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1711);assertEquals("wrap position 2", -1, hf.findWrapPos(text, 8, 8));
      //if there is no a good position before width to make a wrapping look for the next one
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1712);text = "aaaa aa";
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1713);assertEquals("wrap position 3", 4, hf.findWrapPos(text, 3, 0));
   }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

   public void testPrintWrapped() throws Exception
   {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pftwv1bm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintWrapped",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pftwv1bm() throws Exception{try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1714);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1715);StringBuffer sb = new StringBuffer();
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1716);HelpFormatter hf = new HelpFormatter();

      __CLR4_5_21bc1bclvkk1tdz.R.inc(1717);String text = "This is a test.";
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1718);String expected;

      __CLR4_5_21bc1bclvkk1tdz.R.inc(1719);expected = "This is a" + hf.getNewLine() + "test.";
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1720);hf.renderWrappedText(sb, 12, 0, text);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1721);assertEquals("single line text", expected, sb.toString());

      __CLR4_5_21bc1bclvkk1tdz.R.inc(1722);sb.setLength(0);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1723);expected = "This is a" + hf.getNewLine() + "    test.";
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1724);hf.renderWrappedText(sb, 12, 4, text);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1725);assertEquals("single line padded text", expected, sb.toString());

      __CLR4_5_21bc1bclvkk1tdz.R.inc(1726);text = "  -p,--period <PERIOD>  PERIOD is time duration of form " +
          "DATE[-DATE] where DATE has form YYYY[MM[DD]]";

      __CLR4_5_21bc1bclvkk1tdz.R.inc(1727);sb.setLength(0);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1728);expected = "  -p,--period <PERIOD>  PERIOD is time duration of" +
                 hf.getNewLine() +
                 "                        form DATE[-DATE] where DATE" +
                 hf.getNewLine() +
                 "                        has form YYYY[MM[DD]]";
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1729);hf.renderWrappedText(sb, 53, 24, text);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1730);assertEquals("single line padded text 2", expected, sb.toString());

      __CLR4_5_21bc1bclvkk1tdz.R.inc(1731);text =
         "aaaa aaaa aaaa" + hf.getNewLine() +
         "aaaaaa" + hf.getNewLine() +
         "aaaaa";

      __CLR4_5_21bc1bclvkk1tdz.R.inc(1732);expected = text;
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1733);sb.setLength(0);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1734);hf.renderWrappedText(sb, 16, 0, text);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1735);assertEquals("multi line text", expected, sb.toString());

      __CLR4_5_21bc1bclvkk1tdz.R.inc(1736);expected =
         "aaaa aaaa aaaa" + hf.getNewLine() +
         "    aaaaaa" + hf.getNewLine() +
         "    aaaaa";
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1737);sb.setLength(0);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1738);hf.renderWrappedText(sb, 16, 4, text);
      __CLR4_5_21bc1bclvkk1tdz.R.inc(1739);assertEquals("multi-line padded text", expected, sb.toString());
   }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

   public void testPrintOptions() throws Exception
   {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21byq7q1cc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21byq7q1cc() throws Exception{try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1740);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1741);StringBuffer sb = new StringBuffer();
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1742);HelpFormatter hf = new HelpFormatter();
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1743);final int leftPad = 1;
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1744);final int descPad = 3;
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1745);final String lpad = hf.createPadding(leftPad);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1746);final String dpad = hf.createPadding(descPad);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1747);Options options = null;
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1748);String expected = null;

       __CLR4_5_21bc1bclvkk1tdz.R.inc(1749);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1750);expected = lpad + "-a" + dpad + "aaaa aaaa aaaa aaaa aaaa";
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1751);hf.renderOptions(sb, 60, options, leftPad, descPad);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1752);assertEquals("simple non-wrapped option", expected, sb.toString());

       __CLR4_5_21bc1bclvkk1tdz.R.inc(1753);int nextLineTabStop = leftPad+descPad+"-a".length();
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1754);expected =
           lpad + "-a" + dpad + "aaaa aaaa aaaa" + hf.getNewLine() +
           hf.createPadding(nextLineTabStop) + "aaaa aaaa";
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1755);sb.setLength(0);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1756);hf.renderOptions(sb, nextLineTabStop+17, options, leftPad, descPad);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1757);assertEquals("simple wrapped option", expected, sb.toString());


       __CLR4_5_21bc1bclvkk1tdz.R.inc(1758);options = new Options().addOption("a", "aaa", false, "dddd dddd dddd dddd");
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1759);expected = lpad + "-a,--aaa" + dpad + "dddd dddd dddd dddd";
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1760);sb.setLength(0);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1761);hf.renderOptions(sb, 60, options, leftPad, descPad);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1762);assertEquals("long non-wrapped option", expected, sb.toString());

       __CLR4_5_21bc1bclvkk1tdz.R.inc(1763);nextLineTabStop = leftPad+descPad+"-a,--aaa".length();
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1764);expected =
           lpad + "-a,--aaa" + dpad + "dddd dddd" + hf.getNewLine() +
           hf.createPadding(nextLineTabStop) + "dddd dddd";
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1765);sb.setLength(0);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1766);hf.renderOptions(sb, 25, options, leftPad, descPad);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1767);assertEquals("long wrapped option", expected, sb.toString());

       __CLR4_5_21bc1bclvkk1tdz.R.inc(1768);options = new Options().
           addOption("a", "aaa", false, "dddd dddd dddd dddd").
           addOption("b", false, "feeee eeee eeee eeee");
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1769);expected =
           lpad + "-a,--aaa" + dpad + "dddd dddd" + hf.getNewLine() +
           hf.createPadding(nextLineTabStop) + "dddd dddd" + hf.getNewLine() +
           lpad + "-b      " + dpad + "feeee eeee" + hf.getNewLine() +
           hf.createPadding(nextLineTabStop) + "eeee eeee";
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1770);sb.setLength(0);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1771);hf.renderOptions(sb, 25, options, leftPad, descPad);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1772);assertEquals("multiple wrapped options", expected, sb.toString());
   }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

    public void testPrintHelpWithEmptySyntax()
    {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26nb0az1d9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintHelpWithEmptySyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1773,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26nb0az1d9(){try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1773);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1774);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1775);try
        {
            __CLR4_5_21bc1bclvkk1tdz.R.inc(1776);formatter.printHelp(null, new Options());
            __CLR4_5_21bc1bclvkk1tdz.R.inc(1777);fail("null command line syntax should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1778);try
        {
            __CLR4_5_21bc1bclvkk1tdz.R.inc(1779);formatter.printHelp("", new Options());
            __CLR4_5_21bc1bclvkk1tdz.R.inc(1780);fail("empty command line syntax should be rejected");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}


   public void testAutomaticUsage() throws Exception
   {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hizlbj1dh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testAutomaticUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1781,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hizlbj1dh() throws Exception{try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1781);
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1782);HelpFormatter hf = new HelpFormatter();
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1783);Options options = null;
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1784);String expected = "usage: app [-a]";
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1785);ByteArrayOutputStream out = new ByteArrayOutputStream( );
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1786);PrintWriter pw = new PrintWriter( out );

       __CLR4_5_21bc1bclvkk1tdz.R.inc(1787);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa");
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1788);hf.printUsage( pw, 60, "app", options );
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1789);pw.flush();
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1790);assertEquals("simple auto usage", expected, out.toString().trim());
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1791);out.reset();

       __CLR4_5_21bc1bclvkk1tdz.R.inc(1792);expected = "usage: app [-a] [-b]";
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1793);options = new Options().addOption("a", false, "aaaa aaaa aaaa aaaa aaaa")
       .addOption("b", false, "bbb" );
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1794);hf.printUsage( pw, 60, "app", options );
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1795);pw.flush();
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1796);assertEquals("simple auto usage", expected, out.toString().trim());
       __CLR4_5_21bc1bclvkk1tdz.R.inc(1797);out.reset();
   }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

    // This test ensures the options are properly sorted
    // See https://issues.apache.org/jira/browse/CLI-131
    public void testPrintUsage()
    {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oinql1dy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1798,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oinql1dy(){try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1798);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1799);Option optionA = new Option("a", "first");
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1800);Option optionB = new Option("b", "second");
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1801);Option optionC = new Option("c", "third");
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1802);Options opts = new Options();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1803);opts.addOption(optionA);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1804);opts.addOption(optionB);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1805);opts.addOption(optionC);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1806);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1807);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1808);PrintWriter printWriter = new PrintWriter(bytesOut);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1809);helpFormatter.printUsage(printWriter, 80, "app", opts);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1810);printWriter.close();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1811);assertEquals("usage: app [-a] [-b] [-c]" + EOL, bytesOut.toString());
    }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

    // uses the test for CLI-131 to implement CLI-155
    public void testPrintSortedUsage()
    {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rtrlm81ec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintSortedUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1812,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rtrlm81ec(){try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1812);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1813);Options opts = new Options();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1814);opts.addOption(new Option("a", "first"));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1815);opts.addOption(new Option("b", "second"));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1816);opts.addOption(new Option("c", "third"));

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1817);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1818);helpFormatter.setOptionComparator(new Comparator()
        {
            public int compare(Object o1, Object o2)
            {try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1819);
                // reverses the fuctionality of the default comparator
                __CLR4_5_21bc1bclvkk1tdz.R.inc(1820);Option opt1 = (Option) o1;
                __CLR4_5_21bc1bclvkk1tdz.R.inc(1821);Option opt2 = (Option) o2;
                __CLR4_5_21bc1bclvkk1tdz.R.inc(1822);return opt2.getKey().compareToIgnoreCase(opt1.getKey());
            }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}
        });

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1823);StringWriter out = new StringWriter();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1824);helpFormatter.printUsage(new PrintWriter(out), 80, "app", opts);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1825);assertEquals("usage: app [-c] [-b] [-a]" + EOL, out.toString());
    }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

    public void testPrintSortedUsageWithNullComparator()
    {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2747jar1eq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintSortedUsageWithNullComparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1826,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2747jar1eq(){try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1826);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1827);Options opts = new Options();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1828);opts.addOption(new Option("a", "first"));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1829);opts.addOption(new Option("b", "second"));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1830);opts.addOption(new Option("c", "third"));

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1831);HelpFormatter helpFormatter = new HelpFormatter();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1832);helpFormatter.setOptionComparator(null);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1833);StringWriter out = new StringWriter();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1834);helpFormatter.printUsage(new PrintWriter(out), 80, "app", opts);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1835);assertEquals("usage: app [-a] [-b] [-c]" + EOL, out.toString());
    }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

    public void testPrintOptionGroupUsage()
    {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fl1ul51f0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptionGroupUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fl1ul51f0(){try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1836);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1837);OptionGroup group = new OptionGroup();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1838);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1839);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1840);group.addOption(OptionBuilder.create("c"));

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1841);Options options = new Options();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1842);options.addOptionGroup(group);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1843);StringWriter out = new StringWriter();

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1844);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1845);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1846);assertEquals("usage: app [-a | -b | -c]" + EOL, out.toString());
    }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

    public void testPrintRequiredOptionGroupUsage()
    {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2daqvw81fb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintRequiredOptionGroupUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2daqvw81fb(){try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1847);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1848);OptionGroup group = new OptionGroup();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1849);group.addOption(OptionBuilder.create("a"));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1850);group.addOption(OptionBuilder.create("b"));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1851);group.addOption(OptionBuilder.create("c"));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1852);group.setRequired(true);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1853);Options options = new Options();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1854);options.addOptionGroup(group);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1855);StringWriter out = new StringWriter();

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1856);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1857);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1858);assertEquals("usage: app -a | -b | -c" + EOL, out.toString());
    }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

    public void testPrintOptionWithEmptyArgNameUsage()
    {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9m1cy1fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testPrintOptionWithEmptyArgNameUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1859,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9m1cy1fn(){try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1859);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1860);Option option = new Option("f", true, null);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1861);option.setArgName("");
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1862);option.setRequired(true);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1863);Options options = new Options();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1864);options.addOption(option);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1865);StringWriter out = new StringWriter();

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1866);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1867);formatter.printUsage(new PrintWriter(out), 80, "app", options);

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1868);assertEquals("usage: app -f" + EOL, out.toString());
    }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

    public void testRtrim()
    {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mfm1491fx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testRtrim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1869,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mfm1491fx(){try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1869);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1870);HelpFormatter formatter = new HelpFormatter();

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1871);assertEquals(null, formatter.rtrim(null));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1872);assertEquals("", formatter.rtrim(""));
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1873);assertEquals("  foo", formatter.rtrim("  foo  "));
    }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

    public void testAccessors()
    {__CLR4_5_21bc1bclvkk1tdz.R.globalSliceStart(getClass().getName(),1874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hde3s11g2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bc1bclvkk1tdz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bc1bclvkk1tdz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.HelpFormatterTest.testAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hde3s11g2(){try{__CLR4_5_21bc1bclvkk1tdz.R.inc(1874);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1875);HelpFormatter formatter = new HelpFormatter();

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1876);formatter.setArgName("argname");
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1877);assertEquals("arg name", "argname", formatter.getArgName());

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1878);formatter.setDescPadding(3);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1879);assertEquals("desc padding", 3, formatter.getDescPadding());

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1880);formatter.setLeftPadding(7);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1881);assertEquals("left padding", 7, formatter.getLeftPadding());

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1882);formatter.setLongOptPrefix("~~");
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1883);assertEquals("long opt prefix", "~~", formatter.getLongOptPrefix());

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1884);formatter.setNewLine("\n");
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1885);assertEquals("new line", "\n", formatter.getNewLine());

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1886);formatter.setOptPrefix("~");
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1887);assertEquals("opt prefix", "~", formatter.getOptPrefix());

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1888);formatter.setSyntaxPrefix("-> ");
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1889);assertEquals("syntax prefix", "-> ", formatter.getSyntaxPrefix());

        __CLR4_5_21bc1bclvkk1tdz.R.inc(1890);formatter.setWidth(80);
        __CLR4_5_21bc1bclvkk1tdz.R.inc(1891);assertEquals("width", 80, formatter.getWidth());
    }finally{__CLR4_5_21bc1bclvkk1tdz.R.flushNeeded();}}

}
