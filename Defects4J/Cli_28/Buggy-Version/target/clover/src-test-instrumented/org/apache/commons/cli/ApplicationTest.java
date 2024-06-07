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
 * This is a collection of tests that test real world applications command lines.
 *
 * <p>
 * The following applications are tested:
 * <ul>
 *   <li>ls</li>
 *   <li>Ant</li>
 *   <li>Groovy</li>
 *   <li>man</li>
 * </ul>
 * </p>
 *
 * @author John Keyes (john at integralsource.com)
 */
public class ApplicationTest extends TestCase {static class __CLR4_5_218o18olvn1n6c2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,1697,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void testLs() throws Exception {__CLR4_5_218o18olvn1n6c2.R.globalSliceStart(getClass().getName(),1608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2evwn4w18o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218o18olvn1n6c2.R.rethrow($CLV_t2$);}finally{__CLR4_5_218o18olvn1n6c2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ApplicationTest.testLs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1608,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2evwn4w18o() throws Exception{try{__CLR4_5_218o18olvn1n6c2.R.inc(1608);
        // create the command line parser
        __CLR4_5_218o18olvn1n6c2.R.inc(1609);CommandLineParser parser = new PosixParser();
        __CLR4_5_218o18olvn1n6c2.R.inc(1610);Options options = new Options();
        __CLR4_5_218o18olvn1n6c2.R.inc(1611);options.addOption( "a", "all", false, "do not hide entries starting with ." );
        __CLR4_5_218o18olvn1n6c2.R.inc(1612);options.addOption( "A", "almost-all", false, "do not list implied . and .." );
        __CLR4_5_218o18olvn1n6c2.R.inc(1613);options.addOption( "b", "escape", false, "print octal escapes for nongraphic characters" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1614);options.addOption( OptionBuilder.withLongOpt( "block-size" )
                                        .withDescription( "use SIZE-byte blocks" )
                                        .hasArg()
                                        .withArgName("SIZE")
                                        .create() );
        __CLR4_5_218o18olvn1n6c2.R.inc(1615);options.addOption( "B", "ignore-backups", false, "do not list implied entried ending with ~");
        __CLR4_5_218o18olvn1n6c2.R.inc(1616);options.addOption( "c", false, "with -lt: sort by, and show, ctime (time of last modification of file status information) with -l:show ctime and sort by name otherwise: sort by ctime" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1617);options.addOption( "C", false, "list entries by columns" );

        __CLR4_5_218o18olvn1n6c2.R.inc(1618);String[] args = new String[]{ "--block-size=10" };

        __CLR4_5_218o18olvn1n6c2.R.inc(1619);CommandLine line = parser.parse( options, args );
        __CLR4_5_218o18olvn1n6c2.R.inc(1620);assertTrue( line.hasOption( "block-size" ) );
        __CLR4_5_218o18olvn1n6c2.R.inc(1621);assertEquals( line.getOptionValue( "block-size" ), "10" );
    }finally{__CLR4_5_218o18olvn1n6c2.R.flushNeeded();}}

