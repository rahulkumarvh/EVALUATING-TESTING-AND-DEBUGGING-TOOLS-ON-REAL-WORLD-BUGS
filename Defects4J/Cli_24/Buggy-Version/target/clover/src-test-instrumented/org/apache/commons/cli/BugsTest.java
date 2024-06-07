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
{static class __CLR4_5_211l11llvn1lj1w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521104441L,8589935092L,1553,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test11457() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvm9ez11l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11457",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvm9ez11l() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1353);
        __CLR4_5_211l11llvn1lj1w.R.inc(1354);Options options = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1355);options.addOption(OptionBuilder.withLongOpt("verbose").create());
        __CLR4_5_211l11llvn1lj1w.R.inc(1356);String[] args = new String[]{"--verbose"};

        __CLR4_5_211l11llvn1lj1w.R.inc(1357);CommandLineParser parser = new PosixParser();

        __CLR4_5_211l11llvn1lj1w.R.inc(1358);CommandLine cmd = parser.parse(options, args);
        __CLR4_5_211l11llvn1lj1w.R.inc(1359);assertTrue(cmd.hasOption("verbose"));
    }finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}

    public void test11458() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wwhtro11s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11458",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wwhtro11s() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1360);
        __CLR4_5_211l11llvn1lj1w.R.inc(1361);Options options = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1362);options.addOption( OptionBuilder.withValueSeparator( '=' ).hasArgs().create( 'D' ) );
        __CLR4_5_211l11llvn1lj1w.R.inc(1363);options.addOption( OptionBuilder.withValueSeparator( ':' ).hasArgs().create( 'p' ) );
        __CLR4_5_211l11llvn1lj1w.R.inc(1364);String[] args = new String[] { "-DJAVA_HOME=/opt/java" , "-pfile1:file2:file3" };

        __CLR4_5_211l11llvn1lj1w.R.inc(1365);CommandLineParser parser = new PosixParser();

        __CLR4_5_211l11llvn1lj1w.R.inc(1366);CommandLine cmd = parser.parse(options, args);

        __CLR4_5_211l11llvn1lj1w.R.inc(1367);String[] values = cmd.getOptionValues('D');

        __CLR4_5_211l11llvn1lj1w.R.inc(1368);assertEquals(values[0], "JAVA_HOME");
        __CLR4_5_211l11llvn1lj1w.R.inc(1369);assertEquals(values[1], "/opt/java");

        __CLR4_5_211l11llvn1lj1w.R.inc(1370);values = cmd.getOptionValues('p');

        __CLR4_5_211l11llvn1lj1w.R.inc(1371);assertEquals(values[0], "file1");
        __CLR4_5_211l11llvn1lj1w.R.inc(1372);assertEquals(values[1], "file2");
        __CLR4_5_211l11llvn1lj1w.R.inc(1373);assertEquals(values[2], "file3");

        __CLR4_5_211l11llvn1lj1w.R.inc(1374);Iterator iter = cmd.iterator();
        __CLR4_5_211l11llvn1lj1w.R.inc(1375);while ((((iter.hasNext())&&(__CLR4_5_211l11llvn1lj1w.R.iget(1376)!=0|true))||(__CLR4_5_211l11llvn1lj1w.R.iget(1377)==0&false)))
        {{
            __CLR4_5_211l11llvn1lj1w.R.inc(1378);Option opt = (Option) iter.next();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_211l11llvn1lj1w.R.inc(1379);switch (opt.getId())
            {
                case 'D':if (!__CLB4_5_2_bool0) {__CLR4_5_211l11llvn1lj1w.R.inc(1380);__CLB4_5_2_bool0=true;}
                    __CLR4_5_211l11llvn1lj1w.R.inc(1381);assertEquals(opt.getValue(0), "JAVA_HOME");
                    __CLR4_5_211l11llvn1lj1w.R.inc(1382);assertEquals(opt.getValue(1), "/opt/java");
                    __CLR4_5_211l11llvn1lj1w.R.inc(1383);break;
                case 'p':if (!__CLB4_5_2_bool0) {__CLR4_5_211l11llvn1lj1w.R.inc(1384);__CLB4_5_2_bool0=true;}
                    __CLR4_5_211l11llvn1lj1w.R.inc(1385);assertEquals(opt.getValue(0), "file1");
                    __CLR4_5_211l11llvn1lj1w.R.inc(1386);assertEquals(opt.getValue(1), "file2");
                    __CLR4_5_211l11llvn1lj1w.R.inc(1387);assertEquals(opt.getValue(2), "file3");
                    __CLR4_5_211l11llvn1lj1w.R.inc(1388);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_211l11llvn1lj1w.R.inc(1389);__CLB4_5_2_bool0=true;}
                    __CLR4_5_211l11llvn1lj1w.R.inc(1390);fail("-D option not found");
            }
        }
    }}finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}

    public void test11680() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzdrsz12n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11680",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzdrsz12n() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1391);
        __CLR4_5_211l11llvn1lj1w.R.inc(1392);Options options = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1393);options.addOption("f", true, "foobar");
        __CLR4_5_211l11llvn1lj1w.R.inc(1394);options.addOption("m", true, "missing");
        __CLR4_5_211l11llvn1lj1w.R.inc(1395);String[] args = new String[]{"-f", "foo"};

        __CLR4_5_211l11llvn1lj1w.R.inc(1396);CommandLineParser parser = new PosixParser();

        __CLR4_5_211l11llvn1lj1w.R.inc(1397);CommandLine cmd = parser.parse(options, args);

        __CLR4_5_211l11llvn1lj1w.R.inc(1398);cmd.getOptionValue("f", "default f");
        __CLR4_5_211l11llvn1lj1w.R.inc(1399);cmd.getOptionValue("m", "default m");
    }finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}

    public void test11456() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vmmami12w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test11456",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vmmami12w() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1400);
        // Posix 
        __CLR4_5_211l11llvn1lj1w.R.inc(1401);Options options = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1402);options.addOption( OptionBuilder.hasOptionalArg().create( 'a' ) );
        __CLR4_5_211l11llvn1lj1w.R.inc(1403);options.addOption( OptionBuilder.hasArg().create( 'b' ) );
        __CLR4_5_211l11llvn1lj1w.R.inc(1404);String[] args = new String[] { "-a", "-bvalue" };

        __CLR4_5_211l11llvn1lj1w.R.inc(1405);CommandLineParser parser = new PosixParser();

        __CLR4_5_211l11llvn1lj1w.R.inc(1406);CommandLine cmd = parser.parse( options, args );
        __CLR4_5_211l11llvn1lj1w.R.inc(1407);assertEquals( cmd.getOptionValue( 'b' ), "value" );

        // GNU
        __CLR4_5_211l11llvn1lj1w.R.inc(1408);options = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1409);options.addOption( OptionBuilder.hasOptionalArg().create( 'a' ) );
        __CLR4_5_211l11llvn1lj1w.R.inc(1410);options.addOption( OptionBuilder.hasArg().create( 'b' ) );
        __CLR4_5_211l11llvn1lj1w.R.inc(1411);args = new String[] { "-a", "-b", "value" };

        __CLR4_5_211l11llvn1lj1w.R.inc(1412);parser = new GnuParser();

        __CLR4_5_211l11llvn1lj1w.R.inc(1413);cmd = parser.parse( options, args );
        __CLR4_5_211l11llvn1lj1w.R.inc(1414);assertEquals( cmd.getOptionValue( 'b' ), "value" );
    }finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}

    public void test12210() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qlb1dn13b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test12210",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qlb1dn13b() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1415);
        // create the main options object which will handle the first parameter
        __CLR4_5_211l11llvn1lj1w.R.inc(1416);Options mainOptions = new Options();
        // There can be 2 main exclusive options:  -exec|-rep

        // Therefore, place them in an option group

        __CLR4_5_211l11llvn1lj1w.R.inc(1417);String[] argv = new String[] { "-exec", "-exec_opt1", "-exec_opt2" };
        __CLR4_5_211l11llvn1lj1w.R.inc(1418);OptionGroup grp = new OptionGroup();

        __CLR4_5_211l11llvn1lj1w.R.inc(1419);grp.addOption(new Option("exec",false,"description for this option"));

        __CLR4_5_211l11llvn1lj1w.R.inc(1420);grp.addOption(new Option("rep",false,"description for this option"));

        __CLR4_5_211l11llvn1lj1w.R.inc(1421);mainOptions.addOptionGroup(grp);

        // for the exec option, there are 2 options...
        __CLR4_5_211l11llvn1lj1w.R.inc(1422);Options execOptions = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1423);execOptions.addOption("exec_opt1", false, " desc");
        __CLR4_5_211l11llvn1lj1w.R.inc(1424);execOptions.addOption("exec_opt2", false, " desc");

        // similarly, for rep there are 2 options...
        __CLR4_5_211l11llvn1lj1w.R.inc(1425);Options repOptions = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1426);repOptions.addOption("repopto", false, "desc");
        __CLR4_5_211l11llvn1lj1w.R.inc(1427);repOptions.addOption("repoptt", false, "desc");

        // create the parser
        __CLR4_5_211l11llvn1lj1w.R.inc(1428);GnuParser parser = new GnuParser();

        // finally, parse the arguments:

        // first parse the main options to see what the user has specified
        // We set stopAtNonOption to true so it does not touch the remaining
        // options
        __CLR4_5_211l11llvn1lj1w.R.inc(1429);CommandLine cmd = parser.parse(mainOptions,argv,true);
        // get the remaining options...
        __CLR4_5_211l11llvn1lj1w.R.inc(1430);argv = cmd.getArgs();

        __CLR4_5_211l11llvn1lj1w.R.inc(1431);if((((cmd.hasOption("exec"))&&(__CLR4_5_211l11llvn1lj1w.R.iget(1432)!=0|true))||(__CLR4_5_211l11llvn1lj1w.R.iget(1433)==0&false)))
        {{
            __CLR4_5_211l11llvn1lj1w.R.inc(1434);cmd = parser.parse(execOptions,argv,false);
            // process the exec_op1 and exec_opt2...
            __CLR4_5_211l11llvn1lj1w.R.inc(1435);assertTrue( cmd.hasOption("exec_opt1") );
            __CLR4_5_211l11llvn1lj1w.R.inc(1436);assertTrue( cmd.hasOption("exec_opt2") );
        }
        }else {__CLR4_5_211l11llvn1lj1w.R.inc(1437);if((((cmd.hasOption("rep"))&&(__CLR4_5_211l11llvn1lj1w.R.iget(1438)!=0|true))||(__CLR4_5_211l11llvn1lj1w.R.iget(1439)==0&false)))
        {{
            __CLR4_5_211l11llvn1lj1w.R.inc(1440);cmd = parser.parse(repOptions,argv,false);
            // process the rep_op1 and rep_opt2...
        }
        }else {{
            __CLR4_5_211l11llvn1lj1w.R.inc(1441);fail( "exec option not found" );
        }
    }}}finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}

    public void test13425() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jyiylm142();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13425",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jyiylm142() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1442);
        __CLR4_5_211l11llvn1lj1w.R.inc(1443);Options options = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1444);Option oldpass = OptionBuilder.withLongOpt( "old-password" )
            .withDescription( "Use this option to specify the old password" )
            .hasArg()
            .create( 'o' );
        __CLR4_5_211l11llvn1lj1w.R.inc(1445);Option newpass = OptionBuilder.withLongOpt( "new-password" )
            .withDescription( "Use this option to specify the new password" )
            .hasArg()
            .create( 'n' );

        __CLR4_5_211l11llvn1lj1w.R.inc(1446);String[] args = { 
            "-o", 
            "-n", 
            "newpassword" 
        };

        __CLR4_5_211l11llvn1lj1w.R.inc(1447);options.addOption( oldpass );
        __CLR4_5_211l11llvn1lj1w.R.inc(1448);options.addOption( newpass );

        __CLR4_5_211l11llvn1lj1w.R.inc(1449);Parser parser = new PosixParser();

        __CLR4_5_211l11llvn1lj1w.R.inc(1450);try
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1451);parser.parse( options, args );
        }
        // catch the exception and leave the method
        catch( Exception exp )
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1452);assertTrue( exp != null );
            __CLR4_5_211l11llvn1lj1w.R.inc(1453);return;
        }
        __CLR4_5_211l11llvn1lj1w.R.inc(1454);fail( "MissingArgumentException not caught." );
    }finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}

    public void test13666() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_248yy4714f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13666",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_248yy4714f() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1455);
        __CLR4_5_211l11llvn1lj1w.R.inc(1456);Options options = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1457);Option dir = OptionBuilder.withDescription( "dir" ).hasArg().create( 'd' );
        __CLR4_5_211l11llvn1lj1w.R.inc(1458);options.addOption( dir );
        
        __CLR4_5_211l11llvn1lj1w.R.inc(1459);final PrintStream oldSystemOut = System.out;
        __CLR4_5_211l11llvn1lj1w.R.inc(1460);try
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1461);final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            __CLR4_5_211l11llvn1lj1w.R.inc(1462);final PrintStream print = new PrintStream(bytes);
            
            // capture this platform's eol symbol
            __CLR4_5_211l11llvn1lj1w.R.inc(1463);print.println();
            __CLR4_5_211l11llvn1lj1w.R.inc(1464);final String eol = bytes.toString();
            __CLR4_5_211l11llvn1lj1w.R.inc(1465);bytes.reset();
            
            __CLR4_5_211l11llvn1lj1w.R.inc(1466);System.setOut(new PrintStream(bytes));

            __CLR4_5_211l11llvn1lj1w.R.inc(1467);HelpFormatter formatter = new HelpFormatter();
            __CLR4_5_211l11llvn1lj1w.R.inc(1468);formatter.printHelp( "dir", options );

            __CLR4_5_211l11llvn1lj1w.R.inc(1469);assertEquals("usage: dir"+eol+" -d <arg>   dir"+eol,bytes.toString());
        }
        finally
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1470);System.setOut(oldSystemOut);
        }
    }finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}

    public void test13935() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0zn5e14v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test13935",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1471,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0zn5e14v() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1471);
        __CLR4_5_211l11llvn1lj1w.R.inc(1472);OptionGroup directions = new OptionGroup();

        __CLR4_5_211l11llvn1lj1w.R.inc(1473);Option left = new Option( "l", "left", false, "go left" );
        __CLR4_5_211l11llvn1lj1w.R.inc(1474);Option right = new Option( "r", "right", false, "go right" );
        __CLR4_5_211l11llvn1lj1w.R.inc(1475);Option straight = new Option( "s", "straight", false, "go straight" );
        __CLR4_5_211l11llvn1lj1w.R.inc(1476);Option forward = new Option( "f", "forward", false, "go forward" );
        __CLR4_5_211l11llvn1lj1w.R.inc(1477);forward.setRequired( true );

        __CLR4_5_211l11llvn1lj1w.R.inc(1478);directions.addOption( left );
        __CLR4_5_211l11llvn1lj1w.R.inc(1479);directions.addOption( right );
        __CLR4_5_211l11llvn1lj1w.R.inc(1480);directions.setRequired( true );

        __CLR4_5_211l11llvn1lj1w.R.inc(1481);Options opts = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1482);opts.addOptionGroup( directions );
        __CLR4_5_211l11llvn1lj1w.R.inc(1483);opts.addOption( straight );

        __CLR4_5_211l11llvn1lj1w.R.inc(1484);CommandLineParser parser = new PosixParser();
        __CLR4_5_211l11llvn1lj1w.R.inc(1485);boolean exception = false;

        __CLR4_5_211l11llvn1lj1w.R.inc(1486);String[] args = new String[] {  };
        __CLR4_5_211l11llvn1lj1w.R.inc(1487);try
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1488);CommandLine line = parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1489);exception = true;
        }

        __CLR4_5_211l11llvn1lj1w.R.inc(1490);if ((((!exception)&&(__CLR4_5_211l11llvn1lj1w.R.iget(1491)!=0|true))||(__CLR4_5_211l11llvn1lj1w.R.iget(1492)==0&false)))
        {{
            __CLR4_5_211l11llvn1lj1w.R.inc(1493);fail("Expected exception not caught.");
        }

        }__CLR4_5_211l11llvn1lj1w.R.inc(1494);exception = false;

        __CLR4_5_211l11llvn1lj1w.R.inc(1495);args = new String[] { "-s" };
        __CLR4_5_211l11llvn1lj1w.R.inc(1496);try
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1497);CommandLine line = parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1498);exception = true;
        }

        __CLR4_5_211l11llvn1lj1w.R.inc(1499);if ((((!exception)&&(__CLR4_5_211l11llvn1lj1w.R.iget(1500)!=0|true))||(__CLR4_5_211l11llvn1lj1w.R.iget(1501)==0&false)))
        {{
            __CLR4_5_211l11llvn1lj1w.R.inc(1502);fail("Expected exception not caught.");
        }

        }__CLR4_5_211l11llvn1lj1w.R.inc(1503);exception = false;

        __CLR4_5_211l11llvn1lj1w.R.inc(1504);args = new String[] { "-s", "-l" };
        __CLR4_5_211l11llvn1lj1w.R.inc(1505);try
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1506);parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1507);fail("Unexpected exception: " + exp.getClass().getName() + ":" + exp.getMessage());
        }

        __CLR4_5_211l11llvn1lj1w.R.inc(1508);opts.addOption( forward );
        __CLR4_5_211l11llvn1lj1w.R.inc(1509);args = new String[] { "-s", "-l", "-f" };
        __CLR4_5_211l11llvn1lj1w.R.inc(1510);try
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1511);parser.parse(opts, args);
        }
        catch (ParseException exp)
        {
            __CLR4_5_211l11llvn1lj1w.R.inc(1512);fail("Unexpected exception: " + exp.getClass().getName() + ":" + exp.getMessage());
        }
    }finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}

    public void test14786() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d4j8nt161();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test14786",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1513,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d4j8nt161() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1513);
        __CLR4_5_211l11llvn1lj1w.R.inc(1514);Option o = OptionBuilder.isRequired().withDescription("test").create("test");
        __CLR4_5_211l11llvn1lj1w.R.inc(1515);Options opts = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1516);opts.addOption(o);
        __CLR4_5_211l11llvn1lj1w.R.inc(1517);opts.addOption(o);

        __CLR4_5_211l11llvn1lj1w.R.inc(1518);CommandLineParser parser = new GnuParser();

        __CLR4_5_211l11llvn1lj1w.R.inc(1519);String[] args = new String[] { "-test" };

        __CLR4_5_211l11llvn1lj1w.R.inc(1520);CommandLine line = parser.parse( opts, args );
        __CLR4_5_211l11llvn1lj1w.R.inc(1521);assertTrue( line.hasOption( "test" ) );
    }finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}

    public void test15046() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuwqdf16a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test15046",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuwqdf16a() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1522);
        __CLR4_5_211l11llvn1lj1w.R.inc(1523);CommandLineParser parser = new PosixParser();
        __CLR4_5_211l11llvn1lj1w.R.inc(1524);String[] CLI_ARGS = new String[] {"-z", "c"};

        __CLR4_5_211l11llvn1lj1w.R.inc(1525);Options options = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1526);options.addOption(new Option("z", "timezone", true, "affected option"));

        __CLR4_5_211l11llvn1lj1w.R.inc(1527);parser.parse(options, CLI_ARGS);
        
        //now add conflicting option
        __CLR4_5_211l11llvn1lj1w.R.inc(1528);options.addOption("c", "conflict", true, "conflict option");
        __CLR4_5_211l11llvn1lj1w.R.inc(1529);CommandLine line = parser.parse(options, CLI_ARGS);
        __CLR4_5_211l11llvn1lj1w.R.inc(1530);assertEquals( line.getOptionValue('z'), "c" );
        __CLR4_5_211l11llvn1lj1w.R.inc(1531);assertTrue( !line.hasOption("c") );
    }finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}

    public void test15648() throws Exception
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2njsirv16k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test15648",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2njsirv16k() throws Exception{try{__CLR4_5_211l11llvn1lj1w.R.inc(1532);
        __CLR4_5_211l11llvn1lj1w.R.inc(1533);CommandLineParser parser = new PosixParser();
        __CLR4_5_211l11llvn1lj1w.R.inc(1534);final String[] args = new String[] { "-m", "\"Two Words\"" };
        __CLR4_5_211l11llvn1lj1w.R.inc(1535);Option m = OptionBuilder.hasArgs().create("m");
        __CLR4_5_211l11llvn1lj1w.R.inc(1536);Options options = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1537);options.addOption( m );
        __CLR4_5_211l11llvn1lj1w.R.inc(1538);CommandLine line = parser.parse( options, args );
        __CLR4_5_211l11llvn1lj1w.R.inc(1539);assertEquals( "Two Words", line.getOptionValue( "m" ) );
    }finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}
    
    public void test31148() throws ParseException
    {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vjb5bg16s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test31148",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vjb5bg16s() throws ParseException{try{__CLR4_5_211l11llvn1lj1w.R.inc(1540);
        __CLR4_5_211l11llvn1lj1w.R.inc(1541);Option multiArgOption = new Option("o","option with multiple args");
        __CLR4_5_211l11llvn1lj1w.R.inc(1542);multiArgOption.setArgs(1);
        
        __CLR4_5_211l11llvn1lj1w.R.inc(1543);Options options = new Options();
        __CLR4_5_211l11llvn1lj1w.R.inc(1544);options.addOption(multiArgOption);
        
        __CLR4_5_211l11llvn1lj1w.R.inc(1545);Parser parser = new PosixParser();
        __CLR4_5_211l11llvn1lj1w.R.inc(1546);String[] args = new String[]{};
        __CLR4_5_211l11llvn1lj1w.R.inc(1547);Properties props = new Properties();
        __CLR4_5_211l11llvn1lj1w.R.inc(1548);props.setProperty("o","ovalue");
        __CLR4_5_211l11llvn1lj1w.R.inc(1549);CommandLine cl = parser.parse(options,args,props);
        
        __CLR4_5_211l11llvn1lj1w.R.inc(1550);assertTrue(cl.hasOption('o'));
        __CLR4_5_211l11llvn1lj1w.R.inc(1551);assertEquals("ovalue",cl.getOptionValue('o'));
    }finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}}


    public void test27635() {__CLR4_5_211l11llvn1lj1w.R.globalSliceStart(getClass().getName(),1552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_225avt4174();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211l11llvn1lj1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211l11llvn1lj1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.BugsTest.test27635",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_225avt4174(){try{__CLR4_5_211l11llvn1lj1w.R.inc(1552);}finally{__CLR4_5_211l11llvn1lj1w.R.flushNeeded();}} // Fails in super class
}
