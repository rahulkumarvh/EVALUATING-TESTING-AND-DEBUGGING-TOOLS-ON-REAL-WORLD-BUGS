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
{static class __CLR4_5_21i61i6lvkk1tfe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370698324L,8589935092L,2055,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options _options = null;
    private CommandLineParser parser = new PosixParser();

    public void setUp()
    {try{__CLR4_5_21i61i6lvkk1tfe.R.inc(1950);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1951);Option file = new Option( "f", "file", false, "file to process" );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1952);Option dir = new Option( "d", "directory", false, "directory to process" );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1953);OptionGroup group = new OptionGroup();
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1954);group.addOption( file );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1955);group.addOption( dir );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1956);_options = new Options().addOptionGroup( group );

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1957);Option section = new Option( "s", "section", false, "section to process" );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1958);Option chapter = new Option( "c", "chapter", false, "chapter to process" );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1959);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1960);group2.addOption( section );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1961);group2.addOption( chapter );

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1962);_options.addOptionGroup( group2 );

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1963);Option importOpt = new Option( null, "import", false, "section to process" );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1964);Option exportOpt = new Option( null, "export", false, "chapter to process" );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1965);OptionGroup group3 = new OptionGroup();
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1966);group3.addOption( importOpt );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1967);group3.addOption( exportOpt );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1968);_options.addOptionGroup( group3 );

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1969);_options.addOption( "r", "revision", false, "revision number" );
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testSingleOptionFromGroup() throws Exception
    {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),1970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtsvgz1iq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOptionFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1970,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtsvgz1iq() throws Exception{try{__CLR4_5_21i61i6lvkk1tfe.R.inc(1970);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1971);String[] args = new String[] { "-f" };

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1972);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1973);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1974);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1975);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1976);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1977);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1978);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testSingleOption() throws Exception
    {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),1979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzm1vu1iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1979,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzm1vu1iz() throws Exception{try{__CLR4_5_21i61i6lvkk1tfe.R.inc(1979);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1980);String[] args = new String[] { "-r" };

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1981);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1982);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1983);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1984);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1985);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1986);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1987);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testTwoValidOptions() throws Exception
    {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),1988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clxkjn1j8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1988,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clxkjn1j8() throws Exception{try{__CLR4_5_21i61i6lvkk1tfe.R.inc(1988);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1989);String[] args = new String[] { "-r", "-f" };

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1990);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1991);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1992);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1993);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1994);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1995);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1996);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testSingleLongOption() throws Exception
    {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),1997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_246cezy1jh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleLongOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_246cezy1jh() throws Exception{try{__CLR4_5_21i61i6lvkk1tfe.R.inc(1997);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(1998);String[] args = new String[] { "--file" };

        __CLR4_5_21i61i6lvkk1tfe.R.inc(1999);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i61i6lvkk1tfe.R.inc(2000);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2001);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2002);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2003);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2004);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2005);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testTwoValidLongOptions() throws Exception
    {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),2006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtw4vb1jq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidLongOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2006,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtw4vb1jq() throws Exception{try{__CLR4_5_21i61i6lvkk1tfe.R.inc(2006);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2007);String[] args = new String[] { "--revision", "--file" };

        __CLR4_5_21i61i6lvkk1tfe.R.inc(2008);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i61i6lvkk1tfe.R.inc(2009);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2010);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2011);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2012);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2013);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2014);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testNoOptionsExtraArgs() throws Exception
    {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),2015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23uskdl1jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testNoOptionsExtraArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23uskdl1jz() throws Exception{try{__CLR4_5_21i61i6lvkk1tfe.R.inc(2015);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2016);String[] args = new String[] { "arg1", "arg2" };

        __CLR4_5_21i61i6lvkk1tfe.R.inc(2017);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21i61i6lvkk1tfe.R.inc(2018);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2019);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2020);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2021);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2022);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2023);assertTrue( "Confirm TWO extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testTwoOptionsFromGroup() throws Exception
    {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),2024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n65unc1k8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n65unc1k8() throws Exception{try{__CLR4_5_21i61i6lvkk1tfe.R.inc(2024);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2025);String[] args = new String[] { "-f", "-d" };

        __CLR4_5_21i61i6lvkk1tfe.R.inc(2026);try
        {
            __CLR4_5_21i61i6lvkk1tfe.R.inc(2027);parser.parse( _options, args);
            __CLR4_5_21i61i6lvkk1tfe.R.inc(2028);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21i61i6lvkk1tfe.R.inc(2029);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21i61i6lvkk1tfe.R.inc(2030);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21i61i6lvkk1tfe.R.inc(2031);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testTwoLongOptionsFromGroup() throws Exception
    {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),2032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pvi6vg1kg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoLongOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pvi6vg1kg() throws Exception{try{__CLR4_5_21i61i6lvkk1tfe.R.inc(2032);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2033);String[] args = new String[] { "--file", "--directory" };

        __CLR4_5_21i61i6lvkk1tfe.R.inc(2034);try
        {
            __CLR4_5_21i61i6lvkk1tfe.R.inc(2035);parser.parse(_options, args);
            __CLR4_5_21i61i6lvkk1tfe.R.inc(2036);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21i61i6lvkk1tfe.R.inc(2037);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21i61i6lvkk1tfe.R.inc(2038);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21i61i6lvkk1tfe.R.inc(2039);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testTwoOptionsFromDifferentGroup() throws Exception
    {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),2040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzdjqd1ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromDifferentGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2040,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzdjqd1ko() throws Exception{try{__CLR4_5_21i61i6lvkk1tfe.R.inc(2040);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2041);String[] args = new String[] { "-f", "-s" };

        __CLR4_5_21i61i6lvkk1tfe.R.inc(2042);CommandLine cl = parser.parse( _options, args);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2043);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2044);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2045);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2046);assertTrue( "Confirm -s is set", cl.hasOption("s") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2047);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2048);assertTrue( "Confirm NO extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testValidLongOnlyOptions() throws Exception
    {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),2049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297e32r1kx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testValidLongOnlyOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2049,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297e32r1kx() throws Exception{try{__CLR4_5_21i61i6lvkk1tfe.R.inc(2049);
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2050);CommandLine cl1 = parser.parse(_options, new String[]{"--export"});
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2051);assertTrue("Confirm --export is set", cl1.hasOption("export"));

        __CLR4_5_21i61i6lvkk1tfe.R.inc(2052);CommandLine cl2 = parser.parse(_options, new String[]{"--import"});
        __CLR4_5_21i61i6lvkk1tfe.R.inc(2053);assertTrue("Confirm --import is set", cl2.hasOption("import"));
    }finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}

    public void testToString() {__CLR4_5_21i61i6lvkk1tfe.R.globalSliceStart(getClass().getName(),2054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid1l2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i61i6lvkk1tfe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i61i6lvkk1tfe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2054,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid1l2(){try{__CLR4_5_21i61i6lvkk1tfe.R.inc(2054);}finally{__CLR4_5_21i61i6lvkk1tfe.R.flushNeeded();}}
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
