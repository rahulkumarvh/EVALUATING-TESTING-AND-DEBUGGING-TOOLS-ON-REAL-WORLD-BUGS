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
 * @deprecated Use the {@link DefaultParser} instead
 */
public class PosixParser extends Parser
{public static class __CLR4_5_212w12wlvn1n64e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521179989L,8589935092L,1505,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** holder for flattened tokens */
    private List tokens = new ArrayList();

    /** specifies if bursting should continue */
    private boolean eatTheRest;

    /** holder for the current option */
    private Option currentOption;

    /** the command line Options */
    private Options options;

    /**
     * Resets the members to their original state i.e. remove
     * all of <code>tokens</code> entries and set <code>eatTheRest</code>
     * to false.
     */
    private void init()
    {try{__CLR4_5_212w12wlvn1n64e.R.inc(1400);
        __CLR4_5_212w12wlvn1n64e.R.inc(1401);eatTheRest = false;
        __CLR4_5_212w12wlvn1n64e.R.inc(1402);tokens.clear();
    }finally{__CLR4_5_212w12wlvn1n64e.R.flushNeeded();}}

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
    protected String[] flatten(Options options, String[] arguments, boolean stopAtNonOption) throws ParseException
    {try{__CLR4_5_212w12wlvn1n64e.R.inc(1403);
        __CLR4_5_212w12wlvn1n64e.R.inc(1404);init();
        __CLR4_5_212w12wlvn1n64e.R.inc(1405);this.options = options;

        // an iterator for the command line tokens
        __CLR4_5_212w12wlvn1n64e.R.inc(1406);Iterator iter = Arrays.asList(arguments).iterator();

        // process each command line token
        __CLR4_5_212w12wlvn1n64e.R.inc(1407);while ((((iter.hasNext())&&(__CLR4_5_212w12wlvn1n64e.R.iget(1408)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1409)==0&false)))
        {{
            // get the next command line token
            __CLR4_5_212w12wlvn1n64e.R.inc(1410);String token = (String) iter.next();

            // single or double hyphen
            __CLR4_5_212w12wlvn1n64e.R.inc(1411);if (((("-".equals(token) || "--".equals(token))&&(__CLR4_5_212w12wlvn1n64e.R.iget(1412)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1413)==0&false)))
            {{
                __CLR4_5_212w12wlvn1n64e.R.inc(1414);tokens.add(token);
            }
            
            // handle long option --foo or --foo=bar
            }else {__CLR4_5_212w12wlvn1n64e.R.inc(1415);if ((((token.startsWith("--"))&&(__CLR4_5_212w12wlvn1n64e.R.iget(1416)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1417)==0&false)))
            {{
                __CLR4_5_212w12wlvn1n64e.R.inc(1418);int pos = token.indexOf('=');
                __CLR4_5_212w12wlvn1n64e.R.inc(1419);String opt = (((pos == -1 )&&(__CLR4_5_212w12wlvn1n64e.R.iget(1420)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1421)==0&false))? token : token.substring(0, pos); // --foo
                
                __CLR4_5_212w12wlvn1n64e.R.inc(1422);List matchingOpts = options.getMatchingOptions(opt);

                __CLR4_5_212w12wlvn1n64e.R.inc(1423);if ((((matchingOpts.isEmpty())&&(__CLR4_5_212w12wlvn1n64e.R.iget(1424)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1425)==0&false)))
                {{
                    __CLR4_5_212w12wlvn1n64e.R.inc(1426);processNonOptionToken(token, stopAtNonOption);
                }
                }else {__CLR4_5_212w12wlvn1n64e.R.inc(1427);if ((((matchingOpts.size() > 1)&&(__CLR4_5_212w12wlvn1n64e.R.iget(1428)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1429)==0&false)))
                {{
                    __CLR4_5_212w12wlvn1n64e.R.inc(1430);throw new AmbiguousOptionException(opt, matchingOpts);
                }
                }else
                {{
                    __CLR4_5_212w12wlvn1n64e.R.inc(1431);currentOption = options.getOption((String) matchingOpts.get(0));
                    
                    __CLR4_5_212w12wlvn1n64e.R.inc(1432);tokens.add("--" + currentOption.getLongOpt());
                    __CLR4_5_212w12wlvn1n64e.R.inc(1433);if ((((pos != -1)&&(__CLR4_5_212w12wlvn1n64e.R.iget(1434)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1435)==0&false)))
                    {{
                        __CLR4_5_212w12wlvn1n64e.R.inc(1436);tokens.add(token.substring(pos + 1));
                    }
                }}
            }}}

            }else {__CLR4_5_212w12wlvn1n64e.R.inc(1437);if ((((token.startsWith("-"))&&(__CLR4_5_212w12wlvn1n64e.R.iget(1438)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1439)==0&false)))
            {{
                __CLR4_5_212w12wlvn1n64e.R.inc(1440);if ((((token.length() == 2 || options.hasOption(token))&&(__CLR4_5_212w12wlvn1n64e.R.iget(1441)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1442)==0&false)))
                {{
                    __CLR4_5_212w12wlvn1n64e.R.inc(1443);processOptionToken(token, stopAtNonOption);
                }
                }else {__CLR4_5_212w12wlvn1n64e.R.inc(1444);if ((((!options.getMatchingOptions(token).isEmpty())&&(__CLR4_5_212w12wlvn1n64e.R.iget(1445)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1446)==0&false)))
                {{
                    __CLR4_5_212w12wlvn1n64e.R.inc(1447);List matchingOpts = options.getMatchingOptions(token);
                    __CLR4_5_212w12wlvn1n64e.R.inc(1448);if ((((matchingOpts.size() > 1)&&(__CLR4_5_212w12wlvn1n64e.R.iget(1449)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1450)==0&false)))
                    {{
                        __CLR4_5_212w12wlvn1n64e.R.inc(1451);throw new AmbiguousOptionException(token, matchingOpts);
                    }
                    }else
                    {{
                        __CLR4_5_212w12wlvn1n64e.R.inc(1452);Option opt = options.getOption((String) matchingOpts.get(0));
                        __CLR4_5_212w12wlvn1n64e.R.inc(1453);processOptionToken("-" + opt.getLongOpt(), stopAtNonOption);
                    }
                }}
                // requires bursting
                }else
                {{
                    __CLR4_5_212w12wlvn1n64e.R.inc(1454);burstToken(token, stopAtNonOption);
                }
            }}}
            }else
            {{
                __CLR4_5_212w12wlvn1n64e.R.inc(1455);processNonOptionToken(token, stopAtNonOption);
            }

            }}}__CLR4_5_212w12wlvn1n64e.R.inc(1456);gobble(iter);
        }

        }__CLR4_5_212w12wlvn1n64e.R.inc(1457);return (String[]) tokens.toArray(new String[tokens.size()]);
    }finally{__CLR4_5_212w12wlvn1n64e.R.flushNeeded();}}

