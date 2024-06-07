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
 * <p>
 * This is a collection of tests that test real world
 * applications command lines.
 * </p>
 * 
 * <p>
 * The following are the applications that are tested:
 * <ul>
 * <li>Ant</li>
 * </ul>
 * </p>
 *
 * @author John Keyes (john at integralsource.com)
 */
public class ApplicationTest extends TestCase {static class __CLR4_5_2z5z5lvl2txqt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402243997L,8589935092L,1303,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void testLs() throws Exception {__CLR4_5_2z5z5lvl2txqt.R.globalSliceStart(getClass().getName(),1265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2evwn4wz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z5z5lvl2txqt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z5z5lvl2txqt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ApplicationTest.testLs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2evwn4wz5() throws Exception{try{__CLR4_5_2z5z5lvl2txqt.R.inc(1265);
        // create the command line parser
        __CLR4_5_2z5z5lvl2txqt.R.inc(1266);CommandLineParser parser = new PosixParser();
        __CLR4_5_2z5z5lvl2txqt.R.inc(1267);Options options = new Options();
        __CLR4_5_2z5z5lvl2txqt.R.inc(1268);options.addOption( "a", "all", false, "do not hide entries starting with ." );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1269);options.addOption( "A", "almost-all", false, "do not list implied . and .." );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1270);options.addOption( "b", "escape", false, "print octal escapes for nongraphic characters" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1271);options.addOption( OptionBuilder.withLongOpt( "block-size" )
                                        .withDescription( "use SIZE-byte blocks" )
                                        .withValueSeparator( '=' )
                                        .hasArg()
                                        .create() );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1272);options.addOption( "B", "ignore-backups", false, "do not list implied entried ending with ~");
        __CLR4_5_2z5z5lvl2txqt.R.inc(1273);options.addOption( "c", false, "with -lt: sort by, and show, ctime (time of last modification of file status information) with -l:show ctime and sort by name otherwise: sort by ctime" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1274);options.addOption( "C", false, "list entries by columns" );

        __CLR4_5_2z5z5lvl2txqt.R.inc(1275);String[] args = new String[]{ "--block-size=10" };

        __CLR4_5_2z5z5lvl2txqt.R.inc(1276);CommandLine line = parser.parse( options, args );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1277);assertTrue( line.hasOption( "block-size" ) );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1278);assertEquals( line.getOptionValue( "block-size" ), "10" );
    }finally{__CLR4_5_2z5z5lvl2txqt.R.flushNeeded();}}

    /**
     * Ant test
     */
    public void testAnt() throws Exception {__CLR4_5_2z5z5lvl2txqt.R.globalSliceStart(getClass().getName(),1279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2puxg9ozj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z5z5lvl2txqt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z5z5lvl2txqt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.ApplicationTest.testAnt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1279,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2puxg9ozj() throws Exception{try{__CLR4_5_2z5z5lvl2txqt.R.inc(1279);
        // use the GNU parser
        __CLR4_5_2z5z5lvl2txqt.R.inc(1280);CommandLineParser parser = new GnuParser( );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1281);Options options = new Options();
        __CLR4_5_2z5z5lvl2txqt.R.inc(1282);options.addOption( "help", false, "print this message" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1283);options.addOption( "projecthelp", false, "print project help information" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1284);options.addOption( "version", false, "print the version information and exit" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1285);options.addOption( "quiet", false, "be extra quiet" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1286);options.addOption( "verbose", false, "be extra verbose" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1287);options.addOption( "debug", false, "print debug information" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1288);options.addOption( "logfile", true, "use given file for log" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1289);options.addOption( "logger", true, "the class which is to perform the logging" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1290);options.addOption( "listener", true, "add an instance of a class as a project listener" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1291);options.addOption( "buildfile", true, "use given buildfile" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1292);options.addOption( OptionBuilder.withDescription( "use value for given property" )
                                        .hasArgs()
                                        .withValueSeparator()
                                        .create( 'D' ) );
                           //, null, true, , false, true );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1293);options.addOption( "find", true, "search for buildfile towards the root of the filesystem and use it" );

        __CLR4_5_2z5z5lvl2txqt.R.inc(1294);String[] args = new String[]{ "-buildfile", "mybuild.xml",
            "-Dproperty=value", "-Dproperty1=value1",
            "-projecthelp" };

        __CLR4_5_2z5z5lvl2txqt.R.inc(1295);CommandLine line = parser.parse( options, args );

        // check multiple values
        __CLR4_5_2z5z5lvl2txqt.R.inc(1296);String[] opts = line.getOptionValues( "D" );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1297);assertEquals( "property", opts[0] );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1298);assertEquals( "value", opts[1] );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1299);assertEquals( "property1", opts[2] );
        __CLR4_5_2z5z5lvl2txqt.R.inc(1300);assertEquals( "value1", opts[3] );

        // check single value
        __CLR4_5_2z5z5lvl2txqt.R.inc(1301);assertEquals( line.getOptionValue( "buildfile"), "mybuild.xml" );

        // check option
        __CLR4_5_2z5z5lvl2txqt.R.inc(1302);assertTrue( line.hasOption( "projecthelp") );
    }finally{__CLR4_5_2z5z5lvl2txqt.R.flushNeeded();}}

}
