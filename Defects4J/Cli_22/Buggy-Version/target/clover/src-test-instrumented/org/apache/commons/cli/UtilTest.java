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
 * @author brianegge
 */
public class UtilTest extends TestCase
{static class __CLR4_5_21v81v8lvl36yf8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402850486L,8589935092L,2427,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void testStripLeadingHyphens()
    {__CLR4_5_21v81v8lvl36yf8.R.globalSliceStart(getClass().getName(),2420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29w17g81v8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v81v8lvl36yf8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v81v8lvl36yf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.UtilTest.testStripLeadingHyphens",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29w17g81v8(){try{__CLR4_5_21v81v8lvl36yf8.R.inc(2420);
        __CLR4_5_21v81v8lvl36yf8.R.inc(2421);assertEquals("f", Util.stripLeadingHyphens("-f"));
        __CLR4_5_21v81v8lvl36yf8.R.inc(2422);assertEquals("foo", Util.stripLeadingHyphens("--foo"));
        __CLR4_5_21v81v8lvl36yf8.R.inc(2423);assertEquals("-foo", Util.stripLeadingHyphens("---foo"));
        __CLR4_5_21v81v8lvl36yf8.R.inc(2424);assertNull(Util.stripLeadingHyphens(null));
    }finally{__CLR4_5_21v81v8lvl36yf8.R.flushNeeded();}}

    public void testStripLeadingAndTrailingQuotes()
    {__CLR4_5_21v81v8lvl36yf8.R.globalSliceStart(getClass().getName(),2425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p4j3n31vd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v81v8lvl36yf8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v81v8lvl36yf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.UtilTest.testStripLeadingAndTrailingQuotes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p4j3n31vd(){try{__CLR4_5_21v81v8lvl36yf8.R.inc(2425);
        __CLR4_5_21v81v8lvl36yf8.R.inc(2426);assertEquals("foo", Util.stripLeadingAndTrailingQuotes("\"foo\""));
    }finally{__CLR4_5_21v81v8lvl36yf8.R.flushNeeded();}}
}
