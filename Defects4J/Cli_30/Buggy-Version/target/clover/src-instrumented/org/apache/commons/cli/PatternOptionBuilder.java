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

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;

/**
 * <p>
 * Allows Options to be created from a single String.
 * The pattern contains various single character flags and via
 * an optional punctuation character, their expected type.
 * </p>
 *
 * <table border="1">
 * <tr><td>a</td><td>-a flag</td></tr>
 * <tr><td>b@</td><td>-b [classname]</td></tr>
 * <tr><td>c&gt;</td><td>-c [filename]</td></tr>
 * <tr><td>d+</td><td>-d [classname] (creates object via empty contructor)</td></tr>
 * <tr><td>e%</td><td>-e [number] (creates Double/Long instance depeding on existing of a '.')</td></tr>
 * <tr><td>f/</td><td>-f [url]</td></tr>
 * <tr><td>g:</td><td>-g [string]</td></tr>
 * </table>
 *
 * <p>
 * For example, the following allows command line flags of '-v -p string-value -f /dir/file'.
 * The exclamation mark precede a mandatory option.
 * </p>
 * <code>Options options = PatternOptionBuilder.parsePattern("vp:!f/");</code>
 *
 * <p>
 * TODO These need to break out to OptionType and also
 * to be pluggable.
 * </p>
 *
 * @version $Revision$, $Date$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PatternOptionBuilder
{public static class __CLR4_5_2128128lvn1ne9y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521190328L,8589935092L,1435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** String class */
    public static final Class STRING_VALUE = String.class;

    /** Object class */
    public static final Class OBJECT_VALUE = Object.class;

    /** Number class */
    public static final Class NUMBER_VALUE = Number.class;

    /** Date class */
    public static final Class DATE_VALUE = Date.class;

    /** Class class */
    public static final Class CLASS_VALUE = Class.class;

    /// can we do this one??
    // is meant to check that the file exists, else it errors.
    // ie) it's for reading not writing.

    /** FileInputStream class */
    public static final Class EXISTING_FILE_VALUE = FileInputStream.class;

    /** File class */
    public static final Class FILE_VALUE = File.class;

    /** File array class */
    public static final Class FILES_VALUE = File[].class;

    /** URL class */
    public static final Class URL_VALUE = URL.class;

    /**
     * Retrieve the class that <code>ch</code> represents.
     *
     * @param ch the specified character
     * @return The class that <code>ch</code> represents
     */
    public static Object getValueClass(char ch)
    {try{__CLR4_5_2128128lvn1ne9y.R.inc(1376);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2128128lvn1ne9y.R.inc(1377);switch (ch)
        {
            case '@':if (!__CLB4_5_2_bool0) {__CLR4_5_2128128lvn1ne9y.R.inc(1378);__CLB4_5_2_bool0=true;}
                __CLR4_5_2128128lvn1ne9y.R.inc(1379);return PatternOptionBuilder.OBJECT_VALUE;
            case ':':if (!__CLB4_5_2_bool0) {__CLR4_5_2128128lvn1ne9y.R.inc(1380);__CLB4_5_2_bool0=true;}
                __CLR4_5_2128128lvn1ne9y.R.inc(1381);return PatternOptionBuilder.STRING_VALUE;
            case '%':if (!__CLB4_5_2_bool0) {__CLR4_5_2128128lvn1ne9y.R.inc(1382);__CLB4_5_2_bool0=true;}
                __CLR4_5_2128128lvn1ne9y.R.inc(1383);return PatternOptionBuilder.NUMBER_VALUE;
            case '+':if (!__CLB4_5_2_bool0) {__CLR4_5_2128128lvn1ne9y.R.inc(1384);__CLB4_5_2_bool0=true;}
                __CLR4_5_2128128lvn1ne9y.R.inc(1385);return PatternOptionBuilder.CLASS_VALUE;
            case '#':if (!__CLB4_5_2_bool0) {__CLR4_5_2128128lvn1ne9y.R.inc(1386);__CLB4_5_2_bool0=true;}
                __CLR4_5_2128128lvn1ne9y.R.inc(1387);return PatternOptionBuilder.DATE_VALUE;
            case '<':if (!__CLB4_5_2_bool0) {__CLR4_5_2128128lvn1ne9y.R.inc(1388);__CLB4_5_2_bool0=true;}
                __CLR4_5_2128128lvn1ne9y.R.inc(1389);return PatternOptionBuilder.EXISTING_FILE_VALUE;
            case '>':if (!__CLB4_5_2_bool0) {__CLR4_5_2128128lvn1ne9y.R.inc(1390);__CLB4_5_2_bool0=true;}
                __CLR4_5_2128128lvn1ne9y.R.inc(1391);return PatternOptionBuilder.FILE_VALUE;
            case '*':if (!__CLB4_5_2_bool0) {__CLR4_5_2128128lvn1ne9y.R.inc(1392);__CLB4_5_2_bool0=true;}
                __CLR4_5_2128128lvn1ne9y.R.inc(1393);return PatternOptionBuilder.FILES_VALUE;
            case '/':if (!__CLB4_5_2_bool0) {__CLR4_5_2128128lvn1ne9y.R.inc(1394);__CLB4_5_2_bool0=true;}
                __CLR4_5_2128128lvn1ne9y.R.inc(1395);return PatternOptionBuilder.URL_VALUE;
        }

        __CLR4_5_2128128lvn1ne9y.R.inc(1396);return null;
    }finally{__CLR4_5_2128128lvn1ne9y.R.flushNeeded();}}

    /**
     * Returns whether <code>ch</code> is a value code, i.e.
     * whether it represents a class in a pattern.
     *
     * @param ch the specified character
     * @return true if <code>ch</code> is a value code, otherwise false.
     */
    public static boolean isValueCode(char ch)
    {try{__CLR4_5_2128128lvn1ne9y.R.inc(1397);
        __CLR4_5_2128128lvn1ne9y.R.inc(1398);return ch == '@'
                || ch == ':'
                || ch == '%'
                || ch == '+'
                || ch == '#'
                || ch == '<'
                || ch == '>'
                || ch == '*'
                || ch == '/'
                || ch == '!';
    }finally{__CLR4_5_2128128lvn1ne9y.R.flushNeeded();}}

    /**
     * Returns the {@link Options} instance represented by <code>pattern</code>.
     *
     * @param pattern the pattern string
     * @return The {@link Options} instance
     */
    public static Options parsePattern(String pattern)
    {try{__CLR4_5_2128128lvn1ne9y.R.inc(1399);
        __CLR4_5_2128128lvn1ne9y.R.inc(1400);char opt = ' ';
        __CLR4_5_2128128lvn1ne9y.R.inc(1401);boolean required = false;
        __CLR4_5_2128128lvn1ne9y.R.inc(1402);Object type = null;

        __CLR4_5_2128128lvn1ne9y.R.inc(1403);Options options = new Options();

        __CLR4_5_2128128lvn1ne9y.R.inc(1404);for (int i = 0; (((i < pattern.length())&&(__CLR4_5_2128128lvn1ne9y.R.iget(1405)!=0|true))||(__CLR4_5_2128128lvn1ne9y.R.iget(1406)==0&false)); i++)
        {{
            __CLR4_5_2128128lvn1ne9y.R.inc(1407);char ch = pattern.charAt(i);

            // a value code comes after an option and specifies
            // details about it
            __CLR4_5_2128128lvn1ne9y.R.inc(1408);if ((((!isValueCode(ch))&&(__CLR4_5_2128128lvn1ne9y.R.iget(1409)!=0|true))||(__CLR4_5_2128128lvn1ne9y.R.iget(1410)==0&false)))
            {{
                __CLR4_5_2128128lvn1ne9y.R.inc(1411);if ((((opt != ' ')&&(__CLR4_5_2128128lvn1ne9y.R.iget(1412)!=0|true))||(__CLR4_5_2128128lvn1ne9y.R.iget(1413)==0&false)))
                {{
                    __CLR4_5_2128128lvn1ne9y.R.inc(1414);OptionBuilder.hasArg(type != null);
                    __CLR4_5_2128128lvn1ne9y.R.inc(1415);OptionBuilder.isRequired(required);
                    __CLR4_5_2128128lvn1ne9y.R.inc(1416);OptionBuilder.withType(type);

                    // we have a previous one to deal with
                    __CLR4_5_2128128lvn1ne9y.R.inc(1417);options.addOption(OptionBuilder.create(opt));
                    __CLR4_5_2128128lvn1ne9y.R.inc(1418);required = false;
                    __CLR4_5_2128128lvn1ne9y.R.inc(1419);type = null;
                    __CLR4_5_2128128lvn1ne9y.R.inc(1420);opt = ' ';
                }

                }__CLR4_5_2128128lvn1ne9y.R.inc(1421);opt = ch;
            }
            }else {__CLR4_5_2128128lvn1ne9y.R.inc(1422);if ((((ch == '!')&&(__CLR4_5_2128128lvn1ne9y.R.iget(1423)!=0|true))||(__CLR4_5_2128128lvn1ne9y.R.iget(1424)==0&false)))
            {{
                __CLR4_5_2128128lvn1ne9y.R.inc(1425);required = true;
            }
            }else
            {{
                __CLR4_5_2128128lvn1ne9y.R.inc(1426);type = getValueClass(ch);
            }
        }}}

        }__CLR4_5_2128128lvn1ne9y.R.inc(1427);if ((((opt != ' ')&&(__CLR4_5_2128128lvn1ne9y.R.iget(1428)!=0|true))||(__CLR4_5_2128128lvn1ne9y.R.iget(1429)==0&false)))
        {{
            __CLR4_5_2128128lvn1ne9y.R.inc(1430);OptionBuilder.hasArg(type != null);
            __CLR4_5_2128128lvn1ne9y.R.inc(1431);OptionBuilder.isRequired(required);
            __CLR4_5_2128128lvn1ne9y.R.inc(1432);OptionBuilder.withType(type);

            // we have a final one to deal with
            __CLR4_5_2128128lvn1ne9y.R.inc(1433);options.addOption(OptionBuilder.create(opt));
        }

        }__CLR4_5_2128128lvn1ne9y.R.inc(1434);return options;
    }finally{__CLR4_5_2128128lvn1ne9y.R.flushNeeded();}}
}
