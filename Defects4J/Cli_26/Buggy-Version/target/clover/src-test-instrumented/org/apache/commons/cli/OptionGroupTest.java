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
{static class __CLR4_5_21fu1fulvn1m5og{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0036\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521133496L,8589935092L,1993,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Options _options = null;
    private CommandLineParser parser = new PosixParser();

    public void setUp()
    {try{__CLR4_5_21fu1fulvn1m5og.R.inc(1866);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1867);Option file = new Option( "f", "file", false, "file to process" );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1868);Option dir = new Option( "d", "directory", false, "directory to process" );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1869);OptionGroup group = new OptionGroup();
        __CLR4_5_21fu1fulvn1m5og.R.inc(1870);group.addOption( file );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1871);group.addOption( dir );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1872);_options = new Options().addOptionGroup( group );

        __CLR4_5_21fu1fulvn1m5og.R.inc(1873);Option section = new Option( "s", "section", false, "section to process" );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1874);Option chapter = new Option( "c", "chapter", false, "chapter to process" );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1875);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21fu1fulvn1m5og.R.inc(1876);group2.addOption( section );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1877);group2.addOption( chapter );

        __CLR4_5_21fu1fulvn1m5og.R.inc(1878);_options.addOptionGroup( group2 );

        __CLR4_5_21fu1fulvn1m5og.R.inc(1879);Option importOpt = new Option( null, "import", false, "section to process" );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1880);Option exportOpt = new Option( null, "export", false, "chapter to process" );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1881);OptionGroup group3 = new OptionGroup();
        __CLR4_5_21fu1fulvn1m5og.R.inc(1882);group3.addOption( importOpt );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1883);group3.addOption( exportOpt );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1884);_options.addOptionGroup( group3 );

        __CLR4_5_21fu1fulvn1m5og.R.inc(1885);_options.addOption( "r", "revision", false, "revision number" );
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testSingleOptionFromGroup() throws Exception
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtsvgz1ge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOptionFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtsvgz1ge() throws Exception{try{__CLR4_5_21fu1fulvn1m5og.R.inc(1886);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1887);String[] args = new String[] { "-f" };

        __CLR4_5_21fu1fulvn1m5og.R.inc(1888);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21fu1fulvn1m5og.R.inc(1889);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1890);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1891);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1892);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1893);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1894);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testSingleOption() throws Exception
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzm1vu1gn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzm1vu1gn() throws Exception{try{__CLR4_5_21fu1fulvn1m5og.R.inc(1895);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1896);String[] args = new String[] { "-r" };

        __CLR4_5_21fu1fulvn1m5og.R.inc(1897);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21fu1fulvn1m5og.R.inc(1898);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1899);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1900);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1901);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1902);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1903);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testTwoValidOptions() throws Exception
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clxkjn1gw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1904,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clxkjn1gw() throws Exception{try{__CLR4_5_21fu1fulvn1m5og.R.inc(1904);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1905);String[] args = new String[] { "-r", "-f" };

        __CLR4_5_21fu1fulvn1m5og.R.inc(1906);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21fu1fulvn1m5og.R.inc(1907);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1908);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1909);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1910);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1911);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1912);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testSingleLongOption() throws Exception
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_246cezy1h5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testSingleLongOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1913,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_246cezy1h5() throws Exception{try{__CLR4_5_21fu1fulvn1m5og.R.inc(1913);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1914);String[] args = new String[] { "--file" };

        __CLR4_5_21fu1fulvn1m5og.R.inc(1915);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21fu1fulvn1m5og.R.inc(1916);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1917);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1918);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1919);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1920);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1921);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testTwoValidLongOptions() throws Exception
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtw4vb1he();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoValidLongOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtw4vb1he() throws Exception{try{__CLR4_5_21fu1fulvn1m5og.R.inc(1922);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1923);String[] args = new String[] { "--revision", "--file" };

        __CLR4_5_21fu1fulvn1m5og.R.inc(1924);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21fu1fulvn1m5og.R.inc(1925);assertTrue( "Confirm -r is set", cl.hasOption("r") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1926);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1927);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1928);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1929);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1930);assertTrue( "Confirm no extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testNoOptionsExtraArgs() throws Exception
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23uskdl1hn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testNoOptionsExtraArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23uskdl1hn() throws Exception{try{__CLR4_5_21fu1fulvn1m5og.R.inc(1931);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1932);String[] args = new String[] { "arg1", "arg2" };

        __CLR4_5_21fu1fulvn1m5og.R.inc(1933);CommandLine cl = parser.parse( _options, args);

        __CLR4_5_21fu1fulvn1m5og.R.inc(1934);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1935);assertTrue( "Confirm -f is NOT set", !cl.hasOption("f") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1936);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1937);assertTrue( "Confirm -s is NOT set", !cl.hasOption("s") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1938);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1939);assertTrue( "Confirm TWO extra args", cl.getArgList().size() == 2);
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testTwoOptionsFromGroup() throws Exception
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n65unc1hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n65unc1hw() throws Exception{try{__CLR4_5_21fu1fulvn1m5og.R.inc(1940);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1941);String[] args = new String[] { "-f", "-d" };

        __CLR4_5_21fu1fulvn1m5og.R.inc(1942);try
        {
            __CLR4_5_21fu1fulvn1m5og.R.inc(1943);parser.parse( _options, args);
            __CLR4_5_21fu1fulvn1m5og.R.inc(1944);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21fu1fulvn1m5og.R.inc(1945);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21fu1fulvn1m5og.R.inc(1946);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21fu1fulvn1m5og.R.inc(1947);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testTwoLongOptionsFromGroup() throws Exception
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pvi6vg1i4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoLongOptionsFromGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pvi6vg1i4() throws Exception{try{__CLR4_5_21fu1fulvn1m5og.R.inc(1948);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1949);String[] args = new String[] { "--file", "--directory" };

        __CLR4_5_21fu1fulvn1m5og.R.inc(1950);try
        {
            __CLR4_5_21fu1fulvn1m5og.R.inc(1951);parser.parse(_options, args);
            __CLR4_5_21fu1fulvn1m5og.R.inc(1952);fail( "two arguments from group not allowed" );
        }
        catch (AlreadySelectedException e)
        {
            __CLR4_5_21fu1fulvn1m5og.R.inc(1953);assertNotNull("null option group", e.getOptionGroup());
            __CLR4_5_21fu1fulvn1m5og.R.inc(1954);assertEquals("selected option", "f", e.getOptionGroup().getSelected());
            __CLR4_5_21fu1fulvn1m5og.R.inc(1955);assertEquals("option", "d", e.getOption().getOpt());
        }
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testTwoOptionsFromDifferentGroup() throws Exception
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzdjqd1ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testTwoOptionsFromDifferentGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1956,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzdjqd1ic() throws Exception{try{__CLR4_5_21fu1fulvn1m5og.R.inc(1956);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1957);String[] args = new String[] { "-f", "-s" };

        __CLR4_5_21fu1fulvn1m5og.R.inc(1958);CommandLine cl = parser.parse( _options, args);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1959);assertTrue( "Confirm -r is NOT set", !cl.hasOption("r") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1960);assertTrue( "Confirm -f is set", cl.hasOption("f") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1961);assertTrue( "Confirm -d is NOT set", !cl.hasOption("d") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1962);assertTrue( "Confirm -s is set", cl.hasOption("s") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1963);assertTrue( "Confirm -c is NOT set", !cl.hasOption("c") );
        __CLR4_5_21fu1fulvn1m5og.R.inc(1964);assertTrue( "Confirm NO extra args", cl.getArgList().size() == 0);
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testValidLongOnlyOptions() throws Exception
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297e32r1il();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testValidLongOnlyOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1965,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297e32r1il() throws Exception{try{__CLR4_5_21fu1fulvn1m5og.R.inc(1965);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1966);CommandLine cl1 = parser.parse(_options, new String[]{"--export"});
        __CLR4_5_21fu1fulvn1m5og.R.inc(1967);assertTrue("Confirm --export is set", cl1.hasOption("export"));

        __CLR4_5_21fu1fulvn1m5og.R.inc(1968);CommandLine cl2 = parser.parse(_options, new String[]{"--import"});
        __CLR4_5_21fu1fulvn1m5og.R.inc(1969);assertTrue("Confirm --import is set", cl2.hasOption("import"));
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testToString()
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid1iq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1970,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid1iq(){try{__CLR4_5_21fu1fulvn1m5og.R.inc(1970);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1971);OptionGroup group1 = new OptionGroup();
        __CLR4_5_21fu1fulvn1m5og.R.inc(1972);group1.addOption(new Option(null, "foo", false, "Foo"));
        __CLR4_5_21fu1fulvn1m5og.R.inc(1973);group1.addOption(new Option(null, "bar", false, "Bar"));

        __CLR4_5_21fu1fulvn1m5og.R.inc(1974);if ((((!"[--bar Bar, --foo Foo]".equals(group1.toString()))&&(__CLR4_5_21fu1fulvn1m5og.R.iget(1975)!=0|true))||(__CLR4_5_21fu1fulvn1m5og.R.iget(1976)==0&false))) {{
            __CLR4_5_21fu1fulvn1m5og.R.inc(1977);assertEquals("[--foo Foo, --bar Bar]", group1.toString());
        }

        }__CLR4_5_21fu1fulvn1m5og.R.inc(1978);OptionGroup group2 = new OptionGroup();
        __CLR4_5_21fu1fulvn1m5og.R.inc(1979);group2.addOption(new Option("f", "foo", false, "Foo"));
        __CLR4_5_21fu1fulvn1m5og.R.inc(1980);group2.addOption(new Option("b", "bar", false, "Bar"));

        __CLR4_5_21fu1fulvn1m5og.R.inc(1981);if ((((!"[-b Bar, -f Foo]".equals(group2.toString()))&&(__CLR4_5_21fu1fulvn1m5og.R.iget(1982)!=0|true))||(__CLR4_5_21fu1fulvn1m5og.R.iget(1983)==0&false))) {{
            __CLR4_5_21fu1fulvn1m5og.R.inc(1984);assertEquals("[-f Foo, -b Bar]", group2.toString());
        }
    }}finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}

    public void testGetNames()
    {__CLR4_5_21fu1fulvn1m5og.R.globalSliceStart(getClass().getName(),1985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s5d1it1j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fu1fulvn1m5og.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fu1fulvn1m5og.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionGroupTest.testGetNames",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1985,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s5d1it1j5(){try{__CLR4_5_21fu1fulvn1m5og.R.inc(1985);
        __CLR4_5_21fu1fulvn1m5og.R.inc(1986);OptionGroup group = new OptionGroup();
        __CLR4_5_21fu1fulvn1m5og.R.inc(1987);group.addOption(OptionBuilder.create('a'));
        __CLR4_5_21fu1fulvn1m5og.R.inc(1988);group.addOption(OptionBuilder.create('b'));

        __CLR4_5_21fu1fulvn1m5og.R.inc(1989);assertNotNull("null names", group.getNames());
        __CLR4_5_21fu1fulvn1m5og.R.inc(1990);assertEquals(2, group.getNames().size());
        __CLR4_5_21fu1fulvn1m5og.R.inc(1991);assertTrue(group.getNames().contains("a"));
        __CLR4_5_21fu1fulvn1m5og.R.inc(1992);assertTrue(group.getNames().contains("b"));
    }finally{__CLR4_5_21fu1fulvn1m5og.R.flushNeeded();}}
}
