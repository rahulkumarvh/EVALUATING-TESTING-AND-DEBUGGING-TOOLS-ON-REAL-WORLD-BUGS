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
import java.util.List;
import java.util.Properties;

import junit.framework.TestCase;

@java.lang.SuppressWarnings({"fallthrough"}) public class BugsTest extends TestCase
{static class __CLR4_5_2114114lvl36xup{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402850486L,8589935092L,1555,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test11457() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvm9ez114();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11457",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvm9ez114() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1336);
        __CLR4_5_2114114lvl36xup.R.inc(1337);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1338);options.addOption(OptionBuilder.withLongOpt("verbose").create());
        __CLR4_5_2114114lvl36xup.R.inc(1339);String[] args = new String[]{"--verbose"};

        __CLR4_5_2114114lvl36xup.R.inc(1340);CommandLineParser parser = new PosixParser();

        __CLR4_5_2114114lvl36xup.R.inc(1341);CommandLine cmd = parser.parse(options, args);
        __CLR4_5_2114114lvl36xup.R.inc(1342);assertTrue(cmd.hasOption("verbose"));
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test11458() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wwhtro11b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11458",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1343,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wwhtro11b() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1343);
        __CLR4_5_2114114lvl36xup.R.inc(1344);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1345);options.addOption( OptionBuilder.withValueSeparator( '=' ).hasArgs().create( 'D' ) );
        __CLR4_5_2114114lvl36xup.R.inc(1346);options.addOption( OptionBuilder.withValueSeparator( ':' ).hasArgs().create( 'p' ) );
        __CLR4_5_2114114lvl36xup.R.inc(1347);String[] args = new String[] { "-DJAVA_HOME=/opt/java" , "-pfile1:file2:file3" };

        __CLR4_5_2114114lvl36xup.R.inc(1348);CommandLineParser parser = new PosixParser();

        __CLR4_5_2114114lvl36xup.R.inc(1349);CommandLine cmd = parser.parse(options, args);

        __CLR4_5_2114114lvl36xup.R.inc(1350);String[] values = cmd.getOptionValues('D');

        __CLR4_5_2114114lvl36xup.R.inc(1351);assertEquals(values[0], "JAVA_HOME");
        __CLR4_5_2114114lvl36xup.R.inc(1352);assertEquals(values[1], "/opt/java");

        __CLR4_5_2114114lvl36xup.R.inc(1353);values = cmd.getOptionValues('p');

        __CLR4_5_2114114lvl36xup.R.inc(1354);assertEquals(values[0], "file1");
        __CLR4_5_2114114lvl36xup.R.inc(1355);assertEquals(values[1], "file2");
        __CLR4_5_2114114lvl36xup.R.inc(1356);assertEquals(values[2], "file3");

        __CLR4_5_2114114lvl36xup.R.inc(1357);Iterator iter = cmd.iterator();
        __CLR4_5_2114114lvl36xup.R.inc(1358);while ((((iter.hasNext())&&(__CLR4_5_2114114lvl36xup.R.iget(1359)!=0|true))||(__CLR4_5_2114114lvl36xup.R.iget(1360)==0&false)))
        {{
            __CLR4_5_2114114lvl36xup.R.inc(1361);Option opt = (Option) iter.next();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2114114lvl36xup.R.inc(1362);switch (opt.getId())
            {
                case 'D':if (!__CLB4_5_2_bool0) {__CLR4_5_2114114lvl36xup.R.inc(1363);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2114114lvl36xup.R.inc(1364);assertEquals(opt.getValue(0), "JAVA_HOME");
                    __CLR4_5_2114114lvl36xup.R.inc(1365);assertEquals(opt.getValue(1), "/opt/java");
                    __CLR4_5_2114114lvl36xup.R.inc(1366);break;
                case 'p':if (!__CLB4_5_2_bool0) {__CLR4_5_2114114lvl36xup.R.inc(1367);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2114114lvl36xup.R.inc(1368);assertEquals(opt.getValue(0), "file1");
                    __CLR4_5_2114114lvl36xup.R.inc(1369);assertEquals(opt.getValue(1), "file2");
                    __CLR4_5_2114114lvl36xup.R.inc(1370);assertEquals(opt.getValue(2), "file3");
                    __CLR4_5_2114114lvl36xup.R.inc(1371);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2114114lvl36xup.R.inc(1372);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2114114lvl36xup.R.inc(1373);fail("-D option not found");
            }
        }
    }}finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test11680() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzdrsz126();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11680",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1374,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzdrsz126() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1374);
        __CLR4_5_2114114lvl36xup.R.inc(1375);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1376);options.addOption("f", true, "foobar");
        __CLR4_5_2114114lvl36xup.R.inc(1377);options.addOption("m", true, "missing");
        __CLR4_5_2114114lvl36xup.R.inc(1378);String[] args = new String[]{"-f", "foo"};

        __CLR4_5_2114114lvl36xup.R.inc(1379);CommandLineParser parser = new PosixParser();

        __CLR4_5_2114114lvl36xup.R.inc(1380);CommandLine cmd = parser.parse(options, args);

        __CLR4_5_2114114lvl36xup.R.inc(1381);cmd.getOptionValue("f", "default f");
        __CLR4_5_2114114lvl36xup.R.inc(1382);cmd.getOptionValue("m", "default m");
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test11456() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vmmami12f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11456",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1383,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vmmami12f() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1383);
        // Posix 
        __CLR4_5_2114114lvl36xup.R.inc(1384);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1385);options.addOption( OptionBuilder.hasOptionalArg().create( 'a' ) );
        __CLR4_5_2114114lvl36xup.R.inc(1386);options.addOption( OptionBuilder.hasArg().create( 'b' ) );
        __CLR4_5_2114114lvl36xup.R.inc(1387);String[] args = new String[] { "-a", "-bvalue" };

        __CLR4_5_2114114lvl36xup.R.inc(1388);CommandLineParser parser = new PosixParser();

        __CLR4_5_2114114lvl36xup.R.inc(1389);CommandLine cmd = parser.parse( options, args );
        __CLR4_5_2114114lvl36xup.R.inc(1390);assertEquals( cmd.getOptionValue( 'b' ), "value" );

        // GNU
        __CLR4_5_2114114lvl36xup.R.inc(1391);options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1392);options.addOption( OptionBuilder.hasOptionalArg().create( 'a' ) );
        __CLR4_5_2114114lvl36xup.R.inc(1393);options.addOption( OptionBuilder.hasArg().create( 'b' ) );
        __CLR4_5_2114114lvl36xup.R.inc(1394);args = new String[] { "-a", "-b", "value" };

        __CLR4_5_2114114lvl36xup.R.inc(1395);parser = new GnuParser();

        __CLR4_5_2114114lvl36xup.R.inc(1396);cmd = parser.parse( options, args );
        __CLR4_5_2114114lvl36xup.R.inc(1397);assertEquals( cmd.getOptionValue( 'b' ), "value" );
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test12210() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qlb1dn12u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test12210",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qlb1dn12u() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1398);
        // create the main options object which will handle the first parameter
        __CLR4_5_2114114lvl36xup.R.inc(1399);Options mainOptions = new Options();
        // There can be 2 main exclusive options:  -exec|-rep

        // Therefore, place them in an option group

        __CLR4_5_2114114lvl36xup.R.inc(1400);String[] argv = new String[] { "-exec", "-exec_opt1", "-exec_opt2" };
        __CLR4_5_2114114lvl36xup.R.inc(1401);OptionGroup grp = new OptionGroup();

        __CLR4_5_2114114lvl36xup.R.inc(1402);grp.addOption(new Option("exec",false,"description for this option"));

        __CLR4_5_2114114lvl36xup.R.inc(1403);grp.addOption(new Option("rep",false,"description for this option"));

        __CLR4_5_2114114lvl36xup.R.inc(1404);mainOptions.addOptionGroup(grp);

        // for the exec option, there are 2 options...
        __CLR4_5_2114114lvl36xup.R.inc(1405);Options execOptions = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1406);execOptions.addOption("exec_opt1", false, " desc");
        __CLR4_5_2114114lvl36xup.R.inc(1407);execOptions.addOption("exec_opt2", false, " desc");

        // similarly, for rep there are 2 options...
        __CLR4_5_2114114lvl36xup.R.inc(1408);Options repOptions = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1409);repOptions.addOption("repopto", false, "desc");
        __CLR4_5_2114114lvl36xup.R.inc(1410);repOptions.addOption("repoptt", false, "desc");

        // create the parser
        __CLR4_5_2114114lvl36xup.R.inc(1411);GnuParser parser = new GnuParser();

        // finally, parse the arguments:

        // first parse the main options to see what the user has specified
        // We set stopAtNonOption to true so it does not touch the remaining
        // options
        __CLR4_5_2114114lvl36xup.R.inc(1412);CommandLine cmd = parser.parse(mainOptions,argv,true);
        // get the remaining options...
        __CLR4_5_2114114lvl36xup.R.inc(1413);argv = cmd.getArgs();

        __CLR4_5_2114114lvl36xup.R.inc(1414);if((((cmd.hasOption("exec"))&&(__CLR4_5_2114114lvl36xup.R.iget(1415)!=0|true))||(__CLR4_5_2114114lvl36xup.R.iget(1416)==0&false)))
        {{
            __CLR4_5_2114114lvl36xup.R.inc(1417);cmd = parser.parse(execOptions,argv,false);
            // process the exec_op1 and exec_opt2...
            __CLR4_5_2114114lvl36xup.R.inc(1418);assertTrue( cmd.hasOption("exec_opt1") );
            __CLR4_5_2114114lvl36xup.R.inc(1419);assertTrue( cmd.hasOption("exec_opt2") );
        }
        }else {__CLR4_5_2114114lvl36xup.R.inc(1420);if((((cmd.hasOption("rep"))&&(__CLR4_5_2114114lvl36xup.R.iget(1421)!=0|true))||(__CLR4_5_2114114lvl36xup.R.iget(1422)==0&false)))
        {{
            __CLR4_5_2114114lvl36xup.R.inc(1423);cmd = parser.parse(repOptions,argv,false);
            // process the rep_op1 and rep_opt2...
        }
        }else {{
            __CLR4_5_2114114lvl36xup.R.inc(1424);fail( "exec option not found" );
        }
    }}}finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test13425() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jyiylm13l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13425",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jyiylm13l() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1425);
        __CLR4_5_2114114lvl36xup.R.inc(1426);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1427);Option oldpass = OptionBuilder.withLongOpt( "old-password" )
            .withDescription( "Use this option to specify the old password" )
            .hasArg()
            .create( 'o' );
        __CLR4_5_2114114lvl36xup.R.inc(1428);Option newpass = OptionBuilder.withLongOpt( "new-password" )
            .withDescription( "Use this option to specify the new password" )
            .hasArg()
            .create( 'n' );

        __CLR4_5_2114114lvl36xup.R.inc(1429);String[] args = { 
            "-o", 
            "-n", 
            "newpassword" 
        };

        __CLR4_5_2114114lvl36xup.R.inc(1430);options.addOption( oldpass );
        __CLR4_5_2114114lvl36xup.R.inc(1431);options.addOption( newpass );

        __CLR4_5_2114114lvl36xup.R.inc(1432);Parser parser = new PosixParser();

        __CLR4_5_2114114lvl36xup.R.inc(1433);try
        {
            __CLR4_5_2114114lvl36xup.R.inc(1434);parser.parse( options, args );
        }
        // catch the exception and leave the method
        catch( Exception exp )
        {
            __CLR4_5_2114114lvl36xup.R.inc(1435);assertTrue( exp != null );
            __CLR4_5_2114114lvl36xup.R.inc(1436);return;
        }
        __CLR4_5_2114114lvl36xup.R.inc(1437);fail( "MissingArgumentException not caught." );
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test13666() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_248yy4713y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13666",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_248yy4713y() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1438);
        __CLR4_5_2114114lvl36xup.R.inc(1439);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1440);Option dir = OptionBuilder.withDescription( "dir" ).hasArg().create( 'd' );
        __CLR4_5_2114114lvl36xup.R.inc(1441);options.addOption( dir );
        
        __CLR4_5_2114114lvl36xup.R.inc(1442);final PrintStream oldSystemOut = System.out;
        __CLR4_5_2114114lvl36xup.R.inc(1443);try
        {
            __CLR4_5_2114114lvl36xup.R.inc(1444);final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            __CLR4_5_2114114lvl36xup.R.inc(1445);final PrintStream print = new PrintStream(bytes);
            
            // capture this platform's eol symbol
            __CLR4_5_2114114lvl36xup.R.inc(1446);print.println();
            __CLR4_5_2114114lvl36xup.R.inc(1447);final String eol = bytes.toString();
            __CLR4_5_2114114lvl36xup.R.inc(1448);bytes.reset();
            
            __CLR4_5_2114114lvl36xup.R.inc(1449);System.setOut(new PrintStream(bytes));

            __CLR4_5_2114114lvl36xup.R.inc(1450);HelpFormatter formatter = new HelpFormatter();
            __CLR4_5_2114114lvl36xup.R.inc(1451);formatter.printHelp( "dir", options );

            __CLR4_5_2114114lvl36xup.R.inc(1452);assertEquals("usage: dir"+eol+" -d <arg>   dir"+eol,bytes.toString());
        }
        finally
        {
            __CLR4_5_2114114lvl36xup.R.inc(1453);System.setOut(oldSystemOut);
        }
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test13935() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0zn5e14e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13935",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0zn5e14e() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1454);
        __CLR4_5_2114114lvl36xup.R.inc(1455);OptionGroup directions = new OptionGroup();

        __CLR4_5_2114114lvl36xup.R.inc(1456);Option left = new Option( "l", "left", false, "go left" );
        __CLR4_5_2114114lvl36xup.R.inc(1457);Option right = new Option( "r", "right", false, "go right" );
        __CLR4_5_2114114lvl36xup.R.inc(1458);Option straight = new Option( "s", "straight", false, "go straight" );
        __CLR4_5_2114114lvl36xup.R.inc(1459);Option forward = new Option( "f", "forward", false, "go forward" );
        __CLR4_5_2114114lvl36xup.R.inc(1460);forward.setRequired( true );

        __CLR4_5_2114114lvl36xup.R.inc(1461);directions.addOption( left );
        __CLR4_5_2114114lvl36xup.R.inc(1462);directions.addOption( right );
        __CLR4_5_2114114lvl36xup.R.inc(1463);directions.setRequired( true );

        __CLR4_5_2114114lvl36xup.R.inc(1464);Options opts = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1465);opts.addOptionGroup( directions );
        __CLR4_5_2114114lvl36xup.R.inc(1466);opts.addOption( straight );

        __CLR4_5_2114114lvl36xup.R.inc(1467);CommandLineParser parser = new PosixParser();
        __CLR4_5_2114114lvl36xup.R.inc(1468);boolean exception = false;

        __CLR4_5_2114114lvl36xup.R.inc(1469);String[] args = new String[] {  };
        __CLR4_5_2114114lvl36xup.R.inc(1470);try
        {
            __CLR4_5_2114114lvl36xup.R.inc(1471);CommandLine line = parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_2114114lvl36xup.R.inc(1472);exception = true;
        }

        __CLR4_5_2114114lvl36xup.R.inc(1473);if ((((!exception)&&(__CLR4_5_2114114lvl36xup.R.iget(1474)!=0|true))||(__CLR4_5_2114114lvl36xup.R.iget(1475)==0&false)))
        {{
            __CLR4_5_2114114lvl36xup.R.inc(1476);fail("Expected exception not caught.");
        }

        }__CLR4_5_2114114lvl36xup.R.inc(1477);exception = false;

        __CLR4_5_2114114lvl36xup.R.inc(1478);args = new String[] { "-s" };
        __CLR4_5_2114114lvl36xup.R.inc(1479);try
        {
            __CLR4_5_2114114lvl36xup.R.inc(1480);CommandLine line = parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_2114114lvl36xup.R.inc(1481);exception = true;
        }

        __CLR4_5_2114114lvl36xup.R.inc(1482);if ((((!exception)&&(__CLR4_5_2114114lvl36xup.R.iget(1483)!=0|true))||(__CLR4_5_2114114lvl36xup.R.iget(1484)==0&false)))
        {{
            __CLR4_5_2114114lvl36xup.R.inc(1485);fail("Expected exception not caught.");
        }

        }__CLR4_5_2114114lvl36xup.R.inc(1486);exception = false;

        __CLR4_5_2114114lvl36xup.R.inc(1487);args = new String[] { "-s", "-l" };
        __CLR4_5_2114114lvl36xup.R.inc(1488);try
        {
            __CLR4_5_2114114lvl36xup.R.inc(1489);parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_2114114lvl36xup.R.inc(1490);fail("Unexpected exception: " + exp.getClass().getName() + ":" + exp.getMessage());
        }

        __CLR4_5_2114114lvl36xup.R.inc(1491);opts.addOption( forward );
        __CLR4_5_2114114lvl36xup.R.inc(1492);args = new String[] { "-s", "-l", "-f" };
        __CLR4_5_2114114lvl36xup.R.inc(1493);try
        {
            __CLR4_5_2114114lvl36xup.R.inc(1494);parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_2114114lvl36xup.R.inc(1495);fail("Unexpected exception: " + exp.getClass().getName() + ":" + exp.getMessage());
        }
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test14786() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d4j8nt15k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test14786",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d4j8nt15k() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1496);
        __CLR4_5_2114114lvl36xup.R.inc(1497);Option o = OptionBuilder.isRequired().withDescription("test").create("test");
        __CLR4_5_2114114lvl36xup.R.inc(1498);Options opts = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1499);opts.addOption(o);
        __CLR4_5_2114114lvl36xup.R.inc(1500);opts.addOption(o);

        __CLR4_5_2114114lvl36xup.R.inc(1501);CommandLineParser parser = new GnuParser();

        __CLR4_5_2114114lvl36xup.R.inc(1502);String[] args = new String[] { "-test" };

        __CLR4_5_2114114lvl36xup.R.inc(1503);CommandLine line = parser.parse( opts, args );
        __CLR4_5_2114114lvl36xup.R.inc(1504);assertTrue( line.hasOption( "test" ) );
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test15046() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuwqdf15t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test15046",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuwqdf15t() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1505);
        __CLR4_5_2114114lvl36xup.R.inc(1506);CommandLineParser parser = new PosixParser();
        __CLR4_5_2114114lvl36xup.R.inc(1507);String[] CLI_ARGS = new String[] {"-z", "c"};

        __CLR4_5_2114114lvl36xup.R.inc(1508);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1509);options.addOption(new Option("z", "timezone", true, "affected option"));

        __CLR4_5_2114114lvl36xup.R.inc(1510);parser.parse(options, CLI_ARGS);
        
        //now add conflicting option
        __CLR4_5_2114114lvl36xup.R.inc(1511);options.addOption("c", "conflict", true, "conflict option");
        __CLR4_5_2114114lvl36xup.R.inc(1512);CommandLine line = parser.parse(options, CLI_ARGS);
        __CLR4_5_2114114lvl36xup.R.inc(1513);assertEquals( line.getOptionValue('z'), "c" );
        __CLR4_5_2114114lvl36xup.R.inc(1514);assertTrue( !line.hasOption("c") );
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test15648() throws Exception
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2njsirv163();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test15648",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1515,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2njsirv163() throws Exception{try{__CLR4_5_2114114lvl36xup.R.inc(1515);
        __CLR4_5_2114114lvl36xup.R.inc(1516);CommandLineParser parser = new PosixParser();
        __CLR4_5_2114114lvl36xup.R.inc(1517);final String[] args = new String[] { "-m", "\"Two Words\"" };
        __CLR4_5_2114114lvl36xup.R.inc(1518);Option m = OptionBuilder.hasArgs().create("m");
        __CLR4_5_2114114lvl36xup.R.inc(1519);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1520);options.addOption( m );
        __CLR4_5_2114114lvl36xup.R.inc(1521);CommandLine line = parser.parse( options, args );
        __CLR4_5_2114114lvl36xup.R.inc(1522);assertEquals( "Two Words", line.getOptionValue( "m" ) );
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

    public void test27635() {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_225avt416b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test27635",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1523,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_225avt416b(){try{__CLR4_5_2114114lvl36xup.R.inc(1523);}finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}
// Defects4J: flaky method
//     public void test27635()
//     {
//         Option help = new Option("h", "help", false, "print this message");
//         Option version = new Option("v", "version", false, "print version information");
//         Option newRun = new Option("n", "new", false, "Create NLT cache entries only for new items");
//         Option trackerRun = new Option("t", "tracker", false, "Create NLT cache entries only for tracker items");
//         
//         Option timeLimit = OptionBuilder.withLongOpt("limit")
//                                         .hasArg()
//                                         .withValueSeparator()
//                                         .withDescription("Set time limit for execution, in mintues")
//                                         .create("l");
//         
//         Option age = OptionBuilder.withLongOpt("age")
//                                         .hasArg()
//                                         .withValueSeparator()
//                                         .withDescription("Age (in days) of cache item before being recomputed")
//                                         .create("a");
//         
//         Option server = OptionBuilder.withLongOpt("server")
//                                         .hasArg()
//                                         .withValueSeparator()
//                                         .withDescription("The NLT server address")
//                                         .create("s");
//         
//         Option numResults = OptionBuilder.withLongOpt("results")
//                                         .hasArg()
//                                         .withValueSeparator()
//                                         .withDescription("Number of results per item")
//                                         .create("r");
//         
//         Option configFile = OptionBuilder.withLongOpt("config")
//                                         .hasArg()
//                                         .withValueSeparator()
//                                         .withDescription("Use the specified configuration file")
//                                         .create();
//         
//         Options mOptions = new Options();
//         mOptions.addOption(help);
//         mOptions.addOption(version);
//         mOptions.addOption(newRun);
//         mOptions.addOption(trackerRun);
//         mOptions.addOption(timeLimit);
//         mOptions.addOption(age);
//         mOptions.addOption(server);
//         mOptions.addOption(numResults);
//         mOptions.addOption(configFile);
//         
//         HelpFormatter formatter = new HelpFormatter();
//         final String EOL = System.getProperty("line.separator");
//         StringWriter out = new StringWriter();
//         formatter.printHelp(new PrintWriter(out),80,"commandline","header",mOptions,2,2,"footer",true);
//         assertEquals(
//                 "usage: commandline [-a <arg>] [--config <arg>] [-h] [-l <arg>] [-n] [-r <arg>]" + EOL +
//                 "       [-s <arg>] [-t] [-v]" + EOL +
//                 "header"+EOL+
//                 "  -a,--age <arg>      Age (in days) of cache item before being recomputed"+EOL+
//                 "     --config <arg>   Use the specified configuration file"+EOL+
//                 "  -h,--help           print this message"+EOL+
//                 "  -l,--limit <arg>    Set time limit for execution, in mintues"+EOL+
//                 "  -n,--new            Create NLT cache entries only for new items"+EOL+
//                 "  -r,--results <arg>  Number of results per item"+EOL+
//                 "  -s,--server <arg>   The NLT server address"+EOL+
//                 "  -t,--tracker        Create NLT cache entries only for tracker items"+EOL+
//                 "  -v,--version        print version information"+EOL+
//                 "footer"+EOL
//                 ,out.toString());
//     }
    
    public void test31148() throws ParseException
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vjb5bg16c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test31148",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1524,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vjb5bg16c() throws ParseException{try{__CLR4_5_2114114lvl36xup.R.inc(1524);
        __CLR4_5_2114114lvl36xup.R.inc(1525);Option multiArgOption = new Option("o","option with multiple args");
        __CLR4_5_2114114lvl36xup.R.inc(1526);multiArgOption.setArgs(1);
        
        __CLR4_5_2114114lvl36xup.R.inc(1527);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1528);options.addOption(multiArgOption);
        
        __CLR4_5_2114114lvl36xup.R.inc(1529);Parser parser = new PosixParser();
        __CLR4_5_2114114lvl36xup.R.inc(1530);String[] args = new String[]{};
        __CLR4_5_2114114lvl36xup.R.inc(1531);Properties props = new Properties();
        __CLR4_5_2114114lvl36xup.R.inc(1532);props.setProperty("o","ovalue");
        __CLR4_5_2114114lvl36xup.R.inc(1533);CommandLine cl = parser.parse(options,args,props);
        
        __CLR4_5_2114114lvl36xup.R.inc(1534);assertTrue(cl.hasOption('o'));
        __CLR4_5_2114114lvl36xup.R.inc(1535);assertEquals("ovalue",cl.getOptionValue('o'));
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}
    
    public void test21215()
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26tzz3o16o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test21215",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26tzz3o16o(){try{__CLR4_5_2114114lvl36xup.R.inc(1536);
        __CLR4_5_2114114lvl36xup.R.inc(1537);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1538);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_2114114lvl36xup.R.inc(1539);String SEP = System.getProperty("line.separator");
        __CLR4_5_2114114lvl36xup.R.inc(1540);String header = SEP+"Header";
        __CLR4_5_2114114lvl36xup.R.inc(1541);String footer = "Footer";
        __CLR4_5_2114114lvl36xup.R.inc(1542);StringWriter out = new StringWriter();
        __CLR4_5_2114114lvl36xup.R.inc(1543);formatter.printHelp(new PrintWriter(out),80, "foobar", header, options, 2, 2, footer, true);
        __CLR4_5_2114114lvl36xup.R.inc(1544);assertEquals(
                "usage: foobar"+SEP+
                ""+SEP+
                "Header"+SEP+
                ""+SEP+
                "Footer"+SEP
                ,out.toString());
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}
    
    public void test19383()
    {__CLR4_5_2114114lvl36xup.R.globalSliceStart(getClass().getName(),1545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29xaugr16x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2114114lvl36xup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2114114lvl36xup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test19383",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1545,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29xaugr16x(){try{__CLR4_5_2114114lvl36xup.R.inc(1545);
        __CLR4_5_2114114lvl36xup.R.inc(1546);Options options = new Options();
        __CLR4_5_2114114lvl36xup.R.inc(1547);options.addOption(new Option("a","aaa",false,"aaaaaaa"));
        __CLR4_5_2114114lvl36xup.R.inc(1548);options.addOption(new Option(null,"bbb",false,"bbbbbbb"));
        __CLR4_5_2114114lvl36xup.R.inc(1549);options.addOption(new Option("c",null,false,"ccccccc"));
        
        __CLR4_5_2114114lvl36xup.R.inc(1550);HelpFormatter formatter = new HelpFormatter();
        __CLR4_5_2114114lvl36xup.R.inc(1551);String SEP = System.getProperty("line.separator");
        __CLR4_5_2114114lvl36xup.R.inc(1552);StringWriter out = new StringWriter();
        __CLR4_5_2114114lvl36xup.R.inc(1553);formatter.printHelp(new PrintWriter(out),80, "foobar", "", options, 2, 2, "", true);
        __CLR4_5_2114114lvl36xup.R.inc(1554);assertEquals(
                "usage: foobar [-a] [--bbb] [-c]"+SEP+
                "  -a,--aaa  aaaaaaa"+SEP+
                "     --bbb  bbbbbbb"+SEP+
                "  -c        ccccccc"+SEP
                ,out.toString());
    }finally{__CLR4_5_2114114lvl36xup.R.flushNeeded();}}

}
