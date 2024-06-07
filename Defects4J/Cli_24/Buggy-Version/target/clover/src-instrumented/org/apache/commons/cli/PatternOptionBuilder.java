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
{public static class __CLR4_5_2s2s2lvn1lite{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521103352L,8589935092L,1069,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    {try{__CLR4_5_2s2s2lvn1lite.R.inc(1010);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2s2s2lvn1lite.R.inc(1011);switch (ch)
        {
            case '@':if (!__CLB4_5_2_bool0) {__CLR4_5_2s2s2lvn1lite.R.inc(1012);__CLB4_5_2_bool0=true;}
                __CLR4_5_2s2s2lvn1lite.R.inc(1013);return PatternOptionBuilder.OBJECT_VALUE;
            case ':':if (!__CLB4_5_2_bool0) {__CLR4_5_2s2s2lvn1lite.R.inc(1014);__CLB4_5_2_bool0=true;}
                __CLR4_5_2s2s2lvn1lite.R.inc(1015);return PatternOptionBuilder.STRING_VALUE;
            case '%':if (!__CLB4_5_2_bool0) {__CLR4_5_2s2s2lvn1lite.R.inc(1016);__CLB4_5_2_bool0=true;}
                __CLR4_5_2s2s2lvn1lite.R.inc(1017);return PatternOptionBuilder.NUMBER_VALUE;
            case '+':if (!__CLB4_5_2_bool0) {__CLR4_5_2s2s2lvn1lite.R.inc(1018);__CLB4_5_2_bool0=true;}
                __CLR4_5_2s2s2lvn1lite.R.inc(1019);return PatternOptionBuilder.CLASS_VALUE;
            case '#':if (!__CLB4_5_2_bool0) {__CLR4_5_2s2s2lvn1lite.R.inc(1020);__CLB4_5_2_bool0=true;}
                __CLR4_5_2s2s2lvn1lite.R.inc(1021);return PatternOptionBuilder.DATE_VALUE;
            case '<':if (!__CLB4_5_2_bool0) {__CLR4_5_2s2s2lvn1lite.R.inc(1022);__CLB4_5_2_bool0=true;}
                __CLR4_5_2s2s2lvn1lite.R.inc(1023);return PatternOptionBuilder.EXISTING_FILE_VALUE;
            case '>':if (!__CLB4_5_2_bool0) {__CLR4_5_2s2s2lvn1lite.R.inc(1024);__CLB4_5_2_bool0=true;}
                __CLR4_5_2s2s2lvn1lite.R.inc(1025);return PatternOptionBuilder.FILE_VALUE;
            case '*':if (!__CLB4_5_2_bool0) {__CLR4_5_2s2s2lvn1lite.R.inc(1026);__CLB4_5_2_bool0=true;}
                __CLR4_5_2s2s2lvn1lite.R.inc(1027);return PatternOptionBuilder.FILES_VALUE;
            case '/':if (!__CLB4_5_2_bool0) {__CLR4_5_2s2s2lvn1lite.R.inc(1028);__CLB4_5_2_bool0=true;}
                __CLR4_5_2s2s2lvn1lite.R.inc(1029);return PatternOptionBuilder.URL_VALUE;
        }

        __CLR4_5_2s2s2lvn1lite.R.inc(1030);return null;
    }finally{__CLR4_5_2s2s2lvn1lite.R.flushNeeded();}}

    /**
     * Returns whether <code>ch</code> is a value code, i.e.
     * whether it represents a class in a pattern.
     *
     * @param ch the specified character
     * @return true if <code>ch</code> is a value code, otherwise false.
     */
    public static boolean isValueCode(char ch)
    {try{__CLR4_5_2s2s2lvn1lite.R.inc(1031);
        __CLR4_5_2s2s2lvn1lite.R.inc(1032);return ch == '@'
                || ch == ':'
                || ch == '%'
                || ch == '+'
                || ch == '#'
                || ch == '<'
                || ch == '>'
                || ch == '*'
                || ch == '/'
                || ch == '!';
    }finally{__CLR4_5_2s2s2lvn1lite.R.flushNeeded();}}

    /**
     * Returns the {@link Options} instance represented by <code>pattern</code>.
     *
     * @param pattern the pattern string
     * @return The {@link Options} instance
     */
    public static Options parsePattern(String pattern)
    {try{__CLR4_5_2s2s2lvn1lite.R.inc(1033);
        __CLR4_5_2s2s2lvn1lite.R.inc(1034);char opt = ' ';
        __CLR4_5_2s2s2lvn1lite.R.inc(1035);boolean required = false;
        __CLR4_5_2s2s2lvn1lite.R.inc(1036);Object type = null;

        __CLR4_5_2s2s2lvn1lite.R.inc(1037);Options options = new Options();

        __CLR4_5_2s2s2lvn1lite.R.inc(1038);for (int i = 0; (((i < pattern.length())&&(__CLR4_5_2s2s2lvn1lite.R.iget(1039)!=0|true))||(__CLR4_5_2s2s2lvn1lite.R.iget(1040)==0&false)); i++)
        {{
            __CLR4_5_2s2s2lvn1lite.R.inc(1041);char ch = pattern.charAt(i);

            // a value code comes after an option and specifies
            // details about it
            __CLR4_5_2s2s2lvn1lite.R.inc(1042);if ((((!isValueCode(ch))&&(__CLR4_5_2s2s2lvn1lite.R.iget(1043)!=0|true))||(__CLR4_5_2s2s2lvn1lite.R.iget(1044)==0&false)))
            {{
                __CLR4_5_2s2s2lvn1lite.R.inc(1045);if ((((opt != ' ')&&(__CLR4_5_2s2s2lvn1lite.R.iget(1046)!=0|true))||(__CLR4_5_2s2s2lvn1lite.R.iget(1047)==0&false)))
                {{
                    __CLR4_5_2s2s2lvn1lite.R.inc(1048);OptionBuilder.hasArg(type != null);
                    __CLR4_5_2s2s2lvn1lite.R.inc(1049);OptionBuilder.isRequired(required);
                    __CLR4_5_2s2s2lvn1lite.R.inc(1050);OptionBuilder.withType(type);

                    // we have a previous one to deal with
                    __CLR4_5_2s2s2lvn1lite.R.inc(1051);options.addOption(OptionBuilder.create(opt));
                    __CLR4_5_2s2s2lvn1lite.R.inc(1052);required = false;
                    __CLR4_5_2s2s2lvn1lite.R.inc(1053);type = null;
                    __CLR4_5_2s2s2lvn1lite.R.inc(1054);opt = ' ';
                }

                }__CLR4_5_2s2s2lvn1lite.R.inc(1055);opt = ch;
            }
            }else {__CLR4_5_2s2s2lvn1lite.R.inc(1056);if ((((ch == '!')&&(__CLR4_5_2s2s2lvn1lite.R.iget(1057)!=0|true))||(__CLR4_5_2s2s2lvn1lite.R.iget(1058)==0&false)))
            {{
                __CLR4_5_2s2s2lvn1lite.R.inc(1059);required = true;
            }
            }else
            {{
                __CLR4_5_2s2s2lvn1lite.R.inc(1060);type = getValueClass(ch);
            }
        }}}

        }__CLR4_5_2s2s2lvn1lite.R.inc(1061);if ((((opt != ' ')&&(__CLR4_5_2s2s2lvn1lite.R.iget(1062)!=0|true))||(__CLR4_5_2s2s2lvn1lite.R.iget(1063)==0&false)))
        {{
            __CLR4_5_2s2s2lvn1lite.R.inc(1064);OptionBuilder.hasArg(type != null);
            __CLR4_5_2s2s2lvn1lite.R.inc(1065);OptionBuilder.isRequired(required);
            __CLR4_5_2s2s2lvn1lite.R.inc(1066);OptionBuilder.withType(type);

            // we have a final one to deal with
            __CLR4_5_2s2s2lvn1lite.R.inc(1067);options.addOption(OptionBuilder.create(opt));
        }

        }__CLR4_5_2s2s2lvn1lite.R.inc(1068);return options;
    }finally{__CLR4_5_2s2s2lvn1lite.R.flushNeeded();}}
}
