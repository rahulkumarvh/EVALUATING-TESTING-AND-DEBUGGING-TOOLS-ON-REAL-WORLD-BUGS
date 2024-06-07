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
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/**
 * Default parser.
 * 
 * @author Emmanuel Bourg
 * @version $Revision$, $Date$
 * @since 1.3
 */
public class DefaultParser implements CommandLineParser
{public static class __CLR4_5_23s3slvn1ndjs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521190328L,8589935092L,423,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;    
    protected CommandLine cmd;
    protected Options options;

    /** 
     * Flag indicating how unrecognized tokens are handled. <tt>true</tt> to stop
     * the parsing and add the remaining tokens to the args list.
     * <tt>false</tt> to throw an exception. 
     */
    protected boolean stopAtNonOption;

    /** The token currently processed. */
    protected String currentToken;
    
    /** The last option parsed. */
    protected Option currentOption;
    
    /** Flag indicating if tokens should no longer be analysed and simply added as arguments of the command line. */
    protected boolean skipParsing;
    
    /** The required options expected to be found when parsing the command line. */
    protected List expectedOpts;
    
    public CommandLine parse(Options options, String[] arguments) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(136);
        __CLR4_5_23s3slvn1ndjs.R.inc(137);return parse(options, arguments, null);
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Parse the arguments according to the specified options and properties.
     *
     * @param options    the specified Options
     * @param arguments  the command line arguments
     * @param properties command line option name-value pairs
     * @return the list of atomic option and value tokens
     *
     * @throws ParseException if there are any problems encountered
     * while parsing the command line tokens.
     */
    public CommandLine parse(Options options, String[] arguments, Properties properties) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(138);
        __CLR4_5_23s3slvn1ndjs.R.inc(139);return parse(options, arguments, properties, false);
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    public CommandLine parse(Options options, String[] arguments, boolean stopAtNonOption) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(140);
        __CLR4_5_23s3slvn1ndjs.R.inc(141);return parse(options, arguments, null, stopAtNonOption);
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Parse the arguments according to the specified options and properties.
     *
     * @param options         the specified Options
     * @param arguments       the command line arguments
     * @param properties      command line option name-value pairs
     * @param stopAtNonOption if <tt>true</tt> an unrecognized argument stops
     *     the parsing and the remaining arguments are added to the 
     *     {@link CommandLine}s args list. If <tt>false</tt> an unrecognized
     *     argument triggers a ParseException.
     *
     * @return the list of atomic option and value tokens
     * @throws ParseException if there are any problems encountered
     * while parsing the command line tokens.
     */
    public CommandLine parse(Options options, String[] arguments, Properties properties, boolean stopAtNonOption) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(142);
        __CLR4_5_23s3slvn1ndjs.R.inc(143);this.options = options;
        __CLR4_5_23s3slvn1ndjs.R.inc(144);this.stopAtNonOption = stopAtNonOption;
        __CLR4_5_23s3slvn1ndjs.R.inc(145);skipParsing = false;
        __CLR4_5_23s3slvn1ndjs.R.inc(146);currentOption = null;
        __CLR4_5_23s3slvn1ndjs.R.inc(147);expectedOpts = new ArrayList(options.getRequiredOptions());
        
