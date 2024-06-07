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

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class GnuParserTest extends TestCase
{static class __CLR4_5_217l17llvkk1taj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370698324L,8589935092L,1692,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options options;
    private Parser parser;

    public void setUp()
    {try{__CLR4_5_217l17llvkk1taj.R.inc(1569);
        __CLR4_5_217l17llvkk1taj.R.inc(1570);options = new Options()
            .addOption("a", "enable-a", false, "turn [a] on or off")
            .addOption("b", "bfile", true, "set the value of [b]")
            .addOption("c", "copt", false, "turn [c] on or off");

        __CLR4_5_217l17llvkk1taj.R.inc(1571);parser = new GnuParser( );
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testSimpleShort() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25gmla717o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testSimpleShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1572,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25gmla717o() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1572);
        __CLR4_5_217l17llvkk1taj.R.inc(1573);String[] args = new String[] { "-a",
                                       "-b", "toast",
                                       "foo", "bar" };

        __CLR4_5_217l17llvkk1taj.R.inc(1574);CommandLine cl = parser.parse(options, args);

        __CLR4_5_217l17llvkk1taj.R.inc(1575);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_217l17llvkk1taj.R.inc(1576);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_217l17llvkk1taj.R.inc(1577);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_217l17llvkk1taj.R.inc(1578);assertTrue("Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testSimpleLong() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_283qhtz17v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testSimpleLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1579,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_283qhtz17v() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1579);
        __CLR4_5_217l17llvkk1taj.R.inc(1580);String[] args = new String[] { "--enable-a",
                                       "--bfile", "toast",
                                       "foo", "bar" };

        __CLR4_5_217l17llvkk1taj.R.inc(1581);CommandLine cl = parser.parse(options, args);

        __CLR4_5_217l17llvkk1taj.R.inc(1582);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_217l17llvkk1taj.R.inc(1583);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_217l17llvkk1taj.R.inc(1584);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_217l17llvkk1taj.R.inc(1585);assertTrue("Confirm size of extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testUnrecognizedOption() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2grwzr7182();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testUnrecognizedOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1586,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2grwzr7182() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1586);
        __CLR4_5_217l17llvkk1taj.R.inc(1587);String[] args = new String[] { "-a", "-d", "-b", "toast", "foo", "bar" };

        __CLR4_5_217l17llvkk1taj.R.inc(1588);try
        {
            __CLR4_5_217l17llvkk1taj.R.inc(1589);parser.parse(options, args);
            __CLR4_5_217l17llvkk1taj.R.inc(1590);fail("UnrecognizedOptionException wasn't thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            __CLR4_5_217l17llvkk1taj.R.inc(1591);assertEquals("-d", e.getOption());
        }
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testMissingArg() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tcx6x5188();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testMissingArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1592,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tcx6x5188() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1592);
        __CLR4_5_217l17llvkk1taj.R.inc(1593);String[] args = new String[] { "-b" };

        __CLR4_5_217l17llvkk1taj.R.inc(1594);boolean caught = false;

        __CLR4_5_217l17llvkk1taj.R.inc(1595);try
        {
            __CLR4_5_217l17llvkk1taj.R.inc(1596);parser.parse(options, args);
        }
        catch (MissingArgumentException e)
        {
            __CLR4_5_217l17llvkk1taj.R.inc(1597);caught = true;
            __CLR4_5_217l17llvkk1taj.R.inc(1598);assertEquals("option missing an argument", "b", e.getOption().getOpt());
        }

        __CLR4_5_217l17llvkk1taj.R.inc(1599);assertTrue( "Confirm MissingArgumentException caught", caught );
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testStop() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mkgnt118g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testStop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1600,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mkgnt118g() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1600);
        __CLR4_5_217l17llvkk1taj.R.inc(1601);String[] args = new String[] { "-c",
                                       "foober",
                                       "-b",
                                       "toast" };

        __CLR4_5_217l17llvkk1taj.R.inc(1602);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_217l17llvkk1taj.R.inc(1603);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_217l17llvkk1taj.R.inc(1604);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testMultiple() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pj8bhz18l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testMultiple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1605,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pj8bhz18l() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1605);
        __CLR4_5_217l17llvkk1taj.R.inc(1606);String[] args = new String[] { "-c",
                                       "foobar",
                                       "-b",
                                       "toast" };

        __CLR4_5_217l17llvkk1taj.R.inc(1607);CommandLine cl = parser.parse(options, args, true);
        __CLR4_5_217l17llvkk1taj.R.inc(1608);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_217l17llvkk1taj.R.inc(1609);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_217l17llvkk1taj.R.inc(1610);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_217l17llvkk1taj.R.inc(1611);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_217l17llvkk1taj.R.inc(1612);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_217l17llvkk1taj.R.inc(1613);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_217l17llvkk1taj.R.inc(1614);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_217l17llvkk1taj.R.inc(1615);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testMultipleWithLong() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235tfkb18w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testMultipleWithLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1616,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235tfkb18w() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1616);
        __CLR4_5_217l17llvkk1taj.R.inc(1617);String[] args = new String[] { "--copt",
                                       "foobar",
                                       "--bfile", "toast" };

        __CLR4_5_217l17llvkk1taj.R.inc(1618);CommandLine cl = parser.parse(options,args, true);
        __CLR4_5_217l17llvkk1taj.R.inc(1619);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_217l17llvkk1taj.R.inc(1620);assertTrue("Confirm  3 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 3);

        __CLR4_5_217l17llvkk1taj.R.inc(1621);cl = parser.parse(options, cl.getArgs());

        __CLR4_5_217l17llvkk1taj.R.inc(1622);assertTrue("Confirm -c is not set", !cl.hasOption("c"));
        __CLR4_5_217l17llvkk1taj.R.inc(1623);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_217l17llvkk1taj.R.inc(1624);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("toast"));
        __CLR4_5_217l17llvkk1taj.R.inc(1625);assertTrue("Confirm  1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_217l17llvkk1taj.R.inc(1626);assertTrue("Confirm  value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("foobar"));
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testDoubleDash() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rbuc4c197();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testDoubleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1627,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rbuc4c197() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1627);
        __CLR4_5_217l17llvkk1taj.R.inc(1628);String[] args = new String[] { "--copt",
                                       "--",
                                       "-b", "toast" };

        __CLR4_5_217l17llvkk1taj.R.inc(1629);CommandLine cl = parser.parse(options, args);

        __CLR4_5_217l17llvkk1taj.R.inc(1630);assertTrue("Confirm -c is set", cl.hasOption("c"));
        __CLR4_5_217l17llvkk1taj.R.inc(1631);assertTrue("Confirm -b is not set", !cl.hasOption("b"));
        __CLR4_5_217l17llvkk1taj.R.inc(1632);assertTrue("Confirm 2 extra args: " + cl.getArgList().size(), cl.getArgList().size() == 2);
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testSingleDash() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idzcwd19d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1633,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idzcwd19d() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1633);
        __CLR4_5_217l17llvkk1taj.R.inc(1634);String[] args = new String[] { "--copt",
                                       "-b", "-",
                                       "-a",
                                       "-" };

        __CLR4_5_217l17llvkk1taj.R.inc(1635);CommandLine cl = parser.parse(options, args);

        __CLR4_5_217l17llvkk1taj.R.inc(1636);assertTrue("Confirm -a is set", cl.hasOption("a"));
        __CLR4_5_217l17llvkk1taj.R.inc(1637);assertTrue("Confirm -b is set", cl.hasOption("b"));
        __CLR4_5_217l17llvkk1taj.R.inc(1638);assertTrue("Confirm arg of -b", cl.getOptionValue("b").equals("-"));
        __CLR4_5_217l17llvkk1taj.R.inc(1639);assertTrue("Confirm 1 extra arg: " + cl.getArgList().size(), cl.getArgList().size() == 1);
        __CLR4_5_217l17llvkk1taj.R.inc(1640);assertTrue("Confirm value of extra arg: " + cl.getArgList().get(0), cl.getArgList().get(0).equals("-"));
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testNegativeArgument() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8jgqd19l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testNegativeArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1641,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8jgqd19l() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1641);
        __CLR4_5_217l17llvkk1taj.R.inc(1642);String[] args = new String[] { "-a", "-1"} ;

        __CLR4_5_217l17llvkk1taj.R.inc(1643);Options options = new Options();
        __CLR4_5_217l17llvkk1taj.R.inc(1644);options.addOption(OptionBuilder.hasArg().create("a"));

        __CLR4_5_217l17llvkk1taj.R.inc(1645);Parser parser = new GnuParser();
        __CLR4_5_217l17llvkk1taj.R.inc(1646);CommandLine cl = parser.parse(options, args);
        __CLR4_5_217l17llvkk1taj.R.inc(1647);assertEquals("-1", cl.getOptionValue("a"));
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testShortWithEqual() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohwzdh19s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testShortWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1648,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohwzdh19s() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1648);
        __CLR4_5_217l17llvkk1taj.R.inc(1649);String[] args = new String[] { "-f=bar" };

        __CLR4_5_217l17llvkk1taj.R.inc(1650);Options options = new Options();
        __CLR4_5_217l17llvkk1taj.R.inc(1651);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_217l17llvkk1taj.R.inc(1652);Parser parser = new GnuParser();
        __CLR4_5_217l17llvkk1taj.R.inc(1653);CommandLine cl = parser.parse(options, args);

        __CLR4_5_217l17llvkk1taj.R.inc(1654);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testShortWithoutEqual() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se6war19z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testShortWithoutEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se6war19z() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1655);
        __CLR4_5_217l17llvkk1taj.R.inc(1656);String[] args = new String[] { "-fbar" };

        __CLR4_5_217l17llvkk1taj.R.inc(1657);Options options = new Options();
        __CLR4_5_217l17llvkk1taj.R.inc(1658);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_217l17llvkk1taj.R.inc(1659);Parser parser = new GnuParser();
        __CLR4_5_217l17llvkk1taj.R.inc(1660);CommandLine cl = parser.parse(options, args);

        __CLR4_5_217l17llvkk1taj.R.inc(1661);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testLongWithEqual() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23y5b951a6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testLongWithEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23y5b951a6() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1662);
        __CLR4_5_217l17llvkk1taj.R.inc(1663);String[] args = new String[] { "--foo=bar" };

        __CLR4_5_217l17llvkk1taj.R.inc(1664);Options options = new Options();
        __CLR4_5_217l17llvkk1taj.R.inc(1665);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_217l17llvkk1taj.R.inc(1666);Parser parser = new GnuParser();
        __CLR4_5_217l17llvkk1taj.R.inc(1667);CommandLine cl = parser.parse(options, args);

        __CLR4_5_217l17llvkk1taj.R.inc(1668);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testLongWithEqualSingleDash() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qootr51ad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testLongWithEqualSingleDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qootr51ad() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1669);
        __CLR4_5_217l17llvkk1taj.R.inc(1670);String[] args = new String[] { "-foo=bar" };

        __CLR4_5_217l17llvkk1taj.R.inc(1671);Options options = new Options();
        __CLR4_5_217l17llvkk1taj.R.inc(1672);options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create('f'));

        __CLR4_5_217l17llvkk1taj.R.inc(1673);Parser parser = new GnuParser();
        __CLR4_5_217l17llvkk1taj.R.inc(1674);CommandLine cl = parser.parse(options, args);

        __CLR4_5_217l17llvkk1taj.R.inc(1675);assertEquals("bar", cl.getOptionValue("foo"));
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}

    public void testPropertiesOption() throws Exception
    {__CLR4_5_217l17llvkk1taj.R.globalSliceStart(getClass().getName(),1676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2556ta71ak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217l17llvkk1taj.R.rethrow($CLV_t2$);}finally{__CLR4_5_217l17llvkk1taj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.GnuParserTest.testPropertiesOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2556ta71ak() throws Exception{try{__CLR4_5_217l17llvkk1taj.R.inc(1676);
        __CLR4_5_217l17llvkk1taj.R.inc(1677);String[] args = new String[] { "-Jsource=1.5", "-Jtarget=1.5", "foo" };

        __CLR4_5_217l17llvkk1taj.R.inc(1678);Options options = new Options();
        __CLR4_5_217l17llvkk1taj.R.inc(1679);options.addOption(OptionBuilder.withValueSeparator().hasArgs(2).create('J'));

        __CLR4_5_217l17llvkk1taj.R.inc(1680);Parser parser = new GnuParser();
        __CLR4_5_217l17llvkk1taj.R.inc(1681);CommandLine cl = parser.parse(options, args);

        __CLR4_5_217l17llvkk1taj.R.inc(1682);List values = Arrays.asList(cl.getOptionValues("J"));
        __CLR4_5_217l17llvkk1taj.R.inc(1683);assertNotNull("null values", values);
        __CLR4_5_217l17llvkk1taj.R.inc(1684);assertEquals("number of values", 4, values.size());
        __CLR4_5_217l17llvkk1taj.R.inc(1685);assertEquals("value 1", "source", values.get(0));
        __CLR4_5_217l17llvkk1taj.R.inc(1686);assertEquals("value 2", "1.5", values.get(1));
        __CLR4_5_217l17llvkk1taj.R.inc(1687);assertEquals("value 3", "target", values.get(2));
        __CLR4_5_217l17llvkk1taj.R.inc(1688);assertEquals("value 4", "1.5", values.get(3));
        __CLR4_5_217l17llvkk1taj.R.inc(1689);List argsleft = cl.getArgList();
        __CLR4_5_217l17llvkk1taj.R.inc(1690);assertEquals("Should be 1 arg left",1,argsleft.size());
        __CLR4_5_217l17llvkk1taj.R.inc(1691);assertEquals("Expecting foo","foo",argsleft.get(0));
    }finally{__CLR4_5_217l17llvkk1taj.R.flushNeeded();}}
}
