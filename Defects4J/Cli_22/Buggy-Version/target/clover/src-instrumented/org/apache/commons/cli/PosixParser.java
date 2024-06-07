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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * The class PosixParser provides an implementation of the
 * {@link Parser#flatten(Options,String[],boolean) flatten} method.
 *
 * @author John Keyes (john at integralsource.com)
 * @version $Revision$, $Date$
 */
public class PosixParser extends Parser
{public static class __CLR4_5_2tctclvl36xdq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402847792L,8589935092L,1143,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** holder for flattened tokens */
    private List tokens = new ArrayList();

    /** specifies if bursting should continue */
    private boolean eatTheRest;

    /** holder for the current option */

    /** the command line Options */
    private Options options;

    /**
     * Resets the members to their original state i.e. remove
     * all of <code>tokens</code> entries and set <code>eatTheRest</code>
     * to false.
     */
    private void init()
    {try{__CLR4_5_2tctclvl36xdq.R.inc(1056);
        __CLR4_5_2tctclvl36xdq.R.inc(1057);eatTheRest = false;
        __CLR4_5_2tctclvl36xdq.R.inc(1058);tokens.clear();
    }finally{__CLR4_5_2tctclvl36xdq.R.flushNeeded();}}

    /**
     * <p>An implementation of {@link Parser}'s abstract
     * {@link Parser#flatten(Options,String[],boolean) flatten} method.</p>
     *
     * <p>The following are the rules used by this flatten method.
     * <ol>
     *  <li>if <code>stopAtNonOption</code> is <b>true</b> then do not
     *  burst anymore of <code>arguments</code> entries, just add each
     *  successive entry without further processing.  Otherwise, ignore
     *  <code>stopAtNonOption</code>.</li>
     *  <li>if the current <code>arguments</code> entry is "<b>--</b>"
     *  just add the entry to the list of processed tokens</li>
     *  <li>if the current <code>arguments</code> entry is "<b>-</b>"
     *  just add the entry to the list of processed tokens</li>
     *  <li>if the current <code>arguments</code> entry is two characters
     *  in length and the first character is "<b>-</b>" then check if this
     *  is a valid {@link Option} id.  If it is a valid id, then add the
     *  entry to the list of processed tokens and set the current {@link Option}
     *  member.  If it is not a valid id and <code>stopAtNonOption</code>
     *  is true, then the remaining entries are copied to the list of
     *  processed tokens.  Otherwise, the current entry is ignored.</li>
     *  <li>if the current <code>arguments</code> entry is more than two
     *  characters in length and the first character is "<b>-</b>" then
     *  we need to burst the entry to determine its constituents.  For more
     *  information on the bursting algorithm see
     *  {@link PosixParser#burstToken(String, boolean) burstToken}.</li>
     *  <li>if the current <code>arguments</code> entry is not handled
     *  by any of the previous rules, then the entry is added to the list
     *  of processed tokens.</li>
     * </ol>
     * </p>
     *
     * @param options The command line {@link Options}
     * @param arguments The command line arguments to be parsed
     * @param stopAtNonOption Specifies whether to stop flattening
     * when an non option is found.
     * @return The flattened <code>arguments</code> String array.
     */
    protected String[] flatten(Options options, String[] arguments, boolean stopAtNonOption)
    {try{__CLR4_5_2tctclvl36xdq.R.inc(1059);
        __CLR4_5_2tctclvl36xdq.R.inc(1060);init();
        __CLR4_5_2tctclvl36xdq.R.inc(1061);this.options = options;

        // an iterator for the command line tokens
        __CLR4_5_2tctclvl36xdq.R.inc(1062);Iterator iter = Arrays.asList(arguments).iterator();

        // process each command line token
        __CLR4_5_2tctclvl36xdq.R.inc(1063);while ((((iter.hasNext())&&(__CLR4_5_2tctclvl36xdq.R.iget(1064)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1065)==0&false)))
        {{
            // get the next command line token
            __CLR4_5_2tctclvl36xdq.R.inc(1066);String token = (String) iter.next();

            // handle long option --foo or --foo=bar
            __CLR4_5_2tctclvl36xdq.R.inc(1067);if ((((token.startsWith("--"))&&(__CLR4_5_2tctclvl36xdq.R.iget(1068)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1069)==0&false)))
            {{
                __CLR4_5_2tctclvl36xdq.R.inc(1070);int pos = token.indexOf('=');
                __CLR4_5_2tctclvl36xdq.R.inc(1071);String opt = (((pos == -1 )&&(__CLR4_5_2tctclvl36xdq.R.iget(1072)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1073)==0&false))? token : token.substring(0, pos); // --foo

                __CLR4_5_2tctclvl36xdq.R.inc(1074);if ((((!options.hasOption(opt))&&(__CLR4_5_2tctclvl36xdq.R.iget(1075)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1076)==0&false)))
                {{
                    __CLR4_5_2tctclvl36xdq.R.inc(1077);processNonOptionToken(token);
                }
                }else
                {{
                    
                    __CLR4_5_2tctclvl36xdq.R.inc(1078);tokens.add(opt);
                    __CLR4_5_2tctclvl36xdq.R.inc(1079);if ((((pos != -1)&&(__CLR4_5_2tctclvl36xdq.R.iget(1080)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1081)==0&false)))
                    {{
                        __CLR4_5_2tctclvl36xdq.R.inc(1082);tokens.add(token.substring(pos + 1));
                    }
                }}
            }}

            // single hyphen
            }else {__CLR4_5_2tctclvl36xdq.R.inc(1083);if (((("-".equals(token))&&(__CLR4_5_2tctclvl36xdq.R.iget(1084)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1085)==0&false)))
            {{
                __CLR4_5_2tctclvl36xdq.R.inc(1086);tokens.add(token);
            }
            }else {__CLR4_5_2tctclvl36xdq.R.inc(1087);if ((((token.startsWith("-"))&&(__CLR4_5_2tctclvl36xdq.R.iget(1088)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1089)==0&false)))
            {{
                __CLR4_5_2tctclvl36xdq.R.inc(1090);if ((((token.length() == 2 || options.hasOption(token))&&(__CLR4_5_2tctclvl36xdq.R.iget(1091)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1092)==0&false)))
                {{
                    __CLR4_5_2tctclvl36xdq.R.inc(1093);processOptionToken(token, stopAtNonOption);
                }
                // requires bursting
                }else
                {{
                    __CLR4_5_2tctclvl36xdq.R.inc(1094);burstToken(token, stopAtNonOption);
                }
            }}
            }else {__CLR4_5_2tctclvl36xdq.R.inc(1095);if ((((stopAtNonOption)&&(__CLR4_5_2tctclvl36xdq.R.iget(1096)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1097)==0&false)))
            {{
                __CLR4_5_2tctclvl36xdq.R.inc(1098);processNonOptionToken(token);
            }
            }else
            {{
                __CLR4_5_2tctclvl36xdq.R.inc(1099);tokens.add(token);
            }

            }}}}__CLR4_5_2tctclvl36xdq.R.inc(1100);gobble(iter);
        }

        }__CLR4_5_2tctclvl36xdq.R.inc(1101);return (String[]) tokens.toArray(new String[tokens.size()]);
    }finally{__CLR4_5_2tctclvl36xdq.R.flushNeeded();}}

    /**
     * Adds the remaining tokens to the processed tokens list.
     *
     * @param iter An iterator over the remaining tokens
     */
    private void gobble(Iterator iter)
    {try{__CLR4_5_2tctclvl36xdq.R.inc(1102);
        __CLR4_5_2tctclvl36xdq.R.inc(1103);if ((((eatTheRest)&&(__CLR4_5_2tctclvl36xdq.R.iget(1104)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1105)==0&false)))
        {{
            __CLR4_5_2tctclvl36xdq.R.inc(1106);while ((((iter.hasNext())&&(__CLR4_5_2tctclvl36xdq.R.iget(1107)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1108)==0&false)))
            {{
                __CLR4_5_2tctclvl36xdq.R.inc(1109);tokens.add(iter.next());
            }
        }}
    }}finally{__CLR4_5_2tctclvl36xdq.R.flushNeeded();}}

    /**
     * Add the special token "<b>--</b>" and the current <code>value</code>
     * to the processed tokens list. Then add all the remaining
     * <code>argument</code> values to the processed tokens list.
     *
     * @param value The current token
     */
    private void processNonOptionToken(String value)
    {try{__CLR4_5_2tctclvl36xdq.R.inc(1110);
            __CLR4_5_2tctclvl36xdq.R.inc(1111);eatTheRest = true;
            __CLR4_5_2tctclvl36xdq.R.inc(1112);tokens.add("--");

        __CLR4_5_2tctclvl36xdq.R.inc(1113);tokens.add(value);
    }finally{__CLR4_5_2tctclvl36xdq.R.flushNeeded();}}

    /**
     * <p>If an {@link Option} exists for <code>token</code> then
     * add the token to the processed list.</p>
     *
     * <p>If an {@link Option} does not exist and <code>stopAtNonOption</code>
     * is set then add the remaining tokens to the processed tokens list
     * directly.</p>
     *
     * @param token The current option token
     * @param stopAtNonOption Specifies whether flattening should halt
     * at the first non option.
     */
    private void processOptionToken(String token, boolean stopAtNonOption)
    {try{__CLR4_5_2tctclvl36xdq.R.inc(1114);
        __CLR4_5_2tctclvl36xdq.R.inc(1115);if ((((stopAtNonOption && !options.hasOption(token))&&(__CLR4_5_2tctclvl36xdq.R.iget(1116)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1117)==0&false)))
        {{
            __CLR4_5_2tctclvl36xdq.R.inc(1118);eatTheRest = true;
        }


        }__CLR4_5_2tctclvl36xdq.R.inc(1119);tokens.add(token);
    }finally{__CLR4_5_2tctclvl36xdq.R.flushNeeded();}}

    /**
     * Breaks <code>token</code> into its constituent parts
     * using the following algorithm.
     *
     * <ul>
     *  <li>ignore the first character ("<b>-</b>")</li>
     *  <li>foreach remaining character check if an {@link Option}
     *  exists with that id.</li>
     *  <li>if an {@link Option} does exist then add that character
     *  prepended with "<b>-</b>" to the list of processed tokens.</li>
     *  <li>if the {@link Option} can have an argument value and there
     *  are remaining characters in the token then add the remaining
     *  characters as a token to the list of processed tokens.</li>
     *  <li>if an {@link Option} does <b>NOT</b> exist <b>AND</b>
     *  <code>stopAtNonOption</code> <b>IS</b> set then add the special token
     *  "<b>--</b>" followed by the remaining characters and also
     *  the remaining tokens directly to the processed tokens list.</li>
     *  <li>if an {@link Option} does <b>NOT</b> exist <b>AND</b>
     *  <code>stopAtNonOption</code> <b>IS NOT</b> set then add that
     *  character prepended with "<b>-</b>".</li>
     * </ul>
     *
     * @param token The current token to be <b>burst</b>
     * @param stopAtNonOption Specifies whether to stop processing
     * at the first non-Option encountered.
     */
    protected void burstToken(String token, boolean stopAtNonOption)
    {try{__CLR4_5_2tctclvl36xdq.R.inc(1120);
        __CLR4_5_2tctclvl36xdq.R.inc(1121);Option currentOption;
        __CLR4_5_2tctclvl36xdq.R.inc(1122);for (int i = 1; (((i < token.length())&&(__CLR4_5_2tctclvl36xdq.R.iget(1123)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1124)==0&false)); i++)
        {{
            __CLR4_5_2tctclvl36xdq.R.inc(1125);String ch = String.valueOf(token.charAt(i));

            __CLR4_5_2tctclvl36xdq.R.inc(1126);if ((((options.hasOption(ch))&&(__CLR4_5_2tctclvl36xdq.R.iget(1127)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1128)==0&false)))
            {{
                __CLR4_5_2tctclvl36xdq.R.inc(1129);tokens.add("-" + ch);
                __CLR4_5_2tctclvl36xdq.R.inc(1130);currentOption = options.getOption(ch);

                __CLR4_5_2tctclvl36xdq.R.inc(1131);if ((((currentOption.hasArg() && (token.length() != (i + 1)))&&(__CLR4_5_2tctclvl36xdq.R.iget(1132)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1133)==0&false)))
                {{
                    __CLR4_5_2tctclvl36xdq.R.inc(1134);tokens.add(token.substring(i + 1));

                    __CLR4_5_2tctclvl36xdq.R.inc(1135);break;
                }
            }}
            }else {__CLR4_5_2tctclvl36xdq.R.inc(1136);if ((((stopAtNonOption)&&(__CLR4_5_2tctclvl36xdq.R.iget(1137)!=0|true))||(__CLR4_5_2tctclvl36xdq.R.iget(1138)==0&false)))
            {{
                __CLR4_5_2tctclvl36xdq.R.inc(1139);processNonOptionToken(token.substring(i));
                __CLR4_5_2tctclvl36xdq.R.inc(1140);break;
            }
            }else
            {{
                __CLR4_5_2tctclvl36xdq.R.inc(1141);tokens.add(token);
                __CLR4_5_2tctclvl36xdq.R.inc(1142);break;
            }
        }}}
    }}finally{__CLR4_5_2tctclvl36xdq.R.flushNeeded();}}
}