        // clear the data from the groups
        __CLR4_5_23s3slvn1ndjs.R.inc(148);for (Iterator it = options.getOptionGroups().iterator(); (((it.hasNext())&&(__CLR4_5_23s3slvn1ndjs.R.iget(149)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(150)==0&false));)
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(151);OptionGroup group = (OptionGroup) it.next();
            __CLR4_5_23s3slvn1ndjs.R.inc(152);group.setSelected(null);
        }
        
        }__CLR4_5_23s3slvn1ndjs.R.inc(153);cmd = new CommandLine();

        __CLR4_5_23s3slvn1ndjs.R.inc(154);if ((((arguments != null)&&(__CLR4_5_23s3slvn1ndjs.R.iget(155)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(156)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(157);for (int i = 0; (((i < arguments.length)&&(__CLR4_5_23s3slvn1ndjs.R.iget(158)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(159)==0&false)); i++)
            {{
                __CLR4_5_23s3slvn1ndjs.R.inc(160);handleToken(arguments[i]);
            }
        }}
        
        // check the arguments of the last option
        }__CLR4_5_23s3slvn1ndjs.R.inc(161);checkRequiredArgs();
        
        // add the default options
        __CLR4_5_23s3slvn1ndjs.R.inc(162);handleProperties(properties);
        
        __CLR4_5_23s3slvn1ndjs.R.inc(163);checkRequiredOptions();
        
        __CLR4_5_23s3slvn1ndjs.R.inc(164);return cmd;
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Sets the values of Options using the values in <code>properties</code>.
     *
     * @param properties The value properties to be processed.
     */
    private void handleProperties(Properties properties) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(165);
        __CLR4_5_23s3slvn1ndjs.R.inc(166);if ((((properties == null)&&(__CLR4_5_23s3slvn1ndjs.R.iget(167)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(168)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(169);return;
        }
        
        }__CLR4_5_23s3slvn1ndjs.R.inc(170);for (Enumeration e = properties.propertyNames(); (((e.hasMoreElements())&&(__CLR4_5_23s3slvn1ndjs.R.iget(171)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(172)==0&false));)
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(173);String option = e.nextElement().toString();
            
            __CLR4_5_23s3slvn1ndjs.R.inc(174);if ((((!cmd.hasOption(option))&&(__CLR4_5_23s3slvn1ndjs.R.iget(175)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(176)==0&false)))
            {{
                __CLR4_5_23s3slvn1ndjs.R.inc(177);Option opt = options.getOption(option);
            
            // if the option is part of a group, check if another option of the group has been selected
            
                // get the value from the properties
                __CLR4_5_23s3slvn1ndjs.R.inc(178);String value = properties.getProperty(option);
                
                __CLR4_5_23s3slvn1ndjs.R.inc(179);if ((((opt.hasArg())&&(__CLR4_5_23s3slvn1ndjs.R.iget(180)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(181)==0&false)))
                {{
                    __CLR4_5_23s3slvn1ndjs.R.inc(182);if ((((opt.getValues() == null || opt.getValues().length == 0)&&(__CLR4_5_23s3slvn1ndjs.R.iget(183)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(184)==0&false)))
                    {{
                        __CLR4_5_23s3slvn1ndjs.R.inc(185);opt.addValueForProcessing(value);
                    }
                }}
                }else {__CLR4_5_23s3slvn1ndjs.R.inc(186);if ((((!("yes".equalsIgnoreCase(value)
                        || "true".equalsIgnoreCase(value)
                        || "1".equalsIgnoreCase(value)))&&(__CLR4_5_23s3slvn1ndjs.R.iget(187)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(188)==0&false)))
                {{
                    // if the value is not yes, true or 1 then don't add the option to the CommandLine
                    __CLR4_5_23s3slvn1ndjs.R.inc(189);continue;
                }
                
                }}__CLR4_5_23s3slvn1ndjs.R.inc(190);handleOption(opt);
                __CLR4_5_23s3slvn1ndjs.R.inc(191);currentOption = null;
            }
        }}
    }}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Throws a {@link MissingOptionException} if all of the required options
     * are not present.
     *
     * @throws MissingOptionException if any of the required Options
     * are not present.
     */
    private void checkRequiredOptions() throws MissingOptionException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(192);       
        // if there are required options that have not been processsed
        __CLR4_5_23s3slvn1ndjs.R.inc(193);if ((((!expectedOpts.isEmpty())&&(__CLR4_5_23s3slvn1ndjs.R.iget(194)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(195)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(196);throw new MissingOptionException(expectedOpts);
        }
    }}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Throw a {@link MissingArgumentException} if the current option
     * didn't receive the number of arguments expected.
     */
    private void checkRequiredArgs() throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(197);
        __CLR4_5_23s3slvn1ndjs.R.inc(198);if ((((currentOption != null && currentOption.requiresArg())&&(__CLR4_5_23s3slvn1ndjs.R.iget(199)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(200)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(201);throw new MissingArgumentException(currentOption);
        }
    }}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Handle any command line token.
     * 
     * @param token the command line token to handle
     * @throws ParseException
     */
    private void handleToken(String token) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(202);
        __CLR4_5_23s3slvn1ndjs.R.inc(203);currentToken = token;
        
        __CLR4_5_23s3slvn1ndjs.R.inc(204);if ((((skipParsing)&&(__CLR4_5_23s3slvn1ndjs.R.iget(205)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(206)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(207);cmd.addArg(token);
        }
        }else {__CLR4_5_23s3slvn1ndjs.R.inc(208);if (((("--".equals(token))&&(__CLR4_5_23s3slvn1ndjs.R.iget(209)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(210)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(211);skipParsing = true;
        }
        }else {__CLR4_5_23s3slvn1ndjs.R.inc(212);if ((((currentOption != null && currentOption.acceptsArg() && isArgument(token))&&(__CLR4_5_23s3slvn1ndjs.R.iget(213)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(214)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(215);currentOption.addValueForProcessing(Util.stripLeadingAndTrailingQuotes(token));
        }
        }else {__CLR4_5_23s3slvn1ndjs.R.inc(216);if ((((token.startsWith("--"))&&(__CLR4_5_23s3slvn1ndjs.R.iget(217)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(218)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(219);handleLongOption(token);
        }
        }else {__CLR4_5_23s3slvn1ndjs.R.inc(220);if ((((token.startsWith("-") && !"-".equals(token))&&(__CLR4_5_23s3slvn1ndjs.R.iget(221)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(222)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(223);handleShortAndLongOption(token);
        }
        }else
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(224);handleUnknownToken(token);
        }
        
        }}}}}__CLR4_5_23s3slvn1ndjs.R.inc(225);if ((((currentOption != null && !currentOption.acceptsArg())&&(__CLR4_5_23s3slvn1ndjs.R.iget(226)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(227)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(228);currentOption = null;
        }
    }}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Returns true is the token is a valid argument.
     * 
     * @param token
     */
    private boolean isArgument(String token)
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(229);
        __CLR4_5_23s3slvn1ndjs.R.inc(230);return !isOption(token) || isNegativeNumber(token);
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Check if the token is a negative number.
     * 
     * @param token
     */
    private boolean isNegativeNumber(String token)
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(231);
        __CLR4_5_23s3slvn1ndjs.R.inc(232);try
        {
            __CLR4_5_23s3slvn1ndjs.R.inc(233);Double.parseDouble(token);
            __CLR4_5_23s3slvn1ndjs.R.inc(234);return true;
        }
        catch (NumberFormatException e)
        {
            __CLR4_5_23s3slvn1ndjs.R.inc(235);return false;
        }
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Tells if the token looks like an option.
     * 
     * @param token
     */
    private boolean isOption(String token)
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(236);
        __CLR4_5_23s3slvn1ndjs.R.inc(237);return isLongOption(token) || isShortOption(token);
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Tells if the token looks like a short option.
     * 
     * @param token
     */
    private boolean isShortOption(String token)
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(238);
        // short options (-S, -SV, -S=V, -SV1=V2, -S1S2)
        __CLR4_5_23s3slvn1ndjs.R.inc(239);return token.startsWith("-") && token.length() >= 2 && options.hasShortOption(token.substring(1, 2));
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Tells if the token looks like a long option.
     * 
     * @param token
     */
    private boolean isLongOption(String token)
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(240);
        __CLR4_5_23s3slvn1ndjs.R.inc(241);if ((((!token.startsWith("-") || token.length() == 1)&&(__CLR4_5_23s3slvn1ndjs.R.iget(242)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(243)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(244);return false;
        }

        }__CLR4_5_23s3slvn1ndjs.R.inc(245);int pos = token.indexOf("=");
        __CLR4_5_23s3slvn1ndjs.R.inc(246);String t = (((pos == -1 )&&(__CLR4_5_23s3slvn1ndjs.R.iget(247)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(248)==0&false))? token : token.substring(0, pos);
        
        __CLR4_5_23s3slvn1ndjs.R.inc(249);if ((((!options.getMatchingOptions(t).isEmpty())&&(__CLR4_5_23s3slvn1ndjs.R.iget(250)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(251)==0&false)))
        {{
            // long or partial long options (--L, -L, --L=V, -L=V, --l, --l=V)
            __CLR4_5_23s3slvn1ndjs.R.inc(252);return true;
        }
        }else {__CLR4_5_23s3slvn1ndjs.R.inc(253);if ((((getLongPrefix(token) != null && !token.startsWith("--"))&&(__CLR4_5_23s3slvn1ndjs.R.iget(254)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(255)==0&false)))
        {{
            // -LV
            __CLR4_5_23s3slvn1ndjs.R.inc(256);return true;
        }

        }}__CLR4_5_23s3slvn1ndjs.R.inc(257);return false;
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Handles an unknown token. If the token starts with a dash an 
     * UnrecognizedOptionException is thrown. Otherwise the token is added 
     * to the arguments of the command line. If the stopAtNonOption flag 
     * is set, this stops the parsing and the remaining tokens are added 
     * as-is in the arguments of the command line.
     * 
     * @param token the command line token to handle
     */
    private void handleUnknownToken(String token) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(258);
        __CLR4_5_23s3slvn1ndjs.R.inc(259);if ((((token.startsWith("-") && token.length() > 1 && !stopAtNonOption)&&(__CLR4_5_23s3slvn1ndjs.R.iget(260)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(261)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(262);throw new UnrecognizedOptionException("Unrecognized option: " + token, token);
        }
        
        }__CLR4_5_23s3slvn1ndjs.R.inc(263);cmd.addArg(token);
        __CLR4_5_23s3slvn1ndjs.R.inc(264);if ((((stopAtNonOption)&&(__CLR4_5_23s3slvn1ndjs.R.iget(265)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(266)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(267);skipParsing = true;
        }
    }}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Handles the following tokens:
     * 
     * --L
     * --L=V
     * --L V
     * --l
     * 
     * @param token the command line token to handle
     */
    private void handleLongOption(String token) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(268);
        __CLR4_5_23s3slvn1ndjs.R.inc(269);if ((((token.indexOf('=') == -1)&&(__CLR4_5_23s3slvn1ndjs.R.iget(270)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(271)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(272);handleLongOptionWithoutEqual(token);
        }
        }else
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(273);handleLongOptionWithEqual(token);                                   
        }
    }}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Handles the following tokens:
     * 
     * --L
     * -L
     * --l
     * -l
     * 
     * @param token the command line token to handle
     */
    private void handleLongOptionWithoutEqual(String token) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(274);
        __CLR4_5_23s3slvn1ndjs.R.inc(275);List matchingOpts = options.getMatchingOptions(token);
        __CLR4_5_23s3slvn1ndjs.R.inc(276);if ((((matchingOpts.isEmpty())&&(__CLR4_5_23s3slvn1ndjs.R.iget(277)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(278)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(279);handleUnknownToken(currentToken);
        }
        }else {__CLR4_5_23s3slvn1ndjs.R.inc(280);if ((((matchingOpts.size() > 1)&&(__CLR4_5_23s3slvn1ndjs.R.iget(281)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(282)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(283);throw new AmbiguousOptionException(token, matchingOpts);
        }
        }else
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(284);handleOption(options.getOption((String) matchingOpts.get(0)));
        }
    }}}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Handles the following tokens:
     * 
     * --L=V
     * -L=V
     * --l=V
     * -l=V
     * 
     * @param token the command line token to handle
     */
    private void handleLongOptionWithEqual(String token) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(285);
        __CLR4_5_23s3slvn1ndjs.R.inc(286);int pos = token.indexOf('=');

        __CLR4_5_23s3slvn1ndjs.R.inc(287);String value = token.substring(pos + 1);
        
        __CLR4_5_23s3slvn1ndjs.R.inc(288);String opt = token.substring(0, pos);
        
        __CLR4_5_23s3slvn1ndjs.R.inc(289);List matchingOpts = options.getMatchingOptions(opt);
        __CLR4_5_23s3slvn1ndjs.R.inc(290);if ((((matchingOpts.isEmpty())&&(__CLR4_5_23s3slvn1ndjs.R.iget(291)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(292)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(293);handleUnknownToken(currentToken);
        }
        }else {__CLR4_5_23s3slvn1ndjs.R.inc(294);if ((((matchingOpts.size() > 1)&&(__CLR4_5_23s3slvn1ndjs.R.iget(295)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(296)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(297);throw new AmbiguousOptionException(opt, matchingOpts);
        }
        }else
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(298);Option option = options.getOption((String) matchingOpts.get(0));
            
            __CLR4_5_23s3slvn1ndjs.R.inc(299);if ((((option.acceptsArg())&&(__CLR4_5_23s3slvn1ndjs.R.iget(300)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(301)==0&false)))
            {{
                __CLR4_5_23s3slvn1ndjs.R.inc(302);handleOption(option);
                __CLR4_5_23s3slvn1ndjs.R.inc(303);currentOption.addValueForProcessing(value);
                __CLR4_5_23s3slvn1ndjs.R.inc(304);currentOption = null;
            }
            }else
            {{
                __CLR4_5_23s3slvn1ndjs.R.inc(305);handleUnknownToken(currentToken);
            }
        }}
    }}}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Handles the following tokens:
     * 
     * -S
     * -SV
     * -S V
     * -S=V
     * -S1S2
     * -S1S2 V
     * -SV1=V2
     * 
     * -L
     * -LV
     * -L V
     * -L=V
     * -l
     * 
     * @param token the command line token to handle
     */
    private void handleShortAndLongOption(String token) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(306);
        __CLR4_5_23s3slvn1ndjs.R.inc(307);String t = Util.stripLeadingHyphens(token);
        
        __CLR4_5_23s3slvn1ndjs.R.inc(308);int pos = t.indexOf('=');
        
        __CLR4_5_23s3slvn1ndjs.R.inc(309);if ((((t.length() == 1)&&(__CLR4_5_23s3slvn1ndjs.R.iget(310)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(311)==0&false)))
        {{
            // -S
            __CLR4_5_23s3slvn1ndjs.R.inc(312);if ((((options.hasShortOption(t))&&(__CLR4_5_23s3slvn1ndjs.R.iget(313)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(314)==0&false)))
            {{
                __CLR4_5_23s3slvn1ndjs.R.inc(315);handleOption(options.getOption(t));
            }
            }else
            {{
                __CLR4_5_23s3slvn1ndjs.R.inc(316);handleUnknownToken(token);
            }
        }}
        }else {__CLR4_5_23s3slvn1ndjs.R.inc(317);if ((((pos == -1)&&(__CLR4_5_23s3slvn1ndjs.R.iget(318)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(319)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(320);if ((((options.hasShortOption(t))&&(__CLR4_5_23s3slvn1ndjs.R.iget(321)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(322)==0&false)))
            {{
                __CLR4_5_23s3slvn1ndjs.R.inc(323);handleOption(options.getOption(t));
            }
            }else {__CLR4_5_23s3slvn1ndjs.R.inc(324);if ((((!options.getMatchingOptions(t).isEmpty())&&(__CLR4_5_23s3slvn1ndjs.R.iget(325)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(326)==0&false)))
            {{
                // -L or -l
                __CLR4_5_23s3slvn1ndjs.R.inc(327);handleLongOptionWithoutEqual(token);
            }
            }else
            {{
                // look for a long prefix (-Xmx512m)
                __CLR4_5_23s3slvn1ndjs.R.inc(328);String opt = getLongPrefix(t);
                
                __CLR4_5_23s3slvn1ndjs.R.inc(329);if ((((opt != null && options.getOption(opt).acceptsArg())&&(__CLR4_5_23s3slvn1ndjs.R.iget(330)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(331)==0&false)))
                {{
                    __CLR4_5_23s3slvn1ndjs.R.inc(332);handleOption(options.getOption(opt));
                    __CLR4_5_23s3slvn1ndjs.R.inc(333);currentOption.addValueForProcessing(t.substring(opt.length()));
                    __CLR4_5_23s3slvn1ndjs.R.inc(334);currentOption = null;
                }
                }else {__CLR4_5_23s3slvn1ndjs.R.inc(335);if ((((isJavaProperty(t))&&(__CLR4_5_23s3slvn1ndjs.R.iget(336)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(337)==0&false)))
                {{
                    // -SV1 (-Dflag)
                    __CLR4_5_23s3slvn1ndjs.R.inc(338);handleOption(options.getOption(t.substring(0, 1)));
                    __CLR4_5_23s3slvn1ndjs.R.inc(339);currentOption.addValueForProcessing(t.substring(1));
                    __CLR4_5_23s3slvn1ndjs.R.inc(340);currentOption = null;
                }
                }else
                {{
                    // -S1S2S3 or -S1S2V
                    __CLR4_5_23s3slvn1ndjs.R.inc(341);handleConcatenatedOptions(token);
                }
            }}}
        }}}
        }else
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(342);String opt = t.substring(0, pos);
            __CLR4_5_23s3slvn1ndjs.R.inc(343);String value = t.substring(pos + 1);
            
            __CLR4_5_23s3slvn1ndjs.R.inc(344);if ((((opt.length() == 1)&&(__CLR4_5_23s3slvn1ndjs.R.iget(345)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(346)==0&false)))
            {{
                // -S=V
                __CLR4_5_23s3slvn1ndjs.R.inc(347);Option option = options.getOption(opt);
                __CLR4_5_23s3slvn1ndjs.R.inc(348);if ((((option != null && option.acceptsArg())&&(__CLR4_5_23s3slvn1ndjs.R.iget(349)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(350)==0&false)))
                {{
                    __CLR4_5_23s3slvn1ndjs.R.inc(351);handleOption(option);
                    __CLR4_5_23s3slvn1ndjs.R.inc(352);currentOption.addValueForProcessing(value);
                    __CLR4_5_23s3slvn1ndjs.R.inc(353);currentOption = null;
                }
                }else
                {{
                    __CLR4_5_23s3slvn1ndjs.R.inc(354);handleUnknownToken(token);
                }
            }}
            }else {__CLR4_5_23s3slvn1ndjs.R.inc(355);if ((((isJavaProperty(opt))&&(__CLR4_5_23s3slvn1ndjs.R.iget(356)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(357)==0&false)))
            {{
                // -SV1=V2 (-Dkey=value)
                __CLR4_5_23s3slvn1ndjs.R.inc(358);handleOption(options.getOption(opt.substring(0, 1)));
                __CLR4_5_23s3slvn1ndjs.R.inc(359);currentOption.addValueForProcessing(opt.substring(1));
                __CLR4_5_23s3slvn1ndjs.R.inc(360);currentOption.addValueForProcessing(value);
                __CLR4_5_23s3slvn1ndjs.R.inc(361);currentOption = null;
            }
            }else
            {{
                // -L=V or -l=V
                __CLR4_5_23s3slvn1ndjs.R.inc(362);handleLongOptionWithEqual(token);
            }
        }}}
    }}}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Search for a prefix that is the long name of an option (-Xmx512m)
     * 
     * @param token
     */
    private String getLongPrefix(String token)
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(363);
        __CLR4_5_23s3slvn1ndjs.R.inc(364);String t = Util.stripLeadingHyphens(token);
        
        __CLR4_5_23s3slvn1ndjs.R.inc(365);int i;
        __CLR4_5_23s3slvn1ndjs.R.inc(366);String opt = null;
        __CLR4_5_23s3slvn1ndjs.R.inc(367);for (i = t.length() - 2; (((i > 1)&&(__CLR4_5_23s3slvn1ndjs.R.iget(368)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(369)==0&false)); i--)
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(370);String prefix = t.substring(0, i);
            __CLR4_5_23s3slvn1ndjs.R.inc(371);if ((((options.hasLongOption(prefix))&&(__CLR4_5_23s3slvn1ndjs.R.iget(372)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(373)==0&false)))
            {{
                __CLR4_5_23s3slvn1ndjs.R.inc(374);opt = prefix;
                __CLR4_5_23s3slvn1ndjs.R.inc(375);break;
            }
        }}
        
        }__CLR4_5_23s3slvn1ndjs.R.inc(376);return opt;
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Check if the specified token is a Java-like property (-Dkey=value).
     */
    private boolean isJavaProperty(String token)
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(377);
        __CLR4_5_23s3slvn1ndjs.R.inc(378);String opt = token.substring(0, 1);
        __CLR4_5_23s3slvn1ndjs.R.inc(379);Option option = options.getOption(opt);
        
        __CLR4_5_23s3slvn1ndjs.R.inc(380);return option != null && (option.getArgs() >= 2 || option.getArgs() == Option.UNLIMITED_VALUES);
    }finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    private void handleOption(Option option) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(381);
        // check the previous option before handling the next one
        __CLR4_5_23s3slvn1ndjs.R.inc(382);checkRequiredArgs();
        
        __CLR4_5_23s3slvn1ndjs.R.inc(383);option = (Option) option.clone();
        
        __CLR4_5_23s3slvn1ndjs.R.inc(384);updateRequiredOptions(option);
        
        __CLR4_5_23s3slvn1ndjs.R.inc(385);cmd.addOption(option);
        
        __CLR4_5_23s3slvn1ndjs.R.inc(386);if ((((option.hasArg())&&(__CLR4_5_23s3slvn1ndjs.R.iget(387)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(388)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(389);currentOption = option;            
        }
        }else
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(390);currentOption = null;
        }
    }}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

    /**
     * Removes the option or its group from the list of expected elements.
     * 
     * @param option
     */
    private void updateRequiredOptions(Option option) throws AlreadySelectedException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(391);
        __CLR4_5_23s3slvn1ndjs.R.inc(392);if ((((option.isRequired())&&(__CLR4_5_23s3slvn1ndjs.R.iget(393)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(394)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(395);expectedOpts.remove(option.getKey());
        }

        // if the option is in an OptionGroup make that option the selected option of the group
        }__CLR4_5_23s3slvn1ndjs.R.inc(396);if ((((options.getOptionGroup(option) != null)&&(__CLR4_5_23s3slvn1ndjs.R.iget(397)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(398)==0&false)))
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(399);OptionGroup group = options.getOptionGroup(option);

            __CLR4_5_23s3slvn1ndjs.R.inc(400);if ((((group.isRequired())&&(__CLR4_5_23s3slvn1ndjs.R.iget(401)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(402)==0&false)))
            {{
                __CLR4_5_23s3slvn1ndjs.R.inc(403);expectedOpts.remove(group);
            }

            }__CLR4_5_23s3slvn1ndjs.R.inc(404);group.setSelected(option);
        }
    }}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}

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
     * at the first non-Option encountered.
     */
    protected void handleConcatenatedOptions(String token) throws ParseException
    {try{__CLR4_5_23s3slvn1ndjs.R.inc(405);
        __CLR4_5_23s3slvn1ndjs.R.inc(406);for (int i = 1; (((i < token.length())&&(__CLR4_5_23s3slvn1ndjs.R.iget(407)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(408)==0&false)); i++)
        {{
            __CLR4_5_23s3slvn1ndjs.R.inc(409);String ch = String.valueOf(token.charAt(i));

            __CLR4_5_23s3slvn1ndjs.R.inc(410);if ((((options.hasOption(ch))&&(__CLR4_5_23s3slvn1ndjs.R.iget(411)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(412)==0&false)))
            {{
                __CLR4_5_23s3slvn1ndjs.R.inc(413);handleOption(options.getOption(ch));
                
                __CLR4_5_23s3slvn1ndjs.R.inc(414);if ((((currentOption != null && (token.length() != (i + 1)))&&(__CLR4_5_23s3slvn1ndjs.R.iget(415)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(416)==0&false)))
                {{
                    // add the trail as an argument of the option
                    __CLR4_5_23s3slvn1ndjs.R.inc(417);currentOption.addValueForProcessing(token.substring(i + 1));
                    __CLR4_5_23s3slvn1ndjs.R.inc(418);break;
                }
            }}
            }else
            {{                
                __CLR4_5_23s3slvn1ndjs.R.inc(419);handleUnknownToken((((stopAtNonOption && i > 1 )&&(__CLR4_5_23s3slvn1ndjs.R.iget(420)!=0|true))||(__CLR4_5_23s3slvn1ndjs.R.iget(421)==0&false))? token.substring(i) : token);
                __CLR4_5_23s3slvn1ndjs.R.inc(422);break;
            }
        }}
    }}finally{__CLR4_5_23s3slvn1ndjs.R.flushNeeded();}}
}
