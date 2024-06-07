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
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Properties;

import junit.framework.TestCase;

@java.lang.SuppressWarnings({"fallthrough"}) public class BugsTest extends TestCase
{static class __CLR4_5_21df1dflvn1neo4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521191983L,8589935092L,1979,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test11457() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvm9ez1df();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11457",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1779,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvm9ez1df() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1779);
        __CLR4_5_21df1dflvn1neo4.R.inc(1780);Options options = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1781);options.addOption(OptionBuilder.withLongOpt("verbose").create());
        __CLR4_5_21df1dflvn1neo4.R.inc(1782);String[] args = new String[]{"--verbose"};

        __CLR4_5_21df1dflvn1neo4.R.inc(1783);CommandLineParser parser = new PosixParser();

        __CLR4_5_21df1dflvn1neo4.R.inc(1784);CommandLine cmd = parser.parse(options, args);
        __CLR4_5_21df1dflvn1neo4.R.inc(1785);assertTrue(cmd.hasOption("verbose"));
    }finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}

    public void test11458() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wwhtro1dm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11458",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wwhtro1dm() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1786);
        __CLR4_5_21df1dflvn1neo4.R.inc(1787);Options options = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1788);options.addOption( OptionBuilder.withValueSeparator( '=' ).hasArgs().create( 'D' ) );
        __CLR4_5_21df1dflvn1neo4.R.inc(1789);options.addOption( OptionBuilder.withValueSeparator( ':' ).hasArgs().create( 'p' ) );
        __CLR4_5_21df1dflvn1neo4.R.inc(1790);String[] args = new String[] { "-DJAVA_HOME=/opt/java" , "-pfile1:file2:file3" };

        __CLR4_5_21df1dflvn1neo4.R.inc(1791);CommandLineParser parser = new PosixParser();

        __CLR4_5_21df1dflvn1neo4.R.inc(1792);CommandLine cmd = parser.parse(options, args);

        __CLR4_5_21df1dflvn1neo4.R.inc(1793);String[] values = cmd.getOptionValues('D');

        __CLR4_5_21df1dflvn1neo4.R.inc(1794);assertEquals(values[0], "JAVA_HOME");
        __CLR4_5_21df1dflvn1neo4.R.inc(1795);assertEquals(values[1], "/opt/java");

        __CLR4_5_21df1dflvn1neo4.R.inc(1796);values = cmd.getOptionValues('p');

        __CLR4_5_21df1dflvn1neo4.R.inc(1797);assertEquals(values[0], "file1");
        __CLR4_5_21df1dflvn1neo4.R.inc(1798);assertEquals(values[1], "file2");
        __CLR4_5_21df1dflvn1neo4.R.inc(1799);assertEquals(values[2], "file3");

        __CLR4_5_21df1dflvn1neo4.R.inc(1800);Iterator iter = cmd.iterator();
        __CLR4_5_21df1dflvn1neo4.R.inc(1801);while ((((iter.hasNext())&&(__CLR4_5_21df1dflvn1neo4.R.iget(1802)!=0|true))||(__CLR4_5_21df1dflvn1neo4.R.iget(1803)==0&false)))
        {{
            __CLR4_5_21df1dflvn1neo4.R.inc(1804);Option opt = (Option) iter.next();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_21df1dflvn1neo4.R.inc(1805);switch (opt.getId())
            {
                case 'D':if (!__CLB4_5_2_bool0) {__CLR4_5_21df1dflvn1neo4.R.inc(1806);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21df1dflvn1neo4.R.inc(1807);assertEquals(opt.getValue(0), "JAVA_HOME");
                    __CLR4_5_21df1dflvn1neo4.R.inc(1808);assertEquals(opt.getValue(1), "/opt/java");
                    __CLR4_5_21df1dflvn1neo4.R.inc(1809);break;
                case 'p':if (!__CLB4_5_2_bool0) {__CLR4_5_21df1dflvn1neo4.R.inc(1810);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21df1dflvn1neo4.R.inc(1811);assertEquals(opt.getValue(0), "file1");
                    __CLR4_5_21df1dflvn1neo4.R.inc(1812);assertEquals(opt.getValue(1), "file2");
                    __CLR4_5_21df1dflvn1neo4.R.inc(1813);assertEquals(opt.getValue(2), "file3");
                    __CLR4_5_21df1dflvn1neo4.R.inc(1814);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_21df1dflvn1neo4.R.inc(1815);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21df1dflvn1neo4.R.inc(1816);fail("-D option not found");
            }
        }
    }}finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}

    public void test11680() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzdrsz1eh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11680",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1817,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzdrsz1eh() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1817);
        __CLR4_5_21df1dflvn1neo4.R.inc(1818);Options options = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1819);options.addOption("f", true, "foobar");
        __CLR4_5_21df1dflvn1neo4.R.inc(1820);options.addOption("m", true, "missing");
        __CLR4_5_21df1dflvn1neo4.R.inc(1821);String[] args = new String[]{"-f", "foo"};

        __CLR4_5_21df1dflvn1neo4.R.inc(1822);CommandLineParser parser = new PosixParser();

        __CLR4_5_21df1dflvn1neo4.R.inc(1823);CommandLine cmd = parser.parse(options, args);

        __CLR4_5_21df1dflvn1neo4.R.inc(1824);cmd.getOptionValue("f", "default f");
        __CLR4_5_21df1dflvn1neo4.R.inc(1825);cmd.getOptionValue("m", "default m");
    }finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}

    public void test11456() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vmmami1eq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11456",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1826,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vmmami1eq() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1826);
        // Posix 
        __CLR4_5_21df1dflvn1neo4.R.inc(1827);Options options = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1828);options.addOption( OptionBuilder.hasOptionalArg().create( 'a' ) );
        __CLR4_5_21df1dflvn1neo4.R.inc(1829);options.addOption( OptionBuilder.hasArg().create( 'b' ) );
        __CLR4_5_21df1dflvn1neo4.R.inc(1830);String[] args = new String[] { "-a", "-bvalue" };

        __CLR4_5_21df1dflvn1neo4.R.inc(1831);CommandLineParser parser = new PosixParser();

        __CLR4_5_21df1dflvn1neo4.R.inc(1832);CommandLine cmd = parser.parse( options, args );
        __CLR4_5_21df1dflvn1neo4.R.inc(1833);assertEquals( cmd.getOptionValue( 'b' ), "value" );

        // GNU
        __CLR4_5_21df1dflvn1neo4.R.inc(1834);options = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1835);options.addOption( OptionBuilder.hasOptionalArg().create( 'a' ) );
        __CLR4_5_21df1dflvn1neo4.R.inc(1836);options.addOption( OptionBuilder.hasArg().create( 'b' ) );
        __CLR4_5_21df1dflvn1neo4.R.inc(1837);args = new String[] { "-a", "-b", "value" };

        __CLR4_5_21df1dflvn1neo4.R.inc(1838);parser = new GnuParser();

        __CLR4_5_21df1dflvn1neo4.R.inc(1839);cmd = parser.parse( options, args );
        __CLR4_5_21df1dflvn1neo4.R.inc(1840);assertEquals( cmd.getOptionValue( 'b' ), "value" );
    }finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}

    public void test12210() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qlb1dn1f5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test12210",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qlb1dn1f5() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1841);
        // create the main options object which will handle the first parameter
        __CLR4_5_21df1dflvn1neo4.R.inc(1842);Options mainOptions = new Options();
        // There can be 2 main exclusive options:  -exec|-rep

        // Therefore, place them in an option group

        __CLR4_5_21df1dflvn1neo4.R.inc(1843);String[] argv = new String[] { "-exec", "-exec_opt1", "-exec_opt2" };
        __CLR4_5_21df1dflvn1neo4.R.inc(1844);OptionGroup grp = new OptionGroup();

        __CLR4_5_21df1dflvn1neo4.R.inc(1845);grp.addOption(new Option("exec",false,"description for this option"));

        __CLR4_5_21df1dflvn1neo4.R.inc(1846);grp.addOption(new Option("rep",false,"description for this option"));

        __CLR4_5_21df1dflvn1neo4.R.inc(1847);mainOptions.addOptionGroup(grp);

        // for the exec option, there are 2 options...
        __CLR4_5_21df1dflvn1neo4.R.inc(1848);Options execOptions = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1849);execOptions.addOption("exec_opt1", false, " desc");
        __CLR4_5_21df1dflvn1neo4.R.inc(1850);execOptions.addOption("exec_opt2", false, " desc");

        // similarly, for rep there are 2 options...
        __CLR4_5_21df1dflvn1neo4.R.inc(1851);Options repOptions = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1852);repOptions.addOption("repopto", false, "desc");
        __CLR4_5_21df1dflvn1neo4.R.inc(1853);repOptions.addOption("repoptt", false, "desc");

        // create the parser
        __CLR4_5_21df1dflvn1neo4.R.inc(1854);GnuParser parser = new GnuParser();

        // finally, parse the arguments:

        // first parse the main options to see what the user has specified
        // We set stopAtNonOption to true so it does not touch the remaining
        // options
        __CLR4_5_21df1dflvn1neo4.R.inc(1855);CommandLine cmd = parser.parse(mainOptions,argv,true);
        // get the remaining options...
        __CLR4_5_21df1dflvn1neo4.R.inc(1856);argv = cmd.getArgs();

        __CLR4_5_21df1dflvn1neo4.R.inc(1857);if((((cmd.hasOption("exec"))&&(__CLR4_5_21df1dflvn1neo4.R.iget(1858)!=0|true))||(__CLR4_5_21df1dflvn1neo4.R.iget(1859)==0&false)))
        {{
            __CLR4_5_21df1dflvn1neo4.R.inc(1860);cmd = parser.parse(execOptions,argv,false);
            // process the exec_op1 and exec_opt2...
            __CLR4_5_21df1dflvn1neo4.R.inc(1861);assertTrue( cmd.hasOption("exec_opt1") );
            __CLR4_5_21df1dflvn1neo4.R.inc(1862);assertTrue( cmd.hasOption("exec_opt2") );
        }
        }else {__CLR4_5_21df1dflvn1neo4.R.inc(1863);if((((cmd.hasOption("rep"))&&(__CLR4_5_21df1dflvn1neo4.R.iget(1864)!=0|true))||(__CLR4_5_21df1dflvn1neo4.R.iget(1865)==0&false)))
        {{
            __CLR4_5_21df1dflvn1neo4.R.inc(1866);cmd = parser.parse(repOptions,argv,false);
            // process the rep_op1 and rep_opt2...
        }
        }else {{
            __CLR4_5_21df1dflvn1neo4.R.inc(1867);fail( "exec option not found" );
        }
    }}}finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}

    public void test13425() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jyiylm1fw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13425",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jyiylm1fw() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1868);
        __CLR4_5_21df1dflvn1neo4.R.inc(1869);Options options = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1870);Option oldpass = OptionBuilder.withLongOpt( "old-password" )
            .withDescription( "Use this option to specify the old password" )
            .hasArg()
            .create( 'o' );
        __CLR4_5_21df1dflvn1neo4.R.inc(1871);Option newpass = OptionBuilder.withLongOpt( "new-password" )
            .withDescription( "Use this option to specify the new password" )
            .hasArg()
            .create( 'n' );

        __CLR4_5_21df1dflvn1neo4.R.inc(1872);String[] args = { 
            "-o", 
            "-n", 
            "newpassword" 
        };

        __CLR4_5_21df1dflvn1neo4.R.inc(1873);options.addOption( oldpass );
        __CLR4_5_21df1dflvn1neo4.R.inc(1874);options.addOption( newpass );

        __CLR4_5_21df1dflvn1neo4.R.inc(1875);Parser parser = new PosixParser();

        __CLR4_5_21df1dflvn1neo4.R.inc(1876);try
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1877);parser.parse( options, args );
        }
        // catch the exception and leave the method
        catch( Exception exp )
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1878);assertTrue( exp != null );
            __CLR4_5_21df1dflvn1neo4.R.inc(1879);return;
        }
        __CLR4_5_21df1dflvn1neo4.R.inc(1880);fail( "MissingArgumentException not caught." );
    }finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}

    public void test13666() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_248yy471g9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13666",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_248yy471g9() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1881);
        __CLR4_5_21df1dflvn1neo4.R.inc(1882);Options options = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1883);Option dir = OptionBuilder.withDescription( "dir" ).hasArg().create( 'd' );
        __CLR4_5_21df1dflvn1neo4.R.inc(1884);options.addOption( dir );
        
        __CLR4_5_21df1dflvn1neo4.R.inc(1885);final PrintStream oldSystemOut = System.out;
        __CLR4_5_21df1dflvn1neo4.R.inc(1886);try
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1887);final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            __CLR4_5_21df1dflvn1neo4.R.inc(1888);final PrintStream print = new PrintStream(bytes);
            
            // capture this platform's eol symbol
            __CLR4_5_21df1dflvn1neo4.R.inc(1889);print.println();
            __CLR4_5_21df1dflvn1neo4.R.inc(1890);final String eol = bytes.toString();
            __CLR4_5_21df1dflvn1neo4.R.inc(1891);bytes.reset();
            
            __CLR4_5_21df1dflvn1neo4.R.inc(1892);System.setOut(new PrintStream(bytes));

            __CLR4_5_21df1dflvn1neo4.R.inc(1893);HelpFormatter formatter = new HelpFormatter();
            __CLR4_5_21df1dflvn1neo4.R.inc(1894);formatter.printHelp( "dir", options );

            __CLR4_5_21df1dflvn1neo4.R.inc(1895);assertEquals("usage: dir"+eol+" -d <arg>   dir"+eol,bytes.toString());
        }
        finally
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1896);System.setOut(oldSystemOut);
        }
    }finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}

    public void test13935() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0zn5e1gp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13935",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0zn5e1gp() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1897);
        __CLR4_5_21df1dflvn1neo4.R.inc(1898);OptionGroup directions = new OptionGroup();

        __CLR4_5_21df1dflvn1neo4.R.inc(1899);Option left = new Option( "l", "left", false, "go left" );
        __CLR4_5_21df1dflvn1neo4.R.inc(1900);Option right = new Option( "r", "right", false, "go right" );
        __CLR4_5_21df1dflvn1neo4.R.inc(1901);Option straight = new Option( "s", "straight", false, "go straight" );
        __CLR4_5_21df1dflvn1neo4.R.inc(1902);Option forward = new Option( "f", "forward", false, "go forward" );
        __CLR4_5_21df1dflvn1neo4.R.inc(1903);forward.setRequired( true );

        __CLR4_5_21df1dflvn1neo4.R.inc(1904);directions.addOption( left );
        __CLR4_5_21df1dflvn1neo4.R.inc(1905);directions.addOption( right );
        __CLR4_5_21df1dflvn1neo4.R.inc(1906);directions.setRequired( true );

        __CLR4_5_21df1dflvn1neo4.R.inc(1907);Options opts = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1908);opts.addOptionGroup( directions );
        __CLR4_5_21df1dflvn1neo4.R.inc(1909);opts.addOption( straight );

        __CLR4_5_21df1dflvn1neo4.R.inc(1910);CommandLineParser parser = new PosixParser();
        __CLR4_5_21df1dflvn1neo4.R.inc(1911);boolean exception = false;

        __CLR4_5_21df1dflvn1neo4.R.inc(1912);String[] args = new String[] {  };
        __CLR4_5_21df1dflvn1neo4.R.inc(1913);try
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1914);CommandLine line = parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1915);exception = true;
        }

        __CLR4_5_21df1dflvn1neo4.R.inc(1916);if ((((!exception)&&(__CLR4_5_21df1dflvn1neo4.R.iget(1917)!=0|true))||(__CLR4_5_21df1dflvn1neo4.R.iget(1918)==0&false)))
        {{
            __CLR4_5_21df1dflvn1neo4.R.inc(1919);fail("Expected exception not caught.");
        }

        }__CLR4_5_21df1dflvn1neo4.R.inc(1920);exception = false;

        __CLR4_5_21df1dflvn1neo4.R.inc(1921);args = new String[] { "-s" };
        __CLR4_5_21df1dflvn1neo4.R.inc(1922);try
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1923);CommandLine line = parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1924);exception = true;
        }

        __CLR4_5_21df1dflvn1neo4.R.inc(1925);if ((((!exception)&&(__CLR4_5_21df1dflvn1neo4.R.iget(1926)!=0|true))||(__CLR4_5_21df1dflvn1neo4.R.iget(1927)==0&false)))
        {{
            __CLR4_5_21df1dflvn1neo4.R.inc(1928);fail("Expected exception not caught.");
        }

        }__CLR4_5_21df1dflvn1neo4.R.inc(1929);exception = false;

        __CLR4_5_21df1dflvn1neo4.R.inc(1930);args = new String[] { "-s", "-l" };
        __CLR4_5_21df1dflvn1neo4.R.inc(1931);try
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1932);parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1933);fail("Unexpected exception: " + exp.getClass().getName() + ":" + exp.getMessage());
        }

        __CLR4_5_21df1dflvn1neo4.R.inc(1934);opts.addOption( forward );
        __CLR4_5_21df1dflvn1neo4.R.inc(1935);args = new String[] { "-s", "-l", "-f" };
        __CLR4_5_21df1dflvn1neo4.R.inc(1936);try
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1937);parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_21df1dflvn1neo4.R.inc(1938);fail("Unexpected exception: " + exp.getClass().getName() + ":" + exp.getMessage());
        }
    }finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}

    public void test14786() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d4j8nt1hv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test14786",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1939,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d4j8nt1hv() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1939);
        __CLR4_5_21df1dflvn1neo4.R.inc(1940);Option o = OptionBuilder.isRequired().withDescription("test").create("test");
        __CLR4_5_21df1dflvn1neo4.R.inc(1941);Options opts = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1942);opts.addOption(o);
        __CLR4_5_21df1dflvn1neo4.R.inc(1943);opts.addOption(o);

        __CLR4_5_21df1dflvn1neo4.R.inc(1944);CommandLineParser parser = new GnuParser();

        __CLR4_5_21df1dflvn1neo4.R.inc(1945);String[] args = new String[] { "-test" };

        __CLR4_5_21df1dflvn1neo4.R.inc(1946);CommandLine line = parser.parse( opts, args );
        __CLR4_5_21df1dflvn1neo4.R.inc(1947);assertTrue( line.hasOption( "test" ) );
    }finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}

    public void test15046() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuwqdf1i4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test15046",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuwqdf1i4() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1948);
        __CLR4_5_21df1dflvn1neo4.R.inc(1949);CommandLineParser parser = new PosixParser();
        __CLR4_5_21df1dflvn1neo4.R.inc(1950);String[] CLI_ARGS = new String[] {"-z", "c"};

        __CLR4_5_21df1dflvn1neo4.R.inc(1951);Options options = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1952);options.addOption(new Option("z", "timezone", true, "affected option"));

        __CLR4_5_21df1dflvn1neo4.R.inc(1953);parser.parse(options, CLI_ARGS);
        
        //now add conflicting option
        __CLR4_5_21df1dflvn1neo4.R.inc(1954);options.addOption("c", "conflict", true, "conflict option");
        __CLR4_5_21df1dflvn1neo4.R.inc(1955);CommandLine line = parser.parse(options, CLI_ARGS);
        __CLR4_5_21df1dflvn1neo4.R.inc(1956);assertEquals( line.getOptionValue('z'), "c" );
        __CLR4_5_21df1dflvn1neo4.R.inc(1957);assertTrue( !line.hasOption("c") );
    }finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}

    public void test15648() throws Exception
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2njsirv1ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test15648",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2njsirv1ie() throws Exception{try{__CLR4_5_21df1dflvn1neo4.R.inc(1958);
        __CLR4_5_21df1dflvn1neo4.R.inc(1959);CommandLineParser parser = new PosixParser();
        __CLR4_5_21df1dflvn1neo4.R.inc(1960);final String[] args = new String[] { "-m", "\"Two Words\"" };
        __CLR4_5_21df1dflvn1neo4.R.inc(1961);Option m = OptionBuilder.hasArgs().create("m");
        __CLR4_5_21df1dflvn1neo4.R.inc(1962);Options options = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1963);options.addOption( m );
        __CLR4_5_21df1dflvn1neo4.R.inc(1964);CommandLine line = parser.parse( options, args );
        __CLR4_5_21df1dflvn1neo4.R.inc(1965);assertEquals( "Two Words", line.getOptionValue( "m" ) );
    }finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}
    
    public void test31148() throws ParseException
    {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vjb5bg1im();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test31148",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1966,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vjb5bg1im() throws ParseException{try{__CLR4_5_21df1dflvn1neo4.R.inc(1966);
        __CLR4_5_21df1dflvn1neo4.R.inc(1967);Option multiArgOption = new Option("o","option with multiple args");
        __CLR4_5_21df1dflvn1neo4.R.inc(1968);multiArgOption.setArgs(1);
        
        __CLR4_5_21df1dflvn1neo4.R.inc(1969);Options options = new Options();
        __CLR4_5_21df1dflvn1neo4.R.inc(1970);options.addOption(multiArgOption);
        
        __CLR4_5_21df1dflvn1neo4.R.inc(1971);Parser parser = new PosixParser();
        __CLR4_5_21df1dflvn1neo4.R.inc(1972);String[] args = new String[]{};
        __CLR4_5_21df1dflvn1neo4.R.inc(1973);Properties props = new Properties();
        __CLR4_5_21df1dflvn1neo4.R.inc(1974);props.setProperty("o","ovalue");
        __CLR4_5_21df1dflvn1neo4.R.inc(1975);CommandLine cl = parser.parse(options,args,props);
        
        __CLR4_5_21df1dflvn1neo4.R.inc(1976);assertTrue(cl.hasOption('o'));
        __CLR4_5_21df1dflvn1neo4.R.inc(1977);assertEquals("ovalue",cl.getOptionValue('o'));
    }finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}}


    public void test27635() {__CLR4_5_21df1dflvn1neo4.R.globalSliceStart(getClass().getName(),1978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_225avt41iy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21df1dflvn1neo4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21df1dflvn1neo4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test27635",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_225avt41iy(){try{__CLR4_5_21df1dflvn1neo4.R.inc(1978);}finally{__CLR4_5_21df1dflvn1neo4.R.flushNeeded();}} // Fails in super class
}
