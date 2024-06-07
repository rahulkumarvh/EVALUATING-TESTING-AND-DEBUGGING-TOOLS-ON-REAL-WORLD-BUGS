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
import java.util.List;

/**
 * The class GnuParser provides an implementation of the 
 * {@link Parser#flatten(Options,String[],boolean) flatten} method.
 *
 * @author John Keyes (john at integralsource.com)
 * @see Parser
 * @version $Revision$
 */
public class GnuParser extends Parser {public static class __CLR4_5_23131lvkk1ret{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370696164L,8589935092L,154,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>This flatten method does so using the following rules:
     * <ol>
     *  <li>If an {@link Option} exists for the first character of 
     *  the <code>arguments</code> entry <b>AND</b> an {@link Option} 
     *  does not exist for the whole <code>argument</code> then
     *  add the first character as an option to the processed tokens
     *  list e.g. "-D" and add the rest of the entry to the also.</li>
     *  <li>Otherwise just add the token to the processed tokens list.
     *  </li>
     * </ol>
     * </p>
     *
     * @param options The Options to parse the arguments by.
     * @param arguments The arguments that have to be flattened.
     * @param stopAtNonOption specifies whether to stop 
     * flattening when a non option has been encountered
     * @return a String array of the flattened arguments
     */
    protected String[] flatten(Options options, String[] arguments, boolean stopAtNonOption)
    {try{__CLR4_5_23131lvkk1ret.R.inc(109);
        __CLR4_5_23131lvkk1ret.R.inc(110);List tokens = new ArrayList();

        __CLR4_5_23131lvkk1ret.R.inc(111);boolean eatTheRest = false;

        __CLR4_5_23131lvkk1ret.R.inc(112);for (int i = 0; (((i < arguments.length)&&(__CLR4_5_23131lvkk1ret.R.iget(113)!=0|true))||(__CLR4_5_23131lvkk1ret.R.iget(114)==0&false)); i++)
        {{
            __CLR4_5_23131lvkk1ret.R.inc(115);String arg = arguments[i];

            __CLR4_5_23131lvkk1ret.R.inc(116);if (((("--".equals(arg))&&(__CLR4_5_23131lvkk1ret.R.iget(117)!=0|true))||(__CLR4_5_23131lvkk1ret.R.iget(118)==0&false)))
            {{
                __CLR4_5_23131lvkk1ret.R.inc(119);eatTheRest = true;
                __CLR4_5_23131lvkk1ret.R.inc(120);tokens.add("--");
            }
            }else {__CLR4_5_23131lvkk1ret.R.inc(121);if (((("-".equals(arg))&&(__CLR4_5_23131lvkk1ret.R.iget(122)!=0|true))||(__CLR4_5_23131lvkk1ret.R.iget(123)==0&false)))
            {{
                __CLR4_5_23131lvkk1ret.R.inc(124);tokens.add("-");
            }
            }else {__CLR4_5_23131lvkk1ret.R.inc(125);if ((((arg.startsWith("-"))&&(__CLR4_5_23131lvkk1ret.R.iget(126)!=0|true))||(__CLR4_5_23131lvkk1ret.R.iget(127)==0&false)))
            {{
                __CLR4_5_23131lvkk1ret.R.inc(128);String opt = Util.stripLeadingHyphens(arg);

                __CLR4_5_23131lvkk1ret.R.inc(129);if ((((options.hasOption(opt))&&(__CLR4_5_23131lvkk1ret.R.iget(130)!=0|true))||(__CLR4_5_23131lvkk1ret.R.iget(131)==0&false)))
                {{
                    __CLR4_5_23131lvkk1ret.R.inc(132);tokens.add(arg);
                }
                }else
                {{
                    __CLR4_5_23131lvkk1ret.R.inc(133);if ((((opt.indexOf('=') != -1 && options.hasOption(opt.substring(0, opt.indexOf('='))))&&(__CLR4_5_23131lvkk1ret.R.iget(134)!=0|true))||(__CLR4_5_23131lvkk1ret.R.iget(135)==0&false)))
                    {{
                        // the format is --foo=value or -foo=value
                        __CLR4_5_23131lvkk1ret.R.inc(136);tokens.add(arg.substring(0, arg.indexOf('='))); // --foo
                        __CLR4_5_23131lvkk1ret.R.inc(137);tokens.add(arg.substring(arg.indexOf('=') + 1)); // value
                    }
                    }else {__CLR4_5_23131lvkk1ret.R.inc(138);if ((((options.hasOption(arg.substring(0, 2)))&&(__CLR4_5_23131lvkk1ret.R.iget(139)!=0|true))||(__CLR4_5_23131lvkk1ret.R.iget(140)==0&false)))
                    {{
                        // the format is a special properties option (-Dproperty=value)
                        __CLR4_5_23131lvkk1ret.R.inc(141);tokens.add(arg.substring(0, 2)); // -D
                        __CLR4_5_23131lvkk1ret.R.inc(142);tokens.add(arg.substring(2)); // property=value
                    }
                    }else
                    {{
                        __CLR4_5_23131lvkk1ret.R.inc(143);eatTheRest = stopAtNonOption;
                        __CLR4_5_23131lvkk1ret.R.inc(144);tokens.add(arg);
                    }
                }}}
            }}
            }else
            {{
                __CLR4_5_23131lvkk1ret.R.inc(145);tokens.add(arg);
            }

            }}}__CLR4_5_23131lvkk1ret.R.inc(146);if ((((eatTheRest)&&(__CLR4_5_23131lvkk1ret.R.iget(147)!=0|true))||(__CLR4_5_23131lvkk1ret.R.iget(148)==0&false)))
            {{
                __CLR4_5_23131lvkk1ret.R.inc(149);for (i++; (((i < arguments.length)&&(__CLR4_5_23131lvkk1ret.R.iget(150)!=0|true))||(__CLR4_5_23131lvkk1ret.R.iget(151)==0&false)); i++)
                {{
                    __CLR4_5_23131lvkk1ret.R.inc(152);tokens.add(arguments[i]);
                }
            }}
        }}

        }__CLR4_5_23131lvkk1ret.R.inc(153);return (String[]) tokens.toArray(new String[tokens.size()]);
    }finally{__CLR4_5_23131lvkk1ret.R.flushNeeded();}}
}
