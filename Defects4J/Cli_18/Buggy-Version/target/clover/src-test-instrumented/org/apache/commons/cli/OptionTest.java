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

package org.apache.commons.cli;

import junit.framework.TestCase;

/**
 * @author brianegge
 */
public class OptionTest extends TestCase
{static class __CLR4_5_21l31l3lvkk1tgv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370698324L,8589935092L,2121,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static class TestOption extends Option
    {
        public TestOption(String opt, boolean hasArg, String description) throws IllegalArgumentException
        {
            super(opt, hasArg, description);__CLR4_5_21l31l3lvkk1tgv.R.inc(2056);try{__CLR4_5_21l31l3lvkk1tgv.R.inc(2055);
        }finally{__CLR4_5_21l31l3lvkk1tgv.R.flushNeeded();}}

        public boolean addValue(String value)
        {try{__CLR4_5_21l31l3lvkk1tgv.R.inc(2057);
            __CLR4_5_21l31l3lvkk1tgv.R.inc(2058);addValueForProcessing(value);
            __CLR4_5_21l31l3lvkk1tgv.R.inc(2059);return true;
        }finally{__CLR4_5_21l31l3lvkk1tgv.R.flushNeeded();}}
    }

    public void testClear()
    {__CLR4_5_21l31l3lvkk1tgv.R.globalSliceStart(getClass().getName(),2060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jlyl6q1l8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l31l3lvkk1tgv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l31l3lvkk1tgv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionTest.testClear",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jlyl6q1l8(){try{__CLR4_5_21l31l3lvkk1tgv.R.inc(2060);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2061);TestOption option = new TestOption("x", true, "");
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2062);assertEquals(0, option.getValuesList().size());
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2063);option.addValue("a");
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2064);assertEquals(1, option.getValuesList().size());
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2065);option.clearValues();
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2066);assertEquals(0, option.getValuesList().size());
    }finally{__CLR4_5_21l31l3lvkk1tgv.R.flushNeeded();}}

    // See http://issues.apache.org/jira/browse/CLI-21
    public void testClone() throws CloneNotSupportedException
    {__CLR4_5_21l31l3lvkk1tgv.R.globalSliceStart(getClass().getName(),2067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2csyejy1lf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l31l3lvkk1tgv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l31l3lvkk1tgv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionTest.testClone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2067,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2csyejy1lf() throws CloneNotSupportedException{try{__CLR4_5_21l31l3lvkk1tgv.R.inc(2067);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2068);TestOption a = new TestOption("a", true, "");
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2069);TestOption b = (TestOption) a.clone();
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2070);assertEquals(a, b);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2071);assertNotSame(a, b);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2072);a.setDescription("a");
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2073);assertEquals("", b.getDescription());
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2074);b.setArgs(2);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2075);b.addValue("b1");
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2076);b.addValue("b2");
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2077);assertEquals(1, a.getArgs());
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2078);assertEquals(0, a.getValuesList().size());
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2079);assertEquals(2, b.getValues().length);
    }finally{__CLR4_5_21l31l3lvkk1tgv.R.flushNeeded();}}

    private static class DefaultOption extends Option
    {
        private final String defaultValue;

        public DefaultOption(String opt, String description, String defaultValue) throws IllegalArgumentException
        {
            super(opt, true, description);__CLR4_5_21l31l3lvkk1tgv.R.inc(2081);try{__CLR4_5_21l31l3lvkk1tgv.R.inc(2080);
            __CLR4_5_21l31l3lvkk1tgv.R.inc(2082);this.defaultValue = defaultValue;
        }finally{__CLR4_5_21l31l3lvkk1tgv.R.flushNeeded();}}

        public String getValue()
        {try{__CLR4_5_21l31l3lvkk1tgv.R.inc(2083);
            __CLR4_5_21l31l3lvkk1tgv.R.inc(2084);return (((super.getValue() != null )&&(__CLR4_5_21l31l3lvkk1tgv.R.iget(2085)!=0|true))||(__CLR4_5_21l31l3lvkk1tgv.R.iget(2086)==0&false))? super.getValue() : defaultValue;
        }finally{__CLR4_5_21l31l3lvkk1tgv.R.flushNeeded();}}
    }

    public void testSubclass() throws CloneNotSupportedException
    {__CLR4_5_21l31l3lvkk1tgv.R.globalSliceStart(getClass().getName(),2087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ydjpip1lz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l31l3lvkk1tgv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l31l3lvkk1tgv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionTest.testSubclass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ydjpip1lz() throws CloneNotSupportedException{try{__CLR4_5_21l31l3lvkk1tgv.R.inc(2087);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2088);Option option = new DefaultOption("f", "file", "myfile.txt");
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2089);Option clone = (Option) option.clone();
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2090);assertEquals("myfile.txt", clone.getValue());
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2091);assertEquals(DefaultOption.class, clone.getClass());
    }finally{__CLR4_5_21l31l3lvkk1tgv.R.flushNeeded();}}

    public void testHasArgName()
    {__CLR4_5_21l31l3lvkk1tgv.R.globalSliceStart(getClass().getName(),2092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2enptpc1m4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l31l3lvkk1tgv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l31l3lvkk1tgv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionTest.testHasArgName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2092,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2enptpc1m4(){try{__CLR4_5_21l31l3lvkk1tgv.R.inc(2092);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2093);Option option = new Option("f", null);

        __CLR4_5_21l31l3lvkk1tgv.R.inc(2094);option.setArgName(null);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2095);assertFalse(option.hasArgName());

        __CLR4_5_21l31l3lvkk1tgv.R.inc(2096);option.setArgName("");
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2097);assertFalse(option.hasArgName());

        __CLR4_5_21l31l3lvkk1tgv.R.inc(2098);option.setArgName("file");
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2099);assertTrue(option.hasArgName());
    }finally{__CLR4_5_21l31l3lvkk1tgv.R.flushNeeded();}}

    public void testHasArgs()
    {__CLR4_5_21l31l3lvkk1tgv.R.globalSliceStart(getClass().getName(),2100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2om7b1w1mc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l31l3lvkk1tgv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l31l3lvkk1tgv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionTest.testHasArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2om7b1w1mc(){try{__CLR4_5_21l31l3lvkk1tgv.R.inc(2100);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2101);Option option = new Option("f", null);

        __CLR4_5_21l31l3lvkk1tgv.R.inc(2102);option.setArgs(0);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2103);assertFalse(option.hasArgs());

        __CLR4_5_21l31l3lvkk1tgv.R.inc(2104);option.setArgs(1);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2105);assertFalse(option.hasArgs());

        __CLR4_5_21l31l3lvkk1tgv.R.inc(2106);option.setArgs(10);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2107);assertTrue(option.hasArgs());

        __CLR4_5_21l31l3lvkk1tgv.R.inc(2108);option.setArgs(Option.UNLIMITED_VALUES);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2109);assertTrue(option.hasArgs());

        __CLR4_5_21l31l3lvkk1tgv.R.inc(2110);option.setArgs(Option.UNINITIALIZED);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2111);assertFalse(option.hasArgs());
    }finally{__CLR4_5_21l31l3lvkk1tgv.R.flushNeeded();}}

    public void testGetValue()
    {__CLR4_5_21l31l3lvkk1tgv.R.globalSliceStart(getClass().getName(),2112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qcksmk1mo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l31l3lvkk1tgv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l31l3lvkk1tgv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.cli.OptionTest.testGetValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qcksmk1mo(){try{__CLR4_5_21l31l3lvkk1tgv.R.inc(2112);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2113);Option option = new Option("f", null);
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2114);option.setArgs(Option.UNLIMITED_VALUES);

        __CLR4_5_21l31l3lvkk1tgv.R.inc(2115);assertEquals("default", option.getValue("default"));
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2116);assertEquals(null, option.getValue(0));

        __CLR4_5_21l31l3lvkk1tgv.R.inc(2117);option.addValueForProcessing("foo");
        
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2118);assertEquals("foo", option.getValue());
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2119);assertEquals("foo", option.getValue(0));
        __CLR4_5_21l31l3lvkk1tgv.R.inc(2120);assertEquals("foo", option.getValue("default"));
    }finally{__CLR4_5_21l31l3lvkk1tgv.R.flushNeeded();}}
}
