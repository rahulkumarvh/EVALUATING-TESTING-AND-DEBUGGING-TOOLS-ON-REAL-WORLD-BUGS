/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.commons.cli.bug;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;

import junit.framework.TestCase;

public class BugCLI71Test extends TestCase {static class __CLR4_5_22od2odlvn1n6rs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521181340L,8589935092L,3502,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Options options;
    private CommandLineParser parser;

    public void setUp() {try{__CLR4_5_22od2odlvn1n6rs.R.inc(3469);
        __CLR4_5_22od2odlvn1n6rs.R.inc(3470);options = new Options();

        __CLR4_5_22od2odlvn1n6rs.R.inc(3471);Option algorithm = new Option("a" , "algo", true, "the algorithm which it to perform executing");
        __CLR4_5_22od2odlvn1n6rs.R.inc(3472);algorithm.setArgName("algorithm name");
        __CLR4_5_22od2odlvn1n6rs.R.inc(3473);options.addOption(algorithm);

        __CLR4_5_22od2odlvn1n6rs.R.inc(3474);Option key = new Option("k" , "key", true, "the key the setted algorithm uses to process");
        __CLR4_5_22od2odlvn1n6rs.R.inc(3475);algorithm.setArgName("value");
        __CLR4_5_22od2odlvn1n6rs.R.inc(3476);options.addOption(key);

        __CLR4_5_22od2odlvn1n6rs.R.inc(3477);parser = new PosixParser();
    }finally{__CLR4_5_22od2odlvn1n6rs.R.flushNeeded();}}

    public void testBasic() throws Exception {__CLR4_5_22od2odlvn1n6rs.R.globalSliceStart(getClass().getName(),3478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2uf7h2om();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22od2odlvn1n6rs.R.rethrow($CLV_t2$);}finally{__CLR4_5_22od2odlvn1n6rs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.bug.BugCLI71Test.testBasic",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3478,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2uf7h2om() throws Exception{try{__CLR4_5_22od2odlvn1n6rs.R.inc(3478);
        __CLR4_5_22od2odlvn1n6rs.R.inc(3479);String[] args = new String[] { "-a", "Caesar", "-k", "A" };
        __CLR4_5_22od2odlvn1n6rs.R.inc(3480);CommandLine line = parser.parse( options, args);
        __CLR4_5_22od2odlvn1n6rs.R.inc(3481);assertEquals( "Caesar", line.getOptionValue("a") );
        __CLR4_5_22od2odlvn1n6rs.R.inc(3482);assertEquals( "A", line.getOptionValue("k") );
    }finally{__CLR4_5_22od2odlvn1n6rs.R.flushNeeded();}}

    public void testMistakenArgument() throws Exception {__CLR4_5_22od2odlvn1n6rs.R.globalSliceStart(getClass().getName(),3483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l0mnga2or();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22od2odlvn1n6rs.R.rethrow($CLV_t2$);}finally{__CLR4_5_22od2odlvn1n6rs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.bug.BugCLI71Test.testMistakenArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l0mnga2or() throws Exception{try{__CLR4_5_22od2odlvn1n6rs.R.inc(3483);
        __CLR4_5_22od2odlvn1n6rs.R.inc(3484);String[] args = new String[] { "-a", "Caesar", "-k", "A" };
        __CLR4_5_22od2odlvn1n6rs.R.inc(3485);CommandLine line = parser.parse( options, args);
        __CLR4_5_22od2odlvn1n6rs.R.inc(3486);args = new String[] { "-a", "Caesar", "-k", "a" };
        __CLR4_5_22od2odlvn1n6rs.R.inc(3487);line = parser.parse( options, args);
        __CLR4_5_22od2odlvn1n6rs.R.inc(3488);assertEquals( "Caesar", line.getOptionValue("a") );
        __CLR4_5_22od2odlvn1n6rs.R.inc(3489);assertEquals( "a", line.getOptionValue("k") );
    }finally{__CLR4_5_22od2odlvn1n6rs.R.flushNeeded();}}

    public void testLackOfError() throws Exception {__CLR4_5_22od2odlvn1n6rs.R.globalSliceStart(getClass().getName(),3490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ooiqf2oy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22od2odlvn1n6rs.R.rethrow($CLV_t2$);}finally{__CLR4_5_22od2odlvn1n6rs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.bug.BugCLI71Test.testLackOfError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ooiqf2oy() throws Exception{try{__CLR4_5_22od2odlvn1n6rs.R.inc(3490);
        __CLR4_5_22od2odlvn1n6rs.R.inc(3491);String[] args = new String[] { "-k", "-a",  "Caesar" };
        __CLR4_5_22od2odlvn1n6rs.R.inc(3492);try {
            __CLR4_5_22od2odlvn1n6rs.R.inc(3493);CommandLine line = parser.parse( options, args);
            __CLR4_5_22od2odlvn1n6rs.R.inc(3494);fail("MissingArgumentException expected");
        } catch(MissingArgumentException e) {
            __CLR4_5_22od2odlvn1n6rs.R.inc(3495);assertEquals("option missing an argument", "k", e.getOption().getOpt());
        }
    }finally{__CLR4_5_22od2odlvn1n6rs.R.flushNeeded();}}

    public void testGetsDefaultIfOptional() throws Exception {__CLR4_5_22od2odlvn1n6rs.R.globalSliceStart(getClass().getName(),3496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d1c1wq2p4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22od2odlvn1n6rs.R.rethrow($CLV_t2$);}finally{__CLR4_5_22od2odlvn1n6rs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.bug.BugCLI71Test.testGetsDefaultIfOptional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d1c1wq2p4() throws Exception{try{__CLR4_5_22od2odlvn1n6rs.R.inc(3496);
        __CLR4_5_22od2odlvn1n6rs.R.inc(3497);String[] args = new String[] { "-k", "-a", "Caesar" };
        __CLR4_5_22od2odlvn1n6rs.R.inc(3498);options.getOption("k").setOptionalArg(true);
        __CLR4_5_22od2odlvn1n6rs.R.inc(3499);CommandLine line = parser.parse( options, args);
        
        __CLR4_5_22od2odlvn1n6rs.R.inc(3500);assertEquals( "Caesar", line.getOptionValue("a") );
        __CLR4_5_22od2odlvn1n6rs.R.inc(3501);assertEquals( "a", line.getOptionValue("k", "a") );
    }finally{__CLR4_5_22od2odlvn1n6rs.R.flushNeeded();}}

}