    /**
     * Ant test
     */
    public void testAnt() throws Exception {__CLR4_5_218o18olvn1n6c2.R.globalSliceStart(getClass().getName(),1622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2puxg9o192();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218o18olvn1n6c2.R.rethrow($CLV_t2$);}finally{__CLR4_5_218o18olvn1n6c2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ApplicationTest.testAnt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2puxg9o192() throws Exception{try{__CLR4_5_218o18olvn1n6c2.R.inc(1622);
        // use the GNU parser
        __CLR4_5_218o18olvn1n6c2.R.inc(1623);CommandLineParser parser = new GnuParser( );
        __CLR4_5_218o18olvn1n6c2.R.inc(1624);Options options = new Options();
        __CLR4_5_218o18olvn1n6c2.R.inc(1625);options.addOption( "help", false, "print this message" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1626);options.addOption( "projecthelp", false, "print project help information" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1627);options.addOption( "version", false, "print the version information and exit" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1628);options.addOption( "quiet", false, "be extra quiet" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1629);options.addOption( "verbose", false, "be extra verbose" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1630);options.addOption( "debug", false, "print debug information" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1631);options.addOption( "logfile", true, "use given file for log" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1632);options.addOption( "logger", true, "the class which is to perform the logging" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1633);options.addOption( "listener", true, "add an instance of a class as a project listener" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1634);options.addOption( "buildfile", true, "use given buildfile" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1635);options.addOption( OptionBuilder.withDescription( "use value for given property" )
                                        .hasArgs()
                                        .withValueSeparator()
                                        .create( 'D' ) );
                           //, null, true, , false, true );
        __CLR4_5_218o18olvn1n6c2.R.inc(1636);options.addOption( "find", true, "search for buildfile towards the root of the filesystem and use it" );

        __CLR4_5_218o18olvn1n6c2.R.inc(1637);String[] args = new String[]{ "-buildfile", "mybuild.xml",
            "-Dproperty=value", "-Dproperty1=value1",
            "-projecthelp" };

        __CLR4_5_218o18olvn1n6c2.R.inc(1638);CommandLine line = parser.parse( options, args );

        // check multiple values
        __CLR4_5_218o18olvn1n6c2.R.inc(1639);String[] opts = line.getOptionValues( "D" );
        __CLR4_5_218o18olvn1n6c2.R.inc(1640);assertEquals( "property", opts[0] );
        __CLR4_5_218o18olvn1n6c2.R.inc(1641);assertEquals( "value", opts[1] );
        __CLR4_5_218o18olvn1n6c2.R.inc(1642);assertEquals( "property1", opts[2] );
        __CLR4_5_218o18olvn1n6c2.R.inc(1643);assertEquals( "value1", opts[3] );

        // check single value
        __CLR4_5_218o18olvn1n6c2.R.inc(1644);assertEquals( line.getOptionValue( "buildfile"), "mybuild.xml" );

        // check option
        __CLR4_5_218o18olvn1n6c2.R.inc(1645);assertTrue( line.hasOption( "projecthelp") );
    }finally{__CLR4_5_218o18olvn1n6c2.R.flushNeeded();}}

    public void testGroovy() throws Exception {__CLR4_5_218o18olvn1n6c2.R.globalSliceStart(getClass().getName(),1646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p1baex19q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218o18olvn1n6c2.R.rethrow($CLV_t2$);}finally{__CLR4_5_218o18olvn1n6c2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ApplicationTest.testGroovy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p1baex19q() throws Exception{try{__CLR4_5_218o18olvn1n6c2.R.inc(1646);
        __CLR4_5_218o18olvn1n6c2.R.inc(1647);Options options = new Options();

        __CLR4_5_218o18olvn1n6c2.R.inc(1648);options.addOption(
            OptionBuilder.withLongOpt("define").
                withDescription("define a system property").
                hasArg(true).
                withArgName("name=value").
                create('D'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1649);options.addOption(
            OptionBuilder.hasArg(false)
            .withDescription("usage information")
            .withLongOpt("help")
            .create('h'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1650);options.addOption(
            OptionBuilder.hasArg(false)
            .withDescription("debug mode will print out full stack traces")
            .withLongOpt("debug")
            .create('d'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1651);options.addOption(
            OptionBuilder.hasArg(false)
            .withDescription("display the Groovy and JVM versions")
            .withLongOpt("version")
            .create('v'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1652);options.addOption(
            OptionBuilder.withArgName("charset")
            .hasArg()
            .withDescription("specify the encoding of the files")
            .withLongOpt("encoding")
            .create('c'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1653);options.addOption(
            OptionBuilder.withArgName("script")
            .hasArg()
            .withDescription("specify a command line script")
            .create('e'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1654);options.addOption(
            OptionBuilder.withArgName("extension")
            .hasOptionalArg()
            .withDescription("modify files in place; create backup if extension is given (e.g. \'.bak\')")
            .create('i'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1655);options.addOption(
            OptionBuilder.hasArg(false)
            .withDescription("process files line by line using implicit 'line' variable")
            .create('n'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1656);options.addOption(
            OptionBuilder.hasArg(false)
            .withDescription("process files line by line and print result (see also -n)")
            .create('p'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1657);options.addOption(
            OptionBuilder.withArgName("port")
            .hasOptionalArg()
            .withDescription("listen on a port and process inbound lines")
            .create('l'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1658);options.addOption(
            OptionBuilder.withArgName("splitPattern")
            .hasOptionalArg()
            .withDescription("split lines using splitPattern (default '\\s') using implicit 'split' variable")
            .withLongOpt("autosplit")
            .create('a'));

        __CLR4_5_218o18olvn1n6c2.R.inc(1659);Parser parser = new PosixParser();
        __CLR4_5_218o18olvn1n6c2.R.inc(1660);CommandLine line = parser.parse(options, new String[] { "-e", "println 'hello'" }, true);

        __CLR4_5_218o18olvn1n6c2.R.inc(1661);assertTrue(line.hasOption('e'));
        __CLR4_5_218o18olvn1n6c2.R.inc(1662);assertEquals("println 'hello'", line.getOptionValue('e'));
    }finally{__CLR4_5_218o18olvn1n6c2.R.flushNeeded();}}

    /**
     * author Slawek Zachcial
     */
    public void testMan()
    {__CLR4_5_218o18olvn1n6c2.R.globalSliceStart(getClass().getName(),1663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kl7xyn1a7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218o18olvn1n6c2.R.rethrow($CLV_t2$);}finally{__CLR4_5_218o18olvn1n6c2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ApplicationTest.testMan",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kl7xyn1a7(){try{__CLR4_5_218o18olvn1n6c2.R.inc(1663);
        __CLR4_5_218o18olvn1n6c2.R.inc(1664);String cmdLine =
                "man [-c|-f|-k|-w|-tZT device] [-adlhu7V] [-Mpath] [-Ppager] [-Slist] " +
                        "[-msystem] [-pstring] [-Llocale] [-eextension] [section] page ...";
        __CLR4_5_218o18olvn1n6c2.R.inc(1665);Options options = new Options().
                addOption("a", "all", false, "find all matching manual pages.").
                addOption("d", "debug", false, "emit debugging messages.").
                addOption("e", "extension", false, "limit search to extension type 'extension'.").
                addOption("f", "whatis", false, "equivalent to whatis.").
                addOption("k", "apropos", false, "equivalent to apropos.").
                addOption("w", "location", false, "print physical location of man page(s).").
                addOption("l", "local-file", false, "interpret 'page' argument(s) as local filename(s)").
                addOption("u", "update", false, "force a cache consistency check.").
                //FIXME - should generate -r,--prompt string
                addOption("r", "prompt", true, "provide 'less' pager with prompt.").
                addOption("c", "catman", false, "used by catman to reformat out of date cat pages.").
                addOption("7", "ascii", false, "display ASCII translation or certain latin1 chars.").
                addOption("t", "troff", false, "use troff format pages.").
                //FIXME - should generate -T,--troff-device device
                addOption("T", "troff-device", true, "use groff with selected device.").
                addOption("Z", "ditroff", false, "use groff with selected device.").
                addOption("D", "default", false, "reset all options to their default values.").
                //FIXME - should generate -M,--manpath path
                addOption("M", "manpath", true, "set search path for manual pages to 'path'.").
                //FIXME - should generate -P,--pager pager
                addOption("P", "pager", true, "use program 'pager' to display output.").
                //FIXME - should generate -S,--sections list
                addOption("S", "sections", true, "use colon separated section list.").
                //FIXME - should generate -m,--systems system
                addOption("m", "systems", true, "search for man pages from other unix system(s).").
                //FIXME - should generate -L,--locale locale
                addOption("L", "locale", true, "define the locale for this particular man search.").
                //FIXME - should generate -p,--preprocessor string
                addOption("p", "preprocessor", true, "string indicates which preprocessor to run.\n" +
                         " e - [n]eqn  p - pic     t - tbl\n" +
                         " g - grap    r - refer   v - vgrind").
                addOption("V", "version", false, "show version.").
                addOption("h", "help", false, "show this usage message.");

        __CLR4_5_218o18olvn1n6c2.R.inc(1666);HelpFormatter hf = new HelpFormatter();
        //hf.printHelp(cmdLine, opts);
        __CLR4_5_218o18olvn1n6c2.R.inc(1667);hf.printHelp(60, cmdLine, null, options, null);
    }finally{__CLR4_5_218o18olvn1n6c2.R.flushNeeded();}}


    /**
     * Real world test with long and short options.
     */
    public void testNLT() throws Exception {__CLR4_5_218o18olvn1n6c2.R.globalSliceStart(getClass().getName(),1668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k6howb1ac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218o18olvn1n6c2.R.rethrow($CLV_t2$);}finally{__CLR4_5_218o18olvn1n6c2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ApplicationTest.testNLT",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k6howb1ac() throws Exception{try{__CLR4_5_218o18olvn1n6c2.R.inc(1668);
        __CLR4_5_218o18olvn1n6c2.R.inc(1669);Option help = new Option("h", "help", false, "print this message");
        __CLR4_5_218o18olvn1n6c2.R.inc(1670);Option version = new Option("v", "version", false, "print version information");
        __CLR4_5_218o18olvn1n6c2.R.inc(1671);Option newRun = new Option("n", "new", false, "Create NLT cache entries only for new items");
        __CLR4_5_218o18olvn1n6c2.R.inc(1672);Option trackerRun = new Option("t", "tracker", false, "Create NLT cache entries only for tracker items");

        __CLR4_5_218o18olvn1n6c2.R.inc(1673);Option timeLimit = OptionBuilder.withLongOpt("limit").hasArg()
                                        .withValueSeparator()
                                        .withDescription("Set time limit for execution, in minutes")
                                        .create("l");

        __CLR4_5_218o18olvn1n6c2.R.inc(1674);Option age = OptionBuilder.withLongOpt("age").hasArg()
                                  .withValueSeparator()
                                  .withDescription("Age (in days) of cache item before being recomputed")
                                  .create("a");

        __CLR4_5_218o18olvn1n6c2.R.inc(1675);Option server = OptionBuilder.withLongOpt("server").hasArg()
                                     .withValueSeparator()
                                     .withDescription("The NLT server address")
                                     .create("s");

        __CLR4_5_218o18olvn1n6c2.R.inc(1676);Option numResults = OptionBuilder.withLongOpt("results").hasArg()
                                         .withValueSeparator()
                                         .withDescription("Number of results per item")
                                         .create("r");

        __CLR4_5_218o18olvn1n6c2.R.inc(1677);Option configFile = OptionBuilder.withLongOpt("file").hasArg()
                                         .withValueSeparator()
                                         .withDescription("Use the specified configuration file")
                                         .create();

        __CLR4_5_218o18olvn1n6c2.R.inc(1678);Options options = new Options();
        __CLR4_5_218o18olvn1n6c2.R.inc(1679);options.addOption(help);
        __CLR4_5_218o18olvn1n6c2.R.inc(1680);options.addOption(version);
        __CLR4_5_218o18olvn1n6c2.R.inc(1681);options.addOption(newRun);
        __CLR4_5_218o18olvn1n6c2.R.inc(1682);options.addOption(trackerRun);
        __CLR4_5_218o18olvn1n6c2.R.inc(1683);options.addOption(timeLimit);
        __CLR4_5_218o18olvn1n6c2.R.inc(1684);options.addOption(age);
        __CLR4_5_218o18olvn1n6c2.R.inc(1685);options.addOption(server);
        __CLR4_5_218o18olvn1n6c2.R.inc(1686);options.addOption(numResults);
        __CLR4_5_218o18olvn1n6c2.R.inc(1687);options.addOption(configFile);

        // create the command line parser
        __CLR4_5_218o18olvn1n6c2.R.inc(1688);CommandLineParser parser = new PosixParser();

        __CLR4_5_218o18olvn1n6c2.R.inc(1689);String[] args = new String[] {
                "-v",
                "-l",
                "10",
                "-age",
                "5",
                "-file",
                "filename"
            };

        __CLR4_5_218o18olvn1n6c2.R.inc(1690);CommandLine line = parser.parse(options, args);
        __CLR4_5_218o18olvn1n6c2.R.inc(1691);assertTrue(line.hasOption("v"));
        __CLR4_5_218o18olvn1n6c2.R.inc(1692);assertEquals(line.getOptionValue("l"), "10");
        __CLR4_5_218o18olvn1n6c2.R.inc(1693);assertEquals(line.getOptionValue("limit"), "10");
        __CLR4_5_218o18olvn1n6c2.R.inc(1694);assertEquals(line.getOptionValue("a"), "5");
        __CLR4_5_218o18olvn1n6c2.R.inc(1695);assertEquals(line.getOptionValue("age"), "5");
        __CLR4_5_218o18olvn1n6c2.R.inc(1696);assertEquals(line.getOptionValue("file"), "filename");
    }finally{__CLR4_5_218o18olvn1n6c2.R.flushNeeded();}}
}
