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

/**
 * Contains useful helper methods for classes within this package.
 *
 * @author John Keyes (john at integralsource.com)
 * @version $Revision$, $Date$
 */
class Util
{public static class __CLR4_5_218z18zlvn1nedb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521190328L,8589935092L,1640,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Remove the hyphens from the begining of <code>str</code> and
     * return the new String.
     *
     * @param str The string from which the hyphens should be removed.
     *
     * @return the new String.
     */
    static String stripLeadingHyphens(String str)
    {try{__CLR4_5_218z18zlvn1nedb.R.inc(1619);
        __CLR4_5_218z18zlvn1nedb.R.inc(1620);if ((((str == null)&&(__CLR4_5_218z18zlvn1nedb.R.iget(1621)!=0|true))||(__CLR4_5_218z18zlvn1nedb.R.iget(1622)==0&false)))
        {{
            __CLR4_5_218z18zlvn1nedb.R.inc(1623);return null;
        }
        }__CLR4_5_218z18zlvn1nedb.R.inc(1624);if ((((str.startsWith("--"))&&(__CLR4_5_218z18zlvn1nedb.R.iget(1625)!=0|true))||(__CLR4_5_218z18zlvn1nedb.R.iget(1626)==0&false)))
        {{
            __CLR4_5_218z18zlvn1nedb.R.inc(1627);return str.substring(2, str.length());
        }
        }else {__CLR4_5_218z18zlvn1nedb.R.inc(1628);if ((((str.startsWith("-"))&&(__CLR4_5_218z18zlvn1nedb.R.iget(1629)!=0|true))||(__CLR4_5_218z18zlvn1nedb.R.iget(1630)==0&false)))
        {{
            __CLR4_5_218z18zlvn1nedb.R.inc(1631);return str.substring(1, str.length());
        }

        }}__CLR4_5_218z18zlvn1nedb.R.inc(1632);return str;
    }finally{__CLR4_5_218z18zlvn1nedb.R.flushNeeded();}}

    /**
     * Remove the leading and trailing quotes from <code>str</code>.
     * E.g. if str is '"one two"', then 'one two' is returned.
     *
     * @param str The string from which the leading and trailing quotes
     * should be removed.
     *
     * @return The string without the leading and trailing quotes.
     */
    static String stripLeadingAndTrailingQuotes(String str)
    {try{__CLR4_5_218z18zlvn1nedb.R.inc(1633);
        __CLR4_5_218z18zlvn1nedb.R.inc(1634);int length = str.length();
        __CLR4_5_218z18zlvn1nedb.R.inc(1635);if ((((length > 1 && str.startsWith("\"") && str.endsWith("\"") && str.substring(1, length - 1).indexOf('"') == -1)&&(__CLR4_5_218z18zlvn1nedb.R.iget(1636)!=0|true))||(__CLR4_5_218z18zlvn1nedb.R.iget(1637)==0&false)))
        {{
            __CLR4_5_218z18zlvn1nedb.R.inc(1638);str = str.substring(1, length - 1);
        }
        
        }__CLR4_5_218z18zlvn1nedb.R.inc(1639);return str;
    }finally{__CLR4_5_218z18zlvn1nedb.R.flushNeeded();}}
}
