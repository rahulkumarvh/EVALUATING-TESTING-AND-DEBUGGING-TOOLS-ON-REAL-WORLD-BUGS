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
{static class __CLR4_5_21cj1cjlvn1n6e8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,1947,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test11457() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvm9ez1cj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11457",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1747,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvm9ez1cj() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1747);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1748);Options options = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1749);options.addOption(OptionBuilder.withLongOpt("verbose").create());
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1750);String[] args = new String[]{"--verbose"};

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1751);CommandLineParser parser = new PosixParser();

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1752);CommandLine cmd = parser.parse(options, args);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1753);assertTrue(cmd.hasOption("verbose"));
    }finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}

    public void test11458() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wwhtro1cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11458",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1754,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wwhtro1cq() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1754);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1755);Options options = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1756);options.addOption( OptionBuilder.withValueSeparator( '=' ).hasArgs().create( 'D' ) );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1757);options.addOption( OptionBuilder.withValueSeparator( ':' ).hasArgs().create( 'p' ) );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1758);String[] args = new String[] { "-DJAVA_HOME=/opt/java" , "-pfile1:file2:file3" };

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1759);CommandLineParser parser = new PosixParser();

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1760);CommandLine cmd = parser.parse(options, args);

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1761);String[] values = cmd.getOptionValues('D');

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1762);assertEquals(values[0], "JAVA_HOME");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1763);assertEquals(values[1], "/opt/java");

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1764);values = cmd.getOptionValues('p');

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1765);assertEquals(values[0], "file1");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1766);assertEquals(values[1], "file2");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1767);assertEquals(values[2], "file3");

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1768);Iterator iter = cmd.iterator();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1769);while ((((iter.hasNext())&&(__CLR4_5_21cj1cjlvn1n6e8.R.iget(1770)!=0|true))||(__CLR4_5_21cj1cjlvn1n6e8.R.iget(1771)==0&false)))
        {{
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1772);Option opt = (Option) iter.next();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_21cj1cjlvn1n6e8.R.inc(1773);switch (opt.getId())
            {
                case 'D':if (!__CLB4_5_2_bool0) {__CLR4_5_21cj1cjlvn1n6e8.R.inc(1774);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21cj1cjlvn1n6e8.R.inc(1775);assertEquals(opt.getValue(0), "JAVA_HOME");
                    __CLR4_5_21cj1cjlvn1n6e8.R.inc(1776);assertEquals(opt.getValue(1), "/opt/java");
                    __CLR4_5_21cj1cjlvn1n6e8.R.inc(1777);break;
                case 'p':if (!__CLB4_5_2_bool0) {__CLR4_5_21cj1cjlvn1n6e8.R.inc(1778);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21cj1cjlvn1n6e8.R.inc(1779);assertEquals(opt.getValue(0), "file1");
                    __CLR4_5_21cj1cjlvn1n6e8.R.inc(1780);assertEquals(opt.getValue(1), "file2");
                    __CLR4_5_21cj1cjlvn1n6e8.R.inc(1781);assertEquals(opt.getValue(2), "file3");
                    __CLR4_5_21cj1cjlvn1n6e8.R.inc(1782);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_21cj1cjlvn1n6e8.R.inc(1783);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21cj1cjlvn1n6e8.R.inc(1784);fail("-D option not found");
            }
        }
    }}finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}

    public void test11680() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzdrsz1dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11680",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1785,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzdrsz1dl() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1785);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1786);Options options = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1787);options.addOption("f", true, "foobar");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1788);options.addOption("m", true, "missing");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1789);String[] args = new String[]{"-f", "foo"};

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1790);CommandLineParser parser = new PosixParser();

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1791);CommandLine cmd = parser.parse(options, args);

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1792);cmd.getOptionValue("f", "default f");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1793);cmd.getOptionValue("m", "default m");
    }finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}

    public void test11456() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vmmami1du();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11456",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vmmami1du() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1794);
        // Posix 
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1795);Options options = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1796);options.addOption( OptionBuilder.hasOptionalArg().create( 'a' ) );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1797);options.addOption( OptionBuilder.hasArg().create( 'b' ) );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1798);String[] args = new String[] { "-a", "-bvalue" };

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1799);CommandLineParser parser = new PosixParser();

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1800);CommandLine cmd = parser.parse( options, args );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1801);assertEquals( cmd.getOptionValue( 'b' ), "value" );

        // GNU
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1802);options = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1803);options.addOption( OptionBuilder.hasOptionalArg().create( 'a' ) );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1804);options.addOption( OptionBuilder.hasArg().create( 'b' ) );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1805);args = new String[] { "-a", "-b", "value" };

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1806);parser = new GnuParser();

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1807);cmd = parser.parse( options, args );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1808);assertEquals( cmd.getOptionValue( 'b' ), "value" );
    }finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}

    public void test12210() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qlb1dn1e9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test12210",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1809,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qlb1dn1e9() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1809);
        // create the main options object which will handle the first parameter
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1810);Options mainOptions = new Options();
        // There can be 2 main exclusive options:  -exec|-rep

        // Therefore, place them in an option group

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1811);String[] argv = new String[] { "-exec", "-exec_opt1", "-exec_opt2" };
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1812);OptionGroup grp = new OptionGroup();

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1813);grp.addOption(new Option("exec",false,"description for this option"));

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1814);grp.addOption(new Option("rep",false,"description for this option"));

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1815);mainOptions.addOptionGroup(grp);

        // for the exec option, there are 2 options...
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1816);Options execOptions = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1817);execOptions.addOption("exec_opt1", false, " desc");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1818);execOptions.addOption("exec_opt2", false, " desc");

        // similarly, for rep there are 2 options...
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1819);Options repOptions = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1820);repOptions.addOption("repopto", false, "desc");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1821);repOptions.addOption("repoptt", false, "desc");

        // create the parser
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1822);GnuParser parser = new GnuParser();

        // finally, parse the arguments:

        // first parse the main options to see what the user has specified
        // We set stopAtNonOption to true so it does not touch the remaining
        // options
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1823);CommandLine cmd = parser.parse(mainOptions,argv,true);
        // get the remaining options...
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1824);argv = cmd.getArgs();

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1825);if((((cmd.hasOption("exec"))&&(__CLR4_5_21cj1cjlvn1n6e8.R.iget(1826)!=0|true))||(__CLR4_5_21cj1cjlvn1n6e8.R.iget(1827)==0&false)))
        {{
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1828);cmd = parser.parse(execOptions,argv,false);
            // process the exec_op1 and exec_opt2...
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1829);assertTrue( cmd.hasOption("exec_opt1") );
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1830);assertTrue( cmd.hasOption("exec_opt2") );
        }
        }else {__CLR4_5_21cj1cjlvn1n6e8.R.inc(1831);if((((cmd.hasOption("rep"))&&(__CLR4_5_21cj1cjlvn1n6e8.R.iget(1832)!=0|true))||(__CLR4_5_21cj1cjlvn1n6e8.R.iget(1833)==0&false)))
        {{
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1834);cmd = parser.parse(repOptions,argv,false);
            // process the rep_op1 and rep_opt2...
        }
        }else {{
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1835);fail( "exec option not found" );
        }
    }}}finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}

    public void test13425() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jyiylm1f0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13425",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jyiylm1f0() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1836);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1837);Options options = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1838);Option oldpass = OptionBuilder.withLongOpt( "old-password" )
            .withDescription( "Use this option to specify the old password" )
            .hasArg()
            .create( 'o' );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1839);Option newpass = OptionBuilder.withLongOpt( "new-password" )
            .withDescription( "Use this option to specify the new password" )
            .hasArg()
            .create( 'n' );

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1840);String[] args = { 
            "-o", 
            "-n", 
            "newpassword" 
        };

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1841);options.addOption( oldpass );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1842);options.addOption( newpass );

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1843);Parser parser = new PosixParser();

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1844);try
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1845);parser.parse( options, args );
        }
        // catch the exception and leave the method
        catch( Exception exp )
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1846);assertTrue( exp != null );
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1847);return;
        }
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1848);fail( "MissingArgumentException not caught." );
    }finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}

    public void test13666() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_248yy471fd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13666",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_248yy471fd() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1849);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1850);Options options = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1851);Option dir = OptionBuilder.withDescription( "dir" ).hasArg().create( 'd' );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1852);options.addOption( dir );
        
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1853);final PrintStream oldSystemOut = System.out;
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1854);try
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1855);final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1856);final PrintStream print = new PrintStream(bytes);
            
            // capture this platform's eol symbol
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1857);print.println();
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1858);final String eol = bytes.toString();
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1859);bytes.reset();
            
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1860);System.setOut(new PrintStream(bytes));

            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1861);HelpFormatter formatter = new HelpFormatter();
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1862);formatter.printHelp( "dir", options );

            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1863);assertEquals("usage: dir"+eol+" -d <arg>   dir"+eol,bytes.toString());
        }
        finally
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1864);System.setOut(oldSystemOut);
        }
    }finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}

    public void test13935() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0zn5e1ft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13935",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0zn5e1ft() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1865);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1866);OptionGroup directions = new OptionGroup();

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1867);Option left = new Option( "l", "left", false, "go left" );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1868);Option right = new Option( "r", "right", false, "go right" );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1869);Option straight = new Option( "s", "straight", false, "go straight" );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1870);Option forward = new Option( "f", "forward", false, "go forward" );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1871);forward.setRequired( true );

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1872);directions.addOption( left );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1873);directions.addOption( right );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1874);directions.setRequired( true );

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1875);Options opts = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1876);opts.addOptionGroup( directions );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1877);opts.addOption( straight );

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1878);CommandLineParser parser = new PosixParser();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1879);boolean exception = false;

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1880);String[] args = new String[] {  };
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1881);try
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1882);CommandLine line = parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1883);exception = true;
        }

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1884);if ((((!exception)&&(__CLR4_5_21cj1cjlvn1n6e8.R.iget(1885)!=0|true))||(__CLR4_5_21cj1cjlvn1n6e8.R.iget(1886)==0&false)))
        {{
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1887);fail("Expected exception not caught.");
        }

        }__CLR4_5_21cj1cjlvn1n6e8.R.inc(1888);exception = false;

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1889);args = new String[] { "-s" };
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1890);try
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1891);CommandLine line = parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1892);exception = true;
        }

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1893);if ((((!exception)&&(__CLR4_5_21cj1cjlvn1n6e8.R.iget(1894)!=0|true))||(__CLR4_5_21cj1cjlvn1n6e8.R.iget(1895)==0&false)))
        {{
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1896);fail("Expected exception not caught.");
        }

        }__CLR4_5_21cj1cjlvn1n6e8.R.inc(1897);exception = false;

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1898);args = new String[] { "-s", "-l" };
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1899);try
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1900);parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1901);fail("Unexpected exception: " + exp.getClass().getName() + ":" + exp.getMessage());
        }

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1902);opts.addOption( forward );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1903);args = new String[] { "-s", "-l", "-f" };
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1904);try
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1905);parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_21cj1cjlvn1n6e8.R.inc(1906);fail("Unexpected exception: " + exp.getClass().getName() + ":" + exp.getMessage());
        }
    }finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}

    public void test14786() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d4j8nt1gz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test14786",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d4j8nt1gz() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1907);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1908);Option o = OptionBuilder.isRequired().withDescription("test").create("test");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1909);Options opts = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1910);opts.addOption(o);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1911);opts.addOption(o);

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1912);CommandLineParser parser = new GnuParser();

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1913);String[] args = new String[] { "-test" };

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1914);CommandLine line = parser.parse( opts, args );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1915);assertTrue( line.hasOption( "test" ) );
    }finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}

    public void test15046() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuwqdf1h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test15046",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuwqdf1h8() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1916);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1917);CommandLineParser parser = new PosixParser();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1918);String[] CLI_ARGS = new String[] {"-z", "c"};

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1919);Options options = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1920);options.addOption(new Option("z", "timezone", true, "affected option"));

        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1921);parser.parse(options, CLI_ARGS);
        
        //now add conflicting option
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1922);options.addOption("c", "conflict", true, "conflict option");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1923);CommandLine line = parser.parse(options, CLI_ARGS);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1924);assertEquals( line.getOptionValue('z'), "c" );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1925);assertTrue( !line.hasOption("c") );
    }finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}

    public void test15648() throws Exception
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2njsirv1hi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test15648",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1926,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2njsirv1hi() throws Exception{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1926);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1927);CommandLineParser parser = new PosixParser();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1928);final String[] args = new String[] { "-m", "\"Two Words\"" };
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1929);Option m = OptionBuilder.hasArgs().create("m");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1930);Options options = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1931);options.addOption( m );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1932);CommandLine line = parser.parse( options, args );
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1933);assertEquals( "Two Words", line.getOptionValue( "m" ) );
    }finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}
    
    public void test31148() throws ParseException
    {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vjb5bg1hq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test31148",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vjb5bg1hq() throws ParseException{try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1934);
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1935);Option multiArgOption = new Option("o","option with multiple args");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1936);multiArgOption.setArgs(1);
        
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1937);Options options = new Options();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1938);options.addOption(multiArgOption);
        
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1939);Parser parser = new PosixParser();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1940);String[] args = new String[]{};
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1941);Properties props = new Properties();
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1942);props.setProperty("o","ovalue");
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1943);CommandLine cl = parser.parse(options,args,props);
        
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1944);assertTrue(cl.hasOption('o'));
        __CLR4_5_21cj1cjlvn1n6e8.R.inc(1945);assertEquals("ovalue",cl.getOptionValue('o'));
    }finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}}


    public void test27635() {__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceStart(getClass().getName(),1946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_225avt41i2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cj1cjlvn1n6e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test27635",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1946,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_225avt41i2(){try{__CLR4_5_21cj1cjlvn1n6e8.R.inc(1946);}finally{__CLR4_5_21cj1cjlvn1n6e8.R.flushNeeded();}} // Fails in super class
}
