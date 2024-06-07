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

import junit.framework.TestCase;

/**
 * @author John Keyes (john at integralsource.com)
 * @version $Revision$
 */
public class OptionGroupTest extends TestCase
{static class __CLR4_5_21i41i4lvl2ty7f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402243997L,8589935092L,2053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options _options = null;
    private CommandLineParser parser = new PosixParser();

    public void setUp()
    {try{__CLR4_5_21i41i4lvl2ty7f.R.inc(1948);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1949);Option file = new Option( "f", "file", false, "file to process" );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1950);Option dir = new Option( "d", "directory", false, "directory to process" );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1951);OptionGroup group = new OptionGroup();
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1952);group.addOption( file );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1953);group.addOption( dir );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1954);_options = new Options().addOptionGroup( group );

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1955);Option section = new Option( "s", "section", false, "section to process" );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1956);Option chapter = new Option( "c", "chapter", false, "chapter to process" );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1957);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1958);group2.addOption( section );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1959);group2.addOption( chapter );

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1960);_options.addOptionGroup( group2 );

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1961);Option importOpt = new Option( null, "import", false, "section to process" );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1962);Option exportOpt = new Option( null, "export", false, "chapter to process" );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1963);OptionGroup group3 = new OptionGroup();
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1964);group3.addOption( importOpt );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1965);group3.addOption( exportOpt );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1966);_options.addOptionGroup( group3 );

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1967);_options.addOption( "r", "revision", false, "revision number" );
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testSingleOptionFromGroup() throws Exception
    {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),1968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtsvgz1io();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOptionFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1968,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtsvgz1io() throws Exception{try{__CLR4_5_21i41i4lvl2ty7f.R.inc(1968);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1969);String[] args = new String[] { "-f" };

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1970);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1971);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1972);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1973);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1974);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1975);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1976);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testSingleOption() throws Exception
    {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),1977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzm1vu1ix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1977,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzm1vu1ix() throws Exception{try{__CLR4_5_21i41i4lvl2ty7f.R.inc(1977);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1978);String[] args = new String[] { "-r" };

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1979);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1980);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1981);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1982);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1983);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1984);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1985);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testTwoValidOptions() throws Exception
    {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),1986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clxkjn1j6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clxkjn1j6() throws Exception{try{__CLR4_5_21i41i4lvl2ty7f.R.inc(1986);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1987);String[] args = new String[] { "-r", "-f" };

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1988);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1989);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1990);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1991);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1992);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1993);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1994);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testSingleLongOption() throws Exception
    {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),1995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_246cezy1jf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleLongOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_246cezy1jf() throws Exception{try{__CLR4_5_21i41i4lvl2ty7f.R.inc(1995);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1996);String[] args = new String[] { "--file" };

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1997);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i41i4lvl2ty7f.R.inc(1998);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(1999);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2000);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2001);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2002);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2003);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testTwoValidLongOptions() throws Exception
    {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),2004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtw4vb1jo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidLongOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtw4vb1jo() throws Exception{try{__CLR4_5_21i41i4lvl2ty7f.R.inc(2004);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2005);String[] args = new String[] { "--revision", "--file" };

        __CLR4_5_21i41i4lvl2ty7f.R.inc(2006);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i41i4lvl2ty7f.R.inc(2007);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2008);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2009);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2010);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2011);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2012);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testNoOptionsExtraArgs() throws Exception
    {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),2013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23uskdl1jx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testNoOptionsExtraArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2013,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23uskdl1jx() throws Exception{try{__CLR4_5_21i41i4lvl2ty7f.R.inc(2013);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2014);String[] args = new String[] { "arg1", "arg2" };

        __CLR4_5_21i41i4lvl2ty7f.R.inc(2015);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i41i4lvl2ty7f.R.inc(2016);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2017);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2018);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2019);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2020);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2021);assertTrue( "Confirm TWO extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testTwoOptionsFromGroup() throws Exception
    {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),2022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n65unc1k6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n65unc1k6() throws Exception{try{__CLR4_5_21i41i4lvl2ty7f.R.inc(2022);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2023);String[] args = new String[] { "-f", "-d" };

        __CLR4_5_21i41i4lvl2ty7f.R.inc(2024);try
        {
            __CLR4_5_21i41i4lvl2ty7f.R.inc(2025);parser.parse( _options, args);
            __CLR4_5_21i41i4lvl2ty7f.R.inc(2026);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21i41i4lvl2ty7f.R.inc(2027);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21i41i4lvl2ty7f.R.inc(2028);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21i41i4lvl2ty7f.R.inc(2029);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testTwoLongOptionsFromGroup() throws Exception
    {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),2030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pvi6vg1ke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoLongOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2030,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pvi6vg1ke() throws Exception{try{__CLR4_5_21i41i4lvl2ty7f.R.inc(2030);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2031);String[] args = new String[] { "--file", "--directory" };

        __CLR4_5_21i41i4lvl2ty7f.R.inc(2032);try
        {
            __CLR4_5_21i41i4lvl2ty7f.R.inc(2033);parser.parse(_options, args);
            __CLR4_5_21i41i4lvl2ty7f.R.inc(2034);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21i41i4lvl2ty7f.R.inc(2035);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21i41i4lvl2ty7f.R.inc(2036);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21i41i4lvl2ty7f.R.inc(2037);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testTwoOptionsFromDifferentGroup() throws Exception
    {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),2038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzdjqd1km();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromDifferentGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzdjqd1km() throws Exception{try{__CLR4_5_21i41i4lvl2ty7f.R.inc(2038);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2039);String[] args = new String[] { "-f", "-s" };

        __CLR4_5_21i41i4lvl2ty7f.R.inc(2040);CommandLine cl = parser.parse( _options, args);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2041);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2042);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2043);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2044);assertTrue( "Confirm -s is set", cl.hasOption("s") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2045);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2046);assertTrue( "Confirm NO extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testValidLongOnlyOptions() throws Exception
    {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),2047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297e32r1kv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testValidLongOnlyOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297e32r1kv() throws Exception{try{__CLR4_5_21i41i4lvl2ty7f.R.inc(2047);
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2048);CommandLine cl1 = parser.parse(_options, new String[]{"--export"});
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2049);assertTrue("Confirm --export is set", cl1.hasOption("export"));

        __CLR4_5_21i41i4lvl2ty7f.R.inc(2050);CommandLine cl2 = parser.parse(_options, new String[]{"--import"});
        __CLR4_5_21i41i4lvl2ty7f.R.inc(2051);assertTrue("Confirm --import is set", cl2.hasOption("import"));
    }finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}

    public void testToString() {__CLR4_5_21i41i4lvl2ty7f.R.globalSliceStart(getClass().getName(),2052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid1l0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i41i4lvl2ty7f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i41i4lvl2ty7f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid1l0(){try{__CLR4_5_21i41i4lvl2ty7f.R.inc(2052);}finally{__CLR4_5_21i41i4lvl2ty7f.R.flushNeeded();}}
// Defects4J: flaky method
//     public void testToString()
//     {
//         OptionGroup group1 = new OptionGroup();
//         group1.addOption(new Option(null, "foo", false, "Foo"));
//         group1.addOption(new Option(null, "bar", false, "Bar"));
// 
//         assertEquals("[--foo Foo, --bar Bar]", group1.toString());
// 
//         OptionGroup group2 = new OptionGroup();
//         group2.addOption(new Option("f", "foo", false, "Foo"));
//         group2.addOption(new Option("b", "bar", false, "Bar"));
// 
//         assertEquals("[-f Foo, -b Bar]", group2.toString());
//     }

}