    /**
     * Adds the remaining tokens to the processed tokens list.
     *
     * @param iter An iterator over the remaining tokens
     */
    private void gobble(Iterator iter)
    {try{__CLR4_5_212w12wlvn1n64e.R.inc(1458);
        __CLR4_5_212w12wlvn1n64e.R.inc(1459);if ((((eatTheRest)&&(__CLR4_5_212w12wlvn1n64e.R.iget(1460)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1461)==0&false)))
        {{
            __CLR4_5_212w12wlvn1n64e.R.inc(1462);while ((((iter.hasNext())&&(__CLR4_5_212w12wlvn1n64e.R.iget(1463)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1464)==0&false)))
            {{
                __CLR4_5_212w12wlvn1n64e.R.inc(1465);tokens.add(iter.next());
            }
        }}
    }}finally{__CLR4_5_212w12wlvn1n64e.R.flushNeeded();}}

    /**
     * Add the special token "<b>--</b>" and the current <code>value</code>
     * to the processed tokens list. Then add all the remaining
     * <code>argument</code> values to the processed tokens list.
     *
     * @param value The current token
     */
    private void processNonOptionToken(String value, boolean stopAtNonOption)
    {try{__CLR4_5_212w12wlvn1n64e.R.inc(1466);
        __CLR4_5_212w12wlvn1n64e.R.inc(1467);if ((((stopAtNonOption && (currentOption == null || !currentOption.hasArg()))&&(__CLR4_5_212w12wlvn1n64e.R.iget(1468)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1469)==0&false)))
        {{
            __CLR4_5_212w12wlvn1n64e.R.inc(1470);eatTheRest = true;
            __CLR4_5_212w12wlvn1n64e.R.inc(1471);tokens.add("--");
        }

        }__CLR4_5_212w12wlvn1n64e.R.inc(1472);tokens.add(value);
    }finally{__CLR4_5_212w12wlvn1n64e.R.flushNeeded();}}

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
    {try{__CLR4_5_212w12wlvn1n64e.R.inc(1473);
        __CLR4_5_212w12wlvn1n64e.R.inc(1474);if ((((stopAtNonOption && !options.hasOption(token))&&(__CLR4_5_212w12wlvn1n64e.R.iget(1475)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1476)==0&false)))
        {{
            __CLR4_5_212w12wlvn1n64e.R.inc(1477);eatTheRest = true;
        }

        }__CLR4_5_212w12wlvn1n64e.R.inc(1478);if ((((options.hasOption(token))&&(__CLR4_5_212w12wlvn1n64e.R.iget(1479)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1480)==0&false)))
        {{
            __CLR4_5_212w12wlvn1n64e.R.inc(1481);currentOption = options.getOption(token);
        }

        }__CLR4_5_212w12wlvn1n64e.R.inc(1482);tokens.add(token);
    }finally{__CLR4_5_212w12wlvn1n64e.R.flushNeeded();}}

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
    {try{__CLR4_5_212w12wlvn1n64e.R.inc(1483);
        __CLR4_5_212w12wlvn1n64e.R.inc(1484);for (int i = 1; (((i < token.length())&&(__CLR4_5_212w12wlvn1n64e.R.iget(1485)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1486)==0&false)); i++)
        {{
            __CLR4_5_212w12wlvn1n64e.R.inc(1487);String ch = String.valueOf(token.charAt(i));

            __CLR4_5_212w12wlvn1n64e.R.inc(1488);if ((((options.hasOption(ch))&&(__CLR4_5_212w12wlvn1n64e.R.iget(1489)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1490)==0&false)))
            {{
                __CLR4_5_212w12wlvn1n64e.R.inc(1491);tokens.add("-" + ch);
                __CLR4_5_212w12wlvn1n64e.R.inc(1492);currentOption = options.getOption(ch);

                __CLR4_5_212w12wlvn1n64e.R.inc(1493);if ((((currentOption.hasArg() && (token.length() != (i + 1)))&&(__CLR4_5_212w12wlvn1n64e.R.iget(1494)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1495)==0&false)))
                {{
                    __CLR4_5_212w12wlvn1n64e.R.inc(1496);tokens.add(token.substring(i + 1));

                    __CLR4_5_212w12wlvn1n64e.R.inc(1497);break;
                }
            }}
            }else {__CLR4_5_212w12wlvn1n64e.R.inc(1498);if ((((stopAtNonOption)&&(__CLR4_5_212w12wlvn1n64e.R.iget(1499)!=0|true))||(__CLR4_5_212w12wlvn1n64e.R.iget(1500)==0&false)))
            {{
                __CLR4_5_212w12wlvn1n64e.R.inc(1501);processNonOptionToken(token.substring(i), true);
                __CLR4_5_212w12wlvn1n64e.R.inc(1502);break;
            }
            }else
            {{
                __CLR4_5_212w12wlvn1n64e.R.inc(1503);tokens.add(token);
                __CLR4_5_212w12wlvn1n64e.R.inc(1504);break;
            }
        }}}
    }}finally{__CLR4_5_212w12wlvn1n64e.R.flushNeeded();}}
}
