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
{static class __CLR4_5_21ev1evlvl36y5u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402850486L,8589935092L,1944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options _options = null;
    private CommandLineParser parser = new PosixParser();

    public void setUp()
    {try{__CLR4_5_21ev1evlvl36y5u.R.inc(1831);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1832);Option file = new Option( "f", "file", false, "file to process" );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1833);Option dir = new Option( "d", "directory", false, "directory to process" );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1834);OptionGroup group = new OptionGroup();
        __CLR4_5_21ev1evlvl36y5u.R.inc(1835);group.addOption( file );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1836);group.addOption( dir );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1837);_options = new Options().addOptionGroup( group );

        __CLR4_5_21ev1evlvl36y5u.R.inc(1838);Option section = new Option( "s", "section", false, "section to process" );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1839);Option chapter = new Option( "c", "chapter", false, "chapter to process" );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1840);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21ev1evlvl36y5u.R.inc(1841);group2.addOption( section );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1842);group2.addOption( chapter );

        __CLR4_5_21ev1evlvl36y5u.R.inc(1843);_options.addOptionGroup( group2 );

        __CLR4_5_21ev1evlvl36y5u.R.inc(1844);Option importOpt = new Option( null, "import", false, "section to process" );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1845);Option exportOpt = new Option( null, "export", false, "chapter to process" );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1846);OptionGroup group3 = new OptionGroup();
        __CLR4_5_21ev1evlvl36y5u.R.inc(1847);group3.addOption( importOpt );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1848);group3.addOption( exportOpt );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1849);_options.addOptionGroup( group3 );

        __CLR4_5_21ev1evlvl36y5u.R.inc(1850);_options.addOption( "r", "revision", false, "revision number" );
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testSingleOptionFromGroup() throws Exception
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtsvgz1ff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOptionFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1851,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtsvgz1ff() throws Exception{try{__CLR4_5_21ev1evlvl36y5u.R.inc(1851);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1852);String[] args = new String[] { "-f" };

        __CLR4_5_21ev1evlvl36y5u.R.inc(1853);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21ev1evlvl36y5u.R.inc(1854);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1855);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1856);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1857);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1858);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1859);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testSingleOption() throws Exception
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzm1vu1fo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1860,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzm1vu1fo() throws Exception{try{__CLR4_5_21ev1evlvl36y5u.R.inc(1860);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1861);String[] args = new String[] { "-r" };

        __CLR4_5_21ev1evlvl36y5u.R.inc(1862);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21ev1evlvl36y5u.R.inc(1863);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1864);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1865);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1866);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1867);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1868);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testTwoValidOptions() throws Exception
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clxkjn1fx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1869,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clxkjn1fx() throws Exception{try{__CLR4_5_21ev1evlvl36y5u.R.inc(1869);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1870);String[] args = new String[] { "-r", "-f" };

        __CLR4_5_21ev1evlvl36y5u.R.inc(1871);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21ev1evlvl36y5u.R.inc(1872);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1873);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1874);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1875);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1876);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1877);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testSingleLongOption() throws Exception
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_246cezy1g6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleLongOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_246cezy1g6() throws Exception{try{__CLR4_5_21ev1evlvl36y5u.R.inc(1878);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1879);String[] args = new String[] { "--file" };

        __CLR4_5_21ev1evlvl36y5u.R.inc(1880);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21ev1evlvl36y5u.R.inc(1881);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1882);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1883);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1884);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1885);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1886);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testTwoValidLongOptions() throws Exception
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtw4vb1gf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidLongOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1887,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtw4vb1gf() throws Exception{try{__CLR4_5_21ev1evlvl36y5u.R.inc(1887);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1888);String[] args = new String[] { "--revision", "--file" };

        __CLR4_5_21ev1evlvl36y5u.R.inc(1889);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21ev1evlvl36y5u.R.inc(1890);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1891);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1892);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1893);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1894);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1895);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testNoOptionsExtraArgs() throws Exception
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23uskdl1go();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testNoOptionsExtraArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23uskdl1go() throws Exception{try{__CLR4_5_21ev1evlvl36y5u.R.inc(1896);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1897);String[] args = new String[] { "arg1", "arg2" };

        __CLR4_5_21ev1evlvl36y5u.R.inc(1898);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21ev1evlvl36y5u.R.inc(1899);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1900);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1901);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1902);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1903);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1904);assertTrue( "Confirm TWO extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testTwoOptionsFromGroup() throws Exception
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n65unc1gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n65unc1gx() throws Exception{try{__CLR4_5_21ev1evlvl36y5u.R.inc(1905);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1906);String[] args = new String[] { "-f", "-d" };

        __CLR4_5_21ev1evlvl36y5u.R.inc(1907);try
        {
            __CLR4_5_21ev1evlvl36y5u.R.inc(1908);parser.parse( _options, args);
            __CLR4_5_21ev1evlvl36y5u.R.inc(1909);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21ev1evlvl36y5u.R.inc(1910);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21ev1evlvl36y5u.R.inc(1911);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21ev1evlvl36y5u.R.inc(1912);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testTwoLongOptionsFromGroup() throws Exception
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pvi6vg1h5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoLongOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1913,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pvi6vg1h5() throws Exception{try{__CLR4_5_21ev1evlvl36y5u.R.inc(1913);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1914);String[] args = new String[] { "--file", "--directory" };

        __CLR4_5_21ev1evlvl36y5u.R.inc(1915);try
        {
            __CLR4_5_21ev1evlvl36y5u.R.inc(1916);parser.parse(_options, args);
            __CLR4_5_21ev1evlvl36y5u.R.inc(1917);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21ev1evlvl36y5u.R.inc(1918);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21ev1evlvl36y5u.R.inc(1919);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21ev1evlvl36y5u.R.inc(1920);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testTwoOptionsFromDifferentGroup() throws Exception
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzdjqd1hd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromDifferentGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzdjqd1hd() throws Exception{try{__CLR4_5_21ev1evlvl36y5u.R.inc(1921);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1922);String[] args = new String[] { "-f", "-s" };

        __CLR4_5_21ev1evlvl36y5u.R.inc(1923);CommandLine cl = parser.parse( _options, args);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1924);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1925);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1926);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1927);assertTrue( "Confirm -s is set", cl.hasOption("s") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1928);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21ev1evlvl36y5u.R.inc(1929);assertTrue( "Confirm NO extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testValidLongOnlyOptions() throws Exception
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297e32r1hm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testValidLongOnlyOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297e32r1hm() throws Exception{try{__CLR4_5_21ev1evlvl36y5u.R.inc(1930);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1931);CommandLine cl1 = parser.parse(_options, new String[]{"--export"});
        __CLR4_5_21ev1evlvl36y5u.R.inc(1932);assertTrue("Confirm --export is set", cl1.hasOption("export"));

        __CLR4_5_21ev1evlvl36y5u.R.inc(1933);CommandLine cl2 = parser.parse(_options, new String[]{"--import"});
        __CLR4_5_21ev1evlvl36y5u.R.inc(1934);assertTrue("Confirm --import is set", cl2.hasOption("import"));
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}

    public void testToString() {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid1hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid1hr(){try{__CLR4_5_21ev1evlvl36y5u.R.inc(1935);}finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}
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

    public void testGetNames()
    {__CLR4_5_21ev1evlvl36y5u.R.globalSliceStart(getClass().getName(),1936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s5d1it1hs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ev1evlvl36y5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ev1evlvl36y5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testGetNames",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s5d1it1hs(){try{__CLR4_5_21ev1evlvl36y5u.R.inc(1936);
        __CLR4_5_21ev1evlvl36y5u.R.inc(1937);OptionGroup group = new OptionGroup();
        __CLR4_5_21ev1evlvl36y5u.R.inc(1938);group.addOption(OptionBuilder.create('a'));
        __CLR4_5_21ev1evlvl36y5u.R.inc(1939);group.addOption(OptionBuilder.create('b'));

        __CLR4_5_21ev1evlvl36y5u.R.inc(1940);assertNotNull("null names", group.getNames());
        __CLR4_5_21ev1evlvl36y5u.R.inc(1941);assertEquals(2, group.getNames().size());
        __CLR4_5_21ev1evlvl36y5u.R.inc(1942);assertTrue(group.getNames().contains("a"));
        __CLR4_5_21ev1evlvl36y5u.R.inc(1943);assertTrue(group.getNames().contains("b"));
    }finally{__CLR4_5_21ev1evlvl36y5u.R.flushNeeded();}}
}
