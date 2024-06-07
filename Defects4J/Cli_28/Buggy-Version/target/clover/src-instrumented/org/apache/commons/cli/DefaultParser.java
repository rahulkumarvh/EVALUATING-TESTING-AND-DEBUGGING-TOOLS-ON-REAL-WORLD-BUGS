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
import java.util.Iterator;

/**
 * Default parser.
 * 
 * @author Emmanuel Bourg
 * @version $Revision$, $Date$
 * @since 1.3
 */
public class DefaultParser implements CommandLineParser
{public static class __CLR4_5_23s3slvn1n5j1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521179989L,8589935092L,391,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;    
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
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(136);
        __CLR4_5_23s3slvn1n5j1.R.inc(137);return parse(options, arguments, false);
    }finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    public CommandLine parse(Options options, String[] arguments, boolean stopAtNonOption) throws ParseException
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(138);
        __CLR4_5_23s3slvn1n5j1.R.inc(139);this.options = options;
        __CLR4_5_23s3slvn1n5j1.R.inc(140);this.stopAtNonOption = stopAtNonOption;
        __CLR4_5_23s3slvn1n5j1.R.inc(141);skipParsing = false;
        __CLR4_5_23s3slvn1n5j1.R.inc(142);currentOption = null;
        __CLR4_5_23s3slvn1n5j1.R.inc(143);expectedOpts = new ArrayList(options.getRequiredOptions());
        
        // clear the data from the groups
        __CLR4_5_23s3slvn1n5j1.R.inc(144);for (Iterator it = options.getOptionGroups().iterator(); (((it.hasNext())&&(__CLR4_5_23s3slvn1n5j1.R.iget(145)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(146)==0&false));)
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(147);OptionGroup group = (OptionGroup) it.next();
            __CLR4_5_23s3slvn1n5j1.R.inc(148);group.setSelected(null);
        }
        
        }__CLR4_5_23s3slvn1n5j1.R.inc(149);cmd = new CommandLine();

        __CLR4_5_23s3slvn1n5j1.R.inc(150);if ((((arguments != null)&&(__CLR4_5_23s3slvn1n5j1.R.iget(151)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(152)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(153);for (int i = 0; (((i < arguments.length)&&(__CLR4_5_23s3slvn1n5j1.R.iget(154)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(155)==0&false)); i++)
            {{
                __CLR4_5_23s3slvn1n5j1.R.inc(156);handleToken(arguments[i]);
            }
        }}
        
        // check the arguments of the last option
        }__CLR4_5_23s3slvn1n5j1.R.inc(157);checkRequiredArgs();
        
        __CLR4_5_23s3slvn1n5j1.R.inc(158);checkRequiredOptions();
        
        __CLR4_5_23s3slvn1n5j1.R.inc(159);return cmd;
    }finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Throws a {@link MissingOptionException} if all of the required options
     * are not present.
     *
     * @throws MissingOptionException if any of the required Options
     * are not present.
     */
    private void checkRequiredOptions() throws MissingOptionException
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(160);       
        // if there are required options that have not been processsed
        __CLR4_5_23s3slvn1n5j1.R.inc(161);if ((((!expectedOpts.isEmpty())&&(__CLR4_5_23s3slvn1n5j1.R.iget(162)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(163)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(164);throw new MissingOptionException(expectedOpts);
        }
    }}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Throw a {@link MissingArgumentException} if the current option
     * didn't receive the number of arguments expected.
     */
    private void checkRequiredArgs() throws ParseException
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(165);
        __CLR4_5_23s3slvn1n5j1.R.inc(166);if ((((currentOption != null && currentOption.requiresArg())&&(__CLR4_5_23s3slvn1n5j1.R.iget(167)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(168)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(169);throw new MissingArgumentException(currentOption);
        }
    }}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Handle any command line token.
     * 
     * @param token the command line token to handle
     * @throws ParseException
     */
    private void handleToken(String token) throws ParseException
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(170);
        __CLR4_5_23s3slvn1n5j1.R.inc(171);currentToken = token;
        
        __CLR4_5_23s3slvn1n5j1.R.inc(172);if ((((skipParsing)&&(__CLR4_5_23s3slvn1n5j1.R.iget(173)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(174)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(175);cmd.addArg(token);
        }
        }else {__CLR4_5_23s3slvn1n5j1.R.inc(176);if (((("--".equals(token))&&(__CLR4_5_23s3slvn1n5j1.R.iget(177)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(178)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(179);skipParsing = true;
        }
        }else {__CLR4_5_23s3slvn1n5j1.R.inc(180);if ((((currentOption != null && currentOption.acceptsArg() && isArgument(token))&&(__CLR4_5_23s3slvn1n5j1.R.iget(181)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(182)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(183);currentOption.addValueForProcessing(Util.stripLeadingAndTrailingQuotes(token));
        }
        }else {__CLR4_5_23s3slvn1n5j1.R.inc(184);if ((((token.startsWith("--"))&&(__CLR4_5_23s3slvn1n5j1.R.iget(185)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(186)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(187);handleLongOption(token);
        }
        }else {__CLR4_5_23s3slvn1n5j1.R.inc(188);if ((((token.startsWith("-") && !"-".equals(token))&&(__CLR4_5_23s3slvn1n5j1.R.iget(189)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(190)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(191);handleShortAndLongOption(token);
        }
        }else
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(192);handleUnknownToken(token);
        }
        
        }}}}}__CLR4_5_23s3slvn1n5j1.R.inc(193);if ((((currentOption != null && !currentOption.acceptsArg())&&(__CLR4_5_23s3slvn1n5j1.R.iget(194)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(195)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(196);currentOption = null;
        }
    }}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Returns true is the token is a valid argument.
     * 
     * @param token
     */
    private boolean isArgument(String token)
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(197);
        __CLR4_5_23s3slvn1n5j1.R.inc(198);return !isOption(token) || isNegativeNumber(token);
    }finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Check if the token is a negative number.
     * 
     * @param token
     */
    private boolean isNegativeNumber(String token)
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(199);
        __CLR4_5_23s3slvn1n5j1.R.inc(200);try
        {
            __CLR4_5_23s3slvn1n5j1.R.inc(201);Double.parseDouble(token);
            __CLR4_5_23s3slvn1n5j1.R.inc(202);return true;
        }
        catch (NumberFormatException e)
        {
            __CLR4_5_23s3slvn1n5j1.R.inc(203);return false;
        }
    }finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Tells if the token looks like an option.
     * 
     * @param token
     */
    private boolean isOption(String token)
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(204);
        __CLR4_5_23s3slvn1n5j1.R.inc(205);return isLongOption(token) || isShortOption(token);
    }finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Tells if the token looks like a short option.
     * 
     * @param token
     */
    private boolean isShortOption(String token)
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(206);
        // short options (-S, -SV, -S=V, -SV1=V2, -S1S2)
        __CLR4_5_23s3slvn1n5j1.R.inc(207);return token.startsWith("-") && token.length() >= 2 && options.hasShortOption(token.substring(1, 2));
    }finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Tells if the token looks like a long option.
     * 
     * @param token
     */
    private boolean isLongOption(String token)
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(208);
        __CLR4_5_23s3slvn1n5j1.R.inc(209);if ((((!token.startsWith("-") || token.length() == 1)&&(__CLR4_5_23s3slvn1n5j1.R.iget(210)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(211)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(212);return false;
        }

        }__CLR4_5_23s3slvn1n5j1.R.inc(213);int pos = token.indexOf("=");
        __CLR4_5_23s3slvn1n5j1.R.inc(214);String t = (((pos == -1 )&&(__CLR4_5_23s3slvn1n5j1.R.iget(215)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(216)==0&false))? token : token.substring(0, pos);
        
        __CLR4_5_23s3slvn1n5j1.R.inc(217);if ((((!options.getMatchingOptions(t).isEmpty())&&(__CLR4_5_23s3slvn1n5j1.R.iget(218)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(219)==0&false)))
        {{
            // long or partial long options (--L, -L, --L=V, -L=V, --l, --l=V)
            __CLR4_5_23s3slvn1n5j1.R.inc(220);return true;
        }
        }else {__CLR4_5_23s3slvn1n5j1.R.inc(221);if ((((getLongPrefix(token) != null && !token.startsWith("--"))&&(__CLR4_5_23s3slvn1n5j1.R.iget(222)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(223)==0&false)))
        {{
            // -LV
            __CLR4_5_23s3slvn1n5j1.R.inc(224);return true;
        }

        }}__CLR4_5_23s3slvn1n5j1.R.inc(225);return false;
    }finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

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
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(226);
        __CLR4_5_23s3slvn1n5j1.R.inc(227);if ((((token.startsWith("-") && token.length() > 1 && !stopAtNonOption)&&(__CLR4_5_23s3slvn1n5j1.R.iget(228)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(229)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(230);throw new UnrecognizedOptionException("Unrecognized option: " + token, token);
        }
        
        }__CLR4_5_23s3slvn1n5j1.R.inc(231);cmd.addArg(token);
        __CLR4_5_23s3slvn1n5j1.R.inc(232);if ((((stopAtNonOption)&&(__CLR4_5_23s3slvn1n5j1.R.iget(233)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(234)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(235);skipParsing = true;
        }
    }}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

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
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(236);
        __CLR4_5_23s3slvn1n5j1.R.inc(237);if ((((token.indexOf('=') == -1)&&(__CLR4_5_23s3slvn1n5j1.R.iget(238)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(239)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(240);handleLongOptionWithoutEqual(token);
        }
        }else
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(241);handleLongOptionWithEqual(token);                                   
        }
    }}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

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
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(242);
        __CLR4_5_23s3slvn1n5j1.R.inc(243);List matchingOpts = options.getMatchingOptions(token);
        __CLR4_5_23s3slvn1n5j1.R.inc(244);if ((((matchingOpts.isEmpty())&&(__CLR4_5_23s3slvn1n5j1.R.iget(245)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(246)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(247);handleUnknownToken(currentToken);
        }
        }else {__CLR4_5_23s3slvn1n5j1.R.inc(248);if ((((matchingOpts.size() > 1)&&(__CLR4_5_23s3slvn1n5j1.R.iget(249)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(250)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(251);throw new AmbiguousOptionException(token, matchingOpts);
        }
        }else
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(252);handleOption(options.getOption((String) matchingOpts.get(0)));
        }
    }}}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

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
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(253);
        __CLR4_5_23s3slvn1n5j1.R.inc(254);int pos = token.indexOf('=');

        __CLR4_5_23s3slvn1n5j1.R.inc(255);String value = token.substring(pos + 1);
        
        __CLR4_5_23s3slvn1n5j1.R.inc(256);String opt = token.substring(0, pos);
        
        __CLR4_5_23s3slvn1n5j1.R.inc(257);List matchingOpts = options.getMatchingOptions(opt);
        __CLR4_5_23s3slvn1n5j1.R.inc(258);if ((((matchingOpts.isEmpty())&&(__CLR4_5_23s3slvn1n5j1.R.iget(259)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(260)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(261);handleUnknownToken(currentToken);
        }
        }else {__CLR4_5_23s3slvn1n5j1.R.inc(262);if ((((matchingOpts.size() > 1)&&(__CLR4_5_23s3slvn1n5j1.R.iget(263)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(264)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(265);throw new AmbiguousOptionException(opt, matchingOpts);
        }
        }else
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(266);Option option = options.getOption((String) matchingOpts.get(0));
            
            __CLR4_5_23s3slvn1n5j1.R.inc(267);if ((((option.acceptsArg())&&(__CLR4_5_23s3slvn1n5j1.R.iget(268)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(269)==0&false)))
            {{
                __CLR4_5_23s3slvn1n5j1.R.inc(270);handleOption(option);
                __CLR4_5_23s3slvn1n5j1.R.inc(271);currentOption.addValueForProcessing(value);
                __CLR4_5_23s3slvn1n5j1.R.inc(272);currentOption = null;
            }
            }else
            {{
                __CLR4_5_23s3slvn1n5j1.R.inc(273);handleUnknownToken(currentToken);
            }
        }}
    }}}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

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
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(274);
        __CLR4_5_23s3slvn1n5j1.R.inc(275);String t = Util.stripLeadingHyphens(token);
        
        __CLR4_5_23s3slvn1n5j1.R.inc(276);int pos = t.indexOf('=');
        
        __CLR4_5_23s3slvn1n5j1.R.inc(277);if ((((t.length() == 1)&&(__CLR4_5_23s3slvn1n5j1.R.iget(278)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(279)==0&false)))
        {{
            // -S
            __CLR4_5_23s3slvn1n5j1.R.inc(280);if ((((options.hasShortOption(t))&&(__CLR4_5_23s3slvn1n5j1.R.iget(281)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(282)==0&false)))
            {{
                __CLR4_5_23s3slvn1n5j1.R.inc(283);handleOption(options.getOption(t));
            }
            }else
            {{
                __CLR4_5_23s3slvn1n5j1.R.inc(284);handleUnknownToken(token);
            }
        }}
        }else {__CLR4_5_23s3slvn1n5j1.R.inc(285);if ((((pos == -1)&&(__CLR4_5_23s3slvn1n5j1.R.iget(286)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(287)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(288);if ((((options.hasShortOption(t))&&(__CLR4_5_23s3slvn1n5j1.R.iget(289)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(290)==0&false)))
            {{
                __CLR4_5_23s3slvn1n5j1.R.inc(291);handleOption(options.getOption(t));
            }
            }else {__CLR4_5_23s3slvn1n5j1.R.inc(292);if ((((!options.getMatchingOptions(t).isEmpty())&&(__CLR4_5_23s3slvn1n5j1.R.iget(293)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(294)==0&false)))
            {{
                // -L or -l
                __CLR4_5_23s3slvn1n5j1.R.inc(295);handleLongOptionWithoutEqual(token);
            }
            }else
            {{
                // look for a long prefix (-Xmx512m)
                __CLR4_5_23s3slvn1n5j1.R.inc(296);String opt = getLongPrefix(t);
                
                __CLR4_5_23s3slvn1n5j1.R.inc(297);if ((((opt != null && options.getOption(opt).acceptsArg())&&(__CLR4_5_23s3slvn1n5j1.R.iget(298)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(299)==0&false)))
                {{
                    __CLR4_5_23s3slvn1n5j1.R.inc(300);handleOption(options.getOption(opt));
                    __CLR4_5_23s3slvn1n5j1.R.inc(301);currentOption.addValueForProcessing(t.substring(opt.length()));
                    __CLR4_5_23s3slvn1n5j1.R.inc(302);currentOption = null;
                }
                }else {__CLR4_5_23s3slvn1n5j1.R.inc(303);if ((((isJavaProperty(t))&&(__CLR4_5_23s3slvn1n5j1.R.iget(304)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(305)==0&false)))
                {{
                    // -SV1 (-Dflag)
                    __CLR4_5_23s3slvn1n5j1.R.inc(306);handleOption(options.getOption(t.substring(0, 1)));
                    __CLR4_5_23s3slvn1n5j1.R.inc(307);currentOption.addValueForProcessing(t.substring(1));
                    __CLR4_5_23s3slvn1n5j1.R.inc(308);currentOption = null;
                }
                }else
                {{
                    // -S1S2S3 or -S1S2V
                    __CLR4_5_23s3slvn1n5j1.R.inc(309);handleConcatenatedOptions(token);
                }
            }}}
        }}}
        }else
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(310);String opt = t.substring(0, pos);
            __CLR4_5_23s3slvn1n5j1.R.inc(311);String value = t.substring(pos + 1);
            
            __CLR4_5_23s3slvn1n5j1.R.inc(312);if ((((opt.length() == 1)&&(__CLR4_5_23s3slvn1n5j1.R.iget(313)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(314)==0&false)))
            {{
                // -S=V
                __CLR4_5_23s3slvn1n5j1.R.inc(315);Option option = options.getOption(opt);
                __CLR4_5_23s3slvn1n5j1.R.inc(316);if ((((option != null && option.acceptsArg())&&(__CLR4_5_23s3slvn1n5j1.R.iget(317)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(318)==0&false)))
                {{
                    __CLR4_5_23s3slvn1n5j1.R.inc(319);handleOption(option);
                    __CLR4_5_23s3slvn1n5j1.R.inc(320);currentOption.addValueForProcessing(value);
                    __CLR4_5_23s3slvn1n5j1.R.inc(321);currentOption = null;
                }
                }else
                {{
                    __CLR4_5_23s3slvn1n5j1.R.inc(322);handleUnknownToken(token);
                }
            }}
            }else {__CLR4_5_23s3slvn1n5j1.R.inc(323);if ((((isJavaProperty(opt))&&(__CLR4_5_23s3slvn1n5j1.R.iget(324)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(325)==0&false)))
            {{
                // -SV1=V2 (-Dkey=value)
                __CLR4_5_23s3slvn1n5j1.R.inc(326);handleOption(options.getOption(opt.substring(0, 1)));
                __CLR4_5_23s3slvn1n5j1.R.inc(327);currentOption.addValueForProcessing(opt.substring(1));
                __CLR4_5_23s3slvn1n5j1.R.inc(328);currentOption.addValueForProcessing(value);
                __CLR4_5_23s3slvn1n5j1.R.inc(329);currentOption = null;
            }
            }else
            {{
                // -L=V or -l=V
                __CLR4_5_23s3slvn1n5j1.R.inc(330);handleLongOptionWithEqual(token);
            }
        }}}
    }}}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Search for a prefix that is the long name of an option (-Xmx512m)
     * 
     * @param token
     */
    private String getLongPrefix(String token)
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(331);
        __CLR4_5_23s3slvn1n5j1.R.inc(332);String t = Util.stripLeadingHyphens(token);
        
        __CLR4_5_23s3slvn1n5j1.R.inc(333);int i;
        __CLR4_5_23s3slvn1n5j1.R.inc(334);String opt = null;
        __CLR4_5_23s3slvn1n5j1.R.inc(335);for (i = t.length() - 2; (((i > 1)&&(__CLR4_5_23s3slvn1n5j1.R.iget(336)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(337)==0&false)); i--)
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(338);String prefix = t.substring(0, i);
            __CLR4_5_23s3slvn1n5j1.R.inc(339);if ((((options.hasLongOption(prefix))&&(__CLR4_5_23s3slvn1n5j1.R.iget(340)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(341)==0&false)))
            {{
                __CLR4_5_23s3slvn1n5j1.R.inc(342);opt = prefix;
                __CLR4_5_23s3slvn1n5j1.R.inc(343);break;
            }
        }}
        
        }__CLR4_5_23s3slvn1n5j1.R.inc(344);return opt;
    }finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Check if the specified token is a Java-like property (-Dkey=value).
     */
    private boolean isJavaProperty(String token)
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(345);
        __CLR4_5_23s3slvn1n5j1.R.inc(346);String opt = token.substring(0, 1);
        __CLR4_5_23s3slvn1n5j1.R.inc(347);Option option = options.getOption(opt);
        
        __CLR4_5_23s3slvn1n5j1.R.inc(348);return option != null && (option.getArgs() >= 2 || option.getArgs() == Option.UNLIMITED_VALUES);
    }finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    private void handleOption(Option option) throws ParseException
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(349);
        // check the previous option before handling the next one
        __CLR4_5_23s3slvn1n5j1.R.inc(350);checkRequiredArgs();
        
        __CLR4_5_23s3slvn1n5j1.R.inc(351);option = (Option) option.clone();
        
        __CLR4_5_23s3slvn1n5j1.R.inc(352);updateRequiredOptions(option);
        
        __CLR4_5_23s3slvn1n5j1.R.inc(353);cmd.addOption(option);
        
        __CLR4_5_23s3slvn1n5j1.R.inc(354);if ((((option.hasArg())&&(__CLR4_5_23s3slvn1n5j1.R.iget(355)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(356)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(357);currentOption = option;            
        }
        }else
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(358);currentOption = null;
        }
    }}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

    /**
     * Removes the option or its group from the list of expected elements.
     * 
     * @param option
     */
    private void updateRequiredOptions(Option option) throws AlreadySelectedException
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(359);
        __CLR4_5_23s3slvn1n5j1.R.inc(360);if ((((option.isRequired())&&(__CLR4_5_23s3slvn1n5j1.R.iget(361)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(362)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(363);expectedOpts.remove(option.getKey());
        }

        // if the option is in an OptionGroup make that option the selected option of the group
        }__CLR4_5_23s3slvn1n5j1.R.inc(364);if ((((options.getOptionGroup(option) != null)&&(__CLR4_5_23s3slvn1n5j1.R.iget(365)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(366)==0&false)))
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(367);OptionGroup group = options.getOptionGroup(option);

            __CLR4_5_23s3slvn1n5j1.R.inc(368);if ((((group.isRequired())&&(__CLR4_5_23s3slvn1n5j1.R.iget(369)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(370)==0&false)))
            {{
                __CLR4_5_23s3slvn1n5j1.R.inc(371);expectedOpts.remove(group);
            }

            }__CLR4_5_23s3slvn1n5j1.R.inc(372);group.setSelected(option);
        }
    }}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}

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
    {try{__CLR4_5_23s3slvn1n5j1.R.inc(373);
        __CLR4_5_23s3slvn1n5j1.R.inc(374);for (int i = 1; (((i < token.length())&&(__CLR4_5_23s3slvn1n5j1.R.iget(375)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(376)==0&false)); i++)
        {{
            __CLR4_5_23s3slvn1n5j1.R.inc(377);String ch = String.valueOf(token.charAt(i));

            __CLR4_5_23s3slvn1n5j1.R.inc(378);if ((((options.hasOption(ch))&&(__CLR4_5_23s3slvn1n5j1.R.iget(379)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(380)==0&false)))
            {{
                __CLR4_5_23s3slvn1n5j1.R.inc(381);handleOption(options.getOption(ch));
                
                __CLR4_5_23s3slvn1n5j1.R.inc(382);if ((((currentOption != null && (token.length() != (i + 1)))&&(__CLR4_5_23s3slvn1n5j1.R.iget(383)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(384)==0&false)))
                {{
                    // add the trail as an argument of the option
                    __CLR4_5_23s3slvn1n5j1.R.inc(385);currentOption.addValueForProcessing(token.substring(i + 1));
                    __CLR4_5_23s3slvn1n5j1.R.inc(386);break;
                }
            }}
            }else
            {{                
                __CLR4_5_23s3slvn1n5j1.R.inc(387);handleUnknownToken((((stopAtNonOption && i > 1 )&&(__CLR4_5_23s3slvn1n5j1.R.iget(388)!=0|true))||(__CLR4_5_23s3slvn1n5j1.R.iget(389)==0&false))? token.substring(i) : token);
                __CLR4_5_23s3slvn1n5j1.R.inc(390);break;
            }
        }}
    }}finally{__CLR4_5_23s3slvn1n5j1.R.flushNeeded();}}
}
